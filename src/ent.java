import java.util.Locale;

public class ent extends gei {
   private static final tf a = tf.c("mco.backup.unknown");
   private final exz b;
   final emc c;
   private ent.a y;

   public ent(exz $$0, emc $$1) {
      super(tf.c("mco.backup.info.title"));
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void c() {
   }

   @Override
   public void aE_() {
      this.d(esh.a(te.k, $$0 -> this.f.a(this.b)).a(this.g / 2 - 100, this.h / 4 + 120 + 24, 200, 20).a());
      this.y = new ent.a(this.f);
      this.e(this.y);
      this.b(this.y);
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
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.y.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 10, 16777215);
   }

   tf a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (tf)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : tf.b($$1));
      }
   }

   private tf a(String $$0) {
      try {
         return eop.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return a;
      }
   }

   private tf b(String $$0) {
      try {
         return eop.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return a;
      }
   }

   class a extends etd<ent.b> {
      public a(eqm $$0) {
         super($$0, ent.this.g, ent.this.h, 32, ent.this.h - 64, 36);
         this.a(false);
         if (ent.this.c.e != null) {
            ent.this.c.e.forEach(($$0x, $$1) -> this.b(ent.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends etd.a<ent.b> {
      private static final tf b = tf.c("mco.backup.entry.templateName");
      private static final tf c = tf.c("mco.backup.entry.gameDifficulty");
      private static final tf d = tf.c("mco.backup.entry.name");
      private static final tf e = tf.c("mco.backup.entry.gameServerVersion");
      private static final tf f = tf.c("mco.backup.entry.uploaded");
      private static final tf g = tf.c("mco.backup.entry.enabledPack");
      private static final tf h = tf.c("mco.backup.entry.description");
      private static final tf i = tf.c("mco.backup.entry.gameMode");
      private static final tf j = tf.c("mco.backup.entry.seed");
      private static final tf k = tf.c("mco.backup.entry.worldType");
      private static final tf l = tf.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(ent.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(ent.this.i, ent.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private tf a(String $$0) {
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
      public tf a() {
         return tf.a("narrator.select", this.m + " " + this.n);
      }
   }
}
