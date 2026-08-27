import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ddp extends cwc implements ddq {
   public static final djy f = djx.C;
   protected static final float g = 4.0F;
   protected static final emm h = cwq.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dku a;

   protected ddp(dku $$0, djg.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ddp> a();

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return h;
   }

   @Override
   public boolean a(djh $$0) {
      return true;
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new die($$0, $$1);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      cmy $$6 = $$3.b($$4);
      cmt $$7 = $$6.d();
      cnx $$9 = $$6.d() instanceof cnx $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.ge();
      if ($$1.c_($$2) instanceof die $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            dif $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.x()) {
               $$1.a(null, $$11.aB_(), $$11.f(), art.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(dnr.c, $$11.aB_(), dnr.a.a($$3, $$11.r()));
               $$3.b(asc.c.b($$7));
               return bkb.a;
            } else if ($$14) {
               return bkb.a;
            } else if (!this.a($$3, $$11) && $$3.ge() && this.b($$3, $$11, $$12)) {
               this.a($$3, $$11, $$12);
               return this.a($$10);
            } else {
               return bkb.d;
            }
         } else {
            return !$$10 && !$$11.x() ? bkb.b : bkb.a;
         }
      } else {
         return bkb.d;
      }
   }

   private bkb a(boolean $$0) {
      return $$0 ? bkb.d : bkb.a;
   }

   private boolean b(cfi $$0, die $$1, boolean $$2) {
      dif $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(ve.a) || $$0x.b() instanceof wm);
   }

   public abstract float g(djh var1);

   public elt h(djh $$0) {
      return new elt(0.5, 0.5, 0.5);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(f) ? ees.c.a(false) : super.c_($$0);
   }

   public dku d() {
      return this.a;
   }

   public static dku a(cwq $$0) {
      dku $$1;
      if ($$0 instanceof ddp) {
         $$1 = ((ddp)$$0).d();
      } else {
         $$1 = dku.b;
      }

      return $$1;
   }

   public void a(cfi $$0, die $$1, boolean $$2) {
      $$1.a($$0.cw());
      $$0.a($$1, $$2);
   }

   private boolean a(cfi $$0, die $$1) {
      UUID $$2 = $$1.w();
      return $$2 != null && !$$2.equals($$0.cw());
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return a($$2, dgx.h, die::a);
   }
}
