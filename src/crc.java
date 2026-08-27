import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface crc extends cqc, cqj, crp, crz.a {
   @Nullable
   dhx a(int var1, int var2, dic var3, boolean var4);

   @Deprecated
   boolean b(int var1, int var2);

   int a(dlk.a var1, int var2, int var3);

   int B_();

   crz F_();

   default ib<crx> s(ht $$0) {
      return this.F_().a($$0);
   }

   default Stream<dgb> c(eia $$0) {
      int $$1 = asy.a($$0.a);
      int $$2 = asy.a($$0.d);
      int $$3 = asy.a($$0.b);
      int $$4 = asy.a($$0.e);
      int $$5 = asy.a($$0.c);
      int $$6 = asy.a($$0.f);
      return this.a($$1, $$3, $$5, $$2, $$4, $$6) ? this.a($$0) : Stream.empty();
   }

   @Override
   default int a(ht $$0, cqk $$1) {
      return $$1.getColor(this.s($$0).a(), (double)$$0.u(), (double)$$0.w());
   }

   @Override
   default ib<crx> getNoiseBiome(int $$0, int $$1, int $$2) {
      dhx $$3 = this.a(in.e($$0), in.e($$2), dic.f, false);
      return $$3 != null ? $$3.getNoiseBiome($$0, $$1, $$2) : this.a($$0, $$1, $$2);
   }

   ib<crx> a(int var1, int var2, int var3);

   boolean x_();

   @Deprecated
   int z_();

   djk D_();

   @Override
   default int I_() {
      return this.D_().n();
   }

   @Override
   default int J_() {
      return this.D_().o();
   }

   default ht a(dlk.a $$0, ht $$1) {
      return new ht($$1.u(), this.a($$0, $$1.u(), $$1.w()), $$1.w());
   }

   default boolean t(ht $$0) {
      return this.a_($$0).i();
   }

   default boolean u(ht $$0) {
      if ($$0.v() >= this.z_()) {
         return this.g($$0);
      } else {
         ht $$1 = new ht($$0.u(), this.z_(), $$0.w());
         if (!this.g($$1)) {
            return false;
         } else {
            for (ht var4 = $$1.d(); var4.v() > $$0.v(); var4 = var4.d()) {
               dgb $$2 = this.a_(var4);
               if ($$2.b(this, var4) > 0 && !$$2.k()) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   default float v(ht $$0) {
      return this.w($$0) - 0.5F;
   }

   @Deprecated
   default float w(ht $$0) {
      float $$1 = (float)this.z($$0) / 15.0F;
      float $$2 = $$1 / (4.0F - 3.0F * $$1);
      return asy.i(this.D_().s(), $$2, 1.0F);
   }

   default dhx x(ht $$0) {
      return this.a(iu.a($$0.u()), iu.a($$0.w()));
   }

   default dhx a(int $$0, int $$1) {
      return this.a($$0, $$1, dic.n, true);
   }

   default dhx a(int $$0, int $$1, dic $$2) {
      return this.a($$0, $$1, $$2, true);
   }

   @Nullable
   @Override
   default cqf c(int $$0, int $$1) {
      return this.a($$0, $$1, dic.c, false);
   }

   default boolean y(ht $$0) {
      return this.b_($$0).a(aqx.a);
   }

   default boolean d(eia $$0) {
      int $$1 = asy.a($$0.a);
      int $$2 = asy.c($$0.d);
      int $$3 = asy.a($$0.b);
      int $$4 = asy.c($$0.e);
      int $$5 = asy.a($$0.c);
      int $$6 = asy.c($$0.f);
      ht.a $$7 = new ht.a();

      for (int $$8 = $$1; $$8 < $$2; $$8++) {
         for (int $$9 = $$3; $$9 < $$4; $$9++) {
            for (int $$10 = $$5; $$10 < $$6; $$10++) {
               dgb $$11 = this.a_($$7.d($$8, $$9, $$10));
               if (!$$11.u().c()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int z(ht $$0) {
      return this.c($$0, this.B_());
   }

   default int c(ht $$0, int $$1) {
      return $$0.u() >= -30000000 && $$0.w() >= -30000000 && $$0.u() < 30000000 && $$0.w() < 30000000 ? this.b($$0, $$1) : 15;
   }

   @Deprecated
   default boolean f(int $$0, int $$1) {
      return this.b(iu.a($$0), iu.a($$1));
   }

   @Deprecated
   default boolean A(ht $$0) {
      return this.f($$0.u(), $$0.w());
   }

   @Deprecated
   default boolean a(ht $$0, ht $$1) {
      return this.a($$0.u(), $$0.v(), $$0.w(), $$1.u(), $$1.v(), $$1.w());
   }

   @Deprecated
   default boolean a(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      return $$4 >= this.I_() && $$1 < this.aj() ? this.b($$0, $$2, $$3, $$5) : false;
   }

   @Deprecated
   default boolean b(int $$0, int $$1, int $$2, int $$3) {
      int $$4 = iu.a($$0);
      int $$5 = iu.a($$2);
      int $$6 = iu.a($$1);
      int $$7 = iu.a($$3);

      for (int $$8 = $$4; $$8 <= $$5; $$8++) {
         for (int $$9 = $$6; $$9 <= $$7; $$9++) {
            if (!this.b($$8, $$9)) {
               return false;
            }
         }
      }

      return true;
   }

   ip H_();

   cfg G();

   default <T> id<T> a(afv<? extends io<? extends T>> $$0) {
      io<T> $$1 = this.H_().d($$0);
      return $$1.p().a(this.G());
   }
}
