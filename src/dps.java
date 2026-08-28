import com.mojang.serialization.MapCodec;
import java.util.Set;

public class dps extends dmo implements dtb {
   public static final MapCodec<dps> a = b(dps::new);
   private static final fgk b = dnc.b(16.0, 6.0, 12.0);

   @Override
   public MapCodec<dps> a() {
      return a;
   }

   protected dps(ebd.d $$0) {
      super($$0);
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzz($$0, $$1);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return b;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, bwt $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if ($$3.n(false)) {
         if (!$$1.C && $$1.aj() == djx.k && $$3 instanceof art $$5 && !$$5.i) {
            $$5.n();
            return;
         }

         $$3.a(this, $$2);
      }
   }

   @Override
   public eyo a(ars $$0, bwt $$1, iv $$2) {
      alh<djx> $$3 = $$0.aj() == djx.k ? djx.i : djx.k;
      ars $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$3 == djx.k;
         iv $$6 = $$5 ? ars.a : $$4.aa();
         ffq $$7 = $$6.c();
         float $$8;
         Set<byi> $$9;
         if ($$5) {
            ekh.a($$4, iv.a((jp)$$7).e(), true);
            $$8 = jb.e.p();
            $$9 = byi.a(byi.l, Set.of(byi.e));
            if ($$1 instanceof art) {
               $$7 = $$7.a(0.0, 1.0, 0.0);
            }
         } else {
            $$8 = 0.0F;
            $$9 = byi.a(byi.l, byi.k);
            if ($$1 instanceof art $$12) {
               return $$12.a(false, eyo.a);
            }

            $$7 = $$1.a($$4, $$6).c();
         }

         return new eyo($$4, $$7, ffq.c, $$8, 0.0F, $$9, eyo.b.then(eyo.c));
      }
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      double $$4 = (double)$$2.u() + $$3.j();
      double $$5 = (double)$$2.v() + 0.8;
      double $$6 = (double)$$2.w() + $$3.j();
      $$1.a(ly.ah, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return czy.k;
   }

   @Override
   protected boolean a(ebe $$0, exn $$1) {
      return false;
   }

   @Override
   protected dtp a_(ebe $$0) {
      return dtp.a;
   }
}
