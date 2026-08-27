import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class emy extends efw {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "scoreboard";
   private final emx c;

   public emy(emx $$0) {
      this.c = $$0;
   }

   public emy b(sn $$0) {
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

   private void a(st $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         sn $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         ems $$4 = this.c.c($$3);
         vf $$5 = vf.a.a($$2.l("DisplayName"));
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
            vf $$6 = vf.a.a($$2.l("MemberNamePrefix"));
            if ($$6 != null) {
               $$4.b($$6);
            }
         }

         if ($$2.b("MemberNameSuffix", 8)) {
            vf $$7 = vf.a.a($$2.l("MemberNameSuffix"));
            if ($$7 != null) {
               $$4.c($$7);
            }
         }

         if ($$2.b("NameTagVisibility", 8)) {
            emz.b $$8 = emz.b.a($$2.l("NameTagVisibility"));
            if ($$8 != null) {
               $$4.a($$8);
            }
         }

         if ($$2.b("DeathMessageVisibility", 8)) {
            emz.b $$9 = emz.b.a($$2.l("DeathMessageVisibility"));
            if ($$9 != null) {
               $$4.b($$9);
            }
         }

         if ($$2.b("CollisionRule", 8)) {
            emz.a $$10 = emz.a.a($$2.l("CollisionRule"));
            if ($$10 != null) {
               $$4.a($$10);
            }
         }

         this.a($$4, $$2.c("Players", 8));
      }
   }

   private void a(ems $$0, st $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c.a($$1.j($$2), $$0);
      }
   }

   private void c(sn $$0) {
      for (String $$1 : $$0.e()) {
         emo $$2 = emo.t.a($$1);
         if ($$2 != null) {
            String $$3 = $$0.l($$1);
            emp $$4 = this.c.a($$3);
            this.c.a($$2, $$4);
         }
      }
   }

   private void b(st $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         sn $$2 = $$0.a($$1);
         String $$3 = $$2.l("CriteriaName");
         ena $$4 = ena.a($$3).orElseGet(() -> {
            b.warn("Unknown scoreboard criteria {}, replacing with {}", $$3, ena.a.d());
            return ena.a;
         });
         String $$5 = $$2.l("Name");
         vf $$6 = vf.a.a($$2.l("DisplayName"));
         ena.a $$7 = ena.a.a($$2.l("RenderType"));
         boolean $$8 = $$2.q("display_auto_update");
         wv $$9 = (wv)wx.b.parse(tb.a, $$2.c("format")).result().orElse(null);
         this.c.a($$5, $$4, $$6, $$7, $$8, $$9);
      }
   }

   @Override
   public sn a(sn $$0) {
      $$0.a("Objectives", this.b());
      $$0.a("PlayerScores", this.c.h());
      $$0.a("Teams", this.a());
      this.d($$0);
      return $$0;
   }

   private st a() {
      st $$0 = new st();

      for (ems $$2 : this.c.g()) {
         sn $$3 = new sn();
         $$3.a("Name", $$2.b());
         $$3.a("DisplayName", vf.a.a($$2.c()));
         if ($$2.n().b() >= 0) {
            $$3.a("TeamColor", $$2.n().g());
         }

         $$3.a("AllowFriendlyFire", $$2.h());
         $$3.a("SeeFriendlyInvisibles", $$2.i());
         $$3.a("MemberNamePrefix", vf.a.a($$2.e()));
         $$3.a("MemberNameSuffix", vf.a.a($$2.f()));
         $$3.a("NameTagVisibility", $$2.j().e);
         $$3.a("DeathMessageVisibility", $$2.k().e);
         $$3.a("CollisionRule", $$2.l().e);
         st $$4 = new st();

         for (String $$5 : $$2.g()) {
            $$4.add(ti.a($$5));
         }

         $$3.a("Players", $$4);
         $$0.add($$3);
      }

      return $$0;
   }

   private void d(sn $$0) {
      sn $$1 = new sn();

      for (emo $$2 : emo.values()) {
         emp $$3 = this.c.a($$2);
         if ($$3 != null) {
            $$1.a($$2.c(), $$3.b());
         }
      }

      if (!$$1.g()) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private st b() {
      st $$0 = new st();

      for (emp $$2 : this.c.c()) {
         sn $$3 = new sn();
         $$3.a("Name", $$2.b());
         $$3.a("CriteriaName", $$2.c().d());
         $$3.a("DisplayName", vf.a.a($$2.d()));
         $$3.a("RenderType", $$2.h().a());
         $$3.a("display_auto_update", $$2.e());
         wv $$4 = $$2.f();
         if ($$4 != null) {
            wx.b.encodeStart(tb.a, $$4).result().ifPresent($$1 -> $$3.a("format", $$1));
         }

         $$0.add($$3);
      }

      return $$0;
   }
}
