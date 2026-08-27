import java.util.Locale;

public class esf extends gkc {
   private static final vd a = vd.c("mco.backup.info.title");
   private static final vd b = vd.c("mco.backup.unknown");
   private final fct c;
   final eqp v;
   final fai w = new fai(this);
   private esf.a x;

   public esf(fct $$0, eqp $$1) {
      super(a);
      this.c = $$0;
      this.v = $$1;
   }

   @Override
   public void aN_() {
      this.w.a(new eyf(a, this.i));
      this.x = this.w.c(new esf.a(this.f));
      this.w.b(ewy.a(vc.k, $$0 -> this.aE_()).a());
      this.c();
      this.w.a($$1 -> {
         eww var10000 = this.d($$1);
      });
   }

   @Override
   protected void c() {
      this.x.b(this.g, this.h - this.w.b() - this.w.c());
      this.w.a();
   }

   @Override
   public void aE_() {
      this.f.a(this.c);
   }

   vd a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (vd)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : vd.b($$1));
      }
   }

   private vd a(String $$0) {
      try {
         return etc.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private vd b(String $$0) {
      try {
         return etc.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends exu<esf.b> {
      public a(eva $$0) {
         super($$0, esf.this.g, esf.this.h - esf.this.w.b() - esf.this.w.c(), esf.this.w.c(), 36);
         if (esf.this.v.e != null) {
            esf.this.v.e.forEach(($$0x, $$1) -> this.b(esf.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends exu.a<esf.b> {
      private static final vd b = vd.c("mco.backup.entry.templateName");
      private static final vd c = vd.c("mco.backup.entry.gameDifficulty");
      private static final vd d = vd.c("mco.backup.entry.name");
      private static final vd e = vd.c("mco.backup.entry.gameServerVersion");
      private static final vd f = vd.c("mco.backup.entry.uploaded");
      private static final vd g = vd.c("mco.backup.entry.enabledPack");
      private static final vd h = vd.c("mco.backup.entry.description");
      private static final vd i = vd.c("mco.backup.entry.gameMode");
      private static final vd j = vd.c("mco.backup.entry.seed");
      private static final vd k = vd.c("mco.backup.entry.worldType");
      private static final vd l = vd.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(esf.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(esf.this.i, esf.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private vd a(String $$0) {
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
      public vd a() {
         return vd.a("narrator.select", this.m + " " + this.n);
      }
   }
}
