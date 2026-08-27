import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class au extends cx<au.a> {
   @Override
   public Codec<au.a> a() {
      return au.a.a;
   }

   public void a(apv $$0, dpi $$1, crs $$2, int $$3) {
      this.a($$0, $$3x -> $$3x.a($$1, $$2, $$3));
   }

   public static record a(Optional<bc> b, Optional<in<dch>> c, Optional<cc> d, cm.d e) implements cx.a {
      public static final Codec<au.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awu.a(br.b, "player").forGetter(au.a::a),
                  awu.a(kt.e.r(), "block").forGetter(au.a::b),
                  awu.a(cc.a, "item").forGetter(au.a::c),
                  awu.a(cm.d.d, "num_bees_inside", cm.d.c).forGetter(au.a::d)
               )
               .apply($$0, au.a::new)
      );

      public static an<au.a> a(dch $$0, cc.a $$1, cm.d $$2) {
         return am.L.a(new au.a(Optional.empty(), Optional.of($$0.r()), Optional.of($$1.b()), $$2));
      }

      public boolean a(dpi $$0, crs $$1, int $$2) {
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

      public Optional<in<dch>> b() {
         return this.c;
      }

      public Optional<cc> c() {
         return this.d;
      }

      public cm.d d() {
         return this.e;
      }
   }
}
