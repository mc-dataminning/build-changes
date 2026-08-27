import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czn extends cwq {
   public static final MapCodec<czn> a = b(czn::new);
   public static final dkh b = djx.aQ;
   protected static final emm c = cwq.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<czn> a() {
      return a;
   }

   protected czn(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      djh $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof czp || $$3.b() instanceof diz;
   }

   @Override
   public djh a(cph $$0) {
      return !this.o().a((cts)$$0.q(), $$0.a()) ? cws.j.o() : super.a($$0);
   }

   @Override
   public boolean g_(djh $$0) {
      return true;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return c;
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      int $$4 = $$0.c(b);
      if (!a((cts)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((csv)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(ctp $$0, djh $$1, hx $$2, blv $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bml && ($$3 instanceof cfi || $$0.Z().b(ctl.c)) && $$3.dg() * $$3.dg() * $$3.dh() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable blv $$0, djh $$1, ctp $$2, hx $$3) {
      djh $$4 = a($$1, cws.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dnr.c, $$3, dnr.a.a($$0, $$4));
   }

   private static boolean a(csv $$0, hx $$1) {
      return $$0.a_($$1.c()).a(ash.cp);
   }

   private static boolean a(cts $$0, hx $$1) {
      for (hx $$2 : hx.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(asm.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
