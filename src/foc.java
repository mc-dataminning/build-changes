import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class foc {
   private static final int a = 182;
   private static final int b = 5;
   private static final alz[] c = new alz[]{
      alz.b("boss_bar/pink_background"),
      alz.b("boss_bar/blue_background"),
      alz.b("boss_bar/red_background"),
      alz.b("boss_bar/green_background"),
      alz.b("boss_bar/yellow_background"),
      alz.b("boss_bar/purple_background"),
      alz.b("boss_bar/white_background")
   };
   private static final alz[] d = new alz[]{
      alz.b("boss_bar/pink_progress"),
      alz.b("boss_bar/blue_progress"),
      alz.b("boss_bar/red_progress"),
      alz.b("boss_bar/green_progress"),
      alz.b("boss_bar/yellow_progress"),
      alz.b("boss_bar/purple_progress"),
      alz.b("boss_bar/white_progress")
   };
   private static final alz[] e = new alz[]{
      alz.b("boss_bar/notched_6_background"),
      alz.b("boss_bar/notched_10_background"),
      alz.b("boss_bar/notched_12_background"),
      alz.b("boss_bar/notched_20_background")
   };
   private static final alz[] f = new alz[]{
      alz.b("boss_bar/notched_6_progress"), alz.b("boss_bar/notched_10_progress"), alz.b("boss_bar/notched_12_progress"), alz.b("boss_bar/notched_20_progress")
   };
   private final fme g;
   final Map<UUID, fos> h = Maps.newLinkedHashMap();

   public foc(fme $$0) {
      this.g = $$0;
   }

   public void a(fnq $$0) {
      if (!this.h.isEmpty()) {
         bps $$1 = bpr.a();
         $$1.a("bossHealth");
         int $$2 = $$0.a();
         int $$3 = 12;

         for (fos $$4 : this.h.values()) {
            int $$5 = $$2 / 2 - 91;
            this.a($$0, $$5, $$3, $$4);
            xv $$7 = $$4.i();
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

   private void a(fnq $$0, int $$1, int $$2, bsy $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = bae.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fnq $$0, int $$1, int $$2, bsy $$3, int $$4, alz[] $$5, alz[] $$6) {
      $$0.a(glt::B, $$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != bsy.b.a) {
         $$0.a(glt::B, $$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }
   }

   public void a(adb $$0) {
      $$0.a(new adb.b() {
         @Override
         public void a(UUID $$0, xv $$1, float $$2, bsy.a $$3, bsy.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            foc.this.h.put($$0, new fos($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            foc.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            foc.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, xv $$1) {
            foc.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bsy.a $$1, bsy.b $$2) {
            fos $$3 = foc.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fos $$4 = foc.this.h.get($$0);
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
         for (bsy $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bsy $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bsy $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
