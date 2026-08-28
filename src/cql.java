import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.PublicKey;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.UUID;

public record cql(cql.a d) {
   public static final wv a = wv.c("multiplayer.disconnect.expired_public_key");
   private static final wv e = wv.c("multiplayer.disconnect.invalid_public_key_signature");
   public static final Duration b = Duration.ofHours(8L);
   public static final Codec<cql> c = cql.a.a.xmap(cql::new, cql::b);

   public static cql a(azx $$0, UUID $$1, cql.a $$2) throws cql.b {
      if (!$$2.a($$0, $$1)) {
         throw new cql.b(e);
      } else {
         return new cql($$2);
      }
   }

   public azx a() {
      return azx.a(this.d.c, "SHA256withRSA");
   }

   public cql.a b() {
      return this.d;
   }

   public static record a(Instant b, PublicKey c, byte[] d) {
      private static final int e = 4096;
      public static final Codec<cql.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ays.q.fieldOf("expires_at").forGetter(cql.a::b), ayh.f.fieldOf("key").forGetter(cql.a::c), ays.r.fieldOf("signature_v2").forGetter(cql.a::d)
               )
               .apply($$0, cql.a::new)
      );

      public a(vr $$0) {
         this($$0.t(), $$0.u(), $$0.a(4096));
      }

      public void a(vr $$0) {
         $$0.a(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
      }

      boolean a(azx $$0, UUID $$1) {
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
         return !($$0 instanceof cql.a $$1) ? false : this.b.equals($$1.b) && this.c.equals($$1.c) && Arrays.equals(this.d, $$1.d);
      }
   }

   public static class b extends xv {
      public b(wv $$0) {
         super($$0);
      }
   }
}
