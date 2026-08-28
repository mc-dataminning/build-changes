import java.util.Locale;

public class ffp extends hdk {
   private static final xd a = xd.c("mco.backup.info.title");
   private static final xd b = xd.c("mco.backup.unknown");
   private final fqd c;
   final fea B;
   final fny C = new fny(this);
   private ffp.a D;

   public ffp(fqd $$0, fea $$1) {
      super(a);
      this.c = $$0;
      this.B = $$1;
   }

   @Override
   public void aR_() {
      this.C.a(a, this.p);
      this.D = this.C.c(new ffp.a(this.m));
      this.C.b(fkk.a(xc.k, $$0 -> this.d()).a());
      this.c();
      this.C.a($$1 -> {
         fki var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.D.b(this.n, this.C.d());
      this.C.a();
   }

   @Override
   public void d() {
      this.m.a(this.c);
   }

   xd a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (xd)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : xd.b($$1));
      }
   }

   private xd a(String $$0) {
      try {
         return fgl.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private xd b(String $$0) {
      try {
         return fgl.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends flg<ffp.b> {
      public a(final fil $$0) {
         super($$0, ffp.this.n, ffp.this.C.d(), ffp.this.C.c(), 36);
         if (ffp.this.B.e != null) {
            ffp.this.B.e.forEach(($$0x, $$1) -> this.b(ffp.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends flg.a<ffp.b> {
      private static final xd b = xd.c("mco.backup.entry.templateName");
      private static final xd c = xd.c("mco.backup.entry.gameDifficulty");
      private static final xd d = xd.c("mco.backup.entry.name");
      private static final xd e = xd.c("mco.backup.entry.gameServerVersion");
      private static final xd f = xd.c("mco.backup.entry.uploaded");
      private static final xd g = xd.c("mco.backup.entry.enabledPack");
      private static final xd h = xd.c("mco.backup.entry.description");
      private static final xd i = xd.c("mco.backup.entry.gameMode");
      private static final xd j = xd.c("mco.backup.entry.seed");
      private static final xd k = xd.c("mco.backup.entry.worldType");
      private static final xd l = xd.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fjx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(ffp.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(ffp.this.p, ffp.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private xd a(String $$0) {
         return switch ($$0) {
            case "template_name" -> b;
            case "game_difficulty" -> c;
            case "name" -> d;
            case "game_server_version" -> e;
            case "uploaded" -> f;
            case "enabled_packs" -> g;
            case "description" -> h;
            case "game_mode" -> i;
            case "seed" -> j;
            case "world_type" -> k;
            default -> l;
         };
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         return true;
      }

      @Override
      public xd a() {
         return xd.a("narrator.select", this.m + " " + this.n);
      }
   }
}
