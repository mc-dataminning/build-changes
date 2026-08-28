import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.UUID;

public class fhb {
   private static final int a = 182;
   private static final int b = 5;
   private static final ale[] c = new ale[]{
      new ale("boss_bar/pink_background"),
      new ale("boss_bar/blue_background"),
      new ale("boss_bar/red_background"),
      new ale("boss_bar/green_background"),
      new ale("boss_bar/yellow_background"),
      new ale("boss_bar/purple_background"),
      new ale("boss_bar/white_background")
   };
   private static final ale[] d = new ale[]{
      new ale("boss_bar/pink_progress"),
      new ale("boss_bar/blue_progress"),
      new ale("boss_bar/red_progress"),
      new ale("boss_bar/green_progress"),
      new ale("boss_bar/yellow_progress"),
      new ale("boss_bar/purple_progress"),
      new ale("boss_bar/white_progress")
   };
   private static final ale[] e = new ale[]{
      new ale("boss_bar/notched_6_background"),
      new ale("boss_bar/notched_10_background"),
      new ale("boss_bar/notched_12_background"),
      new ale("boss_bar/notched_20_background")
   };
   private static final ale[] f = new ale[]{
      new ale("boss_bar/notched_6_progress"),
      new ale("boss_bar/notched_10_progress"),
      new ale("boss_bar/notched_12_progress"),
      new ale("boss_bar/notched_20_progress")
   };
   private final ffd g;
   final Map<UUID, fhq> h = Maps.newLinkedHashMap();

   public fhb(ffd $$0) {
      this.g = $$0;
   }

   public void a(fgp $$0) {
      if (!this.h.isEmpty()) {
         this.g.aI().a("bossHealth");
         int $$1 = $$0.a();
         int $$2 = 12;

         for (fhq $$3 : this.h.values()) {
            int $$4 = $$1 / 2 - 91;
            this.a($$0, $$4, $$2, $$3);
            xo $$6 = $$3.i();
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

   private void a(fgp $$0, int $$1, int $$2, bqi $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = ayx.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fgp $$0, int $$1, int $$2, bqi $$3, int $$4, ale[] $$5, ale[] $$6) {
      RenderSystem.enableBlend();
      $$0.a($$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != bqi.b.a) {
         $$0.a($$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }

      RenderSystem.disableBlend();
   }

   public void a(acr $$0) {
      $$0.a(new acr.b() {
         @Override
         public void a(UUID $$0, xo $$1, float $$2, bqi.a $$3, bqi.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fhb.this.h.put($$0, new fhq($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fhb.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fhb.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, xo $$1) {
            fhb.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bqi.a $$1, bqi.b $$2) {
            fhq $$3 = fhb.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fhq $$4 = fhb.this.h.get($$0);
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
         for (bqi $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bqi $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bqi $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
