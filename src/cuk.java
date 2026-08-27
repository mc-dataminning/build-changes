import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cuk implements ctd, cth {
   protected final int a;
   protected final int b;
   protected final dll[][] c;
   protected boolean d;
   protected final ctx e;
   private final Supplier<ih<cuw>> f;

   public cuk(ctx $$0, hx $$1, hx $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.I_().d(ke.at).f(cvd.b));
      this.a = iz.a($$1.u());
      this.b = iz.a($$1.w());
      int $$3 = iz.a($$2.u());
      int $$4 = iz.a($$2.w());
      this.c = new dll[$$3 - this.a + 1][$$4 - this.b + 1];
      dlp $$5 = $$0.L();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = iz.a($$1.u()); $$8 <= iz.a($$2.u()); $$8++) {
         for (int $$9 = iz.a($$1.w()); $$9 <= iz.a($$2.w()); $$9++) {
            dll $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dll d(hx $$0) {
      return this.a(iz.a($$0.u()), iz.a($$0.w()));
   }

   private dll a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dll $$4 = this.c[$$2][$$3];
         return (dll)($$4 != null ? $$4 : new dls(this.e, new cte($$0, $$1), this.f.get()));
      } else {
         return new dls(this.e, new cte($$0, $$1), this.f.get());
      }
   }

   @Override
   public dlg D_() {
      return this.e.D_();
   }

   @Override
   public ctd c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<emv> c(@Nullable blw $$0, elx $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dhd c_(hx $$0) {
      dll $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public djp a_(hx $$0) {
      if (this.s($$0)) {
         return cxa.a.o();
      } else {
         dll $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eez b_(hx $$0) {
      if (this.s($$0)) {
         return efa.a.g();
      } else {
         dll $$1 = this.d($$0);
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

   public bgt a() {
      return this.e.af();
   }
}
