import java.util.Locale;

public class esl extends gkn {
   private static final vf a = vf.c("mco.backup.info.title");
   private static final vf b = vf.c("mco.backup.unknown");
   private final fcz c;
   final eqv v;
   final fao w = new fao(this);
   private esl.a x;

   public esl(fcz $$0, eqv $$1) {
      super(a);
      this.c = $$0;
      this.v = $$1;
   }

   @Override
   public void aN_() {
      this.w.a(new eyl(a, this.i));
      this.x = this.w.c(new esl.a(this.f));
      this.w.b(exe.a(ve.k, $$0 -> this.aE_()).a());
      this.c();
      this.w.a($$1 -> {
         exc var10000 = this.d($$1);
      });
   }

   @Override
   protected void c() {
      this.x.b(this.g, this.h - this.w.b() - this.w.c());
      this.w.a();
   }

   @Override
   public void aE_() {
      this.f.a(this.c);
   }

   vf a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (vf)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : vf.b($$1));
      }
   }

   private vf a(String $$0) {
      try {
         return eti.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private vf b(String $$0) {
      try {
         return eti.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends eya<esl.b> {
      public a(evg $$0) {
         super($$0, esl.this.g, esl.this.h - esl.this.w.b() - esl.this.w.c(), esl.this.w.c(), 36);
         if (esl.this.v.e != null) {
            esl.this.v.e.forEach(($$0x, $$1) -> this.b(esl.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends eya.a<esl.b> {
      private static final vf b = vf.c("mco.backup.entry.templateName");
      private static final vf c = vf.c("mco.backup.entry.gameDifficulty");
      private static final vf d = vf.c("mco.backup.entry.name");
      private static final vf e = vf.c("mco.backup.entry.gameServerVersion");
      private static final vf f = vf.c("mco.backup.entry.uploaded");
      private static final vf g = vf.c("mco.backup.entry.enabledPack");
      private static final vf h = vf.c("mco.backup.entry.description");
      private static final vf i = vf.c("mco.backup.entry.gameMode");
      private static final vf j = vf.c("mco.backup.entry.seed");
      private static final vf k = vf.c("mco.backup.entry.worldType");
      private static final vf l = vf.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(esl.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(esl.this.i, esl.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private vf a(String $$0) {
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
      public vf a() {
         return vf.a("narrator.select", this.m + " " + this.n);
      }
   }
}
