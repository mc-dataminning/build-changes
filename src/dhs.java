import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dhs extends dgs, dgz, dih, diu.a {
   @Nullable
   eaj a(int var1, int var2, ebk var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(eel.a var1, int var2, int var3);

   int z_();

   diu D_();

   default js<dis> t(jj $$0) {
      return this.D_().a($$0);
   }

   default Stream<dym> c(fcp $$0) {
      int $$1 = azk.a($$0.a);
      int $$2 = azk.a($$0.d);
      int $$3 = azk.a($$0.b);
      int $$4 = azk.a($$0.e);
      int $$5 = azk.a($$0.c);
      int $$6 = azk.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(jj $$0, dha $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default js<dis> getNoiseBiome(int $$0, int $$1, int $$2) {
      eaj $$3 = this.a(kd.e($$0), kd.e($$2), ebk.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   js<dis> a(int var1, int var2, int var3);

   boolean w_();

   int P();

   ecj B_();

   @Override
   default int G_() {
      return this.B_().n();
   }

   @Override
   default int H_() {
      return this.B_().o();
   }

   default jj a(eel.a $$0, jj $$1) {
      return new jj($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(jj $$0) {
      return this.a_($$0).l();
   }

   default boolean v(jj $$0) {
      if ($$0.v() >= this.P()) {
         return this.h($$0);
      } else {
         jj $$1 = new jj($$0.u(), this.P(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (jj var4 = $$1.e(); var4.v() > $$0.v(); var4 = var4.e()) {
               dym $$2 = this.a_(var4);
               if ($$2.g() > 0 && !$$2.n()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(jj $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(jj $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return azk.h(this.B_().s(), $$2, 1.0F);
   }

   default eaj y(jj $$0) {
      return this.a(kl.a($$0.u()), kl.a($$0.w()));
   }

   default eaj a(int $$0, int $$1) {
      return this.a($$0, $$1, ebk.n, true);
   }

   default eaj a(int $$0, int $$1, ebk $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default dgv c(int $$0, int $$1) {
      return this.a($$0, $$1, ebk.c, false);
   }

   default boolean z(jj $$0) {
      return this.b_($$0).a(axf.a);
   }

   default boolean d(fcp $$0) {
      int $$1 = azk.a($$0.a);
      int $$2 = azk.c($$0.d);
      int $$3 = azk.a($$0.b);
      int $$4 = azk.c($$0.e);
      int $$5 = azk.a($$0.c);
      int $$6 = azk.c($$0.f);
      jj.a $$7 = new jj.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dym $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.y().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(jj $$0) {
      return this.c($$0, this.z_());
   }

   default int c(jj $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(kl.a($$0), kl.a($$1));
   }

   @Deprecated
   default boolean B(jj $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(jj $$0, jj $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.G_() && $$1 <= this.ao() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = kl.a($$0);
      int $$5 = kl.a($$2);
      int $$6 = kl.a($$1);
      int $$7 = kl.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   kg F_();

   cte K();

   default <T> ju<T> a(alc<? extends kf<? extends T>> $$0) {
      kf<T> $$1 = this.F_().f($$0);
      return $$1.a(this.K());
   }
}
