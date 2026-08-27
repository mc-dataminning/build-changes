import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class czq extends csd implements czr {
   public static final dfv e = dfu.C;
   protected static final float f = 4.0F;
   protected static final eib g = csq.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dgr a;

   protected czq(dfd.d $$0, dgr $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return g;
   }

   @Override
   public boolean a(dfe $$0) {
      return true;
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddy($$0, $$1);
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      cja $$6 = $$3.b($$4);
      civ $$7 = $$6.d();
      cjz $$9 = $$6.d() instanceof cjz $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.gc();
      if ($$1.c_($$2) instanceof ddy $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            ddz $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.w()) {
               $$1.a(null, $$11.p(), aoz.zP, apa.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(djo.c, $$11.p(), djo.a.a($$3, $$11.q()));
               $$3.b(apj.c.b($$7));
               return bgt.a;
            } else if ($$14) {
               return bgt.a;
            } else if (!this.a($$3, $$11) && $$3.gc() && this.b($$3, $$11, $$12)) {
               this.a($$3, $$11, $$12);
               return this.a($$10);
            } else {
               return bgt.d;
            }
         } else {
            return !$$10 && !$$11.w() ? bgt.b : bgt.a;
         }
      } else {
         return bgt.d;
      }
   }

   private bgt a(boolean $$0) {
      return $$0 ? bgt.d : bgt.a;
   }

   private boolean b(cbp $$0, ddy $$1, boolean $$2) {
      ddz $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.W())).allMatch($$0x -> $$0x.equals(th.a) || $$0x.b() instanceof un);
   }

   public abstract float g(dfe var1);

   public ehi h(dfe $$0) {
      return new ehi(0.5, 0.5, 0.5);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(e) ? eai.c.a(false) : super.c_($$0);
   }

   public dgr c() {
      return this.a;
   }

   public static dgr a(csq $$0) {
      dgr $$1;
      if ($$0 instanceof czq) {
         $$1 = ((czq)$$0).c();
      } else {
         $$1 = dgr.a;
      }

      return $$1;
   }

   public void a(cbp $$0, ddy $$1, boolean $$2) {
      $$1.a($$0.cv());
      $$0.a($$1, $$2);
   }

   private boolean a(cbp $$0, ddy $$1) {
      UUID $$2 = $$1.v();
      return $$2 != null && !$$2.equals($$0.cv());
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return a($$2, dcs.h, ddy::a);
   }
}
