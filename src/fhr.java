import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.UUID;

public class fhr {
   private static final int a = 182;
   private static final int b = 5;
   private static final akk[] c = new akk[]{
      new akk("boss_bar/pink_background"),
      new akk("boss_bar/blue_background"),
      new akk("boss_bar/red_background"),
      new akk("boss_bar/green_background"),
      new akk("boss_bar/yellow_background"),
      new akk("boss_bar/purple_background"),
      new akk("boss_bar/white_background")
   };
   private static final akk[] d = new akk[]{
      new akk("boss_bar/pink_progress"),
      new akk("boss_bar/blue_progress"),
      new akk("boss_bar/red_progress"),
      new akk("boss_bar/green_progress"),
      new akk("boss_bar/yellow_progress"),
      new akk("boss_bar/purple_progress"),
      new akk("boss_bar/white_progress")
   };
   private static final akk[] e = new akk[]{
      new akk("boss_bar/notched_6_background"),
      new akk("boss_bar/notched_10_background"),
      new akk("boss_bar/notched_12_background"),
      new akk("boss_bar/notched_20_background")
   };
   private static final akk[] f = new akk[]{
      new akk("boss_bar/notched_6_progress"),
      new akk("boss_bar/notched_10_progress"),
      new akk("boss_bar/notched_12_progress"),
      new akk("boss_bar/notched_20_progress")
   };
   private final fft g;
   final Map<UUID, fig> h = Maps.newLinkedHashMap();

   public fhr(fft $$0) {
      this.g = $$0;
   }

   public void a(fhf $$0) {
      if (!this.h.isEmpty()) {
         this.g.aI().a("bossHealth");
         int $$1 = $$0.a();
         int $$2 = 12;

         for (fig $$3 : this.h.values()) {
            int $$4 = $$1 / 2 - 91;
            this.a($$0, $$4, $$2, $$3);
            wu $$6 = $$3.i();
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

   private void a(fhf $$0, int $$1, int $$2, bpw $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = ayg.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fhf $$0, int $$1, int $$2, bpw $$3, int $$4, akk[] $$5, akk[] $$6) {
      RenderSystem.enableBlend();
      $$0.a($$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != bpw.b.a) {
         $$0.a($$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }

      RenderSystem.disableBlend();
   }

   public void a(abx $$0) {
      $$0.a(new abx.b() {
         @Override
         public void a(UUID $$0, wu $$1, float $$2, bpw.a $$3, bpw.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fhr.this.h.put($$0, new fig($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fhr.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fhr.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, wu $$1) {
            fhr.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bpw.a $$1, bpw.b $$2) {
            fig $$3 = fhr.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fig $$4 = fhr.this.h.get($$0);
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
         for (bpw $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bpw $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bpw $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
