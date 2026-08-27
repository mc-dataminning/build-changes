import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class czv extends csi implements czw {
   public static final dga e = dfz.C;
   protected static final float f = 4.0F;
   protected static final eig g = csv.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dgw a;

   protected czv(dfi.d $$0, dgw $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return g;
   }

   @Override
   public boolean a(dfj $$0) {
      return true;
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new ded($$0, $$1);
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      cjf $$6 = $$3.b($$4);
      cja $$7 = $$6.d();
      cke $$9 = $$6.d() instanceof cke $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.gd();
      if ($$1.c_($$2) instanceof ded $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            dee $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.w()) {
               $$1.a(null, $$11.p(), apd.zP, ape.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(djt.c, $$11.p(), djt.a.a($$3, $$11.q()));
               $$3.b(apn.c.b($$7));
               return bgy.a;
            } else if ($$14) {
               return bgy.a;
            } else if (!this.a($$3, $$11) && $$3.gd() && this.b($$3, $$11, $$12)) {
               this.a($$3, $$11, $$12);
               return this.a($$10);
            } else {
               return bgy.d;
            }
         } else {
            return !$$10 && !$$11.w() ? bgy.b : bgy.a;
         }
      } else {
         return bgy.d;
      }
   }

   private bgy a(boolean $$0) {
      return $$0 ? bgy.d : bgy.a;
   }

   private boolean b(cbu $$0, ded $$1, boolean $$2) {
      dee $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.W())).allMatch($$0x -> $$0x.equals(tk.a) || $$0x.b() instanceof uq);
   }

   public abstract float g(dfj var1);

   public ehn h(dfj $$0) {
      return new ehn(0.5, 0.5, 0.5);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(e) ? ean.c.a(false) : super.c_($$0);
   }

   public dgw c() {
      return this.a;
   }

   public static dgw a(csv $$0) {
      dgw $$1;
      if ($$0 instanceof czv) {
         $$1 = ((czv)$$0).c();
      } else {
         $$1 = dgw.a;
      }

      return $$1;
   }

   public void a(cbu $$0, ded $$1, boolean $$2) {
      $$1.a($$0.cv());
      $$0.a($$1, $$2);
   }

   private boolean a(cbu $$0, ded $$1) {
      UUID $$2 = $$1.v();
      return $$2 != null && !$$2.equals($$0.cv());
   }

   @Nullable
   @Override
   public <T extends dcv> dcw<T> a(cpv $$0, dfj $$1, dcx<T> $$2) {
      return a($$2, dcx.h, ded::a);
   }
}
