import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ddi extends cvv implements ddj {
   public static final djr f = djq.C;
   protected static final float g = 4.0F;
   protected static final emf h = cwj.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dkn a;

   protected ddi(dkn $$0, diz.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ddi> a();

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return h;
   }

   @Override
   public boolean a(dja $$0) {
      return true;
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhx($$0, $$1);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      cmr $$6 = $$3.b($$4);
      cmm $$7 = $$6.d();
      cnq $$9 = $$6.d() instanceof cnq $$8 ? $$8 : null;
      boolean $$10 = $$9 != null && $$3.ge();
      if ($$1.c_($$2) instanceof dhx $$11) {
         if (!$$1.B) {
            boolean $$12 = $$11.a($$3);
            dhy $$13 = $$11.a($$12);
            boolean $$14 = $$11.a($$3, $$1, $$2, $$12);
            if ($$11.x()) {
               $$1.a(null, $$11.aB_(), $$11.f(), arn.e);
               return this.a($$10);
            } else if ($$10 && !this.a($$3, $$11) && $$9.a($$13, $$3) && $$9.a($$1, $$11, $$12, $$3)) {
               if (!$$3.f()) {
                  $$6.h(1);
               }

               $$1.a(dnk.c, $$11.aB_(), dnk.a.a($$3, $$11.r()));
               $$3.b(arw.c.b($$7));
               return bjv.a;
            } else if ($$14) {
               return bjv.a;
            } else if (!this.a($$3, $$11) && $$3.ge() && this.b($$3, $$11, $$12)) {
               this.a($$3, $$11, $$12);
               return this.a($$10);
            } else {
               return bjv.d;
            }
         } else {
            return !$$10 && !$$11.x() ? bjv.b : bjv.a;
         }
      } else {
         return bjv.d;
      }
   }

   private bjv a(boolean $$0) {
      return $$0 ? bjv.d : bjv.a;
   }

   private boolean b(cfb $$0, dhx $$1, boolean $$2) {
      dhy $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(vc.a) || $$0x.b() instanceof wk);
   }

   public abstract float g(dja var1);

   public elm h(dja $$0) {
      return new elm(0.5, 0.5, 0.5);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(f) ? eel.c.a(false) : super.c_($$0);
   }

   public dkn d() {
      return this.a;
   }

   public static dkn a(cwj $$0) {
      dkn $$1;
      if ($$0 instanceof ddi) {
         $$1 = ((ddi)$$0).d();
      } else {
         $$1 = dkn.b;
      }

      return $$1;
   }

   public void a(cfb $$0, dhx $$1, boolean $$2) {
      $$1.a($$0.cw());
      $$0.a($$1, $$2);
   }

   private boolean a(cfb $$0, dhx $$1) {
      UUID $$2 = $$1.w();
      return $$2 != null && !$$2.equals($$0.cw());
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return a($$2, dgq.h, dhx::a);
   }
}
