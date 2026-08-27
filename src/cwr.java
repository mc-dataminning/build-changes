import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cwr implements cvk, cvo {
   protected final int a;
   protected final int b;
   protected final doa[][] c;
   protected boolean d;
   protected final cwe e;
   private final Supplier<il<cxd>> f;

   public cwr(cwe $$0, ib $$1, ib $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.I_().d(ki.au).f(cxk.b));
      this.a = jd.a($$1.u());
      this.b = jd.a($$1.w());
      int $$3 = jd.a($$2.u());
      int $$4 = jd.a($$2.w());
      this.c = new doa[$$3 - this.a + 1][$$4 - this.b + 1];
      doe $$5 = $$0.L();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = jd.a($$1.u()); $$8 <= jd.a($$2.u()); $$8++) {
         for (int $$9 = jd.a($$1.w()); $$9 <= jd.a($$2.w()); $$9++) {
            doa $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private doa d(ib $$0) {
      return this.a(jd.a($$0.u()), jd.a($$0.w()));
   }

   private doa a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         doa $$4 = this.c[$$2][$$3];
         return (doa)($$4 != null ? $$4 : new doh(this.e, new cvl($$0, $$1), this.f.get()));
      } else {
         return new doh(this.e, new cvl($$0, $$1), this.f.get());
      }
   }

   @Override
   public dnv D_() {
      return this.e.D_();
   }

   @Override
   public cvk c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<epo> c(@Nullable bof $$0, eoq $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public djl c_(ib $$0) {
      doa $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dme a_(ib $$0) {
      if (this.s($$0)) {
         return czh.a.o();
      } else {
         doa $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public ehr b_(ib $$0) {
      if (this.s($$0)) {
         return ehs.a.g();
      } else {
         doa $$1 = this.d($$0);
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

   public bjc a() {
      return this.e.ae();
   }
}
