import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class enh extends ege {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "scoreboard";
   private final eng c;

   public enh(eng $$0) {
      this.c = $$0;
   }

   public enh b(so $$0) {
      this.b($$0.c("Objectives", 10));
      this.c.a($$0.c("PlayerScores", 10));
      if ($$0.b("DisplaySlots", 10)) {
         this.c($$0.p("DisplaySlots"));
      }

      if ($$0.b("Teams", 9)) {
         this.a($$0.c("Teams", 10));
      }

      return this;
   }

   private void a(su $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         so $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         enb $$4 = this.c.c($$3);
         vg $$5 = vg.a.a($$2.l("DisplayName"));
         if ($$5 != null) {
            $$4.a($$5);
         }

         if ($$2.b("TeamColor", 8)) {
            $$4.a(n.b($$2.l("TeamColor")));
         }

         if ($$2.b("AllowFriendlyFire", 99)) {
            $$4.a($$2.q("AllowFriendlyFire"));
         }

         if ($$2.b("SeeFriendlyInvisibles", 99)) {
            $$4.b($$2.q("SeeFriendlyInvisibles"));
         }

         if ($$2.b("MemberNamePrefix", 8)) {
            vg $$6 = vg.a.a($$2.l("MemberNamePrefix"));
            if ($$6 != null) {
               $$4.b($$6);
            }
         }

         if ($$2.b("MemberNameSuffix", 8)) {
            vg $$7 = vg.a.a($$2.l("MemberNameSuffix"));
            if ($$7 != null) {
               $$4.c($$7);
            }
         }

         if ($$2.b("NameTagVisibility", 8)) {
            eni.b $$8 = eni.b.a($$2.l("NameTagVisibility"));
            if ($$8 != null) {
               $$4.a($$8);
            }
         }

         if ($$2.b("DeathMessageVisibility", 8)) {
            eni.b $$9 = eni.b.a($$2.l("DeathMessageVisibility"));
            if ($$9 != null) {
               $$4.b($$9);
            }
         }

         if ($$2.b("CollisionRule", 8)) {
            eni.a $$10 = eni.a.a($$2.l("CollisionRule"));
            if ($$10 != null) {
               $$4.a($$10);
            }
         }

         this.a($$4, $$2.c("Players", 8));
      }
   }

   private void a(enb $$0, su $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c.a($$1.j($$2), $$0);
      }
   }

   private void c(so $$0) {
      for (String $$1 : $$0.e()) {
         emx $$2 = emx.t.a($$1);
         if ($$2 != null) {
            String $$3 = $$0.l($$1);
            emy $$4 = this.c.a($$3);
            this.c.a($$2, $$4);
         }
      }
   }

   private void b(su $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         so $$2 = $$0.a($$1);
         String $$3 = $$2.l("CriteriaName");
         enj $$4 = enj.a($$3).orElseGet(() -> {
            b.warn("Unknown scoreboard criteria {}, replacing with {}", $$3, enj.a.d());
            return enj.a;
         });
         String $$5 = $$2.l("Name");
         vg $$6 = vg.a.a($$2.l("DisplayName"));
         enj.a $$7 = enj.a.a($$2.l("RenderType"));
         boolean $$8 = $$2.q("display_auto_update");
         ww $$9 = (ww)wy.b.parse(tc.a, $$2.c("format")).result().orElse(null);
         this.c.a($$5, $$4, $$6, $$7, $$8, $$9);
      }
   }

   @Override
   public so a(so $$0) {
      $$0.a("Objectives", this.b());
      $$0.a("PlayerScores", this.c.h());
      $$0.a("Teams", this.a());
      this.d($$0);
      return $$0;
   }

   private su a() {
      su $$0 = new su();

      for (enb $$2 : this.c.g()) {
         so $$3 = new so();
         $$3.a("Name", $$2.b());
         $$3.a("DisplayName", vg.a.a($$2.c()));
         if ($$2.n().b() >= 0) {
            $$3.a("TeamColor", $$2.n().g());
         }

         $$3.a("AllowFriendlyFire", $$2.h());
         $$3.a("SeeFriendlyInvisibles", $$2.i());
         $$3.a("MemberNamePrefix", vg.a.a($$2.e()));
         $$3.a("MemberNameSuffix", vg.a.a($$2.f()));
         $$3.a("NameTagVisibility", $$2.j().e);
         $$3.a("DeathMessageVisibility", $$2.k().e);
         $$3.a("CollisionRule", $$2.l().e);
         su $$4 = new su();

         for (String $$5 : $$2.g()) {
            $$4.add(tj.a($$5));
         }

         $$3.a("Players", $$4);
         $$0.add($$3);
      }

      return $$0;
   }

   private void d(so $$0) {
      so $$1 = new so();

      for (emx $$2 : emx.values()) {
         emy $$3 = this.c.a($$2);
         if ($$3 != null) {
            $$1.a($$2.c(), $$3.b());
         }
      }

      if (!$$1.g()) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private su b() {
      su $$0 = new su();

      for (emy $$2 : this.c.c()) {
         so $$3 = new so();
         $$3.a("Name", $$2.b());
         $$3.a("CriteriaName", $$2.c().d());
         $$3.a("DisplayName", vg.a.a($$2.d()));
         $$3.a("RenderType", $$2.h().a());
         $$3.a("display_auto_update", $$2.e());
         ww $$4 = $$2.f();
         if ($$4 != null) {
            wy.b.encodeStart(tc.a, $$4).result().ifPresent($$1 -> $$3.a("format", $$1));
         }

         $$0.add($$3);
      }

      return $$0;
   }
}
