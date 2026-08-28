import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class djn implements dik {
   protected final int a;
   protected final int b;
   protected final ece[][] c;
   protected boolean d;
   protected final dja e;
   private final Supplier<je<dkd>> f;

   public djn(dja $$0, iu $$1, iu $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.F_().f(mg.aG).b(dkk.b));
      this.a = jx.a($$1.u());
      this.b = jx.a($$1.w());
      int $$3 = jx.a($$2.u());
      int $$4 = jx.a($$2.w());
      this.c = new ece[$$3 - this.a + 1][$$4 - this.b + 1];
      eci $$5 = $$0.S();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = jx.a($$1.u()); $$8 <= jx.a($$2.u()); $$8++) {
         for (int $$9 = jx.a($$1.w()); $$9 <= jx.a($$2.w()); $$9++) {
            ece $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private ece d(iu $$0) {
      return this.a(jx.a($$0.u()), jx.a($$0.w()));
   }

   private ece a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         ece $$4 = this.c[$$2][$$3];
         return (ece)($$4 != null ? $$4 : new eck(this.e, new dih($$0, $$1), this.f.get()));
      } else {
         return new eck(this.e, new dih($$0, $$1), this.f.get());
      }
   }

   @Override
   public ebz A_() {
      return this.e.A_();
   }

   @Override
   public dig c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ffk> c(@Nullable bwf $$0, fel $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dxf c_(iu $$0) {
      ece $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public eah a_(iu $$0) {
      if (this.t($$0)) {
         return dmh.a.m();
      } else {
         ece $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public ewo b_(iu $$0) {
      if (this.t($$0)) {
         return ewp.a.g();
      } else {
         ece $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int G_() {
      return this.e.G_();
   }

   @Override
   public int H_() {
      return this.e.H_();
   }
}
