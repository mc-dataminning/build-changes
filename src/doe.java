import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class doe extends dof {
   private static final Logger a = LogUtils.getLogger();
   private static final int b = 200;
   private static final int c = 40;
   private static final int d = 2400;
   private static final int e = 1;
   private static final int f = 10;
   private long g;
   private int h;
   @Nullable
   private id i;
   private boolean j;

   public doe(id $$0, dpi $$1) {
      super(dmq.v, $$0, $$1);
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      $$0.a("Age", this.g);
      if (this.i != null) {
         $$0.a("exit_portal", ud.a(this.i));
      }

      if (this.j) {
         $$0.a("ExactTeleport", true);
      }
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.g = $$0.i("Age");
      ud.a($$0, "exit_portal").filter(czg::l).ifPresent($$0x -> this.i = $$0x);
      this.j = $$0.q("ExactTeleport");
   }

   public static void a(czg $$0, id $$1, dpi $$2, doe $$3) {
      $$3.g++;
      if ($$3.c()) {
         $$3.h--;
      }
   }

   public static void b(czg $$0, id $$1, dpi $$2, doe $$3) {
      boolean $$4 = $$3.b();
      boolean $$5 = $$3.c();
      $$3.g++;
      if ($$5) {
         $$3.h--;
      } else {
         List<bqa> $$6 = $$0.a(bqa.class, new ese($$1), doe::a);
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

   public static boolean a(bqa $$0) {
      return bqf.f.test($$0) && !$$0.cW().aw();
   }

   public boolean b() {
      return this.g < 200L;
   }

   public boolean c() {
      return this.h > 0;
   }

   public float a(float $$0) {
      return axm.a(((float)this.g + $$0) / 200.0F, 0.0F, 1.0F);
   }

   public float b(float $$0) {
      return 1.0F - axm.a(((float)this.h - $$0) / 40.0F, 0.0F, 1.0F);
   }

   public abh d() {
      return abh.a(this);
   }

   @Override
   public to a(ip.a $$0) {
      return this.d($$0);
   }

   private static void c(czg $$0, id $$1, dpi $$2, doe $$3) {
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

   public static void a(czg $$0, id $$1, dpi $$2, bqa $$3, doe $$4) {
      if ($$0 instanceof apu && !$$4.c()) {
         apu $$5 = (apu)$$0;
         $$4.h = 100;
         if ($$4.i == null && $$0.ae() == czg.j) {
            id $$6 = a($$5, $$1);
            $$6 = $$6.b(10);
            a.debug("Creating portal at {}", $$6);
            a($$5, $$6, eah.a($$1, false));
            $$4.i = $$6;
         }

         if ($$4.i != null) {
            id $$7 = $$4.j ? $$4.i : a($$0, $$4.i);
            bqa $$9;
            if ($$3 instanceof clc) {
               bqa $$8 = ((clc)$$3).u();
               if ($$8 instanceof apv) {
                  am.e.a((apv)$$8, $$2);
               }

               if ($$8 != null) {
                  $$9 = $$8;
                  $$3.am();
               } else {
                  $$9 = $$3;
               }
            } else {
               $$9 = $$3.cW();
            }

            $$9.au();
            $$9.n((double)$$7.u() + 0.5, (double)$$7.v(), (double)$$7.w() + 0.5);
         }

         c($$0, $$1, $$2, $$4);
      }
   }

   private static id a(czg $$0, id $$1) {
      id $$2 = a($$0, $$1.b(0, 2, 0), 5, false);
      a.debug("Best exit position for portal at {} is {}", $$1, $$2);
      return $$2.c();
   }

   private static id a(apu $$0, id $$1) {
      esj $$2 = b($$0, $$1);
      dro $$3 = a((czg)$$0, $$2);
      id $$4 = a($$3);
      if ($$4 == null) {
         id $$5 = id.a($$2.c + 0.5, 75.0, $$2.e + 0.5);
         a.debug("Failed to find a suitable block to teleport to, spawning an island on {}", $$5);
         $$0.H_().c(ku.az).flatMap($$0x -> $$0x.b(rd.e)).ifPresent($$2x -> ((dxr)$$2x.a()).a($$0, $$0.l().g(), axt.a($$5.a()), $$5));
         $$4 = $$5;
      } else {
         a.debug("Found suitable block to teleport to: {}", $$4);
      }

      return a($$0, $$4, 16, true);
   }

   private static esj b(apu $$0, id $$1) {
      esj $$2 = new esj((double)$$1.u(), 0.0, (double)$$1.w()).d();
      int $$3 = 1024;
      esj $$4 = $$2.a(1024.0);

      for (int $$5 = 16; !a($$0, $$4) && $$5-- > 0; $$4 = $$4.e($$2.a(-16.0))) {
         a.debug("Skipping backwards past nonempty chunk at {}", $$4);
      }

      for (int var6 = 16; a($$0, $$4) && var6-- > 0; $$4 = $$4.e($$2.a(16.0))) {
         a.debug("Skipping forward past empty chunk at {}", $$4);
      }

      a.debug("Found chunk at {}", $$4);
      return $$4;
   }

   private static boolean a(apu $$0, esj $$1) {
      return a((czg)$$0, $$1).a() == -1;
   }

   private static id a(cym $$0, id $$1, int $$2, boolean $$3) {
      id $$4 = null;

      for (int $$5 = -$$2; $$5 <= $$2; $$5++) {
         for (int $$6 = -$$2; $$6 <= $$2; $$6++) {
            if ($$5 != 0 || $$6 != 0 || $$3) {
               for (int $$7 = $$0.al() - 1; $$7 > ($$4 == null ? $$0.I_() : $$4.v()); $$7--) {
                  id $$8 = new id($$1.u() + $$5, $$7, $$1.w() + $$6);
                  dpi $$9 = $$0.a_($$8);
                  if ($$9.r($$0, $$8) && ($$3 || !$$9.a(dcj.F))) {
                     $$4 = $$8;
                     break;
                  }
               }
            }
         }
      }

      return $$4 == null ? $$1 : $$4;
   }

   private static dro a(czg $$0, esj $$1) {
      return $$0.d(axm.a($$1.c / 16.0), axm.a($$1.e / 16.0));
   }

   @Nullable
   private static id a(dro $$0) {
      cyn $$1 = $$0.f();
      id $$2 = new id($$1.d(), 30, $$1.e());
      int $$3 = $$0.b() + 16 - 1;
      id $$4 = new id($$1.f(), $$3, $$1.g());
      id $$5 = null;
      double $$6 = 0.0;

      for (id $$7 : id.a($$2, $$4)) {
         dpi $$8 = $$0.a_($$7);
         id $$9 = $$7.c();
         id $$10 = $$7.b(2);
         if ($$8.a(dcj.fz) && !$$0.a_($$9).r($$0, $$9) && !$$0.a_($$10).r($$0, $$10)) {
            double $$11 = $$7.c(0.0, 0.0, 0.0);
            if ($$5 == null || $$11 < $$6) {
               $$5 = $$7;
               $$6 = $$11;
            }
         }
      }

      return $$5;
   }

   private static void a(apu $$0, id $$1, eah $$2) {
      dye.L.a($$2, $$0, $$0.l().g(), axt.a(), $$1);
   }

   @Override
   public boolean a(ij $$0) {
      return dch.a(this.n(), this.o, this.az_(), $$0, this.az_().a($$0));
   }

   public int f() {
      int $$0 = 0;

      for (ij $$1 : ij.values()) {
         $$0 += this.a($$1) ? 1 : 0;
      }

      return $$0;
   }

   public void a(id $$0, boolean $$1) {
      this.j = $$1;
      this.i = $$0;
   }
}
