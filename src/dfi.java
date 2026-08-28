import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dfi implements dee {
   protected final int a;
   protected final int b;
   protected final dwz[][] c;
   protected boolean d;
   protected final dev e;
   private final Supplier<jp<dfw>> f;

   public dfi(dev $$0, jg $$1, jg $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().e(ly.aG).b(dgd.b));
      this.a = ki.a($$1.u());
      this.b = ki.a($$1.w());
      int $$3 = ki.a($$2.u());
      int $$4 = ki.a($$2.w());
      this.c = new dwz[$$3 - this.a + 1][$$4 - this.b + 1];
      dxd $$5 = $$0.P();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = ki.a($$1.u()); $$8 <= ki.a($$2.u()); $$8++) {
         for (int $$9 = ki.a($$1.w()); $$9 <= ki.a($$2.w()); $$9++) {
            dwz $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dwz d(jg $$0) {
      return this.a(ki.a($$0.u()), ki.a($$0.w()));
   }

   private dwz a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dwz $$4 = this.c[$$2][$$3];
         return (dwz)($$4 != null ? $$4 : new dxf(this.e, new deb($$0, $$1), this.f.get()));
      } else {
         return new dxf(this.e, new deb($$0, $$1), this.f.get());
      }
   }

   @Override
   public dwu C_() {
      return this.e.C_();
   }

   @Override
   public dea c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<fab> c(@Nullable btz $$0, ezc $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dsg c_(jg $$0) {
      dwz $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dvd a_(jg $$0) {
      if (this.s($$0)) {
         return dia.a.m();
      } else {
         dwz $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public ere b_(jg $$0) {
      if (this.s($$0)) {
         return erf.a.g();
      } else {
         dwz $$1 = this.d($$0);
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

   public bok a() {
      return this.e.ah();
   }
}
