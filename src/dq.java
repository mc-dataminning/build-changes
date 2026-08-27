import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dq extends df<dq.a> {
   @Override
   public Codec<dq.a> a() {
      return dq.a.a;
   }

   public void a(aqo $$0, brw $$1, eum $$2, int $$3) {
      eph $$4 = br.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bc> b, ct.d c, Optional<bc> d) implements df.a {
      public static final Codec<dq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  br.b.optionalFieldOf("player").forGetter(dq.a::a),
                  ct.d.d.optionalFieldOf("signal_strength", ct.d.c).forGetter(dq.a::b),
                  br.b.optionalFieldOf("projectile").forGetter(dq.a::c)
               )
               .apply($$0, dq.a::new)
      );

      public static an<dq.a> a(ct.d $$0, Optional<bc> $$1) {
         return am.M.a(new dq.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(eph $$0, eum $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         df.a.super.a($$0);
         $$0.a(this.d, ".projectile");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public ct.d b() {
         return this.c;
      }

      public Optional<bc> c() {
         return this.d;
      }
   }
}
