import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dfo implements dek {
   protected final int a;
   protected final int b;
   protected final dxf[][] c;
   protected boolean d;
   protected final dfb e;
   private final Supplier<jq<dgc>> f;

   public dfo(dfb $$0, jh $$1, jh $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.H_().e(lz.aG).b(dgj.b));
      this.a = kj.a($$1.u());
      this.b = kj.a($$1.w());
      int $$3 = kj.a($$2.u());
      int $$4 = kj.a($$2.w());
      this.c = new dxf[$$3 - this.a + 1][$$4 - this.b + 1];
      dxj $$5 = $$0.P();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = kj.a($$1.u()); $$8 <= kj.a($$2.u()); $$8++) {
         for (int $$9 = kj.a($$1.w()); $$9 <= kj.a($$2.w()); $$9++) {
            dxf $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private dxf d(jh $$0) {
      return this.a(kj.a($$0.u()), kj.a($$0.w()));
   }

   private dxf a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         dxf $$4 = this.c[$$2][$$3];
         return (dxf)($$4 != null ? $$4 : new dxl(this.e, new deh($$0, $$1), this.f.get()));
      } else {
         return new dxl(this.e, new deh($$0, $$1), this.f.get());
      }
   }

   @Override
   public dxa C_() {
      return this.e.C_();
   }

   @Override
   public deg c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<fah> c(@Nullable bue $$0, ezi $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dsm c_(jh $$0) {
      dxf $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public dvj a_(jh $$0) {
      if (this.s($$0)) {
         return dig.a.m();
      } else {
         dxf $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public erk b_(jh $$0) {
      if (this.s($$0)) {
         return erl.a.g();
      } else {
         dxf $$1 = this.d($$0);
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
}
