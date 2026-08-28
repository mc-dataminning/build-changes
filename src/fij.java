import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.UUID;

public class fij {
   private static final int a = 182;
   private static final int b = 5;
   private static final akr[] c = new akr[]{
      akr.b("boss_bar/pink_background"),
      akr.b("boss_bar/blue_background"),
      akr.b("boss_bar/red_background"),
      akr.b("boss_bar/green_background"),
      akr.b("boss_bar/yellow_background"),
      akr.b("boss_bar/purple_background"),
      akr.b("boss_bar/white_background")
   };
   private static final akr[] d = new akr[]{
      akr.b("boss_bar/pink_progress"),
      akr.b("boss_bar/blue_progress"),
      akr.b("boss_bar/red_progress"),
      akr.b("boss_bar/green_progress"),
      akr.b("boss_bar/yellow_progress"),
      akr.b("boss_bar/purple_progress"),
      akr.b("boss_bar/white_progress")
   };
   private static final akr[] e = new akr[]{
      akr.b("boss_bar/notched_6_background"),
      akr.b("boss_bar/notched_10_background"),
      akr.b("boss_bar/notched_12_background"),
      akr.b("boss_bar/notched_20_background")
   };
   private static final akr[] f = new akr[]{
      akr.b("boss_bar/notched_6_progress"), akr.b("boss_bar/notched_10_progress"), akr.b("boss_bar/notched_12_progress"), akr.b("boss_bar/notched_20_progress")
   };
   private final fgm g;
   final Map<UUID, fiy> h = Maps.newLinkedHashMap();

   public fij(fgm $$0) {
      this.g = $$0;
   }

   public void a(fhx $$0) {
      if (!this.h.isEmpty()) {
         this.g.aH().a("bossHealth");
         int $$1 = $$0.a();
         int $$2 = 12;

         for (fiy $$3 : this.h.values()) {
            int $$4 = $$1 / 2 - 91;
            this.a($$0, $$4, $$2, $$3);
            wz $$6 = $$3.i();
            int $$7 = this.g.h.a($$6);
            int $$8 = $$1 / 2 - $$7 / 2;
            int $$9 = $$2 - 9;
            $$0.b(this.g.h, $$6, $$8, $$9, 16777215);
            $$2 += 10 + 9;
            if ($$2 >= $$0.b() / 3) {
               break;
            }
         }

         this.g.aH().c();
      }
   }

   private void a(fhx $$0, int $$1, int $$2, bqh $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = ayo.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fhx $$0, int $$1, int $$2, bqh $$3, int $$4, akr[] $$5, akr[] $$6) {
      RenderSystem.enableBlend();
      $$0.a($$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != bqh.b.a) {
         $$0.a($$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }

      RenderSystem.disableBlend();
   }

   public void a(ace $$0) {
      $$0.a(new ace.b() {
         @Override
         public void a(UUID $$0, wz $$1, float $$2, bqh.a $$3, bqh.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fij.this.h.put($$0, new fiy($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fij.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fij.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, wz $$1) {
            fij.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bqh.a $$1, bqh.b $$2) {
            fiy $$3 = fij.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fiy $$4 = fij.this.h.get($$0);
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
         for (bqh $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bqh $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bqh $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
