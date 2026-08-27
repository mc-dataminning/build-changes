import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czv extends cwy {
   public static final MapCodec<czv> a = b(czv::new);
   public static final dkp b = dkf.aQ;
   protected static final emv c = cwy.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<czv> a() {
      return a;
   }

   protected czv(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      djp $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof czx || $$3.b() instanceof djh;
   }

   @Override
   public djp a(cpp $$0) {
      return !this.o().a((cua)$$0.q(), $$0.a()) ? cxa.j.o() : super.a($$0);
   }

   @Override
   public boolean g_(djp $$0) {
      return true;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return c;
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      int $$4 = $$0.c(b);
      if (!a((cua)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((ctd)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(ctx $$0, djp $$1, hx $$2, blw $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bmo && ($$3 instanceof cfq || $$0.Z().b(ctt.c)) && $$3.dg() * $$3.dg() * $$3.dh() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable blw $$0, djp $$1, ctx $$2, hx $$3) {
      djp $$4 = a($$1, cxa.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dnz.c, $$3, dnz.a.a($$0, $$4));
   }

   private static boolean a(ctd $$0, hx $$1) {
      return $$0.a_($$1.c()).a(asi.cp);
   }

   private static boolean a(cua $$0, hx $$1) {
      for (hx $$2 : hx.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(asn.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
