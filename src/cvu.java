import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface cvu extends cuu, cvb, cwh, cws.a {
   @Nullable
   dnf a(int var1, int var2, dnk var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dqv.a var1, int var2, int var3);

   int C_();

   cws G_();

   default ij<cwq> t(hz $$0) {
      return this.G_().a($$0);
   }

   default Stream<dlj> c(enu $$0) {
      int $$1 = awi.a($$0.a);
      int $$2 = awi.a($$0.d);
      int $$3 = awi.a($$0.b);
      int $$4 = awi.a($$0.e);
      int $$5 = awi.a($$0.c);
      int $$6 = awi.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(hz $$0, cvc $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default ij<cwq> getNoiseBiome(int $$0, int $$1, int $$2) {
      dnf $$3 = this.a(iu.e($$0), iu.e($$2), dnk.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   ij<cwq> a(int var1, int var2, int var3);

   boolean y_();

   @Deprecated
   int A_();

   dov E_();

   @Override
   default int J_() {
      return this.E_().n();
   }

   @Override
   default int K_() {
      return this.E_().o();
   }

   default hz a(dqv.a $$0, hz $$1) {
      return new hz($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(hz $$0) {
      return this.a_($$0).i();
   }

   default boolean v(hz $$0) {
      if ($$0.v() >= this.A_()) {
         return this.h($$0);
      } else {
         hz $$1 = new hz($$0.u(), this.A_(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (hz var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               dlj $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(hz $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(hz $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return awi.i(this.E_().s(), $$2, 1.0F);
   }

   default dnf y(hz $$0) {
      return this.a(jb.a($$0.u()), jb.a($$0.w()));
   }

   default dnf a(int $$0, int $$1) {
      return this.a($$0, $$1, dnk.n, true);
   }

   default dnf a(int $$0, int $$1, dnk $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default cux c(int $$0, int $$1) {
      return this.a($$0, $$1, dnk.c, false);
   }

   default boolean z(hz $$0) {
      return this.b_($$0).a(auf.a);
   }

   default boolean d(enu $$0) {
      int $$1 = awi.a($$0.a);
      int $$2 = awi.c($$0.d);
      int $$3 = awi.a($$0.b);
      int $$4 = awi.c($$0.e);
      int $$5 = awi.a($$0.c);
      int $$6 = awi.c($$0.f);
      hz.a $$7 = new hz.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dlj $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(hz $$0) {
      return this.c($$0, this.C_());
   }

   default int c(hz $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(jb.a($$0), jb.a($$1));
   }

   @Deprecated
   default boolean B(hz $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(hz $$0, hz $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.J_() && $$1 < this.ak() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = jb.a($$0);
      int $$5 = jb.a($$2);
      int $$6 = jb.a($$1);
      int $$7 = jb.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   iw I_();

   cjw I();

   default <T> il<T> a(aix<? extends iv<? extends T>> $$0) {
      iv<T> $$1 = this.I_().d($$0);
      return $$1.p().a(this.I());
   }
}
