import java.util.Locale;

public class eod extends gfd {
   private static final tn a = tn.c("mco.backup.info.title");
   private static final tn b = tn.c("mco.backup.unknown");
   private final eym c;
   final emn y;
   final ewb z = new ewb(this);
   private eod.a A;

   public eod(eym $$0, emn $$1) {
      super(a);
      this.c = $$0;
      this.y = $$1;
   }

   @Override
   public void aH_() {
      this.z.a(new ety(a, this.i));
      this.A = new eod.a(this.f);
      this.d(this.A);
      this.z.b(ess.a(tm.k, $$0 -> this.az_()).a());
      this.z.a();
      this.z.a($$1 -> {
         esq var10000 = this.d($$1);
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

   tn a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (tn)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : tn.b($$1));
      }
   }

   private tn a(String $$0) {
      try {
         return epa.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private tn b(String $$0) {
      try {
         return epa.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends eto<eod.b> {
      public a(eqx $$0) {
         super($$0, eod.this.g, eod.this.h, eod.this.z.c(), eod.this.h - eod.this.z.b(), 36);
         if (eod.this.y.e != null) {
            eod.this.y.e.forEach(($$0x, $$1) -> this.b(eod.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends eto.a<eod.b> {
      private static final tn b = tn.c("mco.backup.entry.templateName");
      private static final tn c = tn.c("mco.backup.entry.gameDifficulty");
      private static final tn d = tn.c("mco.backup.entry.name");
      private static final tn e = tn.c("mco.backup.entry.gameServerVersion");
      private static final tn f = tn.c("mco.backup.entry.uploaded");
      private static final tn g = tn.c("mco.backup.entry.enabledPack");
      private static final tn h = tn.c("mco.backup.entry.description");
      private static final tn i = tn.c("mco.backup.entry.gameMode");
      private static final tn j = tn.c("mco.backup.entry.seed");
      private static final tn k = tn.c("mco.backup.entry.worldType");
      private static final tn l = tn.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(esh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(eod.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(eod.this.i, eod.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private tn a(String $$0) {
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
      public tn a() {
         return tn.a("narrator.select", this.m + " " + this.n);
      }
   }
}
