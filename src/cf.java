import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public class cf extends dk<cf.a> {
   @Override
   public Codec<cf.a> a() {
      return cf.a.a;
   }

   public void a(arr $$0, czn $$1, csd $$2, Collection<czn> $$3) {
      ezt $$4 = by.b($$0, (bwi)($$2.j() != null ? $$2.j() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static record a(Optional<bj> b, Optional<cm> c, Optional<bj> d, Optional<cm> e) implements dk.a {
      public static final Codec<cf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  by.b.optionalFieldOf("player").forGetter(cf.a::a),
                  cm.a.optionalFieldOf("rod").forGetter(cf.a::b),
                  by.b.optionalFieldOf("entity").forGetter(cf.a::c),
                  cm.a.optionalFieldOf("item").forGetter(cf.a::d)
               )
               .apply($$0, cf.a::new)
      );

      public static ar<cf.a> a(Optional<cm> $$0, Optional<by> $$1, Optional<cm> $$2) {
         return aq.E.a(new cf.a(Optional.empty(), $$0, by.a($$1), $$2));
      }

      public boolean a(czn $$0, ezt $$1, Collection<czn> $$2) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               boolean $$3 = false;
               bwi $$4 = $$1.c(fcn.a);
               if ($$4 instanceof cnr $$5 && this.e.get().a($$5.f())) {
                  $$3 = true;
               }

               for (czn $$6 : $$2) {
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
      public void a(bk $$0) {
         dk.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<cm> b() {
         return this.c;
      }

      public Optional<bj> c() {
         return this.d;
      }

      public Optional<cm> d() {
         return this.e;
      }
   }
}
