import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class fky {
   private static final int a = 182;
   private static final int b = 5;
   private static final alh[] c = new alh[]{
      alh.b("boss_bar/pink_background"),
      alh.b("boss_bar/blue_background"),
      alh.b("boss_bar/red_background"),
      alh.b("boss_bar/green_background"),
      alh.b("boss_bar/yellow_background"),
      alh.b("boss_bar/purple_background"),
      alh.b("boss_bar/white_background")
   };
   private static final alh[] d = new alh[]{
      alh.b("boss_bar/pink_progress"),
      alh.b("boss_bar/blue_progress"),
      alh.b("boss_bar/red_progress"),
      alh.b("boss_bar/green_progress"),
      alh.b("boss_bar/yellow_progress"),
      alh.b("boss_bar/purple_progress"),
      alh.b("boss_bar/white_progress")
   };
   private static final alh[] e = new alh[]{
      alh.b("boss_bar/notched_6_background"),
      alh.b("boss_bar/notched_10_background"),
      alh.b("boss_bar/notched_12_background"),
      alh.b("boss_bar/notched_20_background")
   };
   private static final alh[] f = new alh[]{
      alh.b("boss_bar/notched_6_progress"), alh.b("boss_bar/notched_10_progress"), alh.b("boss_bar/notched_12_progress"), alh.b("boss_bar/notched_20_progress")
   };
   private final fja g;
   final Map<UUID, fln> h = Maps.newLinkedHashMap();

   public fky(fja $$0) {
      this.g = $$0;
   }

   public void a(fkm $$0) {
      if (!this.h.isEmpty()) {
         this.g.aK().a("bossHealth");
         int $$1 = $$0.a();
         int $$2 = 12;

         for (fln $$3 : this.h.values()) {
            int $$4 = $$1 / 2 - 91;
            this.a($$0, $$4, $$2, $$3);
            xh $$6 = $$3.i();
            int $$7 = this.g.h.a($$6);
            int $$8 = $$1 / 2 - $$7 / 2;
            int $$9 = $$2 - 9;
            $$0.b(this.g.h, $$6, $$8, $$9, 16777215);
            $$2 += 10 + 9;
            if ($$2 >= $$0.b() / 3) {
               break;
            }
         }

         this.g.aK().c();
      }
   }

   private void a(fkm $$0, int $$1, int $$2, bro $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = azj.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fkm $$0, int $$1, int $$2, bro $$3, int $$4, alh[] $$5, alh[] $$6) {
      $$0.a(gig::B, $$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != bro.b.a) {
         $$0.a(gig::B, $$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }
   }

   public void a(acn $$0) {
      $$0.a(new acn.b() {
         @Override
         public void a(UUID $$0, xh $$1, float $$2, bro.a $$3, bro.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fky.this.h.put($$0, new fln($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fky.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fky.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, xh $$1) {
            fky.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bro.a $$1, bro.b $$2) {
            fln $$3 = fky.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fln $$4 = fky.this.h.get($$0);
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
         for (bro $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bro $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bro $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
