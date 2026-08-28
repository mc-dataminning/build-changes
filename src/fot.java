import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class fot {
   private static final int a = 182;
   private static final int b = 5;
   private static final akv[] c = new akv[]{
      akv.b("boss_bar/pink_background"),
      akv.b("boss_bar/blue_background"),
      akv.b("boss_bar/red_background"),
      akv.b("boss_bar/green_background"),
      akv.b("boss_bar/yellow_background"),
      akv.b("boss_bar/purple_background"),
      akv.b("boss_bar/white_background")
   };
   private static final akv[] d = new akv[]{
      akv.b("boss_bar/pink_progress"),
      akv.b("boss_bar/blue_progress"),
      akv.b("boss_bar/red_progress"),
      akv.b("boss_bar/green_progress"),
      akv.b("boss_bar/yellow_progress"),
      akv.b("boss_bar/purple_progress"),
      akv.b("boss_bar/white_progress")
   };
   private static final akv[] e = new akv[]{
      akv.b("boss_bar/notched_6_background"),
      akv.b("boss_bar/notched_10_background"),
      akv.b("boss_bar/notched_12_background"),
      akv.b("boss_bar/notched_20_background")
   };
   private static final akv[] f = new akv[]{
      akv.b("boss_bar/notched_6_progress"), akv.b("boss_bar/notched_10_progress"), akv.b("boss_bar/notched_12_progress"), akv.b("boss_bar/notched_20_progress")
   };
   private final flk g;
   final Map<UUID, fpi> h = Maps.newLinkedHashMap();

   public fot(flk $$0) {
      this.g = $$0;
   }

   public void a(fof $$0) {
      if (!this.h.isEmpty()) {
         bou $$1 = bot.a();
         $$1.a("bossHealth");
         int $$2 = $$0.a();
         int $$3 = 12;

         for (fpi $$4 : this.h.values()) {
            int $$5 = $$2 / 2 - 91;
            this.a($$0, $$5, $$3, $$4);
            wp $$7 = $$4.i();
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

   private void a(fof $$0, int $$1, int $$2, bsb $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = ayz.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fof $$0, int $$1, int $$2, bsb $$3, int $$4, akv[] $$5, akv[] $$6) {
      $$0.a(gmj::H, $$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != bsb.b.a) {
         $$0.a(gmj::H, $$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }
   }

   public void a(abv $$0) {
      $$0.a(new abv.b() {
         @Override
         public void a(UUID $$0, wp $$1, float $$2, bsb.a $$3, bsb.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fot.this.h.put($$0, new fpi($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fot.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fot.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, wp $$1) {
            fot.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bsb.a $$1, bsb.b $$2) {
            fpi $$3 = fot.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fpi $$4 = fot.this.h.get($$0);
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
         for (bsb $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bsb $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bsb $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
