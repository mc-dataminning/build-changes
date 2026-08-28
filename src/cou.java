import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.PublicKey;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.UUID;

public record cou(cou.a d) {
   public static final xl a = xl.c("multiplayer.disconnect.expired_public_key");
   private static final xl e = xl.c("multiplayer.disconnect.invalid_public_key_signature");
   public static final Duration b = Duration.ofHours(8L);
   public static final Codec<cou> c = cou.a.a.xmap(cou::new, cou::b);

   public static cou a(baa $$0, UUID $$1, cou.a $$2) throws cou.b {
      if (!$$2.a($$0, $$1)) {
         throw new cou.b(e);
      } else {
         return new cou($$2);
      }
   }

   public baa a() {
      return baa.a(this.d.c, "SHA256withRSA");
   }

   public cou.a b() {
      return this.d;
   }

   public static record a(Instant b, PublicKey c, byte[] d) {
      private static final int e = 4096;
      public static final Codec<cou.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayw.q.fieldOf("expires_at").forGetter(cou.a::b), ayl.f.fieldOf("key").forGetter(cou.a::c), ayw.r.fieldOf("signature_v2").forGetter(cou.a::d)
               )
               .apply($$0, cou.a::new)
      );

      public a(wi $$0) {
         this($$0.t(), $$0.u(), $$0.a(4096));
      }

      public void a(wi $$0) {
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
      }

      boolean a(baa $$0, UUID $$1) {
         return $$0.a(this.a($$1), this.d);
      }

      private byte[] a(UUID $$0) {
         byte[] $$1 = this.c.getEncoded();
         byte[] $$2 = new byte[24 + $$1.length];
         ByteBuffer $$3 = ByteBuffer.wrap($$2).order(ByteOrder.BIG_ENDIAN);
         $$3.putLong($$0.getMostSignificantBits()).putLong($$0.getLeastSignificantBits()).putLong(this.b.toEpochMilli()).put($$1);
         return $$2;
      }

      public boolean a() {
         return this.b.isBefore(Instant.now());
      }

      public boolean a(Duration $$0) {
         return this.b.plus($$0).isBefore(Instant.now());
      }

      @Override
      public boolean equals(Object $$0) {
         return !($$0 instanceof cou.a $$1) ? false : this.b.equals($$1.b) && this.c.equals($$1.c) && Arrays.equals(this.d, $$1.d);
      }
   }

   public static class b extends yl {
      public b(xl $$0) {
         super($$0);
      }
   }
}
