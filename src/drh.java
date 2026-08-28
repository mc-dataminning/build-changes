import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class drh extends djq implements dri {
   public static final dye f = dyd.D;
   protected static final float g = 4.0F;
   protected static final fcm h = dke.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dyz a;

   protected drh(dyz $$0, dxm.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends drh> a();

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return h;
   }

   @Override
   public boolean a(dxn $$0) {
      return true;
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dwc($$0, $$1);
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      if ($$2.c_($$3) instanceof dwc $$7) {
         cyo $$10 = $$0.h() instanceof cyo $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gt();
         if (!$$2.C) {
            if ($$11 && !$$7.v() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(axp.c.b($$0.h()));
                  $$2.a(ecj.c, $$7.aB_(), ecj.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bte.a;
               } else {
                  return bte.f;
               }
            } else {
               return bte.f;
            }
         } else {
            return !$$11 && !$$7.v() ? bte.c : bte.a;
         }
      } else {
         return bte.e;
      }
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if ($$1.c_($$2) instanceof dwc $$5) {
         if ($$1.C) {
            ae.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.v()) {
            $$1.a(null, $$5.aB_(), $$5.d(), axg.e);
            return bte.b;
         } else if ($$8) {
            return bte.b;
         } else if (!this.a($$3, $$5) && $$3.gt() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bte.b;
         } else {
            return bte.e;
         }
      } else {
         return bte.e;
      }
   }

   private boolean b(cps $$0, dwc $$1, boolean $$2) {
      dwd $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.aa())).allMatch($$0x -> $$0x.equals(xu.a) || $$0x.b() instanceof zc);
   }

   public abstract float h(dxn var1);

   public fbs o(dxn $$0) {
      return new fbs(0.5, 0.5, 0.5);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(f) ? etq.c.a(false) : super.b_($$0);
   }

   public dyz d() {
      return this.a;
   }

   public static dyz a(dke $$0) {
      dyz $$1;
      if ($$0 instanceof drh) {
         $$1 = ((drh)$$0).d();
      } else {
         $$1 = dyz.b;
      }

      return $$1;
   }

   public void a(cps $$0, dwc $$1, boolean $$2) {
      $$1.a($$0.cG());
      $$0.a($$1, $$2);
   }

   private boolean a(cps $$0, dwc $$1) {
      UUID $$2 = $$1.u();
      return $$2 != null && !$$2.equals($$0.cG());
   }

   @Nullable
   @Override
   public <T extends dup> duq<T> a(dha $$0, dxn $$1, dur<T> $$2) {
      return a($$2, dur.h, dwc::a);
   }
}
