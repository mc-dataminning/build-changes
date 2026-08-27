import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class daq implements czj, czn {
   protected final int a;
   protected final int b;
   protected final dsd[][] c;
   protected boolean d;
   protected final dad e;
   private final Supplier<iw<dbc>> f;

   public daq(dad $$0, in $$1, in $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(le.az).g(dbj.b));
      this.a = jp.a($$1.u());
      this.b = jp.a($$1.w());
      int $$3 = jp.a($$2.u());
      int $$4 = jp.a($$2.w());
      this.c = new dsd[$$3 - this.a + 1][$$4 - this.b + 1];
      dsh $$5 = $$0.M();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = jp.a($$1.u()); $$8 <= jp.a($$2.u()); $$8++) {
         for (int $$9 = jp.a($$1.w()); $$9 <= jp.a($$2.w()); $$9++) {
            dsd $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dsd d(in $$0) {
      return this.a(jp.a($$0.u()), jp.a($$0.w()));
   }

   private dsd a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dsd $$4 = this.c[$$2][$$3];
         return (dsd)($$4 != null ? $$4 : new dsj(this.e, new czk($$0, $$1), this.f.get()));
      } else {
         return new dsj(this.e, new czk($$0, $$1), this.f.get());
      }
   }

   @Override
   public dry C_() {
      return this.e.C_();
   }

   @Override
   public czj c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<eui> c(@Nullable brh $$0, etk $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dnm c_(in $$0) {
      dsd $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dqh a_(in $$0) {
      if (this.s($$0)) {
         return ddg.a.n();
      } else {
         dsd $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public ema b_(in $$0) {
      if (this.s($$0)) {
         return emb.a.g();
      } else {
         dsd $$1 = this.d($$0);
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

   public bma a() {
      return this.e.af();
   }
}
