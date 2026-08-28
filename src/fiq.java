import java.util.Locale;

public class fiq extends hle {
   private static final wp a = wp.c("mco.backup.info.title");
   private static final wp b = wp.c("mco.backup.unknown");
   private final ful c;
   final fha C;
   final fsh D = new fsh(this);
   private fiq.a E;

   public fiq(ful $$0, fha $$1) {
      super(a);
      this.c = $$0;
      this.C = $$1;
   }

   @Override
   public void aR_() {
      this.D.a(a, this.p);
      this.E = this.D.c(new fiq.a(this.m));
      this.D.b(fot.a(wo.k, $$0 -> this.aO_()).a());
      this.c();
      this.D.a($$1 -> {
         foq var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.E.b(this.n, this.D.d());
      this.D.a();
   }

   @Override
   public void aO_() {
      this.m.a(this.c);
   }

   wp a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (wp)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : wp.b($$1));
      }
   }

   private wp a(String $$0) {
      try {
         return fjl.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private wp b(String $$0) {
      try {
         return fjl.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fpp<fiq.b> {
      public a(final flj $$0) {
         super($$0, fiq.this.n, fiq.this.D.d(), fiq.this.D.c(), 36);
         if (fiq.this.C.e != null) {
            fiq.this.C.e.forEach(($$0x, $$1) -> this.b(fiq.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fpp.a<fiq.b> {
      private static final wp b = wp.c("mco.backup.entry.templateName");
      private static final wp c = wp.c("mco.backup.entry.gameDifficulty");
      private static final wp d = wp.c("mco.backup.entry.name");
      private static final wp e = wp.c("mco.backup.entry.gameServerVersion");
      private static final wp f = wp.c("mco.backup.entry.uploaded");
      private static final wp g = wp.c("mco.backup.entry.enabledPack");
      private static final wp h = wp.c("mco.backup.entry.description");
      private static final wp i = wp.c("mco.backup.entry.gameMode");
      private static final wp j = wp.c("mco.backup.entry.seed");
      private static final wp k = wp.c("mco.backup.entry.worldType");
      private static final wp l = wp.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(foe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fiq.this.p, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fiq.this.p, fiq.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private wp a(String $$0) {
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
      public wp a() {
         return wp.a("narrator.select", this.m + " " + this.n);
      }
   }
}
