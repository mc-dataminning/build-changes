import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbx extends cyr implements cwm {
   public static final MapCodec<dbx> c = b(dbx::new);
   public static final dka d = djq.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final emf h = cwj.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final emf i = cwj.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final emf j = cwj.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final emf k = cwj.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final emf[] l = new emf[]{cwj.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final emf[] m = new emf[]{j, cwj.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dbx> a() {
      return c;
   }

   public dbx(diz.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dja a(cpa $$0) {
      return this.o();
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return $$0.c(b) == djw.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == djw.b ? k : super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : cwl.a.o();
      }
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return $$0.a(cwl.cC);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if ($$3 instanceof cco && $$1.Z().b(cte.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dja $$0, cpa $$1) {
      return false;
   }

   @Override
   public void a(cti $$0, hx $$1, dja $$2, bmf $$3, cmr $$4) {
   }

   @Override
   public boolean e_(dja $$0) {
      return $$0.c(b) == djw.b && !this.n($$0);
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      float $$4 = cye.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(amz $$0, dja $$1, hx $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dja $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, djw.a), 3);
         }
      }
   }

   private static boolean a(ctl $$0, hx $$1) {
      dja $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(cwl.kB);
   }

   private static boolean b(ctl $$0, hx $$1) {
      return cye.a($$0, $$1);
   }

   private static boolean h(dja $$0) {
      return $$0.a(cwl.kB) && $$0.c(b) == djw.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(ctl $$0, hx $$1, dja $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dja $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dbx.a d(ctl $$0, hx $$1, dja $$2) {
      if (h($$2)) {
         return new dbx.a($$1, $$2);
      } else {
         hx $$3 = $$1.d();
         dja $$4 = $$0.a_($$3);
         return h($$4) ? new dbx.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      dbx.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      dbx.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(hx a, dja b) {
   }
}
