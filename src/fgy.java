import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.UUID;

public class fgy {
   private static final int a = 182;
   private static final int b = 5;
   private static final alb[] c = new alb[]{
      new alb("boss_bar/pink_background"),
      new alb("boss_bar/blue_background"),
      new alb("boss_bar/red_background"),
      new alb("boss_bar/green_background"),
      new alb("boss_bar/yellow_background"),
      new alb("boss_bar/purple_background"),
      new alb("boss_bar/white_background")
   };
   private static final alb[] d = new alb[]{
      new alb("boss_bar/pink_progress"),
      new alb("boss_bar/blue_progress"),
      new alb("boss_bar/red_progress"),
      new alb("boss_bar/green_progress"),
      new alb("boss_bar/yellow_progress"),
      new alb("boss_bar/purple_progress"),
      new alb("boss_bar/white_progress")
   };
   private static final alb[] e = new alb[]{
      new alb("boss_bar/notched_6_background"),
      new alb("boss_bar/notched_10_background"),
      new alb("boss_bar/notched_12_background"),
      new alb("boss_bar/notched_20_background")
   };
   private static final alb[] f = new alb[]{
      new alb("boss_bar/notched_6_progress"),
      new alb("boss_bar/notched_10_progress"),
      new alb("boss_bar/notched_12_progress"),
      new alb("boss_bar/notched_20_progress")
   };
   private final ffa g;
   final Map<UUID, fhn> h = Maps.newLinkedHashMap();

   public fgy(ffa $$0) {
      this.g = $$0;
   }

   public void a(fgm $$0) {
      if (!this.h.isEmpty()) {
         this.g.aI().a("bossHealth");
         int $$1 = $$0.a();
         int $$2 = 12;

         for (fhn $$3 : this.h.values()) {
            int $$4 = $$1 / 2 - 91;
            this.a($$0, $$4, $$2, $$3);
            xl $$6 = $$3.i();
            int $$7 = this.g.h.a($$6);
            int $$8 = $$1 / 2 - $$7 / 2;
            int $$9 = $$2 - 9;
            $$0.b(this.g.h, $$6, $$8, $$9, 16777215);
            $$2 += 10 + 9;
            if ($$2 >= $$0.b() / 3) {
               break;
            }
         }

         this.g.aI().c();
      }
   }

   private void a(fgm $$0, int $$1, int $$2, bqf $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = ayu.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fgm $$0, int $$1, int $$2, bqf $$3, int $$4, alb[] $$5, alb[] $$6) {
      RenderSystem.enableBlend();
      $$0.a($$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != bqf.b.a) {
         $$0.a($$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }

      RenderSystem.disableBlend();
   }

   public void a(aco $$0) {
      $$0.a(new aco.b() {
         @Override
         public void a(UUID $$0, xl $$1, float $$2, bqf.a $$3, bqf.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fgy.this.h.put($$0, new fhn($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fgy.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fgy.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, xl $$1) {
            fgy.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bqf.a $$1, bqf.b $$2) {
            fhn $$3 = fgy.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fhn $$4 = fgy.this.h.get($$0);
            $$4.a($$1);
            $$4.b($$2);
            $$4.c($$3);
         }
      });
   }

   public void a() {
      this.h.clear();
   }

   public boolean b() {
      if (!this.h.isEmpty()) {
         for (bqf $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bqf $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bqf $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
