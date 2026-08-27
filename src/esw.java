import java.util.Locale;

public class esw extends gld {
   private static final vg a = vg.c("mco.backup.info.title");
   private static final vg b = vg.c("mco.backup.unknown");
   private final fdm c;
   final erg v;
   final fbb w = new fbb(this);
   private esw.a x;

   public esw(fdm $$0, erg $$1) {
      super(a);
      this.c = $$0;
      this.v = $$1;
   }

   @Override
   public void aP_() {
      this.w.a(new eyy(a, this.i));
      this.x = this.w.c(new esw.a(this.f));
      this.w.b(exr.a(vf.k, $$0 -> this.d()).a());
      this.c();
      this.w.a($$1 -> {
         exp var10000 = this.d($$1);
      });
   }

   @Override
   protected void c() {
      this.x.b(this.g, this.h - this.w.b() - this.w.c());
      this.w.a();
   }

   @Override
   public void d() {
      this.f.a(this.c);
   }

   vg a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (vg)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : vg.b($$1));
      }
   }

   private vg a(String $$0) {
      try {
         return ett.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private vg b(String $$0) {
      try {
         return ett.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends eyn<esw.b> {
      public a(evr $$0) {
         super($$0, esw.this.g, esw.this.h - esw.this.w.b() - esw.this.w.c(), esw.this.w.c(), 36);
         if (esw.this.v.e != null) {
            esw.this.v.e.forEach(($$0x, $$1) -> this.b(esw.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends eyn.a<esw.b> {
      private static final vg b = vg.c("mco.backup.entry.templateName");
      private static final vg c = vg.c("mco.backup.entry.gameDifficulty");
      private static final vg d = vg.c("mco.backup.entry.name");
      private static final vg e = vg.c("mco.backup.entry.gameServerVersion");
      private static final vg f = vg.c("mco.backup.entry.uploaded");
      private static final vg g = vg.c("mco.backup.entry.enabledPack");
      private static final vg h = vg.c("mco.backup.entry.description");
      private static final vg i = vg.c("mco.backup.entry.gameMode");
      private static final vg j = vg.c("mco.backup.entry.seed");
      private static final vg k = vg.c("mco.backup.entry.worldType");
      private static final vg l = vg.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(esw.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(esw.this.i, esw.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private vg a(String $$0) {
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
      public vg a() {
         return vg.a("narrator.select", this.m + " " + this.n);
      }
   }
}
