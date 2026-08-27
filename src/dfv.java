import com.mojang.serialization.MapCodec;
import java.util.Arrays;

public class dfv extends cwb {
   public static final MapCodec<dfv> b = b(dfv::new);
   public static final dgz<dhd> c = dgr.bg;
   public static final dgs d = dgr.x;
   public static final float e = 4.0F;
   protected static final eiy f = cua.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eiy g = cua.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final eiy h = cua.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final eiy i = cua.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final eiy j = cua.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eiy k = cua.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float l = 2.0F;
   protected static final float m = 6.0F;
   protected static final float n = 10.0F;
   protected static final eiy o = cua.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eiy F = cua.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final eiy G = cua.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final eiy H = cua.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final eiy I = cua.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eiy J = cua.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final eiy K = cua.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eiy L = cua.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eiy M = cua.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final eiy N = cua.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final eiy O = cua.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eiy P = cua.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final eiy[] Q = a(true);
   private static final eiy[] R = a(false);

   @Override
   protected MapCodec<dfv> a() {
      return b;
   }

   private static eiy[] a(boolean $$0) {
      return Arrays.stream(hx.values()).map($$1 -> a($$1, $$0)).toArray(eiy[]::new);
   }

   private static eiy a(hx $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return eiv.a(k, $$1 ? L : F);
         case b:
            return eiv.a(j, $$1 ? K : o);
         case c:
            return eiv.a(i, $$1 ? N : H);
         case d:
            return eiv.a(h, $$1 ? M : G);
         case e:
            return eiv.a(g, $$1 ? P : J);
         case f:
            return eiv.a(f, $$1 ? O : I);
      }
   }

   public dfv(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, hx.c).a(c, dhd.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dgb $$0) {
      return true;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return ($$0.c(d) ? Q : R)[$$0.c(a).ordinal()];
   }

   private boolean a(dgb $$0, dgb $$1) {
      cua $$2 = $$0.c(c) == dhd.a ? cuc.by : cuc.br;
      return $$1.a($$2) && $$1.c(dfu.c) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public dgb a(cqz $$0, ht $$1, dgb $$2, ccx $$3) {
      if (!$$0.B && $$3.fT().d) {
         ht $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, dgb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         ht $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      dgb $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(cuc.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      if ($$0.a((crc)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return new ckj($$2.c(c) == dhd.b ? cuc.br : cuc.by);
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(a, c, d);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
