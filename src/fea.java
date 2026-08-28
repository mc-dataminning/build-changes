import com.mojang.logging.LogUtils;
import java.util.Collection;
import org.slf4j.Logger;

public class fea extends ewf {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "scoreboard";
   private final fdz c;

   public fea(fdz $$0) {
      this.c = $$0;
   }

   public fea b(tw $$0, ju.a $$1) {
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

   private void a(uc $$0, ju.a $$1) {
      alb<ut> $$2 = $$1.a(uk.a);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tw $$4 = $$0.a($$3);
         String $$5 = $$4.l("Name");
         fdu $$6 = this.c.c($$5);
         if ($$4.e("DisplayName")) {
            wx.a.parse($$2, $$4.c("DisplayName")).ifSuccess($$6::a);
         }

         if ($$4.b("TeamColor", 8)) {
            $$6.a(n.b($$4.l("TeamColor")));
         }

         if ($$4.b("AllowFriendlyFire", 99)) {
            $$6.a($$4.q("AllowFriendlyFire"));
         }

         if ($$4.b("SeeFriendlyInvisibles", 99)) {
            $$6.b($$4.q("SeeFriendlyInvisibles"));
         }

         if ($$4.e("MemberNamePrefix")) {
            wx.a.parse($$2, $$4.c("MemberNamePrefix")).ifSuccess($$6::b);
         }

         if ($$4.e("MemberNameSuffix")) {
            wx.a.parse($$2, $$4.c("MemberNameSuffix")).ifSuccess($$6::c);
         }

         if ($$4.b("NameTagVisibility", 8)) {
            feb.b $$7 = feb.b.a($$4.l("NameTagVisibility"));
            if ($$7 != null) {
               $$6.a($$7);
            }
         }

         if ($$4.b("DeathMessageVisibility", 8)) {
            feb.b $$8 = feb.b.a($$4.l("DeathMessageVisibility"));
            if ($$8 != null) {
               $$6.b($$8);
            }
         }

         if ($$4.b("CollisionRule", 8)) {
            feb.a $$9 = feb.a.a($$4.l("CollisionRule"));
            if ($$9 != null) {
               $$6.a($$9);
            }
         }

         this.a($$6, $$4.c("Players", 8));
      }
   }

   private void a(fdu $$0, uc $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c.a($$1.j($$2), $$0);
      }
   }

   private void a(tw $$0) {
      for (String $$1 : $$0.e()) {
         fdq $$2 = fdq.t.a($$1);
         if ($$2 != null) {
            String $$3 = $$0.l($$1);
            fdr $$4 = this.c.a($$3);
            this.c.a($$2, $$4);
         }
      }
   }

   private void b(uc $$0, ju.a $$1) {
      alb<ut> $$2 = $$1.a(uk.a);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tw $$4 = $$0.a($$3);
         String $$5 = $$4.l("CriteriaName");
         fec $$6 = fec.a($$5).orElseGet(() -> {
            b.warn("Unknown scoreboard criteria {}, replacing with {}", $$5, fec.b.d());
            return fec.b;
         });
         String $$7 = $$4.l("Name");
         wv $$8 = (wv)wx.a
            .parse($$2, $$4.c("DisplayName"))
            .ifError($$1x -> b.warn("Malformed display name for scoreboard criteria '{}', ignoring: {}", $$5, $$1x))
            .result()
            .orElse(null);
         if ($$8 != null) {
            fec.a $$9 = fec.a.a($$4.l("RenderType"));
            boolean $$10 = $$4.q("display_auto_update");
            yl $$11 = (yl)yn.b.parse($$2, $$4.c("format")).result().orElse(null);
            this.c.a($$7, $$6, $$8, $$9, $$10, $$11);
         }
      }
   }

   @Override
   public tw a(tw $$0, ju.a $$1) {
      $$0.a("Objectives", this.c($$1));
      $$0.a("PlayerScores", this.c.a($$1));
      $$0.a("Teams", this.b($$1));
      this.b($$0);
      return $$0;
   }

   private uc b(ju.a $$0) {
      uc $$1 = new uc();
      Collection<fdu> $$2 = this.c.g();
      alb<ut> $$3 = $$0.a(uk.a);

      for (fdu $$4 : $$2) {
         tw $$5 = new tw();
         $$5.a("Name", $$4.b());
         $$5.a("DisplayName", (ut)wx.a.encodeStart($$3, $$4.c()).getOrThrow());
         if ($$4.n().b() >= 0) {
            $$5.a("TeamColor", $$4.n().g());
         }

         $$5.a("AllowFriendlyFire", $$4.h());
         $$5.a("SeeFriendlyInvisibles", $$4.i());
         $$5.a("MemberNamePrefix", (ut)wx.a.encodeStart($$3, $$4.e()).getOrThrow());
         $$5.a("MemberNameSuffix", (ut)wx.a.encodeStart($$3, $$4.f()).getOrThrow());
         $$5.a("NameTagVisibility", $$4.j().e);
         $$5.a("DeathMessageVisibility", $$4.k().e);
         $$5.a("CollisionRule", $$4.l().e);
         uc $$6 = new uc();

         for (String $$7 : $$4.g()) {
            $$6.add(ur.a($$7));
         }

         $$5.a("Players", $$6);
         $$1.add($$5);
      }

      return $$1;
   }

   private void b(tw $$0) {
      tw $$1 = new tw();

      for (fdq $$2 : fdq.values()) {
         fdr $$3 = this.c.a($$2);
         if ($$3 != null) {
            $$1.a($$2.c(), $$3.b());
         }
      }

      if (!$$1.g()) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private uc c(ju.a $$0) {
      uc $$1 = new uc();
      Collection<fdr> $$2 = this.c.c();
      alb<ut> $$3 = $$0.a(uk.a);

      for (fdr $$4 : $$2) {
         tw $$5 = new tw();
         $$5.a("Name", $$4.b());
         $$5.a("CriteriaName", $$4.c().d());
         $$5.a("DisplayName", (ut)wx.a.encodeStart($$3, $$4.d()).getOrThrow());
         $$5.a("RenderType", $$4.h().a());
         $$5.a("display_auto_update", $$4.e());
         yl $$6 = $$4.f();
         if ($$6 != null) {
            yn.b.encodeStart($$3, $$6).ifSuccess($$1x -> $$5.a("format", $$1x));
         }

         $$1.add($$5);
      }

      return $$1;
   }
}
