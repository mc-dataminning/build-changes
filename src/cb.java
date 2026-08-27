import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cb extends cx<cb.a> {
   @Override
   public Codec<cb.a> a() {
      return cb.a.a;
   }

   public void a(apv $$0, crs $$1, int $$2) {
      this.a($$0, $$2x -> $$2x.a($$1, $$2));
   }

   public static record a(Optional<bc> b, Optional<cc> c, cm.d d, cm.d e) implements cx.a {
      public static final Codec<cb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  awu.a(br.b, "player").forGetter(cb.a::a),
                  awu.a(cc.a, "item").forGetter(cb.a::b),
                  awu.a(cm.d.d, "durability", cm.d.c).forGetter(cb.a::c),
                  awu.a(cm.d.d, "delta", cm.d.c).forGetter(cb.a::d)
               )
               .apply($$0, cb.a::new)
      );

      public static an<cb.a> a(Optional<cc> $$0, cm.d $$1) {
         return a(Optional.empty(), $$0, $$1);
      }

      public static an<cb.a> a(Optional<bc> $$0, Optional<cc> $$1, cm.d $$2) {
         return am.u.a(new cb.a($$0, $$1, $$2, cm.d.c));
      }

      public boolean a(crs $$0, int $$1) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else {
            return !this.d.d($$0.n() - $$1) ? false : this.e.d($$0.m() - $$1);
         }
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<cc> b() {
         return this.c;
      }

      public cm.d c() {
         return this.d;
      }

      public cm.d d() {
         return this.e;
      }
   }
}
