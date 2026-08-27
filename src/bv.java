import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public class bv extends cv<bv.a> {
   @Override
   public Codec<bv.a> a() {
      return bv.a.a;
   }

   public void a(ane $$0, cmx $$1, cfv $$2, Collection<cmx> $$3) {
      egv $$4 = bp.b($$0, (blu)($$2.u() != null ? $$2.u() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static record a(Optional<bb> b, Optional<ca> c, Optional<bb> d, Optional<ca> e) implements cv.a {
      public static final Codec<bv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atv.a(bp.b, "player").forGetter(bv.a::a),
                  atv.a(ca.a, "rod").forGetter(bv.a::b),
                  atv.a(bp.b, "entity").forGetter(bv.a::c),
                  atv.a(ca.a, "item").forGetter(bv.a::d)
               )
               .apply($$0, bv.a::new)
      );

      public static an<bv.a> a(Optional<ca> $$0, Optional<bp> $$1, Optional<ca> $$2) {
         return am.E.a(new bv.a(Optional.empty(), $$0, bp.a($$1), $$2));
      }

      public boolean a(cmx $$0, egv $$1, Collection<cmx> $$2) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               boolean $$3 = false;
               blu $$4 = $$1.c(ejg.a);
               if ($$4 instanceof cbt $$5 && this.e.get().a($$5.q())) {
                  $$3 = true;
               }

               for (cmx $$6 : $$2) {
                  if (this.e.get().a($$6)) {
                     $$3 = true;
                     break;
                  }
               }

               if (!$$3) {
                  return false;
               }
            }

            return true;
         }
      }

      @Override
      public void a(bc $$0) {
         cv.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<ca> b() {
         return this.c;
      }

      public Optional<bb> c() {
         return this.d;
      }

      public Optional<ca> d() {
         return this.e;
      }
   }
}
