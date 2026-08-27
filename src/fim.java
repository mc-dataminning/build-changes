import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.UUID;

public class fim {
   private static final int a = 182;
   private static final int b = 5;
   private static final akt[] c = new akt[]{
      new akt("boss_bar/pink_background"),
      new akt("boss_bar/blue_background"),
      new akt("boss_bar/red_background"),
      new akt("boss_bar/green_background"),
      new akt("boss_bar/yellow_background"),
      new akt("boss_bar/purple_background"),
      new akt("boss_bar/white_background")
   };
   private static final akt[] d = new akt[]{
      new akt("boss_bar/pink_progress"),
      new akt("boss_bar/blue_progress"),
      new akt("boss_bar/red_progress"),
      new akt("boss_bar/green_progress"),
      new akt("boss_bar/yellow_progress"),
      new akt("boss_bar/purple_progress"),
      new akt("boss_bar/white_progress")
   };
   private static final akt[] e = new akt[]{
      new akt("boss_bar/notched_6_background"),
      new akt("boss_bar/notched_10_background"),
      new akt("boss_bar/notched_12_background"),
      new akt("boss_bar/notched_20_background")
   };
   private static final akt[] f = new akt[]{
      new akt("boss_bar/notched_6_progress"),
      new akt("boss_bar/notched_10_progress"),
      new akt("boss_bar/notched_12_progress"),
      new akt("boss_bar/notched_20_progress")
   };
   private final fgj g;
   final Map<UUID, fjb> h = Maps.newLinkedHashMap();

   public fim(fgj $$0) {
      this.g = $$0;
   }

   public void a(fia $$0) {
      if (!this.h.isEmpty()) {
         this.g.aJ().a("bossHealth");
         int $$1 = $$0.a();
         int $$2 = 12;

         for (fjb $$3 : this.h.values()) {
            if ($$3.a(this.g.t.ds())) {
               int $$4 = $$1 / 2 - 91;
               this.a($$0, $$4, $$2, $$3);
               xe $$6 = $$3.i();
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

         this.g.aJ().c();
      }
   }

   private void a(fia $$0, int $$1, int $$2, bpq $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = aym.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fia $$0, int $$1, int $$2, bpq $$3, int $$4, akt[] $$5, akt[] $$6) {
      RenderSystem.enableBlend();
      $$0.a($$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != bpq.b.a) {
         $$0.a($$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }

      RenderSystem.disableBlend();
   }

   public void a(ach $$0) {
      $$0.a(new ach.b() {
         @Override
         public void a(UUID $$0, xe $$1, float $$2, bpq.a $$3, bpq.b $$4, boolean $$5, boolean $$6, boolean $$7, ewu $$8, int $$9) {
            fim.this.h.put($$0, new fjb($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9));
         }

         @Override
         public void a(UUID $$0) {
            fim.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fim.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, xe $$1) {
            fim.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, ewu $$1, int $$2) {
            fjb $$3 = fim.this.h.get($$0);
            $$3.a($$1, $$2);
         }

         @Override
         public void a(UUID $$0, bpq.a $$1, bpq.b $$2) {
            fjb $$3 = fim.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fjb $$4 = fim.this.h.get($$0);
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
         for (bpq $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bpq $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bpq $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
