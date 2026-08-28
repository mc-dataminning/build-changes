import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwa extends dnc {
   public static final MapCodec<dwa> a = b(dwa::new);
   public static final ebv b = ebu.H;

   @Override
   public MapCodec<dwa> a() {
      return a;
   }

   public dwa(ebd.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.D($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if ($$1.D($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public ebe a(djx $$0, iv $$1, ebe $$2, crx $$3) {
      if (!$$0.A_() && !$$3.gk().d && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ars $$0, iv $$1, djq $$2) {
      cod $$3 = new cod($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.g();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(djx $$0, iv $$1) {
      a($$0, $$1, null);
   }

   private static void a(djx $$0, iv $$1, @Nullable bxu $$2) {
      if (!$$0.C) {
         cod $$3 = new cod($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dA(), $$3.dC(), $$3.dG(), awp.AC, awq.e, 1.0F, 1.0F);
         $$0.a($$2, ege.I, $$1);
      }
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if (!$$0.a(dac.pg) && !$$0.a(dac.vg)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dne.a.m(), 11);
         czu $$7 = $$0.h();
         if ($$0.a(dac.pg)) {
            $$0.a(1, $$4, bxu.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awz.c.b($$7));
         return bur.a;
      }
   }

   @Override
   protected void a(djx $$0, ebe $$1, ffm $$2, css $$3) {
      if ($$0 instanceof ars $$4) {
         iv $$5 = $$2.b();
         bwt $$6 = $$3.q();
         if ($$3.bX() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bxu ? (bxu)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(djq $$0) {
      return false;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }
}
