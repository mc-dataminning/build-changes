import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public class bv extends cv<bv.a> {
   @Override
   public Codec<bv.a> a() {
      return bv.a.a;
   }

   public void a(amq $$0, cmh $$1, cff $$2, Collection<cmh> $$3) {
      ege $$4 = bp.b($$0, (blf)($$2.u() != null ? $$2.u() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static record a(Optional<bb> b, Optional<ca> c, Optional<bb> d, Optional<ca> e) implements cv.a {
      public static final Codec<bv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atg.a(bp.b, "player").forGetter(bv.a::a),
                  atg.a(ca.a, "rod").forGetter(bv.a::b),
                  atg.a(bp.b, "entity").forGetter(bv.a::c),
                  atg.a(ca.a, "item").forGetter(bv.a::d)
               )
               .apply($$0, bv.a::new)
      );

      public static an<bv.a> a(Optional<ca> $$0, Optional<bp> $$1, Optional<ca> $$2) {
         return am.E.a(new bv.a(Optional.empty(), $$0, bp.a($$1), $$2));
      }

      public boolean a(cmh $$0, ege $$1, Collection<cmh> $$2) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               boolean $$3 = false;
               blf $$4 = $$1.c(eip.a);
               if ($$4 instanceof cbe $$5 && this.e.get().a($$5.q())) {
                  $$3 = true;
               }

               for (cmh $$6 : $$2) {
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
