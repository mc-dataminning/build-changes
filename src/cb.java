import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public class cb extends ds<cb.a> {
   @Override
   public Codec<cb.a> a() {
      return cb.a.a;
   }

   public void a(aqn $$0, cuc $$1, cmy $$2, Collection<cuc> $$3) {
      equ $$4 = bu.b($$0, (bsg)($$2.v() != null ? $$2.v() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static record a(Optional<bf> b, Optional<cp> c, Optional<bf> d, Optional<cp> e) implements ds.a {
      public static final Codec<cb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bu.b.optionalFieldOf("player").forGetter(cb.a::a),
                  cp.a.optionalFieldOf("rod").forGetter(cb.a::b),
                  bu.b.optionalFieldOf("entity").forGetter(cb.a::c),
                  cp.a.optionalFieldOf("item").forGetter(cb.a::d)
               )
               .apply($$0, cb.a::new)
      );

      public static an<cb.a> a(Optional<cp> $$0, Optional<bu> $$1, Optional<cp> $$2) {
         return am.E.a(new cb.a(Optional.empty(), $$0, bu.a($$1), $$2));
      }

      public boolean a(cuc $$0, equ $$1, Collection<cuc> $$2) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               boolean $$3 = false;
               bsg $$4 = $$1.c(etq.a);
               if ($$4 instanceof ciu $$5 && this.e.get().a($$5.p())) {
                  $$3 = true;
               }

               for (cuc $$6 : $$2) {
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
      public void a(bg $$0) {
         ds.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<cp> b() {
         return this.c;
      }

      public Optional<bf> c() {
         return this.d;
      }

      public Optional<cp> d() {
         return this.e;
      }
   }
}
