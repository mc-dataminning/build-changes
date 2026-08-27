import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.PublicKey;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.UUID;

public record cfe(cfe.a d) {
   public static final vd a = vd.c("multiplayer.disconnect.expired_public_key");
   private static final vd e = vd.c("multiplayer.disconnect.invalid_public_key_signature.new");
   public static final Duration b = Duration.ofHours(8L);
   public static final Codec<cfe> c = cfe.a.a.xmap(cfe::new, cfe::b);

   public static cfe a(auv $$0, UUID $$1, cfe.a $$2) throws cfe.b {
      if (!$$2.a($$0, $$1)) {
         throw new cfe.b(e);
      } else {
         return new cfe($$2);
      }
   }

   public auv a() {
      return auv.a(this.d.c, "SHA256withRSA");
   }

   public cfe.a b() {
      return this.d;
   }

   public static record a(Instant b, PublicKey c, byte[] d) {
      private static final int e = 4096;
      public static final Codec<cfe.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atq.m.fieldOf("expires_at").forGetter(cfe.a::b), atg.f.fieldOf("key").forGetter(cfe.a::c), atq.n.fieldOf("signature_v2").forGetter(cfe.a::d)
               )
               .apply($$0, cfe.a::new)
      );

      public a(ug $$0) {
         this($$0.w(), $$0.x(), $$0.a(4096));
      }

      public void a(ug $$0) {
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
      }

      boolean a(auv $$0, UUID $$1) {
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
         return !($$0 instanceof cfe.a $$1) ? false : this.b.equals($$1.b) && this.c.equals($$1.c) && Arrays.equals(this.d, $$1.d);
      }
   }

   public static class b extends wd {
      public b(vd $$0) {
         super($$0);
      }
   }
}
