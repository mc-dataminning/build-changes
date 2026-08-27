import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public class bv extends cv<bv.a> {
   @Override
   public Codec<bv.a> a() {
      return bv.a.a;
   }

   public void a(ana $$0, cmr $$1, cfp $$2, Collection<cmr> $$3) {
      egp $$4 = bp.b($$0, (blp)($$2.u() != null ? $$2.u() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static record a(Optional<bb> b, Optional<ca> c, Optional<bb> d, Optional<ca> e) implements cv.a {
      public static final Codec<bv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atq.a(bp.b, "player").forGetter(bv.a::a),
                  atq.a(ca.a, "rod").forGetter(bv.a::b),
                  atq.a(bp.b, "entity").forGetter(bv.a::c),
                  atq.a(ca.a, "item").forGetter(bv.a::d)
               )
               .apply($$0, bv.a::new)
      );

      public static an<bv.a> a(Optional<ca> $$0, Optional<bp> $$1, Optional<ca> $$2) {
         return am.E.a(new bv.a(Optional.empty(), $$0, bp.a($$1), $$2));
      }

      public boolean a(cmr $$0, egp $$1, Collection<cmr> $$2) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               boolean $$3 = false;
               blp $$4 = $$1.c(eja.a);
               if ($$4 instanceof cbo $$5 && this.e.get().a($$5.q())) {
                  $$3 = true;
               }

               for (cmr $$6 : $$2) {
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
