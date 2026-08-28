import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.UUID;

public class fhd {
   private static final int a = 182;
   private static final int b = 5;
   private static final alf[] c = new alf[]{
      new alf("boss_bar/pink_background"),
      new alf("boss_bar/blue_background"),
      new alf("boss_bar/red_background"),
      new alf("boss_bar/green_background"),
      new alf("boss_bar/yellow_background"),
      new alf("boss_bar/purple_background"),
      new alf("boss_bar/white_background")
   };
   private static final alf[] d = new alf[]{
      new alf("boss_bar/pink_progress"),
      new alf("boss_bar/blue_progress"),
      new alf("boss_bar/red_progress"),
      new alf("boss_bar/green_progress"),
      new alf("boss_bar/yellow_progress"),
      new alf("boss_bar/purple_progress"),
      new alf("boss_bar/white_progress")
   };
   private static final alf[] e = new alf[]{
      new alf("boss_bar/notched_6_background"),
      new alf("boss_bar/notched_10_background"),
      new alf("boss_bar/notched_12_background"),
      new alf("boss_bar/notched_20_background")
   };
   private static final alf[] f = new alf[]{
      new alf("boss_bar/notched_6_progress"),
      new alf("boss_bar/notched_10_progress"),
      new alf("boss_bar/notched_12_progress"),
      new alf("boss_bar/notched_20_progress")
   };
   private final fff g;
   final Map<UUID, fhs> h = Maps.newLinkedHashMap();

   public fhd(fff $$0) {
      this.g = $$0;
   }

   public void a(fgr $$0) {
      if (!this.h.isEmpty()) {
         this.g.aI().a("bossHealth");
         int $$1 = $$0.a();
         int $$2 = 12;

         for (fhs $$3 : this.h.values()) {
            int $$4 = $$1 / 2 - 91;
            this.a($$0, $$4, $$2, $$3);
            xp $$6 = $$3.i();
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

   private void a(fgr $$0, int $$1, int $$2, bqk $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = ayz.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fgr $$0, int $$1, int $$2, bqk $$3, int $$4, alf[] $$5, alf[] $$6) {
      RenderSystem.enableBlend();
      $$0.a($$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != bqk.b.a) {
         $$0.a($$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }

      RenderSystem.disableBlend();
   }

   public void a(acs $$0) {
      $$0.a(new acs.b() {
         @Override
         public void a(UUID $$0, xp $$1, float $$2, bqk.a $$3, bqk.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fhd.this.h.put($$0, new fhs($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fhd.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fhd.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, xp $$1) {
            fhd.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bqk.a $$1, bqk.b $$2) {
            fhs $$3 = fhd.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fhs $$4 = fhd.this.h.get($$0);
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
         for (bqk $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bqk $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bqk $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
