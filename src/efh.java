public class efh extends dyj {
   public static final String a = "scoreboard";
   private final efg b;

   public efh(efg $$0) {
      this.b = $$0;
   }

   public efh b(qr $$0) {
      this.b($$0.c("Objectives", 10));
      this.b.a($$0.c("PlayerScores", 10));
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
         efe $$4 = this.b.g($$3);
         sw $$5 = sw.a.a($$2.l("DisplayName"));
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
            sw $$6 = sw.a.a($$2.l("MemberNamePrefix"));
            if ($$6 != null) {
               $$4.b($$6);
            }
         }

         if ($$2.b("MemberNameSuffix", 8)) {
            sw $$7 = sw.a.a($$2.l("MemberNameSuffix"));
            if ($$7 != null) {
               $$4.c($$7);
            }
         }

         if ($$2.b("NameTagVisibility", 8)) {
            efi.b $$8 = efi.b.a($$2.l("NameTagVisibility"));
            if ($$8 != null) {
               $$4.a($$8);
            }
         }

         if ($$2.b("DeathMessageVisibility", 8)) {
            efi.b $$9 = efi.b.a($$2.l("DeathMessageVisibility"));
            if ($$9 != null) {
               $$4.b($$9);
            }
         }

         if ($$2.b("CollisionRule", 8)) {
            efi.a $$10 = efi.a.a($$2.l("CollisionRule"));
            if ($$10 != null) {
               $$4.a($$10);
            }
         }

         this.a($$4, $$2.c("Players", 8));
      }
   }

   private void a(efe $$0, qx $$1) {
      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         this.b.a($$1.j($$2), $$0);
      }
   }

   private void c(qr $$0) {
      for (int $$1 = 0; $$1 < 19; $$1++) {
         if ($$0.b("slot_" + $$1, 8)) {
            String $$2 = $$0.l("slot_" + $$1);
            efd $$3 = this.b.d($$2);
            this.b.a($$1, $$3);
         }
      }
   }

   private void b(qx $$0) {
      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qr $$2 = $$0.a($$1);
         efj.a($$2.l("CriteriaName")).ifPresent($$1x -> {
            String $$2x = $$2.l("Name");
            sw $$3 = sw.a.a($$2.l("DisplayName"));
            efj.a $$4 = efj.a.a($$2.l("RenderType"));
            this.b.a($$2x, $$1x, $$3, $$4);
         });
      }
   }

   @Override
   public qr a(qr $$0) {
      $$0.a("Objectives", this.d());
      $$0.a("PlayerScores", this.b.i());
      $$0.a("Teams", this.a());
      this.d($$0);
      return $$0;
   }

   private qx a() {
      qx $$0 = new qx();

      for (efe $$2 : this.b.g()) {
         qr $$3 = new qr();
         $$3.a("Name", $$2.b());
         $$3.a("DisplayName", sw.a.a($$2.c()));
         if ($$2.n().b() >= 0) {
            $$3.a("TeamColor", $$2.n().g());
         }

         $$3.a("AllowFriendlyFire", $$2.h());
         $$3.a("SeeFriendlyInvisibles", $$2.i());
         $$3.a("MemberNamePrefix", sw.a.a($$2.e()));
         $$3.a("MemberNameSuffix", sw.a.a($$2.f()));
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
      boolean $$2 = false;

      for (int $$3 = 0; $$3 < 19; $$3++) {
         efd $$4 = this.b.a($$3);
         if ($$4 != null) {
            $$1.a("slot_" + $$3, $$4.b());
            $$2 = true;
         }
      }

      if ($$2) {
         $$0.a("DisplaySlots", $$1);
      }
   }

   private qx d() {
      qx $$0 = new qx();

      for (efd $$2 : this.b.c()) {
         if ($$2.c() != null) {
            qr $$3 = new qr();
            $$3.a("Name", $$2.b());
            $$3.a("CriteriaName", $$2.c().d());
            $$3.a("DisplayName", sw.a.a($$2.d()));
            $$3.a("RenderType", $$2.f().a());
            $$0.add($$3);
         }
      }

      return $$0;
   }
}
