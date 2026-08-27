import java.util.Locale;

public class env extends gex {
   private static final tl a = tl.c("mco.backup.info.title");
   private static final tl b = tl.c("mco.backup.unknown");
   private final eye c;
   final emf y;
   final evu z = new evu(this);
   private env.a A;

   public env(eye $$0, emf $$1) {
      super(a);
      this.c = $$0;
      this.y = $$1;
   }

   @Override
   public void aH_() {
      this.z.a(new etr(a, this.i));
      this.A = new env.a(this.f);
      this.d(this.A);
      this.z.b(esk.a(tk.k, $$0 -> this.az_()).a());
      this.z.a();
      this.z.a($$1 -> {
         esi var10000 = this.d($$1);
      });
   }

   @Override
   protected void b() {
      this.z.a();
      this.A.a(this.g, this.h, this.z.c(), this.h - this.z.b());
   }

   @Override
   public void az_() {
      this.f.a(this.c);
   }

   tl a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (tl)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : tl.b($$1));
      }
   }

   private tl a(String $$0) {
      try {
         return eos.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private tl b(String $$0) {
      try {
         return eos.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends etg<env.b> {
      public a(eqp $$0) {
         super($$0, env.this.g, env.this.h, env.this.z.c(), env.this.h - env.this.z.b(), 36);
         if (env.this.y.e != null) {
            env.this.y.e.forEach(($$0x, $$1) -> this.b(env.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends etg.a<env.b> {
      private static final tl b = tl.c("mco.backup.entry.templateName");
      private static final tl c = tl.c("mco.backup.entry.gameDifficulty");
      private static final tl d = tl.c("mco.backup.entry.name");
      private static final tl e = tl.c("mco.backup.entry.gameServerVersion");
      private static final tl f = tl.c("mco.backup.entry.uploaded");
      private static final tl g = tl.c("mco.backup.entry.enabledPack");
      private static final tl h = tl.c("mco.backup.entry.description");
      private static final tl i = tl.c("mco.backup.entry.gameMode");
      private static final tl j = tl.c("mco.backup.entry.seed");
      private static final tl k = tl.c("mco.backup.entry.worldType");
      private static final tl l = tl.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(env.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(env.this.i, env.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private tl a(String $$0) {
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
      public tl a() {
         return tl.a("narrator.select", this.m + " " + this.n);
      }
   }
}
