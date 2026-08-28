import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class fpp {
   private static final int a = 182;
   private static final int b = 5;
   private static final aku[] c = new aku[]{
      aku.b("boss_bar/pink_background"),
      aku.b("boss_bar/blue_background"),
      aku.b("boss_bar/red_background"),
      aku.b("boss_bar/green_background"),
      aku.b("boss_bar/yellow_background"),
      aku.b("boss_bar/purple_background"),
      aku.b("boss_bar/white_background")
   };
   private static final aku[] d = new aku[]{
      aku.b("boss_bar/pink_progress"),
      aku.b("boss_bar/blue_progress"),
      aku.b("boss_bar/red_progress"),
      aku.b("boss_bar/green_progress"),
      aku.b("boss_bar/yellow_progress"),
      aku.b("boss_bar/purple_progress"),
      aku.b("boss_bar/white_progress")
   };
   private static final aku[] e = new aku[]{
      aku.b("boss_bar/notched_6_background"),
      aku.b("boss_bar/notched_10_background"),
      aku.b("boss_bar/notched_12_background"),
      aku.b("boss_bar/notched_20_background")
   };
   private static final aku[] f = new aku[]{
      aku.b("boss_bar/notched_6_progress"), aku.b("boss_bar/notched_10_progress"), aku.b("boss_bar/notched_12_progress"), aku.b("boss_bar/notched_20_progress")
   };
   private final fmg g;
   final Map<UUID, fqe> h = Maps.newLinkedHashMap();

   public fpp(fmg $$0) {
      this.g = $$0;
   }

   public void a(fpc $$0) {
      if (!this.h.isEmpty()) {
         bpj $$1 = bpi.a();
         $$1.a("bossHealth");
         int $$2 = $$0.a();
         int $$3 = 12;

         for (fqe $$4 : this.h.values()) {
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

   private void a(fpc $$0, int $$1, int $$2, bso $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = ayz.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fpc $$0, int $$1, int $$2, bso $$3, int $$4, aku[] $$5, aku[] $$6) {
      $$0.a(gnh::H, $$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != bso.b.a) {
         $$0.a(gnh::H, $$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }
   }

   public void a(abu $$0) {
      $$0.a(new abu.b() {
         @Override
         public void a(UUID $$0, wp $$1, float $$2, bso.a $$3, bso.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            fpp.this.h.put($$0, new fqe($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            fpp.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            fpp.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, wp $$1) {
            fpp.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, bso.a $$1, bso.b $$2) {
            fqe $$3 = fpp.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fqe $$4 = fpp.this.h.get($$0);
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
         for (bso $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (bso $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (bso $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
