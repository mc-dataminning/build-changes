import java.util.Locale;

public class eot extends gfx {
   private static final ui a = ui.c("mco.backup.info.title");
   private static final ui b = ui.c("mco.backup.unknown");
   private final ezd c;
   final end y;
   final ewt z = new ewt(this);
   private eot.a A;

   public eot(ezd $$0, end $$1) {
      super(a);
      this.c = $$0;
      this.y = $$1;
   }

   @Override
   public void aM_() {
      this.z.a(new euq(a, this.i));
      this.A = new eot.a(this.f);
      this.d(this.A);
      this.z.b(etj.a(uh.k, $$0 -> this.aC_()).a());
      this.z.a();
      this.z.a($$1 -> {
         eth var10000 = this.d($$1);
      });
   }

   @Override
   protected void c() {
      this.z.a();
      this.A.a(this.g, this.h, this.z.c(), this.h - this.z.b());
   }

   @Override
   public void aC_() {
      this.f.a(this.c);
   }

   ui a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (ui)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : ui.b($$1));
      }
   }

   private ui a(String $$0) {
      try {
         return epq.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private ui b(String $$0) {
      try {
         return epq.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends euf<eot.b> {
      public a(ero $$0) {
         super($$0, eot.this.g, eot.this.h, eot.this.z.c(), eot.this.h - eot.this.z.b(), 36);
         if (eot.this.y.e != null) {
            eot.this.y.e.forEach(($$0x, $$1) -> this.b(eot.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends euf.a<eot.b> {
      private static final ui b = ui.c("mco.backup.entry.templateName");
      private static final ui c = ui.c("mco.backup.entry.gameDifficulty");
      private static final ui d = ui.c("mco.backup.entry.name");
      private static final ui e = ui.c("mco.backup.entry.gameServerVersion");
      private static final ui f = ui.c("mco.backup.entry.uploaded");
      private static final ui g = ui.c("mco.backup.entry.enabledPack");
      private static final ui h = ui.c("mco.backup.entry.description");
      private static final ui i = ui.c("mco.backup.entry.gameMode");
      private static final ui j = ui.c("mco.backup.entry.seed");
      private static final ui k = ui.c("mco.backup.entry.worldType");
      private static final ui l = ui.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(eot.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(eot.this.i, eot.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private ui a(String $$0) {
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
      public ui a() {
         return ui.a("narrator.select", this.m + " " + this.n);
      }
   }
}
