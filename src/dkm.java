import com.google.common.base.Suppliers;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class dkm implements djh {
   protected final int a;
   protected final int b;
   protected final edd[][] c;
   protected boolean d;
   protected final djz e;
   private final Supplier<jg<dlc>> f;

   public dkm(djz $$0, iw $$1, iw $$2) {
      this.e = $$0;
      this.f = Suppliers.memoize(() -> $$0.J_().f(mi.aG).b(dlj.b));
      this.a = jz.a($$1.u());
      this.b = jz.a($$1.w());
      int $$3 = jz.a($$2.u());
      int $$4 = jz.a($$2.w());
      this.c = new edd[$$3 - this.a + 1][$$4 - this.b + 1];
      edh $$5 = $$0.S();
      this.d = true;

      for (int $$6 = this.a; $$6 <= $$3; $$6++) {
         for (int $$7 = this.b; $$7 <= $$4; $$7++) {
            this.c[$$6 - this.a][$$7 - this.b] = $$5.a($$6, $$7);
         }
      }

      for (int $$8 = jz.a($$1.u()); $$8 <= jz.a($$2.u()); $$8++) {
         for (int $$9 = jz.a($$1.w()); $$9 <= jz.a($$2.w()); $$9++) {
            edd $$10 = this.c[$$8 - this.a][$$9 - this.b];
            if ($$10 != null && !$$10.a($$1.v(), $$2.v())) {
               this.d = false;
               return;
            }
         }
      }
   }

   private edd d(iw $$0) {
      return this.a(jz.a($$0.u()), jz.a($$0.w()));
   }

   private edd a(int $$0, int $$1) {
      int $$2 = $$0 - this.a;
      int $$3 = $$1 - this.b;
      if ($$2 >= 0 && $$2 < this.c.length && $$3 >= 0 && $$3 < this.c[$$2].length) {
         edd $$4 = this.c[$$2][$$3];
         return (edd)($$4 != null ? $$4 : new edj(this.e, new dje($$0, $$1), this.f.get()));
      } else {
         return new edj(this.e, new dje($$0, $$1), this.f.get());
      }
   }

   @Override
   public ecy E_() {
      return this.e.E_();
   }

   @Override
   public djd c(int $$0, int $$1) {
      return this.a($$0, $$1);
   }

   @Override
   public List<fgm> c(@Nullable bwv $$0, ffn $$1) {
      return List.of();
   }

   @Nullable
   @Override
   public dye c_(iw $$0) {
      edd $$1 = this.d($$0);
      return $$1.c_($$0);
   }

   @Override
   public ebg a_(iw $$0) {
      if (this.t($$0)) {
         return dng.a.m();
      } else {
         edd $$1 = this.d($$0);
         return $$1.a_($$0);
      }
   }

   @Override
   public exq b_(iw $$0) {
      if (this.t($$0)) {
         return exr.a.g();
      } else {
         edd $$1 = this.d($$0);
         return $$1.b_($$0);
      }
   }

   @Override
   public int K_() {
      return this.e.K_();
   }

   @Override
   public int L_() {
      return this.e.L_();
   }
}
