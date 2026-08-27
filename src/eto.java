import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eto extends emi {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "scoreboard";
   private final etn c;

   public eto(etn $$0) {
      this.c = $$0;
   }

   public eto b(to $$0, ip.a $$1) {
      this.b($$0.c("Objectives", 10), $$1);
      this.c.a($$0.c("PlayerScores", 10), $$1);
      if ($$0.b("DisplaySlots", 10)) {
         this.a($$0.p("DisplaySlots"));
      }

      if ($$0.b("Teams", 9)) {
         this.a($$0.c("Teams", 10), $$1);
      }

      return this;
   }

   private void a(tu $$0, ip.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         to $$3 = $$0.a($$2);
         String $$4 = $$3.l("Name");
         eti $$5 = this.c.c($$4);
         wi $$6 = wi.a.a($$3.l("DisplayName"), $$1);
         if ($$6 != null) {
            $$5.a($$6);
         }

         if ($$3.b("TeamColor", 8)) {
            $$5.a(n.b($$3.l("TeamColor")));
         }

         if ($$3.b("AllowFriendlyFire", 99)) {
            $$5.a($$3.q("AllowFriendlyFire"));
         }

         if ($$3.b("SeeFriendlyInvisibles", 99)) {
            $$5.b($$3.q("SeeFriendlyInvisibles"));
         }

         if ($$3.b("MemberNamePrefix", 8)) {
            wi $$7 = wi.a.a($$3.l("MemberNamePrefix"), $$1);
            if ($$7 != null) {
               $$5.b($$7);
            }
         }

         if ($$3.b("MemberNameSuffix", 8)) {
            wi $$8 = wi.a.a($$3.l("MemberNameSuffix"), $$1);
            if ($$8 != null) {
               $$5.c($$8);
            }
         }

         if ($$3.b("NameTagVisibility", 8)) {
            etp.b $$9 = etp.b.a($$3.l("NameTagVisibility"));
            if ($$9 != null) {
               $$5.a($$9);
            }
         }

         if ($$3.b("DeathMessageVisibility", 8)) {
            etp.b $$10 = etp.b.a($$3.l("DeathMessageVisibility"));
            if ($$10 != null) {
               $$5.b($$10);
            }
         }

         if ($$3.b("CollisionRule", 8)) {
            etp.a $$11 = etp.a.a($$3.l("CollisionRule"));
            if ($$11 != null) {
               $$5.a($$11);
            }
         }

         this.a($$5, $$3.c("Players", 8));
      }
   }

   private void a(eti $$0, tu $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c.a($$1.j($$2), $$0);
      }
   }

   private void a(to $$0) {
      for (String $$1 : $$0.e()) {
         ete $$2 = ete.t.a($$1);
         if ($$2 != null) {
            String $$3 = $$0.l($$1);
            etf $$4 = this.c.a($$3);
            this.c.a($$2, $$4);
         }
      }
   }

   private void b(tu $$0, ip.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         to $$3 = $$0.a($$2);
         String $$4 = $$3.l("CriteriaName");
         etq $$5 = etq.a($$4).orElseGet(() -> {
            b.warn("Unknown scoreboard criteria {}, replacing with {}", $$4, etq.b.d());
            return etq.b;
         });
         String $$6 = $$3.l("Name");
         wi $$7 = wi.a.a($$3.l("DisplayName"), $$1);
         etq.a $$8 = etq.a.a($$3.l("RenderType"));
         boolean $$9 = $$3.q("display_auto_update");
         xy $$10 = (xy)ya.b.parse($$1.a(uc.a), $$3.c("format")).result().orElse(null);
         this.c.a($$6, $$5, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public to a(to $$0, ip.a $$1) {
      $$0.a("Objectives", this.b($$1));
      $$0.a("PlayerScores", this.c.a($$1));
      $$0.a("Teams", this.a($$1));
      this.b($$0);
      return $$0;
   }

   private tu a(ip.a $$0) {
      tu $$1 = new tu();

      for (eti $$3 : this.c.g()) {
         to $$4 = new to();
         $$4.a("Name", $$3.b());
         $$4.a("DisplayName", wi.a.a($$3.c(), $$0));
         if ($$3.n().b() >= 0) {
            $$4.a("TeamColor", $$3.n().g());
         }

         $$4.a("AllowFriendlyFire", $$3.h());
         $$4.a("SeeFriendlyInvisibles", $$3.i());
         $$4.a("MemberNamePrefix", wi.a.a($$3.e(), $$0));
         $$4.a("MemberNameSuffix", wi.a.a($$3.f(), $$0));
         $$4.a("NameTagVisibility", $$3.j().e);
         $$4.a("DeathMessageVisibility", $$3.k().e);
         $$4.a("CollisionRule", $$3.l().e);
         tu $$5 = new tu();

         for (String $$6 : $$3.g()) {
            $$5.add(uj.a($$6));
         }

         $$4.a("Players", $$5);
         $$1.add($$4);
      }

      return $$1;
   }

   private void b(to $$0) {
      to $$1 = new to();

      for (ete $$2 : ete.values()) {
         etf $$3 = this.c.a($$2);
         if ($$3 != null) {
            $$1.a($$2.c(), $$3.b());
         }
      }

      if (!$$1.g()) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private tu b(ip.a $$0) {
      tu $$1 = new tu();

      for (etf $$3 : this.c.c()) {
         to $$4 = new to();
         $$4.a("Name", $$3.b());
         $$4.a("CriteriaName", $$3.c().d());
         $$4.a("DisplayName", wi.a.a($$3.d(), $$0));
         $$4.a("RenderType", $$3.h().a());
         $$4.a("display_auto_update", $$3.e());
         xy $$5 = $$3.f();
         if ($$5 != null) {
            ya.b.encodeStart($$0.a(uc.a), $$5).result().ifPresent($$1x -> $$4.a("format", $$1x));
         }

         $$1.add($$4);
      }

      return $$1;
   }
}
