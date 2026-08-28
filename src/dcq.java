import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dcq implements dbj, dbn {
   protected final int a;
   protected final int b;
   protected final dud[][] c;
   protected boolean d;
   protected final dcd e;
   private final Supplier<jj<ddd>> f;

   public dcq(dcd $$0, ja $$1, ja $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().d(lr.aE).g(ddk.b));
      this.a = kc.a($$1.u());
      this.b = kc.a($$1.w());
      int $$3 = kc.a($$2.u());
      int $$4 = kc.a($$2.w());
      this.c = new dud[$$3 - this.a + 1][$$4 - this.b + 1];
      duh $$5 = $$0.N();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kc.a($$1.u()); $$8 <= kc.a($$2.u()); $$8++) {
         for (int $$9 = kc.a($$1.w()); $$9 <= kc.a($$2.w()); $$9++) {
            dud $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dud d(ja $$0) {
      return this.a(kc.a($$0.u()), kc.a($$0.w()));
   }

   private dud a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dud $$4 = this.c[$$2][$$3];
         return (dud)($$4 != null ? $$4 : new duj(this.e, new dbk($$0, $$1), this.f.get()));
      } else {
         return new duj(this.e, new dbk($$0, $$1), this.f.get());
      }
   }

   @Override
   public dty C_() {
      return this.e.C_();
   }

   @Override
   public dbj c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ews> c(@Nullable bsd $$0, evu $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dpn c_(ja $$0) {
      dud $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dsh a_(ja $$0) {
      if (this.s($$0)) {
         return dfh.a.o();
      } else {
         dud $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eob b_(ja $$0) {
      if (this.s($$0)) {
         return eoc.a.g();
      } else {
         dud $$1 = this.d($$0);
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

   public bmr a() {
      return this.e.ag();
   }
}
