import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class fkn {
   private static final int a = 182;
   private static final int b = 5;
   private static final ale[] c = new ale[]{
      ale.b("boss_bar/pink_background"),
      ale.b("boss_bar/blue_background"),
      ale.b("boss_bar/red_background"),
      ale.b("boss_bar/green_background"),
      ale.b("boss_bar/yellow_background"),
      ale.b("boss_bar/purple_background"),
      ale.b("boss_bar/white_background")
   };
   private static final ale[] d = new ale[]{
      ale.b("boss_bar/pink_progress"),
      ale.b("boss_bar/blue_progress"),
      ale.b("boss_bar/red_progress"),
      ale.b("boss_bar/green_progress"),
      ale.b("boss_bar/yellow_progress"),
      ale.b("boss_bar/purple_progress"),
      ale.b("boss_bar/white_progress")
   };
   private static final ale[] e = new ale[]{
      ale.b("boss_bar/notched_6_background"),
      ale.b("boss_bar/notched_10_background"),
      ale.b("boss_bar/notched_12_background"),
      ale.b("boss_bar/notched_20_background")
   };
   private static final ale[] f = new ale[]{
      ale.b("boss_bar/notched_6_progress"), ale.b("boss_bar/notched_10_progress"), ale.b("boss_bar/notched_12_progress"), ale.b("boss_bar/notched_20_progress")
   };
   private final fip g;
   final Map<UUID, flc> h = Maps.newLinkedHashMap();

   public fkn(fip $$0) {
      this.g = $$0;
   }

   public void a(fkb $$0) {
      if (!this.h.isEmpty()) {
         this.g.aK().a("bossHealth");
         int $$1 = $$0.a();
         int $$2 = 12;

         for (flc $$3 : this.h.values()) {
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

         this.g.aK().c();
      }
   }

   private void a(fkb $$0, int $$1, int $$2, bri $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = azf.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fkb $$0, int $$1, int $$2, bri $$3, int $$4, ale[] $$5, ale[] $$6) {
      $$0.a(ghv::B, $$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != bri.b.a) {
         $$0.a(ghv::B, $$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }
   }

   public void a(ack $$0) {
      $$0.a(new ack.b() {
         @Override
         public void a(UUID $$0, xe $$1, float $$2, bri.a $$3, bri.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fkn.this.h.put($$0, new flc($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fkn.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fkn.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, xe $$1) {
            fkn.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bri.a $$1, bri.b $$2) {
            flc $$3 = fkn.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            flc $$4 = fkn.this.h.get($$0);
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
         for (bri $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bri $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bri $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
