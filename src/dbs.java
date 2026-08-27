import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dbs extends cuf implements dbt {
   public static final dhn f = dhm.C;
   protected static final float g = 4.0F;
   protected static final ekb h = cut.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dij a;

   protected dbs(dij $$0, dgv.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dbs> a();

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ech.c, ech.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return h;
   }

   @Override
   public boolean a(dgw $$0) {
      return true;
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dga($$0, $$1);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      clb $$6 = $$3.b($$4);
      ckw $$7 = $$6.d();
      cma $$9 = $$6.d() instanceof cma $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.ge();
      if ($$1.c_($$2) instanceof dga $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            dgb $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.x()) {
               $$1.a(null, $$11.p(), $$11.f(), aqo.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(dlg.c, $$11.p(), dlg.a.a($$3, $$11.q()));
               $$3.b(aqx.c.b($$7));
               return biq.a;
            } else if ($$14) {
               return biq.a;
            } else if (!this.a($$3, $$11) && $$3.ge() && this.b($$3, $$11, $$12)) {
               this.a($$3, $$11, $$12);
               return this.a($$10);
            } else {
               return biq.d;
            }
         } else {
            return !$$10 && !$$11.x() ? biq.b : biq.a;
         }
      } else {
         return biq.d;
      }
   }

   private biq a(boolean $$0) {
      return $$0 ? biq.d : biq.a;
   }

   private boolean b(cdm $$0, dga $$1, boolean $$2) {
      dgb $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.W())).allMatch($$0x -> $$0x.equals(uq.a) || $$0x.b() instanceof vy);
   }

   public abstract float g(dgw var1);

   public eji h(dgw $$0) {
      return new eji(0.5, 0.5, 0.5);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(f) ? ech.c.a(false) : super.c_($$0);
   }

   public dij d() {
      return this.a;
   }

   public static dij a(cut $$0) {
      dij $$1;
      if ($$0 instanceof dbs) {
         $$1 = ((dbs)$$0).d();
      } else {
         $$1 = dij.b;
      }

      return $$1;
   }

   public void a(cdm $$0, dga $$1, boolean $$2) {
      $$1.a($$0.cv());
      $$0.a($$1, $$2);
   }

   private boolean a(cdm $$0, dga $$1) {
      UUID $$2 = $$1.w();
      return $$2 != null && !$$2.equals($$0.cv());
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return a($$2, det.h, dga::a);
   }
}
