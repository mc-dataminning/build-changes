import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class czt implements cym, cyq {
   protected final int a;
   protected final int b;
   protected final dre[][] c;
   protected boolean d;
   protected final czg e;
   private final Supplier<in<daf>> f;

   public czt(czg $$0, id $$1, id $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(ku.aw).g(dam.b));
      this.a = jg.a($$1.u());
      this.b = jg.a($$1.w());
      int $$3 = jg.a($$2.u());
      int $$4 = jg.a($$2.w());
      this.c = new dre[$$3 - this.a + 1][$$4 - this.b + 1];
      dri $$5 = $$0.M();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = jg.a($$1.u()); $$8 <= jg.a($$2.u()); $$8++) {
         for (int $$9 = jg.a($$1.w()); $$9 <= jg.a($$2.w()); $$9++) {
            dre $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dre d(id $$0) {
      return this.a(jg.a($$0.u()), jg.a($$0.w()));
   }

   private dre a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dre $$4 = this.c[$$2][$$3];
         return (dre)($$4 != null ? $$4 : new drk(this.e, new cyn($$0, $$1), this.f.get()));
      } else {
         return new drk(this.e, new cyn($$0, $$1), this.f.get());
      }
   }

   @Override
   public dqz C_() {
      return this.e.C_();
   }

   @Override
   public cym c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<etc> c(@Nullable bqa $$0, ese $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dmo c_(id $$0) {
      dre $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dpi a_(id $$0) {
      if (this.s($$0)) {
         return dcj.a.n();
      } else {
         dre $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public elb b_(id $$0) {
      if (this.s($$0)) {
         return elc.a.g();
      } else {
         dre $$1 = this.d($$0);
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

   public bkt a() {
      return this.e.af();
   }
}
