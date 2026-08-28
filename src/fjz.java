import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class fjz {
   private static final int a = 182;
   private static final int b = 5;
   private static final alb[] c = new alb[]{
      alb.b("boss_bar/pink_background"),
      alb.b("boss_bar/blue_background"),
      alb.b("boss_bar/red_background"),
      alb.b("boss_bar/green_background"),
      alb.b("boss_bar/yellow_background"),
      alb.b("boss_bar/purple_background"),
      alb.b("boss_bar/white_background")
   };
   private static final alb[] d = new alb[]{
      alb.b("boss_bar/pink_progress"),
      alb.b("boss_bar/blue_progress"),
      alb.b("boss_bar/red_progress"),
      alb.b("boss_bar/green_progress"),
      alb.b("boss_bar/yellow_progress"),
      alb.b("boss_bar/purple_progress"),
      alb.b("boss_bar/white_progress")
   };
   private static final alb[] e = new alb[]{
      alb.b("boss_bar/notched_6_background"),
      alb.b("boss_bar/notched_10_background"),
      alb.b("boss_bar/notched_12_background"),
      alb.b("boss_bar/notched_20_background")
   };
   private static final alb[] f = new alb[]{
      alb.b("boss_bar/notched_6_progress"), alb.b("boss_bar/notched_10_progress"), alb.b("boss_bar/notched_12_progress"), alb.b("boss_bar/notched_20_progress")
   };
   private final fib g;
   final Map<UUID, fko> h = Maps.newLinkedHashMap();

   public fjz(fib $$0) {
      this.g = $$0;
   }

   public void a(fjn $$0) {
      if (!this.h.isEmpty()) {
         this.g.aJ().a("bossHealth");
         int $$1 = $$0.a();
         int $$2 = 12;

         for (fko $$3 : this.h.values()) {
            int $$4 = $$1 / 2 - 91;
            this.a($$0, $$4, $$2, $$3);
            xd $$6 = $$3.i();
            int $$7 = this.g.h.a($$6);
            int $$8 = $$1 / 2 - $$7 / 2;
            int $$9 = $$2 - 9;
            $$0.b(this.g.h, $$6, $$8, $$9, 16777215);
            $$2 += 10 + 9;
            if ($$2 >= $$0.b() / 3) {
               break;
            }
         }

         this.g.aJ().c();
      }
   }

   private void a(fjn $$0, int $$1, int $$2, bra $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = azc.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fjn $$0, int $$1, int $$2, bra $$3, int $$4, alb[] $$5, alb[] $$6) {
      $$0.a(ghe::C, $$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != bra.b.a) {
         $$0.a(ghe::C, $$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }
   }

   public void a(acj $$0) {
      $$0.a(new acj.b() {
         @Override
         public void a(UUID $$0, xd $$1, float $$2, bra.a $$3, bra.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fjz.this.h.put($$0, new fko($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fjz.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fjz.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, xd $$1) {
            fjz.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bra.a $$1, bra.b $$2) {
            fko $$3 = fjz.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fko $$4 = fjz.this.h.get($$0);
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
         for (bra $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bra $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bra $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
