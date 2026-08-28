import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.PublicKey;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.UUID;

public record cpb(cpb.a d) {
   public static final wp a = wp.c("multiplayer.disconnect.expired_public_key");
   private static final wp e = wp.c("multiplayer.disconnect.invalid_public_key_signature");
   public static final Duration b = Duration.ofHours(8L);
   public static final Codec<cpb> c = cpb.a.a.xmap(cpb::new, cpb::b);

   public static cpb a(azm $$0, UUID $$1, cpb.a $$2) throws cpb.b {
      if (!$$2.a($$0, $$1)) {
         throw new cpb.b(e);
      } else {
         return new cpb($$2);
      }
   }

   public azm a() {
      return azm.a(this.d.c, "SHA256withRSA");
   }

   public cpb.a b() {
      return this.d;
   }

   public static record a(Instant b, PublicKey c, byte[] d) {
      private static final int e = 4096;
      public static final Codec<cpb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ayi.q.fieldOf("expires_at").forGetter(cpb.a::b), axx.f.fieldOf("key").forGetter(cpb.a::c), ayi.r.fieldOf("signature_v2").forGetter(cpb.a::d)
               )
               .apply($$0, cpb.a::new)
      );

      public a(vl $$0) {
         this($$0.t(), $$0.u(), $$0.a(4096));
      }

      public void a(vl $$0) {
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
      }

      boolean a(azm $$0, UUID $$1) {
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
         return !($$0 instanceof cpb.a $$1) ? false : this.b.equals($$1.b) && this.c.equals($$1.c) && Arrays.equals(this.d, $$1.d);
      }
   }

   public static class b extends xp {
      public b(wp $$0) {
         super($$0);
      }
   }
}
