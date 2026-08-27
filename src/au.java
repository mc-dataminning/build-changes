import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class au extends de<au.a> {
   @Override
   public Codec<au.a> a() {
      return au.a.a;
   }

   public void a(aqi $$0, dqh $$1, csz $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bc> b, Optional<iw<dde>> c, Optional<ch> d, ct.d e) implements de.a {
      public static final Codec<au.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.a(br.b, "player").forGetter(au.a::a),
                  axh.a(ld.e.r(), "block").forGetter(au.a::b),
                  axh.a(ch.a, "item").forGetter(au.a::c),
                  axh.a(ct.d.d, "num_bees_inside", ct.d.c).forGetter(au.a::d)
               )
               .apply($$0, au.a::new)
      );

      public static an<au.a> a(dde $$0, ch.a $$1, ct.d $$2) {
         return am.L.a(new au.a(Optional.empty(), Optional.of($$0.r()), Optional.of($$1.b()), $$2));
      }

      public boolean a(dqh $$0, csz $$1, int $$2) {
         if (this.c.isPresent() && !$$0.a(this.c.get())) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1) ? false : this.e.d($$2);
         }
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<iw<dde>> b() {
         return this.c;
      }

      public Optional<ch> c() {
         return this.d;
      }

      public ct.d d() {
         return this.e;
      }
   }
}
