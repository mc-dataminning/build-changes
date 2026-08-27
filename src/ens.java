import java.util.Locale;

public class ens extends ger {
   private static final tf a = tf.c("mco.backup.info.title");
   private static final tf b = tf.c("mco.backup.unknown");
   private final eya c;
   final emb y;
   final evp z = new evp(this);
   private ens.a A;

   public ens(eya $$0, emb $$1) {
      super(a);
      this.c = $$0;
      this.y = $$1;
   }

   @Override
   public void aC_() {
      this.z.a(new etm(a, this.i));
      this.A = new ens.a(this.f);
      this.d(this.A);
      this.z.b(esg.a(te.k, $$0 -> this.at_()).a());
      this.z.a();
      this.z.a($$1 -> {
         ese var10000 = this.d($$1);
      });
   }

   @Override
   protected void b() {
      this.z.a();
      this.A.a(this.g, this.h, this.z.c(), this.h - this.z.b());
   }

   @Override
   public void at_() {
      this.f.a(this.c);
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
         return eoo.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private tf b(String $$0) {
      try {
         return eoo.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends etc<ens.b> {
      public a(eql $$0) {
         super($$0, ens.this.g, ens.this.h, ens.this.z.c(), ens.this.h - ens.this.z.b(), 36);
         if (ens.this.y.e != null) {
            ens.this.y.e.forEach(($$0x, $$1) -> this.b(ens.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends etc.a<ens.b> {
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
      public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(ens.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(ens.this.i, ens.this.a(this.m, this.n), $$3, $$2 + 12, -1);
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
