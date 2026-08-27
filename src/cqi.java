import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cqi implements cpb, cpf {
   protected final int a;
   protected final int b;
   protected final dhf[][] c;
   protected boolean d;
   protected final cpv e;
   private final Supplier<he<cqt>> f;

   public cqi(cpv $$0, gw $$1, gw $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.G_().d(jc.ap).f(cra.b));
      this.a = hw.a($$1.u());
      this.b = hw.a($$1.w());
      int $$3 = hw.a($$2.u());
      int $$4 = hw.a($$2.w());
      this.c = new dhf[$$3 - this.a + 1][$$4 - this.b + 1];
      dhj $$5 = $$0.J();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = hw.a($$1.u()); $$8 <= hw.a($$2.u()); $$8++) {
         for (int $$9 = hw.a($$1.w()); $$9 <= hw.a($$2.w()); $$9++) {
            dhf $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dhf d(gw $$0) {
      return this.a(hw.a($$0.u()), hw.a($$0.w()));
   }

   private dhf a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dhf $$4 = this.c[$$2][$$3];
         return (dhf)($$4 != null ? $$4 : new dhm(this.e, new cpc($$0, $$1), this.f.get()));
      } else {
         return new dhm(this.e, new cpc($$0, $$1), this.f.get());
      }
   }

   @Override
   public dha B_() {
      return this.e.B_();
   }

   @Override
   public cpb c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<eig> c(@Nullable biq $$0, ehi $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dcv c_(gw $$0) {
      dhf $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dfj a_(gw $$0) {
      if (this.r($$0)) {
         return csw.a.n();
      } else {
         dhf $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eam b_(gw $$0) {
      if (this.r($$0)) {
         return ean.a.g();
      } else {
         dhf $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int H_() {
      return this.e.H_();
   }

   @Override
   public int I_() {
      return this.e.I_();
   }

   public bdp a() {
      return this.e.ad();
   }
}
