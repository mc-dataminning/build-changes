import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.UUID;

public class esp {
   private static final int a = 182;
   private static final int b = 5;
   private static final aew[] c = new aew[]{
      new aew("boss_bar/pink_background"),
      new aew("boss_bar/blue_background"),
      new aew("boss_bar/red_background"),
      new aew("boss_bar/green_background"),
      new aew("boss_bar/yellow_background"),
      new aew("boss_bar/purple_background"),
      new aew("boss_bar/white_background")
   };
   private static final aew[] d = new aew[]{
      new aew("boss_bar/pink_progress"),
      new aew("boss_bar/blue_progress"),
      new aew("boss_bar/red_progress"),
      new aew("boss_bar/green_progress"),
      new aew("boss_bar/yellow_progress"),
      new aew("boss_bar/purple_progress"),
      new aew("boss_bar/white_progress")
   };
   private static final aew[] e = new aew[]{
      new aew("boss_bar/notched_6_background"),
      new aew("boss_bar/notched_10_background"),
      new aew("boss_bar/notched_12_background"),
      new aew("boss_bar/notched_20_background")
   };
   private static final aew[] f = new aew[]{
      new aew("boss_bar/notched_6_progress"),
      new aew("boss_bar/notched_10_progress"),
      new aew("boss_bar/notched_12_progress"),
      new aew("boss_bar/notched_20_progress")
   };
   private final eqv g;
   final Map<UUID, ete> h = Maps.newLinkedHashMap();

   public esp(eqv $$0) {
      this.g = $$0;
   }

   public void a(esf $$0) {
      if (!this.h.isEmpty()) {
         int $$1 = $$0.a();
         int $$2 = 12;

         for (ete $$3 : this.h.values()) {
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

   private void a(esf $$0, int $$1, int $$2, bgo $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = arw.b($$3.k(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(esf $$0, int $$1, int $$2, bgo $$3, int $$4, aew[] $$5, aew[] $$6) {
      $$0.a($$5[$$3.l().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.m() != bgo.b.a) {
         RenderSystem.enableBlend();
         $$0.a($$6[$$3.m().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
         RenderSystem.disableBlend();
      }
   }

   public void a(xg $$0) {
      $$0.a(new xg.b() {
         @Override
         public void a(UUID $$0, tl $$1, float $$2, bgo.a $$3, bgo.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            esp.this.h.put($$0, new ete($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            esp.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            esp.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, tl $$1) {
            esp.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bgo.a $$1, bgo.b $$2) {
            ete $$3 = esp.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            ete $$4 = esp.this.h.get($$0);
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
         for (bgo $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bgo $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bgo $$0 : this.h.values()) {
            if ($$0.p()) {
               return true;
            }
         }
      }

      return false;
   }
}
