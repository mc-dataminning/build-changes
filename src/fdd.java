import com.mojang.logging.LogUtils;
import java.util.Collection;
import org.slf4j.Logger;

public class fdd extends evi {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "scoreboard";
   private final fdc c;

   public fdd(fdc $$0) {
      this.c = $$0;
   }

   public fdd b(tq $$0, jt.a $$1) {
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

   private void a(tw $$0, jt.a $$1) {
      aks<un> $$2 = $$1.a(ue.a);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tq $$4 = $$0.a($$3);
         String $$5 = $$4.l("Name");
         fcx $$6 = this.c.c($$5);
         if ($$4.e("DisplayName")) {
            wr.a.parse($$2, $$4.c("DisplayName")).ifSuccess($$6::a);
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
            wr.a.parse($$2, $$4.c("MemberNamePrefix")).ifSuccess($$6::b);
         }

         if ($$4.e("MemberNameSuffix")) {
            wr.a.parse($$2, $$4.c("MemberNameSuffix")).ifSuccess($$6::c);
         }

         if ($$4.b("NameTagVisibility", 8)) {
            fde.b $$7 = fde.b.a($$4.l("NameTagVisibility"));
            if ($$7 != null) {
               $$6.a($$7);
            }
         }

         if ($$4.b("DeathMessageVisibility", 8)) {
            fde.b $$8 = fde.b.a($$4.l("DeathMessageVisibility"));
            if ($$8 != null) {
               $$6.b($$8);
            }
         }

         if ($$4.b("CollisionRule", 8)) {
            fde.a $$9 = fde.a.a($$4.l("CollisionRule"));
            if ($$9 != null) {
               $$6.a($$9);
            }
         }

         this.a($$6, $$4.c("Players", 8));
      }
   }

   private void a(fcx $$0, tw $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c.a($$1.j($$2), $$0);
      }
   }

   private void a(tq $$0) {
      for (String $$1 : $$0.e()) {
         fct $$2 = fct.t.a($$1);
         if ($$2 != null) {
            String $$3 = $$0.l($$1);
            fcu $$4 = this.c.a($$3);
            this.c.a($$2, $$4);
         }
      }
   }

   private void b(tw $$0, jt.a $$1) {
      aks<un> $$2 = $$1.a(ue.a);

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tq $$4 = $$0.a($$3);
         String $$5 = $$4.l("CriteriaName");
         fdf $$6 = fdf.a($$5).orElseGet(() -> {
            b.warn("Unknown scoreboard criteria {}, replacing with {}", $$5, fdf.b.d());
            return fdf.b;
         });
         String $$7 = $$4.l("Name");
         wp $$8 = (wp)wr.a
            .parse($$2, $$4.c("DisplayName"))
            .ifError($$1x -> b.warn("Malformed display name for scoreboard criteria '{}', ignoring: {}", $$5, $$1x))
            .result()
            .orElse(null);
         if ($$8 != null) {
            fdf.a $$9 = fdf.a.a($$4.l("RenderType"));
            boolean $$10 = $$4.q("display_auto_update");
            yf $$11 = (yf)yh.b.parse($$2, $$4.c("format")).result().orElse(null);
            this.c.a($$7, $$6, $$8, $$9, $$10, $$11);
         }
      }
   }

   @Override
   public tq a(tq $$0, jt.a $$1) {
      $$0.a("Objectives", this.c($$1));
      $$0.a("PlayerScores", this.c.a($$1));
      $$0.a("Teams", this.b($$1));
      this.b($$0);
      return $$0;
   }

   private tw b(jt.a $$0) {
      tw $$1 = new tw();
      Collection<fcx> $$2 = this.c.g();
      aks<un> $$3 = $$0.a(ue.a);

      for (fcx $$4 : $$2) {
         tq $$5 = new tq();
         $$5.a("Name", $$4.b());
         $$5.a("DisplayName", (un)wr.a.encodeStart($$3, $$4.c()).getOrThrow());
         if ($$4.n().b() >= 0) {
            $$5.a("TeamColor", $$4.n().g());
         }

         $$5.a("AllowFriendlyFire", $$4.h());
         $$5.a("SeeFriendlyInvisibles", $$4.i());
         $$5.a("MemberNamePrefix", (un)wr.a.encodeStart($$3, $$4.e()).getOrThrow());
         $$5.a("MemberNameSuffix", (un)wr.a.encodeStart($$3, $$4.f()).getOrThrow());
         $$5.a("NameTagVisibility", $$4.j().e);
         $$5.a("DeathMessageVisibility", $$4.k().e);
         $$5.a("CollisionRule", $$4.l().e);
         tw $$6 = new tw();

         for (String $$7 : $$4.g()) {
            $$6.add(ul.a($$7));
         }

         $$5.a("Players", $$6);
         $$1.add($$5);
      }

      return $$1;
   }

   private void b(tq $$0) {
      tq $$1 = new tq();

      for (fct $$2 : fct.values()) {
         fcu $$3 = this.c.a($$2);
         if ($$3 != null) {
            $$1.a($$2.c(), $$3.b());
         }
      }

      if (!$$1.g()) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private tw c(jt.a $$0) {
      tw $$1 = new tw();
      Collection<fcu> $$2 = this.c.c();
      aks<un> $$3 = $$0.a(ue.a);

      for (fcu $$4 : $$2) {
         tq $$5 = new tq();
         $$5.a("Name", $$4.b());
         $$5.a("CriteriaName", $$4.c().d());
         $$5.a("DisplayName", (un)wr.a.encodeStart($$3, $$4.d()).getOrThrow());
         $$5.a("RenderType", $$4.h().a());
         $$5.a("display_auto_update", $$4.e());
         yf $$6 = $$4.f();
         if ($$6 != null) {
            yh.b.encodeStart($$3, $$6).ifSuccess($$1x -> $$5.a("format", $$1x));
         }

         $$1.add($$5);
      }

      return $$1;
   }
}
