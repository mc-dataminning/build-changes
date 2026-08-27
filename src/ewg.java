import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.UUID;

public class ewg {
   private static final int a = 182;
   private static final int b = 5;
   private static final agt[] c = new agt[]{
      new agt("boss_bar/pink_background"),
      new agt("boss_bar/blue_background"),
      new agt("boss_bar/red_background"),
      new agt("boss_bar/green_background"),
      new agt("boss_bar/yellow_background"),
      new agt("boss_bar/purple_background"),
      new agt("boss_bar/white_background")
   };
   private static final agt[] d = new agt[]{
      new agt("boss_bar/pink_progress"),
      new agt("boss_bar/blue_progress"),
      new agt("boss_bar/red_progress"),
      new agt("boss_bar/green_progress"),
      new agt("boss_bar/yellow_progress"),
      new agt("boss_bar/purple_progress"),
      new agt("boss_bar/white_progress")
   };
   private static final agt[] e = new agt[]{
      new agt("boss_bar/notched_6_background"),
      new agt("boss_bar/notched_10_background"),
      new agt("boss_bar/notched_12_background"),
      new agt("boss_bar/notched_20_background")
   };
   private static final agt[] f = new agt[]{
      new agt("boss_bar/notched_6_progress"),
      new agt("boss_bar/notched_10_progress"),
      new agt("boss_bar/notched_12_progress"),
      new agt("boss_bar/notched_20_progress")
   };
   private final euk g;
   final Map<UUID, ewv> h = Maps.newLinkedHashMap();

   public ewg(euk $$0) {
      this.g = $$0;
   }

   public void a(evw $$0) {
      if (!this.h.isEmpty()) {
         int $$1 = $$0.a();
         int $$2 = 12;

         for (ewv $$3 : this.h.values()) {
            int $$4 = $$1 / 2 - 91;
            this.a($$0, $$4, $$2, $$3);
            vb $$6 = $$3.j();
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

   private void a(evw $$0, int $$1, int $$2, bjb $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = aty.b($$3.k(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(evw $$0, int $$1, int $$2, bjb $$3, int $$4, agt[] $$5, agt[] $$6) {
      $$0.a($$5[$$3.l().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.m() != bjb.b.a) {
         RenderSystem.enableBlend();
         $$0.a($$6[$$3.m().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
         RenderSystem.disableBlend();
      }
   }

   public void a(yy $$0) {
      $$0.a(new yy.b() {
         @Override
         public void a(UUID $$0, vb $$1, float $$2, bjb.a $$3, bjb.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            ewg.this.h.put($$0, new ewv($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            ewg.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            ewg.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, vb $$1) {
            ewg.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bjb.a $$1, bjb.b $$2) {
            ewv $$3 = ewg.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            ewv $$4 = ewg.this.h.get($$0);
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
         for (bjb $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bjb $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bjb $$0 : this.h.values()) {
            if ($$0.p()) {
               return true;
            }
         }
      }

      return false;
   }
}
