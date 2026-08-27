import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dah extends cxa implements cuw {
   public static final MapCodec<dah> c = b(dah::new);
   public static final dhw d = dhm.at;
   public static final int e = 4;
   private static final int f = 3;
   private static final int g = 1;
   private static final ekb h = cut.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ekb i = cut.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ekb j = cut.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ekb k = cut.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ekb[] l = new ekb[]{cut.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), h};
   private static final ekb[] m = new ekb[]{j, cut.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), i, i, i};

   @Override
   public MapCodec<dah> a() {
      return c;
   }

   public dah(dgv.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      return this.o();
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return $$0.c(b) == dhs.a ? l[Math.min(Math.abs(4 - ($$0.c(d) + 1)), l.length - 1)] : m[$$0.c(d)];
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      if ($$0.c(d) == 0) {
         return j;
      } else {
         return $$0.c(b) == dhs.b ? k : super.c($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if (b($$0.c(d))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : cuv.a.o();
      }
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.a(cuv.cC);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(d);
      super.a($$0);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if ($$3 instanceof cbf && $$1.X().b(cro.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dgw $$0, cnj $$1) {
      return false;
   }

   @Override
   public void a(crs $$0, ht $$1, dgw $$2, bky $$3, clb $$4) {
   }

   @Override
   public boolean e_(dgw $$0) {
      return $$0.c(b) == dhs.b && !this.n($$0);
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      float $$4 = cwn.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(ama $$0, dgw $$1, ht $$2, int $$3) {
      int $$4 = Math.min($$1.c(d) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dgw $$5 = $$1.a(d, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(b, dhs.a), 3);
         }
      }
   }

   private static boolean a(crv $$0, ht $$1) {
      dgw $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(cuv.kB);
   }

   private static boolean b(crv $$0, ht $$1) {
      return cwn.a($$0, $$1);
   }

   private static boolean h(dgw $$0) {
      return $$0.a(cuv.kB) && $$0.c(b) == dhs.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(crv $$0, ht $$1, dgw $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dgw $$0) {
      return $$0.c(d) >= 4;
   }

   @Nullable
   private dah.a d(crv $$0, ht $$1, dgw $$2) {
      if (h($$2)) {
         return new dah.a($$1, $$2);
      } else {
         ht $$3 = $$1.d();
         dgw $$4 = $$0.a_($$3);
         return h($$4) ? new dah.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      dah.a $$3 = this.d($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(d) + 1);
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      dah.a $$4 = this.d($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(ht a, dgw b) {
   }
}
