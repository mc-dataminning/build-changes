import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.UUID;

public class esj {
   private static final int a = 182;
   private static final int b = 5;
   private static final aez[] c = new aez[]{
      new aez("boss_bar/pink_background"),
      new aez("boss_bar/blue_background"),
      new aez("boss_bar/red_background"),
      new aez("boss_bar/green_background"),
      new aez("boss_bar/yellow_background"),
      new aez("boss_bar/purple_background"),
      new aez("boss_bar/white_background")
   };
   private static final aez[] d = new aez[]{
      new aez("boss_bar/pink_progress"),
      new aez("boss_bar/blue_progress"),
      new aez("boss_bar/red_progress"),
      new aez("boss_bar/green_progress"),
      new aez("boss_bar/yellow_progress"),
      new aez("boss_bar/purple_progress"),
      new aez("boss_bar/white_progress")
   };
   private static final aez[] e = new aez[]{
      new aez("boss_bar/notched_6_background"),
      new aez("boss_bar/notched_10_background"),
      new aez("boss_bar/notched_12_background"),
      new aez("boss_bar/notched_20_background")
   };
   private static final aez[] f = new aez[]{
      new aez("boss_bar/notched_6_progress"),
      new aez("boss_bar/notched_10_progress"),
      new aez("boss_bar/notched_12_progress"),
      new aez("boss_bar/notched_20_progress")
   };
   private final eqp g;
   final Map<UUID, esy> h = Maps.newLinkedHashMap();

   public esj(eqp $$0) {
      this.g = $$0;
   }

   public void a(erz $$0) {
      if (!this.h.isEmpty()) {
         int $$1 = $$0.a();
         int $$2 = 12;

         for (esy $$3 : this.h.values()) {
            int $$4 = $$1 / 2 - 91;
            this.a($$0, $$4, $$2, $$3);
            tl $$6 = $$3.j();
            int $$7 = this.g.h.a($$6);
            int $$8 = $$1 / 2 - $$7 / 2;
            int $$9 = $$2 - 9;
            $$0.b(this.g.h, $$6, $$8, $$9, 16777215);
            $$2 += 10 + 9;
            if ($$2 >= $$0.b() / 3) {
               break;
            }
         }
      }
   }

   private void a(erz $$0, int $$1, int $$2, bgu $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = asb.b($$3.k(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(erz $$0, int $$1, int $$2, bgu $$3, int $$4, aez[] $$5, aez[] $$6) {
      $$0.a($$5[$$3.l().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.m() != bgu.b.a) {
         RenderSystem.enableBlend();
         $$0.a($$6[$$3.m().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
         RenderSystem.disableBlend();
      }
   }

   public void a(xh $$0) {
      $$0.a(new xh.b() {
         @Override
         public void a(UUID $$0, tl $$1, float $$2, bgu.a $$3, bgu.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            esj.this.h.put($$0, new esy($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            esj.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            esj.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, tl $$1) {
            esj.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bgu.a $$1, bgu.b $$2) {
            esy $$3 = esj.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            esy $$4 = esj.this.h.get($$0);
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
         for (bgu $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bgu $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bgu $$0 : this.h.values()) {
            if ($$0.p()) {
               return true;
            }
         }
      }

      return false;
   }
}
