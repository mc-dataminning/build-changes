import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwv extends cua {
   public static final MapCodec<cwv> a = b(cwv::new);
   public static final dhb b = dgr.aQ;
   protected static final eiy c = cua.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<cwv> a() {
      return a;
   }

   protected cwv(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1 == hx.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      dgb $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof cwx || $$3.b() instanceof dft;
   }

   @Override
   public dgb a(cmr $$0) {
      return !this.o().a((crc)$$0.q(), $$0.a()) ? cuc.j.o() : super.a($$0);
   }

   @Override
   public boolean g_(dgb $$0) {
      return true;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return c;
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      int $$4 = $$0.c(b);
      if (!a((crc)$$1, $$2) && !$$1.q($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((cqf)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(cqz $$0, dgb $$1, ht $$2, bjt $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bkj && ($$3 instanceof ccx || $$0.X().b(cqv.c)) && $$3.df() * $$3.df() * $$3.dg() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable bjt $$0, dgb $$1, cqz $$2, ht $$3) {
      dgb $$4 = a($$1, cuc.j.o(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dkl.c, $$3, dkl.a.a($$0, $$4));
   }

   private static boolean a(cqf $$0, ht $$1) {
      return $$0.a_($$1.c()).a(aqs.cp);
   }

   private static boolean a(crc $$0, ht $$1) {
      for (ht $$2 : ht.a($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(aqx.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
