import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dce extends cur implements dcf {
   public static final die f = did.C;
   protected static final float g = 4.0F;
   protected static final eks h = cvf.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dja a;

   protected dce(dja $$0, dhm.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dce> a();

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return h;
   }

   @Override
   public boolean a(dhn $$0) {
      return true;
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgr($$0, $$1);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      clo $$6 = $$3.b($$4);
      clj $$7 = $$6.d();
      cmn $$9 = $$6.d() instanceof cmn $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.gf();
      if ($$1.c_($$2) instanceof dgr $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            dgs $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.x()) {
               $$1.a(null, $$11.aC_(), $$11.f(), aqw.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(dlx.c, $$11.aC_(), dlx.a.a($$3, $$11.r()));
               $$3.b(arf.c.b($$7));
               return bjb.a;
            } else if ($$14) {
               return bjb.a;
            } else if (!this.a($$3, $$11) && $$3.gf() && this.b($$3, $$11, $$12)) {
               this.a($$3, $$11, $$12);
               return this.a($$10);
            } else {
               return bjb.d;
            }
         } else {
            return !$$10 && !$$11.x() ? bjb.b : bjb.a;
         }
      } else {
         return bjb.d;
      }
   }

   private bjb a(boolean $$0) {
      return $$0 ? bjb.d : bjb.a;
   }

   private boolean b(cdz $$0, dgr $$1, boolean $$2) {
      dgs $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(uu.a) || $$0x.b() instanceof wc);
   }

   public abstract float g(dhn var1);

   public ejz h(dhn $$0) {
      return new ejz(0.5, 0.5, 0.5);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(f) ? ecy.c.a(false) : super.c_($$0);
   }

   public dja d() {
      return this.a;
   }

   public static dja a(cvf $$0) {
      dja $$1;
      if ($$0 instanceof dce) {
         $$1 = ((dce)$$0).d();
      } else {
         $$1 = dja.b;
      }

      return $$1;
   }

   public void a(cdz $$0, dgr $$1, boolean $$2) {
      $$1.a($$0.cw());
      $$0.a($$1, $$2);
   }

   private boolean a(cdz $$0, dgr $$1) {
      UUID $$2 = $$1.w();
      return $$2 != null && !$$2.equals($$0.cw());
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return a($$2, dfk.h, dgr::a);
   }
}
