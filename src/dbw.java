import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface dbw extends daw, dbd, dcj, dcu.a {
   @Nullable
   dtt a(int var1, int var2, dus var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dxp.a var1, int var2, int var3);

   int B_();

   dcu F_();

   default ji<dcs> t(iz $$0) {
      return this.F_().a($$0);
   }

   default Stream<drx> c(evh $$0) {
      int $$1 = ayu.a($$0.a);
      int $$2 = ayu.a($$0.d);
      int $$3 = ayu.a($$0.b);
      int $$4 = ayu.a($$0.e);
      int $$5 = ayu.a($$0.c);
      int $$6 = ayu.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(iz $$0, dbe $$1) {
      return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default ji<dcs> getNoiseBiome(int $$0, int $$1, int $$2) {
      dtt $$3 = this.a(jt.e($$0), jt.e($$2), dus.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   ji<dcs> a(int var1, int var2, int var3);

   boolean x_();

   @Deprecated
   int z_();

   dvp D_();

   @Override
   default int I_() {
      return this.D_().n();
   }

   @Override
   default int J_() {
      return this.D_().o();
   }

   default iz a(dxp.a $$0, iz $$1) {
      return new iz($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean u(iz $$0) {
      return this.a_($$0).i();
   }

   default boolean v(iz $$0) {
      if ($$0.v() >= this.z_()) {
         return this.h($$0);
      } else {
         iz $$1 = new iz($$0.u(), this.z_(), $$0.w());
         if (!this.h($$1)) {
            return false;
         } else {
            for (iz var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               drx $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float w(iz $$0) {
      return this.x($$0) - 0.5F;
   }

   @Deprecated
   default float x(iz $$0) {
      float $$1 = (float)this.A($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return ayu.i(this.D_().s(), $$2, 1.0F);
   }

   default dtt y(iz $$0) {
      return this.a(kb.a($$0.u()), kb.a($$0.w()));
   }

   default dtt a(int $$0, int $$1) {
      return this.a($$0, $$1, dus.n, true);
   }

   default dtt a(int $$0, int $$1, dus $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default daz c(int $$0, int $$1) {
      return this.a($$0, $$1, dus.c, false);
   }

   default boolean z(iz $$0) {
      return this.b_($$0).a(awr.a);
   }

   default boolean d(evh $$0) {
      int $$1 = ayu.a($$0.a);
      int $$2 = ayu.c($$0.d);
      int $$3 = ayu.a($$0.b);
      int $$4 = ayu.c($$0.e);
      int $$5 = ayu.a($$0.c);
      int $$6 = ayu.c($$0.f);
      iz.a $$7 = new iz.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               drx $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int A(iz $$0) {
      return this.c($$0, this.B_());
   }

   default int c(iz $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(kb.a($$0), kb.a($$1));
   }

   @Deprecated
   default boolean B(iz $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(iz $$0, iz $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.I_() && $$1 < this.am() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = kb.a($$0);
      int $$5 = kb.a($$2);
      int $$6 = kb.a($$1);
      int $$7 = kb.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   jw H_();

   cpg J();

   default <T> jk<T> a(ala<? extends jv<? extends T>> $$0) {
      jv<T> $$1 = this.H_().d($$0);
      return $$1.p().a(this.J());
   }
}
