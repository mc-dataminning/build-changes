import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class au extends dd<au.a> {
   @Override
   public Codec<au.a> a() {
      return au.a.a;
   }

   public void a(aqf $$0, dpy $$1, csd $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bc> b, Optional<iv<dcv>> c, Optional<cg> d, cs.d e) implements dd.a {
      public static final Codec<au.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axe.a(br.b, "player").forGetter(au.a::a),
                  axe.a(lc.e.r(), "block").forGetter(au.a::b),
                  axe.a(cg.a, "item").forGetter(au.a::c),
                  axe.a(cs.d.d, "num_bees_inside", cs.d.c).forGetter(au.a::d)
               )
               .apply($$0, au.a::new)
      );

      public static an<au.a> a(dcv $$0, cg.a $$1, cs.d $$2) {
         return am.L.a(new au.a(Optional.empty(), Optional.of($$0.r()), Optional.of($$1.b()), $$2));
      }

      public boolean a(dpy $$0, csd $$1, int $$2) {
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

      public Optional<iv<dcv>> b() {
         return this.c;
      }

      public Optional<cg> c() {
         return this.d;
      }

      public cs.d d() {
         return this.e;
      }
   }
}
