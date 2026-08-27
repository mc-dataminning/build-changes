import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czn extends cwg implements cud {
   public static final MapCodec<czn> c = b(czn::new);
   public static final dhb d = dgr.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final eiy h = cua.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final eiy i = cua.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final eiy j = cua.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final eiy k = cua.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final eiy[] l = new eiy[]{cua.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final eiy[] m = new eiy[]{j, cua.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<czn> a() {
      return c;
   }

   public czn(dga.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      return this.o();
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return $$0.c(b) == dgx.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dgx.b ? k : super.c($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : cuc.a.o();
      }
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.a(cuc.cC);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if ($$3 instanceof caq && $$1.X().b(cqv.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dgb $$0, cmr $$1) {
      return false;
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, bkj $$3, ckj $$4) {
   }

   @Override
   public boolean e_(dgb $$0) {
      return $$0.c(b) == dgx.b && !this.n($$0);
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
      float $$4 = cvt.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(alq $$0, dgb $$1, ht $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dgb $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dgx.a), 3);
         }
      }
   }

   private static boolean a(crc $$0, ht $$1) {
      dgb $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(cuc.kB);
   }

   private static boolean b(crc $$0, ht $$1) {
      return cvt.a($$0, $$1);
   }

   private static boolean h(dgb $$0) {
      return $$0.a(cuc.kB) && $$0.c(b) == dgx.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(crc $$0, ht $$1, dgb $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dgb $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private czn.a d(crc $$0, ht $$1, dgb $$2) {
      if (h($$2)) {
         return new czn.a($$1, $$2);
      } else {
         ht $$3 = $$1.d();
         dgb $$4 = $$0.a_($$3);
         return h($$4) ? new czn.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      czn.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      czn.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ht a, dgb b) {
   }
}
