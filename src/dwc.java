import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwc extends dne {
   public static final MapCodec<dwc> a = b(dwc::new);
   public static final ebx b = ebw.H;

   @Override
   public MapCodec<dwc> a() {
      return a;
   }

   public dwc(ebf.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.D($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if ($$1.D($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public ebg a(djz $$0, iw $$1, ebg $$2, crz $$3) {
      if (!$$0.A_() && !$$3.gk().d && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aru $$0, iw $$1, djs $$2) {
      if ($$0.O().c(djv.ad)) {
         cof $$3 = new cof($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
         int $$4 = $$3.g();
         $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static boolean a(djz $$0, iw $$1) {
      return a($$0, $$1, null);
   }

   private static boolean a(djz $$0, iw $$1, @Nullable bxw $$2) {
      if ($$0 instanceof aru $$3 && $$3.O().c(djv.ad)) {
         cof $$5 = new cof($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$5);
         $$0.a(null, $$5.dA(), $$5.dC(), $$5.dG(), awr.AC, aws.e, 1.0F, 1.0F);
         $$0.a($$2, egg.I, $$1);
         return true;
      }

      return false;
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if (!$$0.a(dae.pg) && !$$0.a(dae.vg)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         if (a($$2, $$3, $$4)) {
            $$2.a($$3, dng.a.m(), 11);
            czw $$7 = $$0.h();
            if ($$0.a(dae.pg)) {
               $$0.a(1, $$4, bxw.d($$5));
            } else {
               $$0.a(1, $$4);
            }

            $$4.b(axb.c.b($$7));
         } else if ($$2 instanceof aru $$8 && !$$8.O().c(djv.ad)) {
            $$4.a(xc.c("block.minecraft.tnt.disabled"), true);
            return but.e;
         }

         return but.a;
      }
   }

   @Override
   protected void a(djz $$0, ebg $$1, ffo $$2, csu $$3) {
      if ($$0 instanceof aru $$4) {
         iw $$5 = $$2.b();
         bwv $$6 = $$3.q();
         if ($$3.bX() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bxw ? (bxw)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(djs $$0) {
      return false;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }
}
