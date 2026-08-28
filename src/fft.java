import java.util.Locale;

public class fft extends hdp {
   private static final xe a = xe.c("mco.backup.info.title");
   private static final xe b = xe.c("mco.backup.unknown");
   private final fqh c;
   final fee B;
   final foc C = new foc(this);
   private fft.a D;

   public fft(fqh $$0, fee $$1) {
      super(a);
      this.c = $$0;
      this.B = $$1;
   }

   @Override
   public void aS_() {
      this.C.a(a, this.p);
      this.D = this.C.c(new fft.a(this.m));
      this.C.b(fko.a(xd.k, $$0 -> this.d()).a());
      this.c();
      this.C.a($$1 -> {
         fkm var10000 = this.c($$1);
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

   xe a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (xe)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : xe.b($$1));
      }
   }

   private xe a(String $$0) {
      try {
         return fgp.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private xe b(String $$0) {
      try {
         return fgp.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends flk<fft.b> {
      public a(final fip $$0) {
         super($$0, fft.this.n, fft.this.C.d(), fft.this.C.c(), 36);
         if (fft.this.B.e != null) {
            fft.this.B.e.forEach(($$0x, $$1) -> this.b(fft.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends flk.a<fft.b> {
      private static final xe b = xe.c("mco.backup.entry.templateName");
      private static final xe c = xe.c("mco.backup.entry.gameDifficulty");
      private static final xe d = xe.c("mco.backup.entry.name");
      private static final xe e = xe.c("mco.backup.entry.gameServerVersion");
      private static final xe f = xe.c("mco.backup.entry.uploaded");
      private static final xe g = xe.c("mco.backup.entry.enabledPack");
      private static final xe h = xe.c("mco.backup.entry.description");
      private static final xe i = xe.c("mco.backup.entry.gameMode");
      private static final xe j = xe.c("mco.backup.entry.seed");
      private static final xe k = xe.c("mco.backup.entry.worldType");
      private static final xe l = xe.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fft.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fft.this.p, fft.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private xe a(String $$0) {
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
      public xe a() {
         return xe.a("narrator.select", this.m + " " + this.n);
      }
   }
}
