import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cox implements cov {
   final coc a;
   final coc b;
   final coc c;

   cox(coc $$0, coc $$1, coc $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bij $$0, crs $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public clb a(bij $$0, ip $$1) {
      clb $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<ib.c<cne>> $$3 = cnf.a($$1, $$0.a(2));
         Optional<ib.c<cng>> $$4 = cnh.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            Optional<cnd> $$5 = cnd.a($$1, $$2, false);
            if ($$5.isPresent() && $$5.get().a($$4.get(), $$3.get())) {
               return clb.b;
            }

            clb $$6 = $$2.p();
            $$6.f(1);
            cnd $$7 = new cnd($$3.get(), $$4.get());
            if (cnd.a($$1, $$6, $$7)) {
               return $$6;
            }
         }
      }

      return clb.b;
   }

   @Override
   public clb a(ip $$0) {
      clb $$1 = new clb(cle.oT);
      Optional<ib.c<cng>> $$2 = $$0.d(jz.aG).h().findFirst();
      if ($$2.isPresent()) {
         Optional<ib.c<cne>> $$3 = $$0.d(jz.aF).b(cnf.d);
         if ($$3.isPresent()) {
            cnd $$4 = new cnd($$3.get(), $$2.get());
            cnd.a($$0, $$1, $$4);
         }
      }

      return $$1;
   }

   @Override
   public boolean a(clb $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(clb $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(clb $$0) {
      return this.c.a($$0);
   }

   @Override
   public coj<?> aq_() {
      return coj.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(coc::c);
   }

   public static class a implements coj<cox> {
      private static final Codec<cox> x = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  coc.b.fieldOf("template").forGetter($$0x -> $$0x.a),
                  coc.b.fieldOf("base").forGetter($$0x -> $$0x.b),
                  coc.b.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cox::new)
      );

      @Override
      public Codec<cox> a() {
         return x;
      }

      public cox b(tu $$0) {
         coc $$1 = coc.b($$0);
         coc $$2 = coc.b($$0);
         coc $$3 = coc.b($$0);
         return new cox($$1, $$2, $$3);
      }

      public void a(tu $$0, cox $$1) {
         $$1.a.a($$0);
         $$1.b.a($$0);
         $$1.c.a($$0);
      }
   }
}
