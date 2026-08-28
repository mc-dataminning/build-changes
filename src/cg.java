import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public class cg extends dl<cg.a> {
   @Override
   public Codec<cg.a> a() {
      return cg.a.a;
   }

   public void a(asc $$0, dak $$1, csz $$2, Collection<dak> $$3) {
      fat $$4 = bz.b($$0, (bxe)($$2.j() != null ? $$2.j() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static record a(Optional<bj> b, Optional<cn> c, Optional<bj> d, Optional<cn> e) implements dl.a {
      public static final Codec<cg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bz.b.optionalFieldOf("player").forGetter(cg.a::a),
                  cn.a.optionalFieldOf("rod").forGetter(cg.a::b),
                  bz.b.optionalFieldOf("entity").forGetter(cg.a::c),
                  cn.a.optionalFieldOf("item").forGetter(cg.a::d)
               )
               .apply($$0, cg.a::new)
      );

      public static ar<cg.a> a(Optional<cn> $$0, Optional<bz> $$1, Optional<cn> $$2) {
         return aq.E.a(new cg.a(Optional.empty(), $$0, bz.a($$1), $$2));
      }

      public boolean a(dak $$0, fat $$1, Collection<dak> $$2) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               boolean $$3 = false;
               bxe $$4 = $$1.c(fdn.a);
               if ($$4 instanceof coo $$5 && this.e.get().a($$5.f())) {
                  $$3 = true;
               }

               for (dak $$6 : $$2) {
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
         dl.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<cn> b() {
         return this.c;
      }

      public Optional<bj> c() {
         return this.d;
      }

      public Optional<cn> d() {
         return this.e;
      }
   }
}
