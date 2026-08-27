import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cqk implements cpd, cph {
   protected final int a;
   protected final int b;
   protected final dhh[][] c;
   protected boolean d;
   protected final cpx e;
   private final Supplier<hg<cqv>> f;

   public cqk(cpx $$0, gw $$1, gw $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.G_().d(je.ap).f(crc.b));
      this.a = hz.a($$1.u());
      this.b = hz.a($$1.w());
      int $$3 = hz.a($$2.u());
      int $$4 = hz.a($$2.w());
      this.c = new dhh[$$3 - this.a + 1][$$4 - this.b + 1];
      dhl $$5 = $$0.J();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = hz.a($$1.u()); $$8 <= hz.a($$2.u()); $$8++) {
         for (int $$9 = hz.a($$1.w()); $$9 <= hz.a($$2.w()); $$9++) {
            dhh $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dhh d(gw $$0) {
      return this.a(hz.a($$0.u()), hz.a($$0.w()));
   }

   private dhh a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dhh $$4 = this.c[$$2][$$3];
         return (dhh)($$4 != null ? $$4 : new dho(this.e, new cpe($$0, $$1), this.f.get()));
      } else {
         return new dho(this.e, new cpe($$0, $$1), this.f.get());
      }
   }

   @Override
   public dhc B_() {
      return this.e.B_();
   }

   @Override
   public cpd c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<eii> c(@Nullable bis $$0, ehk $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dcx c_(gw $$0) {
      dhh $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dfl a_(gw $$0) {
      if (this.r($$0)) {
         return csy.a.n();
      } else {
         dhh $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eao b_(gw $$0) {
      if (this.r($$0)) {
         return eap.a.g();
      } else {
         dhh $$1 = this.d($$0);
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

   public bdr a() {
      return this.e.ad();
   }
}
