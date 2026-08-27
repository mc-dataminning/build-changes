import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class ddx extends cwk implements ddy {
   public static final dkg f = dkf.C;
   protected static final float g = 4.0F;
   protected static final emv h = cwy.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private final dlc a;

   protected ddx(dlc $$0, djo.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ddx> a();

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return h;
   }

   @Override
   public boolean a(djp $$0) {
      return true;
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dim($$0, $$1);
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      if ($$2.c_($$3) instanceof dim $$7) {
         cof $$10 = $$0.d() instanceof cof $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.ge();
         if (!$$2.B) {
            if ($$11 && !$$7.x() && !this.a($$4, $$7)) {
               boolean $$12 = $$7.a($$4);
               if ($$10.a($$7.a($$12), $$4) && $$10.a($$2, $$7, $$12, $$4)) {
                  $$7.a($$4, $$2, $$3, $$12);
                  $$4.b(asd.c.b($$0.d()));
                  $$2.a(dnz.c, $$7.aE_(), dnz.a.a($$4, $$7.r()));
                  if (!$$4.f()) {
                     $$0.h(1);
                  }

                  return bke.a;
               } else {
                  return bke.d;
               }
            } else {
               return bke.d;
            }
         } else {
            return !$$11 && !$$7.x() ? bke.b : bke.a;
         }
      } else {
         return bke.e;
      }
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.c_($$2) instanceof dim $$5) {
         if ($$1.B) {
            ac.b(new IllegalStateException("Expected to only call this on server"));
         }

         boolean $$7 = $$5.a($$3);
         boolean $$8 = $$5.a($$3, $$1, $$2, $$7);
         if ($$5.x()) {
            $$1.a(null, $$5.aE_(), $$5.f(), aru.e);
            return bkc.a;
         } else if ($$8) {
            return bkc.a;
         } else if (!this.a($$3, $$5) && $$3.ge() && this.b($$3, $$5, $$7)) {
            this.a($$3, $$5, $$7);
            return bkc.a;
         } else {
            return bkc.d;
         }
      } else {
         return bkc.d;
      }
   }

   private boolean b(cfq $$0, dim $$1, boolean $$2) {
      din $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.Y())).allMatch($$0x -> $$0x.equals(vf.a) || $$0x.b() instanceof wn);
   }

   public abstract float g(djp var1);

   public emc h(djp $$0) {
      return new emc(0.5, 0.5, 0.5);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(f) ? efa.c.a(false) : super.c_($$0);
   }

   public dlc d() {
      return this.a;
   }

   public static dlc a(cwy $$0) {
      dlc $$1;
      if ($$0 instanceof ddx) {
         $$1 = ((ddx)$$0).d();
      } else {
         $$1 = dlc.b;
      }

      return $$1;
   }

   public void a(cfq $$0, dim $$1, boolean $$2) {
      $$1.a($$0.cw());
      $$0.a($$1, $$2);
   }

   private boolean a(cfq $$0, dim $$1) {
      UUID $$2 = $$1.w();
      return $$2 != null && !$$2.equals($$0.cw());
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return a($$2, dhf.h, dim::a);
   }
}
