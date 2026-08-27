import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface czj extends cyj, cyq, czw, dah.a {
   @Nullable
   dre a(int var1, int var2, dsd var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dva.a var1, int var2, int var3);

   int B_();

   dah F_();

   default in<daf> t(id $$0) {
      return this.F_().a($$0);
   }

   default Stream<dpi> c(ese $$0) {
      int $$1 = axm.a($$0.a);
      int $$2 = axm.a($$0.d);
      int $$3 = axm.a($$0.b);
      int $$4 = axm.a($$0.e);
      int $$5 = axm.a($$0.c);
      int $$6 = axm.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(id $$0, cyr $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default in<daf> getNoiseBiome(int $$0, int $$1, int $$2) {
      dre $$3 = this.a(iy.e($$0), iy.e($$2), dsd.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   in<daf> a(int var1, int var2, int var3);

   boolean x_();

   @Deprecated
   int z_();

   dta D_();

   @Override
   default int I_() {
      return this.D_().n();
   }

   @Override
   default int J_() {
      return this.D_().o();
   }

   default id a(dva.a $$0, id $$1) {
      return new id($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(id $$0) {
      return this.a_($$0).i();
   }

   default boolean v(id $$0) {
      if ($$0.v() >= this.z_()) {
         return this.h($$0);
      } else {
         id $$1 = new id($$0.u(), this.z_(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (id var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               dpi $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(id $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(id $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return axm.i(this.D_().s(), $$2, 1.0F);
   }

   default dre y(id $$0) {
      return this.a(jg.a($$0.u()), jg.a($$0.w()));
   }

   default dre a(int $$0, int $$1) {
      return this.a($$0, $$1, dsd.n, true);
   }

   default dre a(int $$0, int $$1, dsd $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default cym c(int $$0, int $$1) {
      return this.a($$0, $$1, dsd.c, false);
   }

   default boolean z(id $$0) {
      return this.b_($$0).a(avj.a);
   }

   default boolean d(ese $$0) {
      int $$1 = axm.a($$0.a);
      int $$2 = axm.c($$0.d);
      int $$3 = axm.a($$0.b);
      int $$4 = axm.c($$0.e);
      int $$5 = axm.a($$0.c);
      int $$6 = axm.c($$0.f);
      id.a $$7 = new id.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dpi $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(id $$0) {
      return this.c($$0, this.B_());
   }

   default int c(id $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(jg.a($$0), jg.a($$1));
   }

   @Deprecated
   default boolean B(id $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(id $$0, id $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.I_() && $$1 < this.al() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = jg.a($$0);
      int $$5 = jg.a($$2);
      int $$6 = jg.a($$1);
      int $$7 = jg.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   jb H_();

   cmn J();

   default <T> ip<T> a(aju<? extends ja<? extends T>> $$0) {
      ja<T> $$1 = this.H_().d($$0);
      return $$1.p().a(this.J());
   }
}
