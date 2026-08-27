import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface cpt extends cot, cpa, cqg, cqq.a {
   @Nullable
   dha a(int var1, int var2, dhf var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dkn.a var1, int var2, int var3);

   int v_();

   cqq z_();

   default hg<cqo> s(gw $$0) {
      return this.z_().a($$0);
   }

   default Stream<dfe> c(ehd $$0) {
      int $$1 = ars.a($$0.a);
      int $$2 = ars.a($$0.d);
      int $$3 = ars.a($$0.b);
      int $$4 = ars.a($$0.e);
      int $$5 = ars.a($$0.c);
      int $$6 = ars.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(gw $$0, cpb $$1) {
      return $$1.getColor(this.s($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default hg<cqo> getNoiseBiome(int $$0, int $$1, int $$2) {
      dha $$3 = this.a(hs.e($$0), hs.e($$2), dhf.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   hg<cqo> a(int var1, int var2, int var3);

   boolean r_();

   @Deprecated
   int t_();

   din x_();

   @Override
   default int C_() {
      return this.x_().n();
   }

   @Override
   default int D_() {
      return this.x_().o();
   }

   default gw a(dkn.a $$0, gw $$1) {
      return new gw($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean t(gw $$0) {
      return this.a_($$0).i();
   }

   default boolean u(gw $$0) {
      if ($$0.v() >= this.t_()) {
         return this.g($$0);
      } else {
         gw $$1 = new gw($$0.u(), this.t_(), $$0.w());
         if (!this.g($$1)) {
            return false;
         } else {
            for (gw var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               dfe $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float v(gw $$0) {
      return this.w($$0) - 0.5F;
   }

   @Deprecated
   default float w(gw $$0) {
      float $$1 = (float)this.z($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return ars.i(this.x_().s(), $$2, 1.0F);
   }

   default dha x(gw $$0) {
      return this.a(hz.a($$0.u()), hz.a($$0.w()));
   }

   default dha a(int $$0, int $$1) {
      return this.a($$0, $$1, dhf.n, true);
   }

   default dha a(int $$0, int $$1, dhf $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default cow c(int $$0, int $$1) {
      return this.a($$0, $$1, dhf.c, false);
   }

   default boolean y(gw $$0) {
      return this.b_($$0).a(apt.a);
   }

   default boolean d(ehd $$0) {
      int $$1 = ars.a($$0.a);
      int $$2 = ars.c($$0.d);
      int $$3 = ars.a($$0.b);
      int $$4 = ars.c($$0.e);
      int $$5 = ars.a($$0.c);
      int $$6 = ars.c($$0.f);
      gw.a $$7 = new gw.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dfe $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int z(gw $$0) {
      return this.c($$0, this.v_());
   }

   default int c(gw $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(hz.a($$0), hz.a($$1));
   }

   @Deprecated
   default boolean A(gw $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(gw $$0, gw $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.C_() && $$1 < this.aj() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = hz.a($$0);
      int $$5 = hz.a($$2);
      int $$6 = hz.a($$1);
      int $$7 = hz.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   hu B_();

   cdx G();

   default <T> hi<T> a(aet<? extends ht<? extends T>> $$0) {
      ht<T> $$1 = this.B_().d($$0);
      return $$1.p().a(this.G());
   }
}
