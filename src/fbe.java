import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fbe extends eth {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "scoreboard";
   private final fbd c;

   public fbe(fbd $$0) {
      this.c = $$0;
   }

   public fbe b(ul $$0, js.a $$1) {
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

   private void a(ur $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         ul $$3 = $$0.a($$2);
         String $$4 = $$3.l("Name");
         fay $$5 = this.c.c($$4);
         xj $$6 = xj.a.a($$3.l("DisplayName"), $$1);
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
            xj $$7 = xj.a.a($$3.l("MemberNamePrefix"), $$1);
            if ($$7 != null) {
               $$5.b($$7);
            }
         }

         if ($$3.b("MemberNameSuffix", 8)) {
            xj $$8 = xj.a.a($$3.l("MemberNameSuffix"), $$1);
            if ($$8 != null) {
               $$5.c($$8);
            }
         }

         if ($$3.b("NameTagVisibility", 8)) {
            fbf.b $$9 = fbf.b.a($$3.l("NameTagVisibility"));
            if ($$9 != null) {
               $$5.a($$9);
            }
         }

         if ($$3.b("DeathMessageVisibility", 8)) {
            fbf.b $$10 = fbf.b.a($$3.l("DeathMessageVisibility"));
            if ($$10 != null) {
               $$5.b($$10);
            }
         }

         if ($$3.b("CollisionRule", 8)) {
            fbf.a $$11 = fbf.a.a($$3.l("CollisionRule"));
            if ($$11 != null) {
               $$5.a($$11);
            }
         }

         this.a($$5, $$3.c("Players", 8));
      }
   }

   private void a(fay $$0, ur $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c.a($$1.j($$2), $$0);
      }
   }

   private void a(ul $$0) {
      for (String $$1 : $$0.e()) {
         fau $$2 = fau.t.a($$1);
         if ($$2 != null) {
            String $$3 = $$0.l($$1);
            fav $$4 = this.c.a($$3);
            this.c.a($$2, $$4);
         }
      }
   }

   private void b(ur $$0, js.a $$1) {
      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         ul $$3 = $$0.a($$2);
         String $$4 = $$3.l("CriteriaName");
         fbg $$5 = fbg.a($$4).orElseGet(() -> {
            b.warn("Unknown scoreboard criteria {}, replacing with {}", $$4, fbg.b.d());
            return fbg.b;
         });
         String $$6 = $$3.l("Name");
         xj $$7 = xj.a.a($$3.l("DisplayName"), $$1);
         fbg.a $$8 = fbg.a.a($$3.l("RenderType"));
         boolean $$9 = $$3.q("display_auto_update");
         yz $$10 = (yz)zb.b.parse($$1.a(uz.a), $$3.c("format")).result().orElse(null);
         this.c.a($$6, $$5, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public ul a(ul $$0, js.a $$1) {
      $$0.a("Objectives", this.c($$1));
      $$0.a("PlayerScores", this.c.a($$1));
      $$0.a("Teams", this.b($$1));
      this.b($$0);
      return $$0;
   }

   private ur b(js.a $$0) {
      ur $$1 = new ur();

      for (fay $$3 : this.c.g()) {
         ul $$4 = new ul();
         $$4.a("Name", $$3.b());
         $$4.a("DisplayName", xj.a.a($$3.c(), $$0));
         if ($$3.n().b() >= 0) {
            $$4.a("TeamColor", $$3.n().g());
         }

         $$4.a("AllowFriendlyFire", $$3.h());
         $$4.a("SeeFriendlyInvisibles", $$3.i());
         $$4.a("MemberNamePrefix", xj.a.a($$3.e(), $$0));
         $$4.a("MemberNameSuffix", xj.a.a($$3.f(), $$0));
         $$4.a("NameTagVisibility", $$3.j().e);
         $$4.a("DeathMessageVisibility", $$3.k().e);
         $$4.a("CollisionRule", $$3.l().e);
         ur $$5 = new ur();

         for (String $$6 : $$3.g()) {
            $$5.add(vg.a($$6));
         }

         $$4.a("Players", $$5);
         $$1.add($$4);
      }

      return $$1;
   }

   private void b(ul $$0) {
      ul $$1 = new ul();

      for (fau $$2 : fau.values()) {
         fav $$3 = this.c.a($$2);
         if ($$3 != null) {
            $$1.a($$2.c(), $$3.b());
         }
      }

      if (!$$1.g()) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private ur c(js.a $$0) {
      ur $$1 = new ur();

      for (fav $$3 : this.c.c()) {
         ul $$4 = new ul();
         $$4.a("Name", $$3.b());
         $$4.a("CriteriaName", $$3.c().d());
         $$4.a("DisplayName", xj.a.a($$3.d(), $$0));
         $$4.a("RenderType", $$3.h().a());
         $$4.a("display_auto_update", $$3.e());
         yz $$5 = $$3.f();
         if ($$5 != null) {
            zb.b.encodeStart($$0.a(uz.a), $$5).ifSuccess($$1x -> $$4.a("format", $$1x));
         }

         $$1.add($$4);
      }

      return $$1;
   }
}
