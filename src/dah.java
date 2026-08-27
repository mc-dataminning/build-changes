import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dah implements cza, cze {
   protected final int a;
   protected final int b;
   protected final dru[][] c;
   protected boolean d;
   protected final czu e;
   private final Supplier<iv<dat>> f;

   public dah(czu $$0, im $$1, im $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(ld.ay).g(dba.b));
      this.a = jo.a($$1.u());
      this.b = jo.a($$1.w());
      int $$3 = jo.a($$2.u());
      int $$4 = jo.a($$2.w());
      this.c = new dru[$$3 - this.a + 1][$$4 - this.b + 1];
      dry $$5 = $$0.M();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = jo.a($$1.u()); $$8 <= jo.a($$2.u()); $$8++) {
         for (int $$9 = jo.a($$1.w()); $$9 <= jo.a($$2.w()); $$9++) {
            dru $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dru d(im $$0) {
      return this.a(jo.a($$0.u()), jo.a($$0.w()));
   }

   private dru a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dru $$4 = this.c[$$2][$$3];
         return (dru)($$4 != null ? $$4 : new dsa(this.e, new czb($$0, $$1), this.f.get()));
      } else {
         return new dsa(this.e, new czb($$0, $$1), this.f.get());
      }
   }

   @Override
   public drp C_() {
      return this.e.C_();
   }

   @Override
   public cza c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ety> c(@Nullable bql $$0, eta $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dnd c_(im $$0) {
      dru $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dpy a_(im $$0) {
      if (this.s($$0)) {
         return dcx.a.n();
      } else {
         dru $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public elr b_(im $$0) {
      if (this.s($$0)) {
         return els.a.g();
      } else {
         dru $$1 = this.d($$0);
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

   public ble a() {
      return this.e.af();
   }
}
