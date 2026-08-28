import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.PublicKey;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.UUID;

public record cmk(cmk.a d) {
   public static final wu a = wu.c("multiplayer.disconnect.expired_public_key");
   private static final wu e = wu.c("multiplayer.disconnect.invalid_public_key_signature.new");
   public static final Duration b = Duration.ofHours(8L);
   public static final Codec<cmk> c = cmk.a.a.xmap(cmk::new, cmk::b);

   public static cmk a(ayr $$0, UUID $$1, cmk.a $$2) throws cmk.b {
      if (!$$2.a($$0, $$1)) {
         throw new cmk.b(e);
      } else {
         return new cmk($$2);
      }
   }

   public ayr a() {
      return ayr.a(this.d.c, "SHA256withRSA");
   }

   public cmk.a b() {
      return this.d;
   }

   public static record a(Instant b, PublicKey c, byte[] d) {
      private static final int e = 4096;
      public static final Codec<cmk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axm.o.fieldOf("expires_at").forGetter(cmk.a::b), axb.f.fieldOf("key").forGetter(cmk.a::c), axm.p.fieldOf("signature_v2").forGetter(cmk.a::d)
               )
               .apply($$0, cmk.a::new)
      );

      public a(vr $$0) {
         this($$0.t(), $$0.u(), $$0.a(4096));
      }

      public void a(vr $$0) {
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
      }

      boolean a(ayr $$0, UUID $$1) {
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
         return !($$0 instanceof cmk.a $$1) ? false : this.b.equals($$1.b) && this.c.equals($$1.c) && Arrays.equals(this.d, $$1.d);
      }
   }

   public static class b extends xu {
      public b(wu $$0) {
         super($$0);
      }
   }
}
