import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czg extends cwj {
   public static final MapCodec<czg> a = b(czg::new);
   public static final dka b = djq.aQ;
   protected static final emf c = cwj.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<czg> a() {
      return a;
   }

   protected czg(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      dja $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof czi || $$3.b() instanceof dis;
   }

   @Override
   public dja a(cpa $$0) {
      return !this.o().a((ctl)$$0.q(), $$0.a()) ? cwl.j.o() : super.a($$0);
   }

   @Override
   public boolean g_(dja $$0) {
      return true;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return c;
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      int $$4 = $$0.c(b);
      if (!a((ctl)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cso)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cti $$0, dja $$1, hx $$2, blp $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bmf && ($$3 instanceof cfb || $$0.Z().b(cte.c)) && $$3.dg() * $$3.dg() * $$3.dh() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable blp $$0, dja $$1, cti $$2, hx $$3) {
      dja $$4 = a($$1, cwl.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dnk.c, $$3, dnk.a.a($$0, $$4));
   }

   private static boolean a(cso $$0, hx $$1) {
      return $$0.a_($$1.c()).a(asb.cp);
   }

   private static boolean a(ctl $$0, hx $$1) {
      for (hx $$2 : hx.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(asg.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
