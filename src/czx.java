import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class czx extends csk implements czy {
   public static final dgc e = dgb.C;
   protected static final float f = 4.0F;
   protected static final eii g = csx.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dgy a;

   protected czx(dfk.d $$0, dgy $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return g;
   }

   @Override
   public boolean a(dfl $$0) {
      return true;
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new def($$0, $$1);
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      cjh $$6 = $$3.b($$4);
      cjc $$7 = $$6.d();
      ckg $$9 = $$6.d() instanceof ckg $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.gd();
      if ($$1.c_($$2) instanceof def $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            deg $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.w()) {
               $$1.a(null, $$11.p(), apf.zP, apg.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(djv.c, $$11.p(), djv.a.a($$3, $$11.q()));
               $$3.b(app.c.b($$7));
               return bha.a;
            } else if ($$14) {
               return bha.a;
            } else if (!this.a($$3, $$11) && $$3.gd() && this.b($$3, $$11, $$12)) {
               this.a($$3, $$11, $$12);
               return this.a($$10);
            } else {
               return bha.d;
            }
         } else {
            return !$$10 && !$$11.w() ? bha.b : bha.a;
         }
      } else {
         return bha.d;
      }
   }

   private bha a(boolean $$0) {
      return $$0 ? bha.d : bha.a;
   }

   private boolean b(cbw $$0, def $$1, boolean $$2) {
      deg $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.W())).allMatch($$0x -> $$0x.equals(tm.a) || $$0x.b() instanceof us);
   }

   public abstract float g(dfl var1);

   public ehp h(dfl $$0) {
      return new ehp(0.5, 0.5, 0.5);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(e) ? eap.c.a(false) : super.c_($$0);
   }

   public dgy c() {
      return this.a;
   }

   public static dgy a(csx $$0) {
      dgy $$1;
      if ($$0 instanceof czx) {
         $$1 = ((czx)$$0).c();
      } else {
         $$1 = dgy.a;
      }

      return $$1;
   }

   public void a(cbw $$0, def $$1, boolean $$2) {
      $$1.a($$0.cv());
      $$0.a($$1, $$2);
   }

   private boolean a(cbw $$0, def $$1) {
      UUID $$2 = $$1.v();
      return $$2 != null && !$$2.equals($$0.cv());
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return a($$2, dcz.h, def::a);
   }
}
