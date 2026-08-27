import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eip extends ebt {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "scoreboard";
   private final eio c;

   public eip(eio $$0) {
      this.c = $$0;
   }

   public eip b(qy $$0) {
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

   private void a(re $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qy $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         eim $$4 = this.c.e($$3);
         tn $$5 = tn.a.a($$2.l("DisplayName"));
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
            tn $$6 = tn.a.a($$2.l("MemberNamePrefix"));
            if ($$6 != null) {
               $$4.b($$6);
            }
         }

         if ($$2.b("MemberNameSuffix", 8)) {
            tn $$7 = tn.a.a($$2.l("MemberNameSuffix"));
            if ($$7 != null) {
               $$4.c($$7);
            }
         }

         if ($$2.b("NameTagVisibility", 8)) {
            eiq.b $$8 = eiq.b.a($$2.l("NameTagVisibility"));
            if ($$8 != null) {
               $$4.a($$8);
            }
         }

         if ($$2.b("DeathMessageVisibility", 8)) {
            eiq.b $$9 = eiq.b.a($$2.l("DeathMessageVisibility"));
            if ($$9 != null) {
               $$4.b($$9);
            }
         }

         if ($$2.b("CollisionRule", 8)) {
            eiq.a $$10 = eiq.a.a($$2.l("CollisionRule"));
            if ($$10 != null) {
               $$4.a($$10);
            }
         }

         this.a($$4, $$2.c("Players", 8));
      }
   }

   private void a(eim $$0, re $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c.a($$1.j($$2), $$0);
      }
   }

   private void c(qy $$0) {
      for (String $$1 : $$0.e()) {
         eik $$2 = eik.t.a($$1);
         if ($$2 != null) {
            String $$3 = $$0.l($$1);
            eil $$4 = this.c.b($$3);
            this.c.a($$2, $$4);
         }
      }
   }

   private void b(re $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qy $$2 = $$0.a($$1);
         String $$3 = $$2.l("CriteriaName");
         eir $$4 = eir.a($$3).orElseGet(() -> {
            b.warn("Unknown scoreboard criteria {}, replacing with {}", $$3, eir.a.d());
            return eir.a;
         });
         String $$5 = $$2.l("Name");
         tn $$6 = tn.a.a($$2.l("DisplayName"));
         eir.a $$7 = eir.a.a($$2.l("RenderType"));
         this.c.a($$5, $$4, $$6, $$7);
      }
   }

   @Override
   public qy a(qy $$0) {
      $$0.a("Objectives", this.b());
      $$0.a("PlayerScores", this.c.h());
      $$0.a("Teams", this.a());
      this.d($$0);
      return $$0;
   }

   private re a() {
      re $$0 = new re();

      for (eim $$2 : this.c.g()) {
         qy $$3 = new qy();
         $$3.a("Name", $$2.b());
         $$3.a("DisplayName", tn.a.a($$2.c()));
         if ($$2.n().b() >= 0) {
            $$3.a("TeamColor", $$2.n().g());
         }

         $$3.a("AllowFriendlyFire", $$2.h());
         $$3.a("SeeFriendlyInvisibles", $$2.i());
         $$3.a("MemberNamePrefix", tn.a.a($$2.e()));
         $$3.a("MemberNameSuffix", tn.a.a($$2.f()));
         $$3.a("NameTagVisibility", $$2.j().e);
         $$3.a("DeathMessageVisibility", $$2.k().e);
         $$3.a("CollisionRule", $$2.l().e);
         re $$4 = new re();

         for (String $$5 : $$2.g()) {
            $$4.add(rq.a($$5));
         }

         $$3.a("Players", $$4);
         $$0.add($$3);
      }

      return $$0;
   }

   private void d(qy $$0) {
      qy $$1 = new qy();

      for (eik $$2 : eik.values()) {
         eil $$3 = this.c.a($$2);
         if ($$3 != null) {
            $$1.a($$2.c(), $$3.b());
         }
      }

      if (!$$1.g()) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private re b() {
      re $$0 = new re();

      for (eil $$2 : this.c.c()) {
         qy $$3 = new qy();
         $$3.a("Name", $$2.b());
         $$3.a("CriteriaName", $$2.c().d());
         $$3.a("DisplayName", tn.a.a($$2.d()));
         $$3.a("RenderType", $$2.f().a());
         $$0.add($$3);
      }

      return $$0;
   }
}
