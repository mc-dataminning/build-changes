import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class fsz {
   private static final int a = 182;
   private static final int b = 5;
   private static final alg[] c = new alg[]{
      alg.b("boss_bar/pink_background"),
      alg.b("boss_bar/blue_background"),
      alg.b("boss_bar/red_background"),
      alg.b("boss_bar/green_background"),
      alg.b("boss_bar/yellow_background"),
      alg.b("boss_bar/purple_background"),
      alg.b("boss_bar/white_background")
   };
   private static final alg[] d = new alg[]{
      alg.b("boss_bar/pink_progress"),
      alg.b("boss_bar/blue_progress"),
      alg.b("boss_bar/red_progress"),
      alg.b("boss_bar/green_progress"),
      alg.b("boss_bar/yellow_progress"),
      alg.b("boss_bar/purple_progress"),
      alg.b("boss_bar/white_progress")
   };
   private static final alg[] e = new alg[]{
      alg.b("boss_bar/notched_6_background"),
      alg.b("boss_bar/notched_10_background"),
      alg.b("boss_bar/notched_12_background"),
      alg.b("boss_bar/notched_20_background")
   };
   private static final alg[] f = new alg[]{
      alg.b("boss_bar/notched_6_progress"), alg.b("boss_bar/notched_10_progress"), alg.b("boss_bar/notched_12_progress"), alg.b("boss_bar/notched_20_progress")
   };
   private final fpt g;
   final Map<UUID, fto> h = Maps.newLinkedHashMap();

   public fsz(fpt $$0) {
      this.g = $$0;
   }

   public void a(fsm $$0) {
      if (!this.h.isEmpty()) {
         bqq $$1 = bqp.a();
         $$1.a("bossHealth");
         int $$2 = $$0.a();
         int $$3 = 12;

         for (fto $$4 : this.h.values()) {
            int $$5 = $$2 / 2 - 91;
            this.a($$0, $$5, $$3, $$4);
            wy $$7 = $$4.j();
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

   private void a(fsm $$0, int $$1, int $$2, btw $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = azm.b($$3.k(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fsm $$0, int $$1, int $$2, btw $$3, int $$4, alg[] $$5, alg[] $$6) {
      $$0.a(grc::H, $$5[$$3.l().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.m() != btw.b.a) {
         $$0.a(grc::H, $$6[$$3.m().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }
   }

   public void a(acd $$0) {
      $$0.a(new acd.b() {
         @Override
         public void a(UUID $$0, wy $$1, float $$2, btw.a $$3, btw.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fsz.this.h.put($$0, new fto($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fsz.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fsz.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, wy $$1) {
            fsz.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, btw.a $$1, btw.b $$2) {
            fto $$3 = fsz.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fto $$4 = fsz.this.h.get($$0);
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
         for (btw $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (btw $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (btw $$0 : this.h.values()) {
            if ($$0.p()) {
               return true;
            }
         }
      }

      return false;
   }
}
