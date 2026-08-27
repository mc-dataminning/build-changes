import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epe extends eib {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "scoreboard";
   private final epd c;

   public epe(epd $$0) {
      this.c = $$0;
   }

   public epe b(sw $$0) {
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

   private void a(tc $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         sw $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         eoy $$4 = this.c.c($$3);
         vq $$5 = vq.a.a($$2.l("DisplayName"));
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
            vq $$6 = vq.a.a($$2.l("MemberNamePrefix"));
            if ($$6 != null) {
               $$4.b($$6);
            }
         }

         if ($$2.b("MemberNameSuffix", 8)) {
            vq $$7 = vq.a.a($$2.l("MemberNameSuffix"));
            if ($$7 != null) {
               $$4.c($$7);
            }
         }

         if ($$2.b("NameTagVisibility", 8)) {
            epf.b $$8 = epf.b.a($$2.l("NameTagVisibility"));
            if ($$8 != null) {
               $$4.a($$8);
            }
         }

         if ($$2.b("DeathMessageVisibility", 8)) {
            epf.b $$9 = epf.b.a($$2.l("DeathMessageVisibility"));
            if ($$9 != null) {
               $$4.b($$9);
            }
         }

         if ($$2.b("CollisionRule", 8)) {
            epf.a $$10 = epf.a.a($$2.l("CollisionRule"));
            if ($$10 != null) {
               $$4.a($$10);
            }
         }

         this.a($$4, $$2.c("Players", 8));
      }
   }

   private void a(eoy $$0, tc $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c.a($$1.j($$2), $$0);
      }
   }

   private void c(sw $$0) {
      for (String $$1 : $$0.e()) {
         eou $$2 = eou.t.a($$1);
         if ($$2 != null) {
            String $$3 = $$0.l($$1);
            eov $$4 = this.c.a($$3);
            this.c.a($$2, $$4);
         }
      }
   }

   private void b(tc $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         sw $$2 = $$0.a($$1);
         String $$3 = $$2.l("CriteriaName");
         epg $$4 = epg.a($$3).orElseGet(() -> {
            b.warn("Unknown scoreboard criteria {}, replacing with {}", $$3, epg.b.d());
            return epg.b;
         });
         String $$5 = $$2.l("Name");
         vq $$6 = vq.a.a($$2.l("DisplayName"));
         epg.a $$7 = epg.a.a($$2.l("RenderType"));
         boolean $$8 = $$2.q("display_auto_update");
         xg $$9 = (xg)xi.b.parse(tk.a, $$2.c("format")).result().orElse(null);
         this.c.a($$5, $$4, $$6, $$7, $$8, $$9);
      }
   }

   @Override
   public sw a(sw $$0) {
      $$0.a("Objectives", this.b());
      $$0.a("PlayerScores", this.c.h());
      $$0.a("Teams", this.a());
      this.d($$0);
      return $$0;
   }

   private tc a() {
      tc $$0 = new tc();

      for (eoy $$2 : this.c.g()) {
         sw $$3 = new sw();
         $$3.a("Name", $$2.b());
         $$3.a("DisplayName", vq.a.a($$2.c()));
         if ($$2.n().b() >= 0) {
            $$3.a("TeamColor", $$2.n().g());
         }

         $$3.a("AllowFriendlyFire", $$2.h());
         $$3.a("SeeFriendlyInvisibles", $$2.i());
         $$3.a("MemberNamePrefix", vq.a.a($$2.e()));
         $$3.a("MemberNameSuffix", vq.a.a($$2.f()));
         $$3.a("NameTagVisibility", $$2.j().e);
         $$3.a("DeathMessageVisibility", $$2.k().e);
         $$3.a("CollisionRule", $$2.l().e);
         tc $$4 = new tc();

         for (String $$5 : $$2.g()) {
            $$4.add(tr.a($$5));
         }

         $$3.a("Players", $$4);
         $$0.add($$3);
      }

      return $$0;
   }

   private void d(sw $$0) {
      sw $$1 = new sw();

      for (eou $$2 : eou.values()) {
         eov $$3 = this.c.a($$2);
         if ($$3 != null) {
            $$1.a($$2.c(), $$3.b());
         }
      }

      if (!$$1.g()) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private tc b() {
      tc $$0 = new tc();

      for (eov $$2 : this.c.c()) {
         sw $$3 = new sw();
         $$3.a("Name", $$2.b());
         $$3.a("CriteriaName", $$2.c().d());
         $$3.a("DisplayName", vq.a.a($$2.d()));
         $$3.a("RenderType", $$2.h().a());
         $$3.a("display_auto_update", $$2.e());
         xg $$4 = $$2.f();
         if ($$4 != null) {
            xi.b.encodeStart(tk.a, $$4).result().ifPresent($$1 -> $$3.a("format", $$1));
         }

         $$0.add($$3);
      }

      return $$0;
   }
}
