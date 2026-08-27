import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpw extends dpx {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private io i;
   private boolean j;

   public dpw(io $$0, drb $$1) {
      super(doi.v, $$0, $$1);
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("exit_portal", us.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.g = $$0.i("Age");
      us.a($$0, "exit_portal").filter(dax::l).ifPresent($$0x -> this.i = $$0x);
      this.j = $$0.q("ExactTeleport");
   }

   public static void a(dax $$0, io $$1, drb $$2, dpw $$3) {
      $$3.g++;
      if ($$3.c()) {
         $$3.h--;
      }
   }

   public static void b(dax $$0, io $$1, drb $$2, dpw $$3) {
      boolean $$4 = $$3.b();
      boolean $$5 = $$3.c();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else {
         List<bru> $$6 = $$0.a(bru.class, new euf($$1), dpw::a);
         if (!$$6.isEmpty()) {
            a($$0, $$1, $$2, $$6.get($$0.z.a($$6.size())), $$3);
         }

         if ($$3.g % 2400L == 0L) {
            c($$0, $$1, $$2, $$3);
         }
      }

      if ($$4 != $$3.b() || $$5 != $$3.c()) {
         a($$0, $$1, $$2);
      }
   }

   public static boolean a(bru $$0) {
      return brz.f.test($$0) && !$$0.cZ().ay();
   }

   public boolean b() {
      return this.g < 200L;
   }

   public boolean c() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return ayd.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - ayd.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public abx d() {
      return abx.a(this);
   }

   @Override
   public ud a(iz.a $$0) {
      return this.e($$0);
   }

   private static void c(dax $$0, io $$1, drb $$2, dpw $$3) {
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

   public static void a(dax $$0, io $$1, drb $$2, bru $$3, dpw $$4) {
      if ($$0 instanceof aqm && !$$4.c()) {
         aqm $$5 = (aqm)$$0;
         $$4.h = 100;
         if ($$4.i == null && $$0.ae() == dax.j) {
            io $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, eca.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            io $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            bru $$9;
            if ($$3 instanceof cmy) {
               bru $$8 = ((cmy)$$3).s();
               if ($$8 instanceof aqn) {
                  am.e.a((aqn)$$8, $$2);
               }

               if ($$8 != null) {
                  $$9 = $$8;
                  $$3.ao();
               } else {
                  $$9 = $$3;
               }
            } else {
               $$9 = $$3.cZ();
            }

            $$9.aw();
            $$9.n((double)$$7.u() + 0.5, (double)$$7.v(), (double)$$7.w() + 0.5);
         }

         c($$0, $$1, $$2, $$4);
      }
   }

   private static io a(dax $$0, io $$1) {
      io $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static io a(aqm $$0, io $$1) {
      euk $$2 = b($$0, $$1);
      dth $$3 = a((dax)$$0, $$2);
      io $$4 = a($$3);
      if ($$4 == null) {
         io $$5 = io.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.H_().c(lf.aC).flatMap($$0x -> $$0x.b(rs.e)).ifPresent($$2x -> ((dzk)$$2x.a()).a($$0, $$0.l().g(), ayk.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static euk b(aqm $$0, io $$1) {
      euk $$2 = new euk((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      euk $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(aqm $$0, euk $$1) {
      return a((dax)$$0, $$1).a() == -1;
   }

   private static io a(dad $$0, io $$1, int $$2, boolean $$3) {
      io $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.al() - 1; $$7 > ($$4 == null ? $$0.I_() : $$4.v()); $$7--) {
                  io $$8 = new io($$1.u() + $$5, $$7, $$1.w() + $$6);
                  drb $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(dea.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dth a(dax $$0, euk $$1) {
      return $$0.d(ayd.a($$1.c / 16.0), ayd.a($$1.e / 16.0));
   }

   @Nullable
   private static io a(dth $$0) {
      dae $$1 = $$0.f();
      io $$2 = new io($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      io $$4 = new io($$1.f(), $$3, $$1.g());
      io $$5 = null;
      double $$6 = 0.0;

      for (io $$7 : io.c($$2, $$4)) {
         drb $$8 = $$0.a_($$7);
         io $$9 = $$7.c();
         io $$10 = $$7.b(2);
         if ($$8.a(dea.fz) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(aqm $$0, io $$1, eca $$2) {
      dzx.L.a($$2, $$0, $$0.l().g(), ayk.a(), $$1);
   }

   @Override
   public boolean a(it $$0) {
      return ddy.a(this.n(), this.n, this.az_(), $$0, this.az_().a($$0));
   }

   public int f() {
      int $$0 = 0;

      for (it $$1 : it.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(io $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
