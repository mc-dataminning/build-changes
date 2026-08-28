import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class foq {
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
   private final flj g;
   final Map<UUID, fpg> h = Maps.newLinkedHashMap();

   public foq(flj $$0) {
      this.g = $$0;
   }

   public void a(fod $$0) {
      if (!this.h.isEmpty()) {
         bos $$1 = bor.a();
         $$1.a("bossHealth");
         int $$2 = $$0.a();
         int $$3 = 12;

         for (fpg $$4 : this.h.values()) {
            int $$5 = $$2 / 2 - 91;
            this.a($$0, $$5, $$3, $$4);
            wo $$7 = $$4.i();
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

   private void a(fod $$0, int $$1, int $$2, brz $$3) {
      this.a($$0, $$1, $$2, $$3, 182, c, e);
      int $$4 = ayz.b($$3.j(), 0, 182);
      if ($$4 > 0) {
         this.a($$0, $$1, $$2, $$3, $$4, d, f);
      }
   }

   private void a(fod $$0, int $$1, int $$2, brz $$3, int $$4, aku[] $$5, aku[] $$6) {
      $$0.a(gmh::H, $$5[$$3.k().ordinal()], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      if ($$3.l() != brz.b.a) {
         $$0.a(gmh::H, $$6[$$3.l().ordinal() - 1], 182, 5, 0, 0, $$1, $$2, $$4, 5);
      }
   }

   public void a(abu $$0) {
      $$0.a(new abu.b() {
         @Override
         public void a(UUID $$0, wo $$1, float $$2, brz.a $$3, brz.b $$4, boolean $$5, boolean $$6, boolean $$7) {
            foq.this.h.put($$0, new fpg($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         }

         @Override
         public void a(UUID $$0) {
            foq.this.h.remove($$0);
         }

         @Override
         public void a(UUID $$0, float $$1) {
            foq.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, wo $$1) {
            foq.this.h.get($$0).a($$1);
         }

         @Override
         public void a(UUID $$0, brz.a $$1, brz.b $$2) {
            fpg $$3 = foq.this.h.get($$0);
            $$3.a($$1);
            $$3.a($$2);
         }

         @Override
         public void a(UUID $$0, boolean $$1, boolean $$2, boolean $$3) {
            fpg $$4 = foq.this.h.get($$0);
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
         for (brz $$0 : this.h.values()) {
            if ($$0.n()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c() {
      if (!this.h.isEmpty()) {
         for (brz $$0 : this.h.values()) {
            if ($$0.m()) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean d() {
      if (!this.h.isEmpty()) {
         for (brz $$0 : this.h.values()) {
            if ($$0.o()) {
               return true;
            }
         }
      }

      return false;
   }
}
