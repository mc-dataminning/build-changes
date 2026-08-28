import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class fqm {
   private static final int a = 182;
   private static final int b = 5;
   private static final ald[] c = new ald[]{
      ald.b("boss_bar/pink_background"),
      ald.b("boss_bar/blue_background"),
      ald.b("boss_bar/red_background"),
      ald.b("boss_bar/green_background"),
      ald.b("boss_bar/yellow_background"),
      ald.b("boss_bar/purple_background"),
      ald.b("boss_bar/white_background")
   };
   private static final ald[] d = new ald[]{
      ald.b("boss_bar/pink_progress"),
      ald.b("boss_bar/blue_progress"),
      ald.b("boss_bar/red_progress"),
      ald.b("boss_bar/green_progress"),
      ald.b("boss_bar/yellow_progress"),
      ald.b("boss_bar/purple_progress"),
      ald.b("boss_bar/white_progress")
   };
   private static final ald[] e = new ald[]{
      ald.b("boss_bar/notched_6_background"),
      ald.b("boss_bar/notched_10_background"),
      ald.b("boss_bar/notched_12_background"),
      ald.b("boss_bar/notched_20_background")
   };
   private static final ald[] f = new ald[]{
      ald.b("boss_bar/notched_6_progress"), ald.b("boss_bar/notched_10_progress"), ald.b("boss_bar/notched_12_progress"), ald.b("boss_bar/notched_20_progress")
   };
   private final fnd g;
   final Map<UUID, frb> h = Maps.newLinkedHashMap();

   public fqm(fnd $$0) {
      this.g = $$0;
   }

   public void a(fpz $$0) {
      if (!this.h.isEmpty()) {
         bqb $$1 = bqa.a();
         $$1.a("bossHealth");
         int $$2 = $$0.a();
         int $$3 = 12;

         for (frb $$4 : this.h.values()) {
            int $$5 = $$2 / 2 - 91;
            this.a($$0, $$5, $$3, $$4);
            wv $$7 = $$4.i();
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

   private void a(fpz $$0, int $$1, int $$2, btg $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = azk.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fpz $$0, int $$1, int $$2, btg $$3, int $$4, ald[] $$5, ald[] $$6) {
      $$0.a(goi::H, $$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != btg.b.a) {
         $$0.a(goi::H, $$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }
   }

   public void a(aca $$0) {
      $$0.a(new aca.b() {
         @Override
         public void a(UUID $$0, wv $$1, float $$2, btg.a $$3, btg.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fqm.this.h.put($$0, new frb($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fqm.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fqm.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, wv $$1) {
            fqm.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, btg.a $$1, btg.b $$2) {
            frb $$3 = fqm.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            frb $$4 = fqm.this.h.get($$0);
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
         for (btg $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (btg $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (btg $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
