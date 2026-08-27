import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czm extends cwp {
   public static final MapCodec<czm> a = b(czm::new);
   public static final dkg b = djw.aQ;
   protected static final eml c = cwp.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<czm> a() {
      return a;
   }

   protected czm(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      djg $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof czo || $$3.b() instanceof diy;
   }

   @Override
   public djg a(cpg $$0) {
      return !this.o().a((ctr)$$0.q(), $$0.a()) ? cwr.j.o() : super.a($$0);
   }

   @Override
   public boolean g_(djg $$0) {
      return true;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return c;
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      int $$4 = $$0.c(b);
      if (!a((ctr)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((csu)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cto $$0, djg $$1, hx $$2, blu $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bmk && ($$3 instanceof cfh || $$0.Z().b(ctk.c)) && $$3.dg() * $$3.dg() * $$3.dh() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable blu $$0, djg $$1, cto $$2, hx $$3) {
      djg $$4 = a($$1, cwr.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dnq.c, $$3, dnq.a.a($$0, $$4));
   }

   private static boolean a(csu $$0, hx $$1) {
      return $$0.a_($$1.c()).a(asg.cp);
   }

   private static boolean a(ctr $$0, hx $$1) {
      for (hx $$2 : hx.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(asl.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
