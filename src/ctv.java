import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ctv implements cso, css {
   protected final int a;
   protected final int b;
   protected final dkw[][] c;
   protected boolean d;
   protected final cti e;
   private final Supplier<ih<cuh>> f;

   public ctv(cti $$0, hx $$1, hx $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.I_().d(ke.at).f(cuo.b));
      this.a = iz.a($$1.u());
      this.b = iz.a($$1.w());
      int $$3 = iz.a($$2.u());
      int $$4 = iz.a($$2.w());
      this.c = new dkw[$$3 - this.a + 1][$$4 - this.b + 1];
      dla $$5 = $$0.L();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = iz.a($$1.u()); $$8 <= iz.a($$2.u()); $$8++) {
         for (int $$9 = iz.a($$1.w()); $$9 <= iz.a($$2.w()); $$9++) {
            dkw $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dkw d(hx $$0) {
      return this.a(iz.a($$0.u()), iz.a($$0.w()));
   }

   private dkw a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dkw $$4 = this.c[$$2][$$3];
         return (dkw)($$4 != null ? $$4 : new dld(this.e, new csp($$0, $$1), this.f.get()));
      } else {
         return new dld(this.e, new csp($$0, $$1), this.f.get());
      }
   }

   @Override
   public dkr D_() {
      return this.e.D_();
   }

   @Override
   public cso c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<emf> c(@Nullable blp $$0, elh $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dgo c_(hx $$0) {
      dkw $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dja a_(hx $$0) {
      if (this.s($$0)) {
         return cwl.a.o();
      } else {
         dkw $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eek b_(hx $$0) {
      if (this.s($$0)) {
         return eel.a.g();
      } else {
         dkw $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int J_() {
      return this.e.J_();
   }

   @Override
   public int K_() {
      return this.e.K_();
   }

   public bgm a() {
      return this.e.af();
   }
}
