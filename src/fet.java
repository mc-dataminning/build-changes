import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.UUID;

public class fet {
   private static final int a = 182;
   private static final int b = 5;
   private static final akf[] c = new akf[]{
      new akf("boss_bar/pink_background"),
      new akf("boss_bar/blue_background"),
      new akf("boss_bar/red_background"),
      new akf("boss_bar/green_background"),
      new akf("boss_bar/yellow_background"),
      new akf("boss_bar/purple_background"),
      new akf("boss_bar/white_background")
   };
   private static final akf[] d = new akf[]{
      new akf("boss_bar/pink_progress"),
      new akf("boss_bar/blue_progress"),
      new akf("boss_bar/red_progress"),
      new akf("boss_bar/green_progress"),
      new akf("boss_bar/yellow_progress"),
      new akf("boss_bar/purple_progress"),
      new akf("boss_bar/white_progress")
   };
   private static final akf[] e = new akf[]{
      new akf("boss_bar/notched_6_background"),
      new akf("boss_bar/notched_10_background"),
      new akf("boss_bar/notched_12_background"),
      new akf("boss_bar/notched_20_background")
   };
   private static final akf[] f = new akf[]{
      new akf("boss_bar/notched_6_progress"),
      new akf("boss_bar/notched_10_progress"),
      new akf("boss_bar/notched_12_progress"),
      new akf("boss_bar/notched_20_progress")
   };
   private final fcu g;
   final Map<UUID, ffi> h = Maps.newLinkedHashMap();

   public fet(fcu $$0) {
      this.g = $$0;
   }

   public void a(feh $$0) {
      if (!this.h.isEmpty()) {
         this.g.aI().a("bossHealth");
         int $$1 = $$0.a();
         int $$2 = 12;

         for (ffi $$3 : this.h.values()) {
            int $$4 = $$1 / 2 - 91;
            this.a($$0, $$4, $$2, $$3);
            ws $$6 = $$3.i();
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

   private void a(feh $$0, int $$1, int $$2, bog $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = axw.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(feh $$0, int $$1, int $$2, bog $$3, int $$4, akf[] $$5, akf[] $$6) {
      $$0.a($$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != bog.b.a) {
         RenderSystem.enableBlend();
         $$0.a($$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
         RenderSystem.disableBlend();
      }
   }

   public void a(abu $$0) {
      $$0.a(new abu.b() {
         @Override
         public void a(UUID $$0, ws $$1, float $$2, bog.a $$3, bog.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fet.this.h.put($$0, new ffi($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fet.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fet.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, ws $$1) {
            fet.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bog.a $$1, bog.b $$2) {
            ffi $$3 = fet.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            ffi $$4 = fet.this.h.get($$0);
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
         for (bog $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bog $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bog $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
