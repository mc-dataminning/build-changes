import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duv extends dma {
   public static final MapCodec<duv> a = b(duv::new);
   public static final eaq b = eap.H;

   @Override
   public MapCodec<duv> a() {
      return a;
   }

   public duv(dzy.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.D($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      if ($$1.D($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dzz a(div $$0, iu $$1, dzz $$2, cqy $$3) {
      if (!$$0.w_() && !$$3.gj().d && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(arq $$0, iu $$1, dio $$2) {
      cne $$3 = new cne($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.g();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(div $$0, iu $$1) {
      a($$0, $$1, null);
   }

   private static void a(div $$0, iu $$1, @Nullable bxc $$2) {
      if (!$$0.C) {
         cne $$3 = new cne($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dA(), $$3.dC(), $$3.dG(), awn.Az, awo.e, 1.0F, 1.0F);
         $$0.a($$2, eez.I, $$1);
      }
   }

   @Override
   protected bub a(cyy $$0, dzz $$1, div $$2, iu $$3, cqy $$4, bua $$5, fee $$6) {
      if (!$$0.a(czc.pd) && !$$0.a(czc.vb)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dmc.a.m(), 11);
         cyu $$7 = $$0.h();
         if ($$0.a(czc.pd)) {
            $$0.a(1, $$4, bxc.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awx.c.b($$7));
         return bub.a;
      }
   }

   @Override
   protected void a(div $$0, dzz $$1, fee $$2, crs $$3) {
      if ($$0 instanceof arq $$4) {
         iu $$5 = $$2.b();
         bwd $$6 = $$3.q();
         if ($$3.bY() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bxc ? (bxc)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dio $$0) {
      return false;
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b);
   }
}
