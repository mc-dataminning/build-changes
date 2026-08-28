import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dew implements dds {
   protected final int a;
   protected final int b;
   protected final dwo[][] c;
   protected boolean d;
   protected final dej e;
   private final Supplier<jo<dfk>> f;

   public dew(dej $$0, jf $$1, jf $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.G_().e(lw.aH).b(dfr.b));
      this.a = kh.a($$1.u());
      this.b = kh.a($$1.w());
      int $$3 = kh.a($$2.u());
      int $$4 = kh.a($$2.w());
      this.c = new dwo[$$3 - this.a + 1][$$4 - this.b + 1];
      dws $$5 = $$0.P();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kh.a($$1.u()); $$8 <= kh.a($$2.u()); $$8++) {
         for (int $$9 = kh.a($$1.w()); $$9 <= kh.a($$2.w()); $$9++) {
            dwo $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dwo d(jf $$0) {
      return this.a(kh.a($$0.u()), kh.a($$0.w()));
   }

   private dwo a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dwo $$4 = this.c[$$2][$$3];
         return (dwo)($$4 != null ? $$4 : new dwu(this.e, new ddp($$0, $$1), this.f.get()));
      } else {
         return new dwu(this.e, new ddp($$0, $$1), this.f.get());
      }
   }

   @Override
   public dwj B_() {
      return this.e.B_();
   }

   @Override
   public ddo c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<ezq> c(@Nullable btr $$0, eyr $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public drv c_(jf $$0) {
      dwo $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dus a_(jf $$0) {
      if (this.s($$0)) {
         return dho.a.n();
      } else {
         dwo $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public eqt b_(jf $$0) {
      if (this.s($$0)) {
         return equ.a.g();
      } else {
         dwo $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int H_() {
      return this.e.H_();
   }

   @Override
   public int I_() {
      return this.e.I_();
   }

   public bog a() {
      return this.e.ah();
   }
}
