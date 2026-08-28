import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class det implements ddp {
   protected final int a;
   protected final int b;
   protected final dwk[][] c;
   protected boolean d;
   protected final deg e;
   private final Supplier<jn<dfh>> f;

   public det(deg $$0, je $$1, je $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.F_().d(lv.aG).g(dfo.b));
      this.a = kg.a($$1.u());
      this.b = kg.a($$1.w());
      int $$3 = kg.a($$2.u());
      int $$4 = kg.a($$2.w());
      this.c = new dwk[$$3 - this.a + 1][$$4 - this.b + 1];
      dwo $$5 = $$0.P();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kg.a($$1.u()); $$8 <= kg.a($$2.u()); $$8++) {
         for (int $$9 = kg.a($$1.w()); $$9 <= kg.a($$2.w()); $$9++) {
            dwk $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dwk d(je $$0) {
      return this.a(kg.a($$0.u()), kg.a($$0.w()));
   }

   private dwk a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dwk $$4 = this.c[$$2][$$3];
         return (dwk)($$4 != null ? $$4 : new dwq(this.e, new ddm($$0, $$1), this.f.get()));
      } else {
         return new dwq(this.e, new ddm($$0, $$1), this.f.get());
      }
   }

   @Override
   public dwf A_() {
      return this.e.A_();
   }

   @Override
   public ddl c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ezm> c(@Nullable bto $$0, eyn $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public drs c_(je $$0) {
      dwk $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public duo a_(je $$0) {
      if (this.s($$0)) {
         return dhl.a.o();
      } else {
         dwk $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eqp b_(je $$0) {
      if (this.s($$0)) {
         return eqq.a.g();
      } else {
         dwk $$1 = this.d($$0);
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

   public bod a() {
      return this.e.ah();
   }
}
