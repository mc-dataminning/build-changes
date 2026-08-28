import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class ftx {
   private static final int a = 182;
   private static final int b = 5;
   private static final alr[] c = new alr[]{
      alr.b("boss_bar/pink_background"),
      alr.b("boss_bar/blue_background"),
      alr.b("boss_bar/red_background"),
      alr.b("boss_bar/green_background"),
      alr.b("boss_bar/yellow_background"),
      alr.b("boss_bar/purple_background"),
      alr.b("boss_bar/white_background")
   };
   private static final alr[] d = new alr[]{
      alr.b("boss_bar/pink_progress"),
      alr.b("boss_bar/blue_progress"),
      alr.b("boss_bar/red_progress"),
      alr.b("boss_bar/green_progress"),
      alr.b("boss_bar/yellow_progress"),
      alr.b("boss_bar/purple_progress"),
      alr.b("boss_bar/white_progress")
   };
   private static final alr[] e = new alr[]{
      alr.b("boss_bar/notched_6_background"),
      alr.b("boss_bar/notched_10_background"),
      alr.b("boss_bar/notched_12_background"),
      alr.b("boss_bar/notched_20_background")
   };
   private static final alr[] f = new alr[]{
      alr.b("boss_bar/notched_6_progress"), alr.b("boss_bar/notched_10_progress"), alr.b("boss_bar/notched_12_progress"), alr.b("boss_bar/notched_20_progress")
   };
   private final fqq g;
   final Map<UUID, fum> h = Maps.newLinkedHashMap();

   public ftx(fqq $$0) {
      this.g = $$0;
   }

   public void a(ftk $$0) {
      if (!this.h.isEmpty()) {
         brm $$1 = brl.a();
         $$1.a("bossHealth");
         int $$2 = $$0.a();
         int $$3 = 12;

         for (fum $$4 : this.h.values()) {
            int $$5 = $$2 / 2 - 91;
            this.a($$0, $$5, $$3, $$4);
            xg $$7 = $$4.j();
            int $$8 = this.g.h.a($$7);
            int $$9 = $$2 / 2 - $$8 / 2;
            int $$10 = $$3 - 9;
            $$0.b(this.g.h, $$7, $$9, $$10, 16777215);
            $$3 += 10 + 9;
            if ($$3 >= $$0.b() / 3) {
               break;
            }
         }

         $$1.c();
      }
   }

   private void a(ftk $$0, int $$1, int $$2, bus $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = azz.b($$3.k(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(ftk $$0, int $$1, int $$2, bus $$3, int $$4, alr[] $$5, alr[] $$6) {
      $$0.a(gry::H, $$5[$$3.l().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.m() != bus.b.a) {
         $$0.a(gry::H, $$6[$$3.m().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }
   }

   public void a(aco $$0) {
      $$0.a(new aco.b() {
         @Override
         public void a(UUID $$0, xg $$1, float $$2, bus.a $$3, bus.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            ftx.this.h.put($$0, new fum($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            ftx.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            ftx.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, xg $$1) {
            ftx.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bus.a $$1, bus.b $$2) {
            fum $$3 = ftx.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fum $$4 = ftx.this.h.get($$0);
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
         for (bus $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bus $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bus $$0 : this.h.values()) {
            if ($$0.p()) {
               return true;
            }
         }
      }

      return false;
   }
}
