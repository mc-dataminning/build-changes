import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dbb extends dbc {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private gu i;
   private boolean j;

   public dbb(gu $$0, dcb $$1) {
      super(czp.v, $$0, $$1);
   }

   @Override
   protected void b(qr $$0) {
      super.b($$0);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("ExitPortal", rd.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.g = $$0.i("Age");
      if ($$0.b("ExitPortal", 10)) {
         gu $$1 = rd.b($$0.p("ExitPortal"));
         if (cmm.k($$1)) {
            this.i = $$1;
         }
      }

      this.j = $$0.q("ExactTeleport");
   }

   public static void a(cmm $$0, gu $$1, dcb $$2, dbb $$3) {
      $$3.g++;
      if ($$3.d()) {
         $$3.h--;
      }
   }

   public static void b(cmm $$0, gu $$1, dcb $$2, dbb $$3) {
      boolean $$4 = $$3.c();
      boolean $$5 = $$3.d();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else {
         List<bfj> $$6 = $$0.a(bfj.class, new eed($$1), dbb::a);
         if (!$$6.isEmpty()) {
            a($$0, $$1, $$2, $$6.get($$0.z.a($$6.size())), $$3);
         }

         if ($$3.g % 2400L == 0L) {
            c($$0, $$1, $$2, $$3);
         }
      }

      if ($$4 != $$3.c() || $$5 != $$3.d()) {
         a($$0, $$1, $$2);
      }
   }

   public static boolean a(bfj $$0) {
      return bfm.f.test($$0) && !$$0.cT().as();
   }

   public boolean c() {
      return this.g < 200L;
   }

   public boolean d() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return apa.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - apa.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public uz f() {
      return uz.a(this);
   }

   @Override
   public qr ao_() {
      return this.o();
   }

   private static void c(cmm $$0, gu $$1, dcb $$2, dbb $$3) {
      if (!$$0.B) {
         $$3.h = 40;
         $$0.a($$1, $$2.b(), 1, 0);
         a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a_(int $$0, int $$1) {
      if ($$0 == 1) {
         this.h = 40;
         return true;
      } else {
         return super.a_($$0, $$1);
      }
   }

   public static void a(cmm $$0, gu $$1, dcb $$2, bfj $$3, dbb $$4) {
      if ($$0 instanceof aif && !$$4.d()) {
         aif $$5 = (aif)$$0;
         $$4.h = 100;
         if ($$4.i == null && $$0.ac() == cmm.j) {
            gu $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, dmr.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            gu $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            bfj $$9;
            if ($$3 instanceof bzp) {
               bfj $$8 = ((bzp)$$3).v();
               if ($$8 instanceof aig) {
                  ai.d.a((aig)$$8, $$2);
               }

               if ($$8 != null) {
                  $$9 = $$8;
                  $$3.ai();
               } else {
                  $$9 = $$3;
               }
            } else {
               $$9 = $$3.cT();
            }

            $$9.aq();
            $$9.n((double)$$7.u() + 0.5, (double)$$7.v(), (double)$$7.w() + 0.5);
         }

         c($$0, $$1, $$2, $$4);
      }
   }

   private static gu a(cmm $$0, gu $$1) {
      gu $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static gu a(aif $$0, gu $$1) {
      eei $$2 = b($$0, $$1);
      dei $$3 = a((cmm)$$0, $$2);
      gu $$4 = a($$3);
      if ($$4 == null) {
         gu $$5 = gu.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.B_().c(jc.as).flatMap($$0x -> $$0x.b(ol.e)).ifPresent($$2x -> ((dkb)$$2x.a()).a($$0, $$0.k().g(), apf.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static eei b(aif $$0, gu $$1) {
      eei $$2 = new eei((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      eei $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(aif $$0, eei $$1) {
      return a((cmm)$$0, $$1).a() == -1;
   }

   private static gu a(cls $$0, gu $$1, int $$2, boolean $$3) {
      gu $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.aj() - 1; $$7 > ($$4 == null ? $$0.C_() : $$4.v()); $$7--) {
                  gu $$8 = new gu($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dcb $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(cpo.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dei a(cmm $$0, eei $$1) {
      return $$0.d(apa.a($$1.c / 16.0), apa.a($$1.e / 16.0));
   }

   @Nullable
   private static gu a(dei $$0) {
      clt $$1 = $$0.f();
      gu $$2 = new gu($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      gu $$4 = new gu($$1.f(), $$3, $$1.g());
      gu $$5 = null;
      double $$6 = 0.0;

      for (gu $$7 : gu.a($$2, $$4)) {
         dcb $$8 = $$0.a_($$7);
         gu $$9 = $$7.c();
         gu $$10 = $$7.b(2);
         if ($$8.a(cpo.fz) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(aif $$0, gu $$1, dmr $$2) {
      dko.L.a($$2, $$0, $$0.k().g(), apf.a(), $$1);
   }

   @Override
   public boolean a(ha $$0) {
      return cpn.a(this.q(), this.o, this.p(), $$0, this.p().a($$0));
   }

   public int g() {
      int $$0 = 0;

      for (ha $$1 : ha.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(gu $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
