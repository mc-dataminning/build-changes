import com.mojang.serialization.MapCodec;

public class dns extends dne {
   public static final MapCodec<dns> a = b(dns::new);
   public static final int b = 6;
   public static final ecg c = ebw.aB;
   public static final int d = b(0);
   private static final fgm[] e = dne.a(6, $$0 -> dne.a((double)(1 + $$0 * 2), 0.0, 1.0, 15.0, 8.0, 15.0));

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   protected dns(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      czw $$7 = $$0.h();
      if ($$0.a(axo.aP) && $$1.c(c) == 0 && dne.a($$7) instanceof dnv $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awr.dv, aws.e, 1.0F, 1.0F);
         $$2.b($$3, dnw.a($$8));
         $$2.a($$4, egg.c, $$3);
         $$4.b(axb.c.b($$7));
         return but.a;
      } else {
         return but.f;
      }
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return but.a;
         }

         if ($$3.b(bus.a).f()) {
            return but.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static but a(dka $$0, iw $$1, ebg $$2, crz $$3) {
      if (!$$3.t(false)) {
         return but.e;
      } else {
         $$3.a(axb.U);
         $$3.gu().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, egg.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, egg.f, $$1);
         }

         return but.a;
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4 == jc.a && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
