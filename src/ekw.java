import java.util.Locale;

public class ekw extends gan {
   private static final sw a = sw.c("mco.backup.unknown");
   private final euq b;
   final ejf c;
   private ekw.a G;

   public ekw(euq $$0, ejf $$1) {
      super(sw.c("mco.backup.info.title"));
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void f() {
   }

   @Override
   public void b() {
      this.d(epi.a(sv.k, $$0 -> this.f.a(this.b)).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
      this.G = new ekw.a(this.f);
      this.e(this.G);
      this.b(this.G);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.b);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      this.G.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
      super.a($$0, $$1, $$2, $$3);
   }

   sw a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (sw)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : sw.b($$1));
      }
   }

   private sw a(String $$0) {
      try {
         return elr.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return a;
      }
   }

   private sw b(String $$0) {
      try {
         return elr.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return a;
      }
   }

   class a extends eqc<ekw.b> {
      public a(enn $$0) {
         super($$0, ekw.this.g, ekw.this.h, 32, ekw.this.h - 64, 36);
         this.a(false);
         if (ekw.this.c.e != null) {
            ekw.this.c.e.forEach(($$0x, $$1) -> this.b(ekw.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends eqc.a<ekw.b> {
      private static final sw b = sw.c("mco.backup.entry.templateName");
      private static final sw c = sw.c("mco.backup.entry.gameDifficulty");
      private static final sw d = sw.c("mco.backup.entry.name");
      private static final sw e = sw.c("mco.backup.entry.gameServerVersion");
      private static final sw f = sw.c("mco.backup.entry.uploaded");
      private static final sw g = sw.c("mco.backup.entry.enabledPack");
      private static final sw h = sw.c("mco.backup.entry.description");
      private static final sw i = sw.c("mco.backup.entry.gameMode");
      private static final sw j = sw.c("mco.backup.entry.seed");
      private static final sw k = sw.c("mco.backup.entry.worldType");
      private static final sw l = sw.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(ekw.this.i, this.a(this.m), $$3, $$2, 10526880);
         $$0.b(ekw.this.i, ekw.this.a(this.m, this.n), $$3, $$2 + 12, 16777215);
      }

      private sw a(String $$0) {
         return switch ($$0) {
            case "template_name" -> b;
            case "game_difficulty" -> c;
            case "name" -> d;
            case "game_server_version" -> e;
            case "uploaded" -> f;
            case "enabled_pack" -> g;
            case "description" -> h;
            case "game_mode" -> i;
            case "seed" -> j;
            case "world_type" -> k;
            default -> l;
         };
      }

      @Override
      public sw a() {
         return sw.a("narrator.select", this.m + " " + this.n);
      }
   }
}
