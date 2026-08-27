import java.util.Locale;

public class eqi extends ghr {
   private static final ur a = ur.c("mco.backup.info.title");
   private static final ur b = ur.c("mco.backup.unknown");
   private final fau c;
   final eos v;
   final eyj w = new eyj(this);
   private eqi.a x;

   public eqi(fau $$0, eos $$1) {
      super(a);
      this.c = $$0;
      this.v = $$1;
   }

   @Override
   public void aP_() {
      this.w.a(new ewg(a, this.i));
      this.x = new eqi.a(this.f);
      this.d(this.x);
      this.w.b(euz.a(uq.k, $$0 -> this.aF_()).a());
      this.w.a();
      this.w.a($$1 -> {
         eux var10000 = this.d($$1);
      });
   }

   @Override
   protected void c() {
      this.w.a();
      this.x.a(this.g, this.h, this.w.c(), this.h - this.w.b());
   }

   @Override
   public void aF_() {
      this.f.a(this.c);
   }

   ur a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (ur)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : ur.b($$1));
      }
   }

   private ur a(String $$0) {
      try {
         return erf.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private ur b(String $$0) {
      try {
         return erf.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends evv<eqi.b> {
      public a(etd $$0) {
         super($$0, eqi.this.g, eqi.this.h, eqi.this.w.c(), eqi.this.h - eqi.this.w.b(), 36);
         if (eqi.this.v.e != null) {
            eqi.this.v.e.forEach(($$0x, $$1) -> this.b(eqi.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends evv.a<eqi.b> {
      private static final ur b = ur.c("mco.backup.entry.templateName");
      private static final ur c = ur.c("mco.backup.entry.gameDifficulty");
      private static final ur d = ur.c("mco.backup.entry.name");
      private static final ur e = ur.c("mco.backup.entry.gameServerVersion");
      private static final ur f = ur.c("mco.backup.entry.uploaded");
      private static final ur g = ur.c("mco.backup.entry.enabledPack");
      private static final ur h = ur.c("mco.backup.entry.description");
      private static final ur i = ur.c("mco.backup.entry.gameMode");
      private static final ur j = ur.c("mco.backup.entry.seed");
      private static final ur k = ur.c("mco.backup.entry.worldType");
      private static final ur l = ur.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(euo $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(eqi.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(eqi.this.i, eqi.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private ur a(String $$0) {
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
      public ur a() {
         return ur.a("narrator.select", this.m + " " + this.n);
      }
   }
}
