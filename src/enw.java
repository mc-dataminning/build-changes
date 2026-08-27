import java.util.Locale;

public class enw extends gew {
   private static final ti a = ti.c("mco.backup.info.title");
   private static final ti b = ti.c("mco.backup.unknown");
   private final eyf c;
   final emg y;
   final evu z = new evu(this);
   private enw.a A;

   public enw(eyf $$0, emg $$1) {
      super(a);
      this.c = $$0;
      this.y = $$1;
   }

   @Override
   public void aD_() {
      this.z.a(new etr(a, this.i));
      this.A = new enw.a(this.f);
      this.d(this.A);
      this.z.b(esl.a(th.k, $$0 -> this.au_()).a());
      this.z.a();
      this.z.a($$1 -> {
         esj var10000 = this.d($$1);
      });
   }

   @Override
   protected void b() {
      this.z.a();
      this.A.a(this.g, this.h, this.z.c(), this.h - this.z.b());
   }

   @Override
   public void au_() {
      this.f.a(this.c);
   }

   ti a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (ti)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : ti.b($$1));
      }
   }

   private ti a(String $$0) {
      try {
         return eot.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private ti b(String $$0) {
      try {
         return eot.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends eth<enw.b> {
      public a(eqq $$0) {
         super($$0, enw.this.g, enw.this.h, enw.this.z.c(), enw.this.h - enw.this.z.b(), 36);
         if (enw.this.y.e != null) {
            enw.this.y.e.forEach(($$0x, $$1) -> this.b(enw.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends eth.a<enw.b> {
      private static final ti b = ti.c("mco.backup.entry.templateName");
      private static final ti c = ti.c("mco.backup.entry.gameDifficulty");
      private static final ti d = ti.c("mco.backup.entry.name");
      private static final ti e = ti.c("mco.backup.entry.gameServerVersion");
      private static final ti f = ti.c("mco.backup.entry.uploaded");
      private static final ti g = ti.c("mco.backup.entry.enabledPack");
      private static final ti h = ti.c("mco.backup.entry.description");
      private static final ti i = ti.c("mco.backup.entry.gameMode");
      private static final ti j = ti.c("mco.backup.entry.seed");
      private static final ti k = ti.c("mco.backup.entry.worldType");
      private static final ti l = ti.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(esa $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(enw.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(enw.this.i, enw.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private ti a(String $$0) {
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
      public ti a() {
         return ti.a("narrator.select", this.m + " " + this.n);
      }
   }
}
