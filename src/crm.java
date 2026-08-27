import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class crm implements cqf, cqj {
   protected final int a;
   protected final int b;
   protected final dhx[][] c;
   protected boolean d;
   protected final cqz e;
   private final Supplier<ib<crx>> f;

   public crm(cqz $$0, ht $$1, ht $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(jz.aq).f(cse.b));
      this.a = iu.a($$1.u());
      this.b = iu.a($$1.w());
      int $$3 = iu.a($$2.u());
      int $$4 = iu.a($$2.w());
      this.c = new dhx[$$3 - this.a + 1][$$4 - this.b + 1];
      dib $$5 = $$0.J();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = iu.a($$1.u()); $$8 <= iu.a($$2.u()); $$8++) {
         for (int $$9 = iu.a($$1.w()); $$9 <= iu.a($$2.w()); $$9++) {
            dhx $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dhx d(ht $$0) {
      return this.a(iu.a($$0.u()), iu.a($$0.w()));
   }

   private dhx a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dhx $$4 = this.c[$$2][$$3];
         return (dhx)($$4 != null ? $$4 : new die(this.e, new cqg($$0, $$1), this.f.get()));
      } else {
         return new die(this.e, new cqg($$0, $$1), this.f.get());
      }
   }

   @Override
   public dhs C_() {
      return this.e.C_();
   }

   @Override
   public cqf c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<eiy> c(@Nullable bjt $$0, eia $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public ddx c_(ht $$0) {
      dhx $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dgb a_(ht $$0) {
      if (this.r($$0)) {
         return cuc.a.o();
      } else {
         dhx $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public ebe b_(ht $$0) {
      if (this.r($$0)) {
         return ebf.a.g();
      } else {
         dhx $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int I_() {
      return this.e.I_();
   }

   @Override
   public int J_() {
      return this.e.J_();
   }

   public bes a() {
      return this.e.ad();
   }
}
