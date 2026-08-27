import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eif extends ebg {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "scoreboard";
   private final eie c;

   public eif(eie $$0) {
      this.c = $$0;
   }

   public eif b(qs $$0) {
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

   private void a(qy $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qs $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         eic $$4 = this.c.e($$3);
         te $$5 = te.a.a($$2.l("DisplayName"));
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
            te $$6 = te.a.a($$2.l("MemberNamePrefix"));
            if ($$6 != null) {
               $$4.b($$6);
            }
         }

         if ($$2.b("MemberNameSuffix", 8)) {
            te $$7 = te.a.a($$2.l("MemberNameSuffix"));
            if ($$7 != null) {
               $$4.c($$7);
            }
         }

         if ($$2.b("NameTagVisibility", 8)) {
            eig.b $$8 = eig.b.a($$2.l("NameTagVisibility"));
            if ($$8 != null) {
               $$4.a($$8);
            }
         }

         if ($$2.b("DeathMessageVisibility", 8)) {
            eig.b $$9 = eig.b.a($$2.l("DeathMessageVisibility"));
            if ($$9 != null) {
               $$4.b($$9);
            }
         }

         if ($$2.b("CollisionRule", 8)) {
            eig.a $$10 = eig.a.a($$2.l("CollisionRule"));
            if ($$10 != null) {
               $$4.a($$10);
            }
         }

         this.a($$4, $$2.c("Players", 8));
      }
   }

   private void a(eic $$0, qy $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c.a($$1.j($$2), $$0);
      }
   }

   private void c(qs $$0) {
      for (String $$1 : $$0.e()) {
         eia $$2 = eia.t.a($$1);
         if ($$2 != null) {
            String $$3 = $$0.l($$1);
            eib $$4 = this.c.b($$3);
            this.c.a($$2, $$4);
         }
      }
   }

   private void b(qy $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qs $$2 = $$0.a($$1);
         String $$3 = $$2.l("CriteriaName");
         eih $$4 = eih.a($$3).orElseGet(() -> {
            b.warn("Unknown scoreboard criteria {}, replacing with {}", $$3, eih.a.d());
            return eih.a;
         });
         String $$5 = $$2.l("Name");
         te $$6 = te.a.a($$2.l("DisplayName"));
         eih.a $$7 = eih.a.a($$2.l("RenderType"));
         this.c.a($$5, $$4, $$6, $$7);
      }
   }

   @Override
   public qs a(qs $$0) {
      $$0.a("Objectives", this.b());
      $$0.a("PlayerScores", this.c.h());
      $$0.a("Teams", this.a());
      this.d($$0);
      return $$0;
   }

   private qy a() {
      qy $$0 = new qy();

      for (eic $$2 : this.c.g()) {
         qs $$3 = new qs();
         $$3.a("Name", $$2.b());
         $$3.a("DisplayName", te.a.a($$2.c()));
         if ($$2.n().b() >= 0) {
            $$3.a("TeamColor", $$2.n().g());
         }

         $$3.a("AllowFriendlyFire", $$2.h());
         $$3.a("SeeFriendlyInvisibles", $$2.i());
         $$3.a("MemberNamePrefix", te.a.a($$2.e()));
         $$3.a("MemberNameSuffix", te.a.a($$2.f()));
         $$3.a("NameTagVisibility", $$2.j().e);
         $$3.a("DeathMessageVisibility", $$2.k().e);
         $$3.a("CollisionRule", $$2.l().e);
         qy $$4 = new qy();

         for (String $$5 : $$2.g()) {
            $$4.add(rj.a($$5));
         }

         $$3.a("Players", $$4);
         $$0.add($$3);
      }

      return $$0;
   }

   private void d(qs $$0) {
      qs $$1 = new qs();

      for (eia $$2 : eia.values()) {
         eib $$3 = this.c.a($$2);
         if ($$3 != null) {
            $$1.a($$2.c(), $$3.b());
         }
      }

      if (!$$1.g()) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private qy b() {
      qy $$0 = new qy();

      for (eib $$2 : this.c.c()) {
         qs $$3 = new qs();
         $$3.a("Name", $$2.b());
         $$3.a("CriteriaName", $$2.c().d());
         $$3.a("DisplayName", te.a.a($$2.d()));
         $$3.a("RenderType", $$2.f().a());
         $$0.add($$3);
      }

      return $$0;
   }
}
