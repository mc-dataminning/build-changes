import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dp extends de<dp.a> {
   @Override
   public Codec<dp.a> a() {
      return dp.a.a;
   }

   public void a(aqi $$0, brh $$1, etp $$2, int $$3) {
      eol $$4 = br.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$4, $$2, $$3));
   }

   public static record a(Optional<bc> b, ct.d c, Optional<bc> d) implements de.a {
      public static final Codec<dp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.a(br.b, "player").forGetter(dp.a::a),
                  axh.a(ct.d.d, "signal_strength", ct.d.c).forGetter(dp.a::b),
                  axh.a(br.b, "projectile").forGetter(dp.a::c)
               )
               .apply($$0, dp.a::new)
      );

      public static an<dp.a> a(ct.d $$0, Optional<bc> $$1) {
         return am.M.a(new dp.a(Optional.empty(), $$0, $$1));
      }

      public boolean a(eol $$0, etp $$1, int $$2) {
         return !this.c.d($$2) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public void a(bd $$0) {
         de.a.super.a($$0);
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
