import java.util.Locale;

public class faj extends gtb {
   private static final wu a = wu.c("mco.backup.info.title");
   private static final wu b = wu.c("mco.backup.unknown");
   private final fld c;
   final eyt B;
   final fir C = new fir(this);
   private faj.a D;

   public faj(fld $$0, eyt $$1) {
      super(a);
      this.c = $$0;
      this.B = $$1;
   }

   @Override
   public void aM_() {
      this.C.a(a, this.p);
      this.D = this.C.c(new faj.a(this.m));
      this.C.b(ffe.a(wt.k, $$0 -> this.d()).a());
      this.c();
      this.C.a($$1 -> {
         ffc var10000 = this.c($$1);
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

   wu a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (wu)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : wu.b($$1));
      }
   }

   private wu a(String $$0) {
      try {
         return fbg.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private wu b(String $$0) {
      try {
         return fbg.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fga<faj.b> {
      public a(fde $$0) {
         super($$0, faj.this.n, faj.this.C.d(), faj.this.C.c(), 36);
         if (faj.this.B.e != null) {
            faj.this.B.e.forEach(($$0x, $$1) -> this.b(faj.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fga.a<faj.b> {
      private static final wu b = wu.c("mco.backup.entry.templateName");
      private static final wu c = wu.c("mco.backup.entry.gameDifficulty");
      private static final wu d = wu.c("mco.backup.entry.name");
      private static final wu e = wu.c("mco.backup.entry.gameServerVersion");
      private static final wu f = wu.c("mco.backup.entry.uploaded");
      private static final wu g = wu.c("mco.backup.entry.enabledPack");
      private static final wu h = wu.c("mco.backup.entry.description");
      private static final wu i = wu.c("mco.backup.entry.gameMode");
      private static final wu j = wu.c("mco.backup.entry.seed");
      private static final wu k = wu.c("mco.backup.entry.worldType");
      private static final wu l = wu.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(faj.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(faj.this.p, faj.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private wu a(String $$0) {
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
      public wu a() {
         return wu.a("narrator.select", this.m + " " + this.n);
      }
   }
}
