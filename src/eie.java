import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eie extends ebi {
   private static final Logger b = LogUtils.getLogger();
   public static final String a = "scoreboard";
   private final eid c;

   public eie(eid $$0) {
      this.c = $$0;
   }

   public eie b(qr $$0) {
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

   private void a(qx $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qr $$2 = $$0.a($$1);
         String $$3 = $$2.l("Name");
         eib $$4 = this.c.e($$3);
         tf $$5 = tf.a.a($$2.l("DisplayName"));
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
            tf $$6 = tf.a.a($$2.l("MemberNamePrefix"));
            if ($$6 != null) {
               $$4.b($$6);
            }
         }

         if ($$2.b("MemberNameSuffix", 8)) {
            tf $$7 = tf.a.a($$2.l("MemberNameSuffix"));
            if ($$7 != null) {
               $$4.c($$7);
            }
         }

         if ($$2.b("NameTagVisibility", 8)) {
            eif.b $$8 = eif.b.a($$2.l("NameTagVisibility"));
            if ($$8 != null) {
               $$4.a($$8);
            }
         }

         if ($$2.b("DeathMessageVisibility", 8)) {
            eif.b $$9 = eif.b.a($$2.l("DeathMessageVisibility"));
            if ($$9 != null) {
               $$4.b($$9);
            }
         }

         if ($$2.b("CollisionRule", 8)) {
            eif.a $$10 = eif.a.a($$2.l("CollisionRule"));
            if ($$10 != null) {
               $$4.a($$10);
            }
         }

         this.a($$4, $$2.c("Players", 8));
      }
   }

   private void a(eib $$0, qx $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.c.a($$1.j($$2), $$0);
      }
   }

   private void c(qr $$0) {
      for (String $$1 : $$0.e()) {
         ehz $$2 = ehz.t.a($$1);
         if ($$2 != null) {
            String $$3 = $$0.l($$1);
            eia $$4 = this.c.b($$3);
            this.c.a($$2, $$4);
         }
      }
   }

   private void b(qx $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qr $$2 = $$0.a($$1);
         String $$3 = $$2.l("CriteriaName");
         eig $$4 = eig.a($$3).orElseGet(() -> {
            b.warn("Unknown scoreboard criteria {}, replacing with {}", $$3, eig.a.d());
            return eig.a;
         });
         String $$5 = $$2.l("Name");
         tf $$6 = tf.a.a($$2.l("DisplayName"));
         eig.a $$7 = eig.a.a($$2.l("RenderType"));
         this.c.a($$5, $$4, $$6, $$7);
      }
   }

   @Override
   public qr a(qr $$0) {
      $$0.a("Objectives", this.b());
      $$0.a("PlayerScores", this.c.h());
      $$0.a("Teams", this.a());
      this.d($$0);
      return $$0;
   }

   private qx a() {
      qx $$0 = new qx();

      for (eib $$2 : this.c.g()) {
         qr $$3 = new qr();
         $$3.a("Name", $$2.b());
         $$3.a("DisplayName", tf.a.a($$2.c()));
         if ($$2.n().b() >= 0) {
            $$3.a("TeamColor", $$2.n().g());
         }

         $$3.a("AllowFriendlyFire", $$2.h());
         $$3.a("SeeFriendlyInvisibles", $$2.i());
         $$3.a("MemberNamePrefix", tf.a.a($$2.e()));
         $$3.a("MemberNameSuffix", tf.a.a($$2.f()));
         $$3.a("NameTagVisibility", $$2.j().e);
         $$3.a("DeathMessageVisibility", $$2.k().e);
         $$3.a("CollisionRule", $$2.l().e);
         qx $$4 = new qx();

         for (String $$5 : $$2.g()) {
            $$4.add(ri.a($$5));
         }

         $$3.a("Players", $$4);
         $$0.add($$3);
      }

      return $$0;
   }

   private void d(qr $$0) {
      qr $$1 = new qr();

      for (ehz $$2 : ehz.values()) {
         eia $$3 = this.c.a($$2);
         if ($$3 != null) {
            $$1.a($$2.c(), $$3.b());
         }
      }

      if (!$$1.g()) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private qx b() {
      qx $$0 = new qx();

      for (eia $$2 : this.c.c()) {
         qr $$3 = new qr();
         $$3.a("Name", $$2.b());
         $$3.a("CriteriaName", $$2.c().d());
         $$3.a("DisplayName", tf.a.a($$2.d()));
         $$3.a("RenderType", $$2.f().a());
         $$0.add($$3);
      }

      return $$0;
   }
}
