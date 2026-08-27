import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class css implements crl, crp {
   protected final int a;
   protected final int b;
   protected final djj[][] c;
   protected boolean d;
   protected final csf e;
   private final Supplier<ig<ctd>> f;

   public css(csf $$0, hx $$1, hx $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.I_().d(kd.ar).f(ctk.b));
      this.a = iy.a($$1.u());
      this.b = iy.a($$1.w());
      int $$3 = iy.a($$2.u());
      int $$4 = iy.a($$2.w());
      this.c = new djj[$$3 - this.a + 1][$$4 - this.b + 1];
      djn $$5 = $$0.K();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = iy.a($$1.u()); $$8 <= iy.a($$2.u()); $$8++) {
         for (int $$9 = iy.a($$1.w()); $$9 <= iy.a($$2.w()); $$9++) {
            djj $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private djj d(hx $$0) {
      return this.a(iy.a($$0.u()), iy.a($$0.w()));
   }

   private djj a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         djj $$4 = this.c[$$2][$$3];
         return (djj)($$4 != null ? $$4 : new djq(this.e, new crm($$0, $$1), this.f.get()));
      } else {
         return new djq(this.e, new crm($$0, $$1), this.f.get());
      }
   }

   @Override
   public dje D_() {
      return this.e.D_();
   }

   @Override
   public crl c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<eks> c(@Nullable bkv $$0, eju $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dfi c_(hx $$0) {
      djj $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dhn a_(hx $$0) {
      if (this.r($$0)) {
         return cvh.a.o();
      } else {
         djj $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public ecx b_(hx $$0) {
      if (this.r($$0)) {
         return ecy.a.g();
      } else {
         djj $$1 = this.d($$0);
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

   public bfs a() {
      return this.e.ae();
   }
}
