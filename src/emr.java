import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emr extends efp {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "scoreboard";
   private final emq c;

   public emr(emq $$0) {
      this.c = $$0;
   }

   public emr b(sl $$0) {
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

   private void a(sr $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         sl $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         eml $$4 = this.c.c($$3);
         vd $$5 = vd.a.a($$2.l("DisplayName"));
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
            vd $$6 = vd.a.a($$2.l("MemberNamePrefix"));
            if ($$6 != null) {
               $$4.b($$6);
            }
         }

         if ($$2.b("MemberNameSuffix", 8)) {
            vd $$7 = vd.a.a($$2.l("MemberNameSuffix"));
            if ($$7 != null) {
               $$4.c($$7);
            }
         }

         if ($$2.b("NameTagVisibility", 8)) {
            ems.b $$8 = ems.b.a($$2.l("NameTagVisibility"));
            if ($$8 != null) {
               $$4.a($$8);
            }
         }

         if ($$2.b("DeathMessageVisibility", 8)) {
            ems.b $$9 = ems.b.a($$2.l("DeathMessageVisibility"));
            if ($$9 != null) {
               $$4.b($$9);
            }
         }

         if ($$2.b("CollisionRule", 8)) {
            ems.a $$10 = ems.a.a($$2.l("CollisionRule"));
            if ($$10 != null) {
               $$4.a($$10);
            }
         }

         this.a($$4, $$2.c("Players", 8));
      }
   }

   private void a(eml $$0, sr $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c.a($$1.j($$2), $$0);
      }
   }

   private void c(sl $$0) {
      for (String $$1 : $$0.e()) {
         emh $$2 = emh.t.a($$1);
         if ($$2 != null) {
            String $$3 = $$0.l($$1);
            emi $$4 = this.c.a($$3);
            this.c.a($$2, $$4);
         }
      }
   }

   private void b(sr $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         sl $$2 = $$0.a($$1);
         String $$3 = $$2.l("CriteriaName");
         emt $$4 = emt.a($$3).orElseGet(() -> {
            b.warn("Unknown scoreboard criteria {}, replacing with {}", $$3, emt.a.d());
            return emt.a;
         });
         String $$5 = $$2.l("Name");
         vd $$6 = vd.a.a($$2.l("DisplayName"));
         emt.a $$7 = emt.a.a($$2.l("RenderType"));
         boolean $$8 = $$2.q("display_auto_update");
         wt $$9 = (wt)wv.b.parse(sz.a, $$2.c("format")).result().orElse(null);
         this.c.a($$5, $$4, $$6, $$7, $$8, $$9);
      }
   }

   @Override
   public sl a(sl $$0) {
      $$0.a("Objectives", this.b());
      $$0.a("PlayerScores", this.c.h());
      $$0.a("Teams", this.a());
      this.d($$0);
      return $$0;
   }

   private sr a() {
      sr $$0 = new sr();

      for (eml $$2 : this.c.g()) {
         sl $$3 = new sl();
         $$3.a("Name", $$2.b());
         $$3.a("DisplayName", vd.a.a($$2.c()));
         if ($$2.n().b() >= 0) {
            $$3.a("TeamColor", $$2.n().g());
         }

         $$3.a("AllowFriendlyFire", $$2.h());
         $$3.a("SeeFriendlyInvisibles", $$2.i());
         $$3.a("MemberNamePrefix", vd.a.a($$2.e()));
         $$3.a("MemberNameSuffix", vd.a.a($$2.f()));
         $$3.a("NameTagVisibility", $$2.j().e);
         $$3.a("DeathMessageVisibility", $$2.k().e);
         $$3.a("CollisionRule", $$2.l().e);
         sr $$4 = new sr();

         for (String $$5 : $$2.g()) {
            $$4.add(tg.a($$5));
         }

         $$3.a("Players", $$4);
         $$0.add($$3);
      }

      return $$0;
   }

   private void d(sl $$0) {
      sl $$1 = new sl();

      for (emh $$2 : emh.values()) {
         emi $$3 = this.c.a($$2);
         if ($$3 != null) {
            $$1.a($$2.c(), $$3.b());
         }
      }

      if (!$$1.g()) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private sr b() {
      sr $$0 = new sr();

      for (emi $$2 : this.c.c()) {
         sl $$3 = new sl();
         $$3.a("Name", $$2.b());
         $$3.a("CriteriaName", $$2.c().d());
         $$3.a("DisplayName", vd.a.a($$2.d()));
         $$3.a("RenderType", $$2.h().a());
         $$3.a("display_auto_update", $$2.e());
         wt $$4 = $$2.f();
         if ($$4 != null) {
            wv.b.encodeStart(sz.a, $$4).result().ifPresent($$1 -> $$3.a("format", $$1));
         }

         $$0.add($$3);
      }

      return $$0;
   }
}
