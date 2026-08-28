import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class def implements ddb {
   protected final int a;
   protected final int b;
   protected final dvw[][] c;
   protected boolean d;
   protected final dds e;
   private final Supplier<jn<det>> f;

   public def(dds $$0, je $$1, je $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.F_().d(lv.aF).g(dfa.b));
      this.a = kg.a($$1.u());
      this.b = kg.a($$1.w());
      int $$3 = kg.a($$2.u());
      int $$4 = kg.a($$2.w());
      this.c = new dvw[$$3 - this.a + 1][$$4 - this.b + 1];
      dwa $$5 = $$0.P();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kg.a($$1.u()); $$8 <= kg.a($$2.u()); $$8++) {
         for (int $$9 = kg.a($$1.w()); $$9 <= kg.a($$2.w()); $$9++) {
            dvw $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dvw d(je $$0) {
      return this.a(kg.a($$0.u()), kg.a($$0.w()));
   }

   private dvw a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dvw $$4 = this.c[$$2][$$3];
         return (dvw)($$4 != null ? $$4 : new dwc(this.e, new dcy($$0, $$1), this.f.get()));
      } else {
         return new dwc(this.e, new dcy($$0, $$1), this.f.get());
      }
   }

   @Override
   public dvr A_() {
      return this.e.A_();
   }

   @Override
   public dcx c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<eyx> c(@Nullable btj $$0, exz $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dre c_(je $$0) {
      dvw $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dua a_(je $$0) {
      if (this.s($$0)) {
         return dgx.a.o();
      } else {
         dvw $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eqb b_(je $$0) {
      if (this.s($$0)) {
         return eqc.a.g();
      } else {
         dvw $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int G_() {
      return this.e.G_();
   }

   @Override
   public int H_() {
      return this.e.H_();
   }

   public bny a() {
      return this.e.ah();
   }
}
