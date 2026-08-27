import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class cty extends cxu implements cud, daz {
   public static final MapCodec<cty> a = b(cty::new);
   private static final dgs f = dgr.C;
   private static final int g = 6;
   protected static final eiy b = cua.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final eiy c = cua.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final eiy d = cua.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final eiy e = cua.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<cty> a() {
      return a;
   }

   protected cty(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, hx.c));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      switch ((hx)$$0.c(aE)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(f, aE);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(f) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      ht $$3 = $$2.d();
      dgb $$4 = $$1.a_($$3);
      dgb $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(aqs.bx)) && ($$5.a(this) || $$5.a(cuc.rC));
   }

   protected static boolean a(cra $$0, ht $$1, ebe $$2, hx $$3) {
      dgb $$4 = cuc.rD.o().a(f, Boolean.valueOf($$2.a(ebf.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if (($$1 == hx.a || $$1 == hx.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      Optional<ht> $$3 = l.a($$0, $$1, $$2.b(), hx.b, cuc.rC);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ht $$4 = $$3.get().c();
         dgb $$5 = $$0.a_($$4);
         return ctx.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      Optional<ht> $$4 = l.a($$0, $$2, $$3.b(), hx.b, cuc.rC);
      if (!$$4.isEmpty()) {
         ht $$5 = $$4.get();
         ht $$6 = $$5.c();
         hx $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         ctx.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return new ckj(cuc.rC);
   }
}
