import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ewr extends eox {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "scoreboard";
   private final ewq c;

   public ewr(ewq $$0) {
      this.c = $$0;
   }

   public ewr b(ur $$0, jk.a $$1) {
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

   private void a(ux $$0, jk.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         ur $$3 = $$0.a($$2);
         String $$4 = $$3.l("Name");
         ewl $$5 = this.c.c($$4);
         xl $$6 = xl.a.a($$3.l("DisplayName"), $$1);
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
            xl $$7 = xl.a.a($$3.l("MemberNamePrefix"), $$1);
            if ($$7 != null) {
               $$5.b($$7);
            }
         }

         if ($$3.b("MemberNameSuffix", 8)) {
            xl $$8 = xl.a.a($$3.l("MemberNameSuffix"), $$1);
            if ($$8 != null) {
               $$5.c($$8);
            }
         }

         if ($$3.b("NameTagVisibility", 8)) {
            ews.b $$9 = ews.b.a($$3.l("NameTagVisibility"));
            if ($$9 != null) {
               $$5.a($$9);
            }
         }

         if ($$3.b("DeathMessageVisibility", 8)) {
            ews.b $$10 = ews.b.a($$3.l("DeathMessageVisibility"));
            if ($$10 != null) {
               $$5.b($$10);
            }
         }

         if ($$3.b("CollisionRule", 8)) {
            ews.a $$11 = ews.a.a($$3.l("CollisionRule"));
            if ($$11 != null) {
               $$5.a($$11);
            }
         }

         this.a($$5, $$3.c("Players", 8));
      }
   }

   private void a(ewl $$0, ux $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c.a($$1.j($$2), $$0);
      }
   }

   private void a(ur $$0) {
      for (String $$1 : $$0.e()) {
         ewh $$2 = ewh.t.a($$1);
         if ($$2 != null) {
            String $$3 = $$0.l($$1);
            ewi $$4 = this.c.a($$3);
            this.c.a($$2, $$4);
         }
      }
   }

   private void b(ux $$0, jk.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         ur $$3 = $$0.a($$2);
         String $$4 = $$3.l("CriteriaName");
         ewt $$5 = ewt.a($$4).orElseGet(() -> {
            b.warn("Unknown scoreboard criteria {}, replacing with {}", $$4, ewt.b.d());
            return ewt.b;
         });
         String $$6 = $$3.l("Name");
         xl $$7 = xl.a.a($$3.l("DisplayName"), $$1);
         ewt.a $$8 = ewt.a.a($$3.l("RenderType"));
         boolean $$9 = $$3.q("display_auto_update");
         zb $$10 = (zb)zd.b.parse($$1.a(vf.a), $$3.c("format")).result().orElse(null);
         this.c.a($$6, $$5, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public ur a(ur $$0, jk.a $$1) {
      $$0.a("Objectives", this.b($$1));
      $$0.a("PlayerScores", this.c.a($$1));
      $$0.a("Teams", this.a($$1));
      this.b($$0);
      return $$0;
   }

   private ux a(jk.a $$0) {
      ux $$1 = new ux();

      for (ewl $$3 : this.c.g()) {
         ur $$4 = new ur();
         $$4.a("Name", $$3.b());
         $$4.a("DisplayName", xl.a.a($$3.c(), $$0));
         if ($$3.n().b() >= 0) {
            $$4.a("TeamColor", $$3.n().g());
         }

         $$4.a("AllowFriendlyFire", $$3.h());
         $$4.a("SeeFriendlyInvisibles", $$3.i());
         $$4.a("MemberNamePrefix", xl.a.a($$3.e(), $$0));
         $$4.a("MemberNameSuffix", xl.a.a($$3.f(), $$0));
         $$4.a("NameTagVisibility", $$3.j().e);
         $$4.a("DeathMessageVisibility", $$3.k().e);
         $$4.a("CollisionRule", $$3.l().e);
         ux $$5 = new ux();

         for (String $$6 : $$3.g()) {
            $$5.add(vm.a($$6));
         }

         $$4.a("Players", $$5);
         $$1.add($$4);
      }

      return $$1;
   }

   private void b(ur $$0) {
      ur $$1 = new ur();

      for (ewh $$2 : ewh.values()) {
         ewi $$3 = this.c.a($$2);
         if ($$3 != null) {
            $$1.a($$2.c(), $$3.b());
         }
      }

      if (!$$1.g()) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private ux b(jk.a $$0) {
      ux $$1 = new ux();

      for (ewi $$3 : this.c.c()) {
         ur $$4 = new ur();
         $$4.a("Name", $$3.b());
         $$4.a("CriteriaName", $$3.c().d());
         $$4.a("DisplayName", xl.a.a($$3.d(), $$0));
         $$4.a("RenderType", $$3.h().a());
         $$4.a("display_auto_update", $$3.e());
         zb $$5 = $$3.f();
         if ($$5 != null) {
            zd.b.encodeStart($$0.a(vf.a), $$5).ifSuccess($$1x -> $$4.a("format", $$1x));
         }

         $$1.add($$4);
      }

      return $$1;
   }
}
