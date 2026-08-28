import java.util.Locale;

public class foj extends hrm {
   private static final xa a = xa.c("mco.backup.info.title");
   private static final xa b = xa.c("mco.backup.unknown");
   private final gad c;
   final fmt C;
   final fxz D = new fxz(this);
   private foj.a E;

   public foj(gad $$0, fmt $$1) {
      super(a);
      this.c = $$0;
      this.C = $$1;
   }

   @Override
   public void aS_() {
      this.D.a(a, this.p);
      this.E = this.D.c(new foj.a(this.m));
      this.D.b(ful.a(wz.k, $$0 -> this.aP_()).a());
      this.c();
      this.D.a($$1 -> {
         fuj var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.E.b(this.n, this.D.d());
      this.D.a();
   }

   @Override
   public void aP_() {
      this.m.a(this.c);
   }

   xa a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (xa)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : xa.b($$1));
      }
   }

   private xa a(String $$0) {
      try {
         return fpf.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private xa b(String $$0) {
      try {
         return fpf.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fvh<foj.b> {
      public a(final frd $$0) {
         super($$0, foj.this.n, foj.this.D.d(), foj.this.D.c(), 36);
         if (foj.this.C.e != null) {
            foj.this.C.e.forEach(($$0x, $$1) -> this.b(foj.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fvh.a<foj.b> {
      private static final xa b = xa.c("mco.backup.entry.templateName");
      private static final xa c = xa.c("mco.backup.entry.gameDifficulty");
      private static final xa d = xa.c("mco.backup.entry.name");
      private static final xa e = xa.c("mco.backup.entry.gameServerVersion");
      private static final xa f = xa.c("mco.backup.entry.uploaded");
      private static final xa g = xa.c("mco.backup.entry.enabledPack");
      private static final xa h = xa.c("mco.backup.entry.description");
      private static final xa i = xa.c("mco.backup.entry.gameMode");
      private static final xa j = xa.c("mco.backup.entry.seed");
      private static final xa k = xa.c("mco.backup.entry.worldType");
      private static final xa l = xa.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(ftx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(foj.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(foj.this.p, foj.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private xa a(String $$0) {
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
      public xa a() {
         return xa.a("narrator.select", this.m + " " + this.n);
      }
   }
}
