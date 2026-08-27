import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eqy extends eju {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "scoreboard";
   private final eqx c;

   public eqy(eqx $$0) {
      this.c = $$0;
   }

   public eqy a(ta $$0) {
      this.b($$0.c("Objectives", 10));
      this.c.a($$0.c("PlayerScores", 10));
      if ($$0.b("DisplaySlots", 10)) {
         this.b($$0.p("DisplaySlots"));
      }

      if ($$0.b("Teams", 9)) {
         this.a($$0.c("Teams", 10));
      }

      return this;
   }

   private void a(tg $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ta $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         eqs $$4 = this.c.c($$3);
         vu $$5 = vu.a.a($$2.l("DisplayName"));
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
            vu $$6 = vu.a.a($$2.l("MemberNamePrefix"));
            if ($$6 != null) {
               $$4.b($$6);
            }
         }

         if ($$2.b("MemberNameSuffix", 8)) {
            vu $$7 = vu.a.a($$2.l("MemberNameSuffix"));
            if ($$7 != null) {
               $$4.c($$7);
            }
         }

         if ($$2.b("NameTagVisibility", 8)) {
            eqz.b $$8 = eqz.b.a($$2.l("NameTagVisibility"));
            if ($$8 != null) {
               $$4.a($$8);
            }
         }

         if ($$2.b("DeathMessageVisibility", 8)) {
            eqz.b $$9 = eqz.b.a($$2.l("DeathMessageVisibility"));
            if ($$9 != null) {
               $$4.b($$9);
            }
         }

         if ($$2.b("CollisionRule", 8)) {
            eqz.a $$10 = eqz.a.a($$2.l("CollisionRule"));
            if ($$10 != null) {
               $$4.a($$10);
            }
         }

         this.a($$4, $$2.c("Players", 8));
      }
   }

   private void a(eqs $$0, tg $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c.a($$1.j($$2), $$0);
      }
   }

   private void b(ta $$0) {
      for (String $$1 : $$0.e()) {
         eqo $$2 = eqo.t.a($$1);
         if ($$2 != null) {
            String $$3 = $$0.l($$1);
            eqp $$4 = this.c.a($$3);
            this.c.a($$2, $$4);
         }
      }
   }

   private void b(tg $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ta $$2 = $$0.a($$1);
         String $$3 = $$2.l("CriteriaName");
         era $$4 = era.a($$3).orElseGet(() -> {
            b.warn("Unknown scoreboard criteria {}, replacing with {}", $$3, era.b.d());
            return era.b;
         });
         String $$5 = $$2.l("Name");
         vu $$6 = vu.a.a($$2.l("DisplayName"));
         era.a $$7 = era.a.a($$2.l("RenderType"));
         boolean $$8 = $$2.q("display_auto_update");
         xk $$9 = (xk)xm.b.parse(to.a, $$2.c("format")).result().orElse(null);
         this.c.a($$5, $$4, $$6, $$7, $$8, $$9);
      }
   }

   @Override
   public ta a(ta $$0, in.a $$1) {
      $$0.a("Objectives", this.b());
      $$0.a("PlayerScores", this.c.h());
      $$0.a("Teams", this.a());
      this.c($$0);
      return $$0;
   }

   private tg a() {
      tg $$0 = new tg();

      for (eqs $$2 : this.c.g()) {
         ta $$3 = new ta();
         $$3.a("Name", $$2.b());
         $$3.a("DisplayName", vu.a.a($$2.c()));
         if ($$2.n().b() >= 0) {
            $$3.a("TeamColor", $$2.n().g());
         }

         $$3.a("AllowFriendlyFire", $$2.h());
         $$3.a("SeeFriendlyInvisibles", $$2.i());
         $$3.a("MemberNamePrefix", vu.a.a($$2.e()));
         $$3.a("MemberNameSuffix", vu.a.a($$2.f()));
         $$3.a("NameTagVisibility", $$2.j().e);
         $$3.a("DeathMessageVisibility", $$2.k().e);
         $$3.a("CollisionRule", $$2.l().e);
         tg $$4 = new tg();

         for (String $$5 : $$2.g()) {
            $$4.add(tv.a($$5));
         }

         $$3.a("Players", $$4);
         $$0.add($$3);
      }

      return $$0;
   }

   private void c(ta $$0) {
      ta $$1 = new ta();

      for (eqo $$2 : eqo.values()) {
         eqp $$3 = this.c.a($$2);
         if ($$3 != null) {
            $$1.a($$2.c(), $$3.b());
         }
      }

      if (!$$1.g()) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private tg b() {
      tg $$0 = new tg();

      for (eqp $$2 : this.c.c()) {
         ta $$3 = new ta();
         $$3.a("Name", $$2.b());
         $$3.a("CriteriaName", $$2.c().d());
         $$3.a("DisplayName", vu.a.a($$2.d()));
         $$3.a("RenderType", $$2.h().a());
         $$3.a("display_auto_update", $$2.e());
         xk $$4 = $$2.f();
         if ($$4 != null) {
            xm.b.encodeStart(to.a, $$4).result().ifPresent($$1 -> $$3.a("format", $$1));
         }

         $$0.add($$3);
      }

      return $$0;
   }
}
