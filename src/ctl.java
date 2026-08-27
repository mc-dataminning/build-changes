import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ctl implements cse, csi {
   protected final int a;
   protected final int b;
   protected final dkl[][] c;
   protected boolean d;
   protected final csy e;
   private final Supplier<ie<ctx>> f;

   public ctl(csy $$0, hv $$1, hv $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.I_().d(kc.as).f(cue.b));
      this.a = ix.a($$1.u());
      this.b = ix.a($$1.w());
      int $$3 = ix.a($$2.u());
      int $$4 = ix.a($$2.w());
      this.c = new dkl[$$3 - this.a + 1][$$4 - this.b + 1];
      dkp $$5 = $$0.K();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = ix.a($$1.u()); $$8 <= ix.a($$2.u()); $$8++) {
         for (int $$9 = ix.a($$1.w()); $$9 <= ix.a($$2.w()); $$9++) {
            dkl $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dkl d(hv $$0) {
      return this.a(ix.a($$0.u()), ix.a($$0.w()));
   }

   private dkl a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dkl $$4 = this.c[$$2][$$3];
         return (dkl)($$4 != null ? $$4 : new dks(this.e, new csf($$0, $$1), this.f.get()));
      } else {
         return new dks(this.e, new csf($$0, $$1), this.f.get());
      }
   }

   @Override
   public dkg D_() {
      return this.e.D_();
   }

   @Override
   public cse c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<elu> c(@Nullable blf $$0, ekw $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dgd c_(hv $$0) {
      dkl $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dip a_(hv $$0) {
      if (this.r($$0)) {
         return cwb.a.o();
      } else {
         dkl $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public edz b_(hv $$0) {
      if (this.r($$0)) {
         return eea.a.g();
      } else {
         dkl $$1 = this.d($$0);
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

   public bgc a() {
      return this.e.ae();
   }
}
