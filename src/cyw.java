import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyw extends cvz {
   public static final MapCodec<cyw> a = b(cyw::new);
   public static final djp b = djf.aQ;
   protected static final elu c = cvz.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<cyw> a() {
      return a;
   }

   protected cyw(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$1 == ia.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      dip $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cyy || $$3.b() instanceof dih;
   }

   @Override
   public dip a(coq $$0) {
      return !this.o().a((ctb)$$0.q(), $$0.a()) ? cwb.j.o() : super.a($$0);
   }

   @Override
   public boolean g_(dip $$0) {
      return true;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return c;
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      int $$4 = $$0.c(b);
      if (!a((ctb)$$1, $$2) && !$$1.q($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cse)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(csy $$0, dip $$1, hv $$2, blf $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof blv && ($$3 instanceof cer || $$0.Y().b(csu.c)) && $$3.dg() * $$3.dg() * $$3.dh() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable blf $$0, dip $$1, csy $$2, hv $$3) {
      dip $$4 = a($$1, cwb.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dmz.c, $$3, dmz.a.a($$0, $$4));
   }

   private static boolean a(cse $$0, hv $$1) {
      return $$0.a_($$1.c()).a(arr.cp);
   }

   private static boolean a(ctb $$0, hv $$1) {
      for (hv $$2 : hv.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(arw.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
