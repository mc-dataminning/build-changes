import com.google.common.primitives.Longs;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.bytes.ByteArrays;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.EncodedKeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Base64.Encoder;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ayh {
   private static final String h = "AES";
   private static final int i = 128;
   private static final String j = "RSA";
   private static final int k = 1024;
   private static final String l = "ISO_8859_1";
   private static final String m = "SHA-1";
   public static final String a = "SHA256withRSA";
   public static final int b = 256;
   private static final String n = "-----BEGIN RSA PRIVATE KEY-----";
   private static final String o = "-----END RSA PRIVATE KEY-----";
   public static final String c = "-----BEGIN RSA PUBLIC KEY-----";
   private static final String p = "-----END RSA PUBLIC KEY-----";
   public static final String d = "\n";
   public static final Encoder e = Base64.getMimeEncoder(76, "\n".getBytes(StandardCharsets.UTF_8));
   public static final Codec<PublicKey> f = Codec.STRING.comapFlatMap($$0 -> {
      try {
         return DataResult.success(b($$0));
      } catch (ayi var2) {
         return DataResult.error(var2::getMessage);
      }
   }, ayh::a);
   public static final Codec<PrivateKey> g = Codec.STRING.comapFlatMap($$0 -> {
      try {
         return DataResult.success(a($$0));
      } catch (ayi var2) {
         return DataResult.error(var2::getMessage);
      }
   }, ayh::a);

   public static SecretKey a() throws ayi {
      try {
         KeyGenerator $$0 = KeyGenerator.getInstance("AES");
         $$0.init(128);
         return $$0.generateKey();
      } catch (Exception var1) {
         throw new ayi(var1);
      }
   }

   public static KeyPair b() throws ayi {
      try {
         KeyPairGenerator $$0 = KeyPairGenerator.getInstance("RSA");
         $$0.initialize(1024);
         return $$0.generateKeyPair();
      } catch (Exception var1) {
         throw new ayi(var1);
      }
   }

   public static byte[] a(String $$0, PublicKey $$1, SecretKey $$2) throws ayi {
      try {
         return a($$0.getBytes("ISO_8859_1"), $$2.getEncoded(), $$1.getEncoded());
      } catch (Exception var4) {
         throw new ayi(var4);
      }
   }

   private static byte[] a(byte[]... $$0) throws Exception {
      MessageDigest $$1 = MessageDigest.getInstance("SHA-1");

      for (byte[] $$2 : $$0) {
         $$1.update($$2);
      }

      return $$1.digest();
   }

   private static <T extends Key> T a(String $$0, String $$1, String $$2, ayh.a<T> $$3) throws ayi {
      int $$4 = $$0.indexOf($$1);
      if ($$4 != -1) {
         $$4 += $$1.length();
         int $$5 = $$0.indexOf($$2, $$4);
         $$0 = $$0.substring($$4, $$5 + 1);
      }

      try {
         return $$3.apply(Base64.getMimeDecoder().decode($$0));
      } catch (IllegalArgumentException var6) {
         throw new ayi(var6);
      }
   }

   public static PrivateKey a(String $$0) throws ayi {
      return a($$0, "-----BEGIN RSA PRIVATE KEY-----", "-----END RSA PRIVATE KEY-----", ayh::b);
   }

   public static PublicKey b(String $$0) throws ayi {
      return a($$0, "-----BEGIN RSA PUBLIC KEY-----", "-----END RSA PUBLIC KEY-----", ayh::a);
   }

   public static String a(PublicKey $$0) {
      if (!"RSA".equals($$0.getAlgorithm())) {
         throw new IllegalArgumentException("Public key must be RSA");
      } else {
         return "-----BEGIN RSA PUBLIC KEY-----\n" + e.encodeToString($$0.getEncoded()) + "\n-----END RSA PUBLIC KEY-----\n";
      }
   }

   public static String a(PrivateKey $$0) {
      if (!"RSA".equals($$0.getAlgorithm())) {
         throw new IllegalArgumentException("Private key must be RSA");
      } else {
         return "-----BEGIN RSA PRIVATE KEY-----\n" + e.encodeToString($$0.getEncoded()) + "\n-----END RSA PRIVATE KEY-----\n";
      }
   }

   private static PrivateKey b(byte[] $$0) throws ayi {
      try {
         EncodedKeySpec $$1 = new PKCS8EncodedKeySpec($$0);
         KeyFactory $$2 = KeyFactory.getInstance("RSA");
         return $$2.generatePrivate($$1);
      } catch (Exception var3) {
         throw new ayi(var3);
      }
   }

   public static PublicKey a(byte[] $$0) throws ayi {
      try {
         EncodedKeySpec $$1 = new X509EncodedKeySpec($$0);
         KeyFactory $$2 = KeyFactory.getInstance("RSA");
         return $$2.generatePublic($$1);
      } catch (Exception var3) {
         throw new ayi(var3);
      }
   }

   public static SecretKey a(PrivateKey $$0, byte[] $$1) throws ayi {
      byte[] $$2 = b($$0, $$1);

      try {
         return new SecretKeySpec($$2, "AES");
      } catch (Exception var4) {
         throw new ayi(var4);
      }
   }

   public static byte[] a(Key $$0, byte[] $$1) throws ayi {
      return a(1, $$0, $$1);
   }

   public static byte[] b(Key $$0, byte[] $$1) throws ayi {
      return a(2, $$0, $$1);
   }

   private static byte[] a(int $$0, Key $$1, byte[] $$2) throws ayi {
      try {
         return a($$0, $$1.getAlgorithm(), $$1).doFinal($$2);
      } catch (Exception var4) {
         throw new ayi(var4);
      }
   }

   private static Cipher a(int $$0, String $$1, Key $$2) throws Exception {
      Cipher $$3 = Cipher.getInstance($$1);
      $$3.init($$0, $$2);
      return $$3;
   }

   public static Cipher a(int $$0, Key $$1) throws ayi {
      try {
         Cipher $$2 = Cipher.getInstance("AES/CFB8/NoPadding");
         $$2.init($$0, $$1, new IvParameterSpec($$1.getEncoded()));
         return $$2;
      } catch (Exception var3) {
         throw new ayi(var3);
      }
   }

   interface a<T extends Key> {
      T apply(byte[] var1) throws ayi;
   }

   public static record b(long b, byte[] c) {
      public static final ayh.b a = new ayh.b(0L, ByteArrays.EMPTY_ARRAY);

      public b(vs $$0) {
         this($$0.readLong(), $$0.b());
      }

      public boolean a() {
         return this.c.length > 0;
      }

      public static void a(vs $$0, ayh.b $$1) {
         $$0.b($$1.b);
         $$0.a($$1.c);
      }

      public byte[] b() {
         return Longs.toByteArray(this.b);
      }

      public long c() {
         return this.b;
      }

      public byte[] d() {
         return this.c;
      }
   }

   public static class c {
      private static final SecureRandom a = new SecureRandom();

      public static long a() {
         return a.nextLong();
      }
   }
}
