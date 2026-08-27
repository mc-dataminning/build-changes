import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ein extends ebr {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "scoreboard";
   private final eim c;

   public ein(eim $$0) {
      this.c = $$0;
   }

   public ein b(qw $$0) {
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

   private void a(rc $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qw $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         eik $$4 = this.c.e($$3);
         tl $$5 = tl.a.a($$2.l("DisplayName"));
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
            tl $$6 = tl.a.a($$2.l("MemberNamePrefix"));
            if ($$6 != null) {
               $$4.b($$6);
            }
         }

         if ($$2.b("MemberNameSuffix", 8)) {
            tl $$7 = tl.a.a($$2.l("MemberNameSuffix"));
            if ($$7 != null) {
               $$4.c($$7);
            }
         }

         if ($$2.b("NameTagVisibility", 8)) {
            eio.b $$8 = eio.b.a($$2.l("NameTagVisibility"));
            if ($$8 != null) {
               $$4.a($$8);
            }
         }

         if ($$2.b("DeathMessageVisibility", 8)) {
            eio.b $$9 = eio.b.a($$2.l("DeathMessageVisibility"));
            if ($$9 != null) {
               $$4.b($$9);
            }
         }

         if ($$2.b("CollisionRule", 8)) {
            eio.a $$10 = eio.a.a($$2.l("CollisionRule"));
            if ($$10 != null) {
               $$4.a($$10);
            }
         }

         this.a($$4, $$2.c("Players", 8));
      }
   }

   private void a(eik $$0, rc $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c.a($$1.j($$2), $$0);
      }
   }

   private void c(qw $$0) {
      for (String $$1 : $$0.e()) {
         eii $$2 = eii.t.a($$1);
         if ($$2 != null) {
            String $$3 = $$0.l($$1);
            eij $$4 = this.c.b($$3);
            this.c.a($$2, $$4);
         }
      }
   }

   private void b(rc $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qw $$2 = $$0.a($$1);
         String $$3 = $$2.l("CriteriaName");
         eip $$4 = eip.a($$3).orElseGet(() -> {
            b.warn("Unknown scoreboard criteria {}, replacing with {}", $$3, eip.a.d());
            return eip.a;
         });
         String $$5 = $$2.l("Name");
         tl $$6 = tl.a.a($$2.l("DisplayName"));
         eip.a $$7 = eip.a.a($$2.l("RenderType"));
         this.c.a($$5, $$4, $$6, $$7);
      }
   }

   @Override
   public qw a(qw $$0) {
      $$0.a("Objectives", this.b());
      $$0.a("PlayerScores", this.c.h());
      $$0.a("Teams", this.a());
      this.d($$0);
      return $$0;
   }

   private rc a() {
      rc $$0 = new rc();

      for (eik $$2 : this.c.g()) {
         qw $$3 = new qw();
         $$3.a("Name", $$2.b());
         $$3.a("DisplayName", tl.a.a($$2.c()));
         if ($$2.n().b() >= 0) {
            $$3.a("TeamColor", $$2.n().g());
         }

         $$3.a("AllowFriendlyFire", $$2.h());
         $$3.a("SeeFriendlyInvisibles", $$2.i());
         $$3.a("MemberNamePrefix", tl.a.a($$2.e()));
         $$3.a("MemberNameSuffix", tl.a.a($$2.f()));
         $$3.a("NameTagVisibility", $$2.j().e);
         $$3.a("DeathMessageVisibility", $$2.k().e);
         $$3.a("CollisionRule", $$2.l().e);
         rc $$4 = new rc();

         for (String $$5 : $$2.g()) {
            $$4.add(ro.a($$5));
         }

         $$3.a("Players", $$4);
         $$0.add($$3);
      }

      return $$0;
   }

   private void d(qw $$0) {
      qw $$1 = new qw();

      for (eii $$2 : eii.values()) {
         eij $$3 = this.c.a($$2);
         if ($$3 != null) {
            $$1.a($$2.c(), $$3.b());
         }
      }

      if (!$$1.g()) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private rc b() {
      rc $$0 = new rc();

      for (eij $$2 : this.c.c()) {
         qw $$3 = new qw();
         $$3.a("Name", $$2.b());
         $$3.a("CriteriaName", $$2.c().d());
         $$3.a("DisplayName", tl.a.a($$2.d()));
         $$3.a("RenderType", $$2.f().a());
         $$0.add($$3);
      }

      return $$0;
   }
}
