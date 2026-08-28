import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class flg {
   private static final int a = 182;
   private static final int b = 5;
   private static final ali[] c = new ali[]{
      ali.b("boss_bar/pink_background"),
      ali.b("boss_bar/blue_background"),
      ali.b("boss_bar/red_background"),
      ali.b("boss_bar/green_background"),
      ali.b("boss_bar/yellow_background"),
      ali.b("boss_bar/purple_background"),
      ali.b("boss_bar/white_background")
   };
   private static final ali[] d = new ali[]{
      ali.b("boss_bar/pink_progress"),
      ali.b("boss_bar/blue_progress"),
      ali.b("boss_bar/red_progress"),
      ali.b("boss_bar/green_progress"),
      ali.b("boss_bar/yellow_progress"),
      ali.b("boss_bar/purple_progress"),
      ali.b("boss_bar/white_progress")
   };
   private static final ali[] e = new ali[]{
      ali.b("boss_bar/notched_6_background"),
      ali.b("boss_bar/notched_10_background"),
      ali.b("boss_bar/notched_12_background"),
      ali.b("boss_bar/notched_20_background")
   };
   private static final ali[] f = new ali[]{
      ali.b("boss_bar/notched_6_progress"), ali.b("boss_bar/notched_10_progress"), ali.b("boss_bar/notched_12_progress"), ali.b("boss_bar/notched_20_progress")
   };
   private final fji g;
   final Map<UUID, flv> h = Maps.newLinkedHashMap();

   public flg(fji $$0) {
      this.g = $$0;
   }

   public void a(fku $$0) {
      if (!this.h.isEmpty()) {
         bon $$1 = bom.a();
         $$1.a("bossHealth");
         int $$2 = $$0.a();
         int $$3 = 12;

         for (flv $$4 : this.h.values()) {
            int $$5 = $$2 / 2 - 91;
            this.a($$0, $$5, $$3, $$4);
            xi $$7 = $$4.i();
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

   private void a(fku $$0, int $$1, int $$2, brt $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = azk.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fku $$0, int $$1, int $$2, brt $$3, int $$4, ali[] $$5, ali[] $$6) {
      $$0.a(gir::B, $$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != brt.b.a) {
         $$0.a(gir::B, $$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }
   }

   public void a(aco $$0) {
      $$0.a(new aco.b() {
         @Override
         public void a(UUID $$0, xi $$1, float $$2, brt.a $$3, brt.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            flg.this.h.put($$0, new flv($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            flg.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            flg.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, xi $$1) {
            flg.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, brt.a $$1, brt.b $$2) {
            flv $$3 = flg.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            flv $$4 = flg.this.h.get($$0);
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
         for (brt $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (brt $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (brt $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
