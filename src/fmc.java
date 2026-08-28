import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class fmc {
   private static final int a = 182;
   private static final int b = 5;
   private static final alj[] c = new alj[]{
      alj.b("boss_bar/pink_background"),
      alj.b("boss_bar/blue_background"),
      alj.b("boss_bar/red_background"),
      alj.b("boss_bar/green_background"),
      alj.b("boss_bar/yellow_background"),
      alj.b("boss_bar/purple_background"),
      alj.b("boss_bar/white_background")
   };
   private static final alj[] d = new alj[]{
      alj.b("boss_bar/pink_progress"),
      alj.b("boss_bar/blue_progress"),
      alj.b("boss_bar/red_progress"),
      alj.b("boss_bar/green_progress"),
      alj.b("boss_bar/yellow_progress"),
      alj.b("boss_bar/purple_progress"),
      alj.b("boss_bar/white_progress")
   };
   private static final alj[] e = new alj[]{
      alj.b("boss_bar/notched_6_background"),
      alj.b("boss_bar/notched_10_background"),
      alj.b("boss_bar/notched_12_background"),
      alj.b("boss_bar/notched_20_background")
   };
   private static final alj[] f = new alj[]{
      alj.b("boss_bar/notched_6_progress"), alj.b("boss_bar/notched_10_progress"), alj.b("boss_bar/notched_12_progress"), alj.b("boss_bar/notched_20_progress")
   };
   private final fke g;
   final Map<UUID, fmr> h = Maps.newLinkedHashMap();

   public fmc(fke $$0) {
      this.g = $$0;
   }

   public void a(flq $$0) {
      if (!this.h.isEmpty()) {
         bou $$1 = bot.a();
         $$1.a("bossHealth");
         int $$2 = $$0.a();
         int $$3 = 12;

         for (fmr $$4 : this.h.values()) {
            int $$5 = $$2 / 2 - 91;
            this.a($$0, $$5, $$3, $$4);
            xj $$7 = $$4.i();
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

   private void a(flq $$0, int $$1, int $$2, bsa $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = azm.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(flq $$0, int $$1, int $$2, bsa $$3, int $$4, alj[] $$5, alj[] $$6) {
      $$0.a(gjq::B, $$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != bsa.b.a) {
         $$0.a(gjq::B, $$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }
   }

   public void a(acp $$0) {
      $$0.a(new acp.b() {
         @Override
         public void a(UUID $$0, xj $$1, float $$2, bsa.a $$3, bsa.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fmc.this.h.put($$0, new fmr($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fmc.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fmc.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, xj $$1) {
            fmc.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bsa.a $$1, bsa.b $$2) {
            fmr $$3 = fmc.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fmr $$4 = fmc.this.h.get($$0);
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
         for (bsa $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bsa $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bsa $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
