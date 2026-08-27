import java.util.Locale;

public class eut extends gnd {
   private static final vq a = vq.c("mco.backup.info.title");
   private static final vq b = vq.c("mco.backup.unknown");
   private final ffl c;
   final etd v;
   final fda w = new fda(this);
   private eut.a x;

   public eut(ffl $$0, etd $$1) {
      super(a);
      this.c = $$0;
      this.v = $$1;
   }

   @Override
   public void aQ_() {
      this.w.a(new fav(a, this.i));
      this.x = this.w.c(new eut.a(this.f));
      this.w.b(ezo.a(vp.k, $$0 -> this.d()).a());
      this.c();
      this.w.a($$1 -> {
         ezm var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.x.b(this.g, this.h - this.w.b() - this.w.c());
      this.w.a();
   }

   @Override
   public void d() {
      this.f.a(this.c);
   }

   vq a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (vq)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : vq.b($$1));
      }
   }

   private vq a(String $$0) {
      try {
         return evq.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private vq b(String $$0) {
      try {
         return evq.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fak<eut.b> {
      public a(exo $$0) {
         super($$0, eut.this.g, eut.this.h - eut.this.w.b() - eut.this.w.c(), eut.this.w.c(), 36);
         if (eut.this.v.e != null) {
            eut.this.v.e.forEach(($$0x, $$1) -> this.b(eut.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fak.a<eut.b> {
      private static final vq b = vq.c("mco.backup.entry.templateName");
      private static final vq c = vq.c("mco.backup.entry.gameDifficulty");
      private static final vq d = vq.c("mco.backup.entry.name");
      private static final vq e = vq.c("mco.backup.entry.gameServerVersion");
      private static final vq f = vq.c("mco.backup.entry.uploaded");
      private static final vq g = vq.c("mco.backup.entry.enabledPack");
      private static final vq h = vq.c("mco.backup.entry.description");
      private static final vq i = vq.c("mco.backup.entry.gameMode");
      private static final vq j = vq.c("mco.backup.entry.seed");
      private static final vq k = vq.c("mco.backup.entry.worldType");
      private static final vq l = vq.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(ezb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(eut.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(eut.this.i, eut.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private vq a(String $$0) {
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
      public vq a() {
         return vq.a("narrator.select", this.m + " " + this.n);
      }
   }
}
