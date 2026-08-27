import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class cwe implements cux, cvb {
   protected final int a;
   protected final int b;
   protected final dnf[][] c;
   protected boolean d;
   protected final cvr e;
   private final Supplier<ij<cwq>> f;

   public cwe(cvr $$0, hz $$1, hz $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.I_().d(kg.at).f(cwx.b));
      this.a = jb.a($$1.u());
      this.b = jb.a($$1.w());
      int $$3 = jb.a($$2.u());
      int $$4 = jb.a($$2.w());
      this.c = new dnf[$$3 - this.a + 1][$$4 - this.b + 1];
      dnj $$5 = $$0.L();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = jb.a($$1.u()); $$8 <= jb.a($$2.u()); $$8++) {
         for (int $$9 = jb.a($$1.w()); $$9 <= jb.a($$2.w()); $$9++) {
            dnf $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dnf d(hz $$0) {
      return this.a(jb.a($$0.u()), jb.a($$0.w()));
   }

   private dnf a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dnf $$4 = this.c[$$2][$$3];
         return (dnf)($$4 != null ? $$4 : new dnm(this.e, new cuy($$0, $$1), this.f.get()));
      } else {
         return new dnm(this.e, new cuy($$0, $$1), this.f.get());
      }
   }

   @Override
   public dna D_() {
      return this.e.D_();
   }

   @Override
   public cux c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<eos> c(@Nullable bnq $$0, enu $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dix c_(hz $$0) {
      dnf $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dlj a_(hz $$0) {
      if (this.s($$0)) {
         return cyu.a.o();
      } else {
         dnf $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public egw b_(hz $$0) {
      if (this.s($$0)) {
         return egx.a.g();
      } else {
         dnf $$1 = this.d($$0);
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

   public bin a() {
      return this.e.ae();
   }
}
