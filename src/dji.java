import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dji implements dif {
   protected final int a;
   protected final int b;
   protected final ebw[][] c;
   protected boolean d;
   protected final div e;
   private final Supplier<je<djy>> f;

   public dji(div $$0, iu $$1, iu $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.F_().f(mg.aG).b(dkf.b));
      this.a = jx.a($$1.u());
      this.b = jx.a($$1.w());
      int $$3 = jx.a($$2.u());
      int $$4 = jx.a($$2.w());
      this.c = new ebw[$$3 - this.a + 1][$$4 - this.b + 1];
      eca $$5 = $$0.S();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = jx.a($$1.u()); $$8 <= jx.a($$2.u()); $$8++) {
         for (int $$9 = jx.a($$1.w()); $$9 <= jx.a($$2.w()); $$9++) {
            ebw $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private ebw d(iu $$0) {
      return this.a(jx.a($$0.u()), jx.a($$0.w()));
   }

   private ebw a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         ebw $$4 = this.c[$$2][$$3];
         return (ebw)($$4 != null ? $$4 : new ecc(this.e, new dic($$0, $$1), this.f.get()));
      } else {
         return new ecc(this.e, new dic($$0, $$1), this.f.get());
      }
   }

   @Override
   public ebr A_() {
      return this.e.A_();
   }

   @Override
   public dib c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ffc> c(@Nullable bwd $$0, fed $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dwx c_(iu $$0) {
      ebw $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dzz a_(iu $$0) {
      if (this.t($$0)) {
         return dmc.a.m();
      } else {
         ebw $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public ewg b_(iu $$0) {
      if (this.t($$0)) {
         return ewh.a.g();
      } else {
         ebw $$1 = this.d($$0);
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
