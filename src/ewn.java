import java.util.Locale;

public class ewn extends gpe {
   private static final vu a = vu.c("mco.backup.info.title");
   private static final vu b = vu.c("mco.backup.unknown");
   private final fhh c;
   final eux v;
   final fev w = new fev(this);
   private ewn.a x;

   public ewn(fhh $$0, eux $$1) {
      super(a);
      this.c = $$0;
      this.v = $$1;
   }

   @Override
   public void aO_() {
      this.w.a(new fcp(a, this.i));
      this.x = this.w.c(new ewn.a(this.f));
      this.w.b(fbi.a(vt.k, $$0 -> this.d()).a());
      this.c();
      this.w.a($$1 -> {
         fbg var10000 = this.c($$1);
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

   vu a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (vu)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : vu.b($$1));
      }
   }

   private vu a(String $$0) {
      try {
         return exk.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private vu b(String $$0) {
      try {
         return exk.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fce<ewn.b> {
      public a(ezi $$0) {
         super($$0, ewn.this.g, ewn.this.h - ewn.this.w.b() - ewn.this.w.c(), ewn.this.w.c(), 36);
         if (ewn.this.v.e != null) {
            ewn.this.v.e.forEach(($$0x, $$1) -> this.b(ewn.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fce.a<ewn.b> {
      private static final vu b = vu.c("mco.backup.entry.templateName");
      private static final vu c = vu.c("mco.backup.entry.gameDifficulty");
      private static final vu d = vu.c("mco.backup.entry.name");
      private static final vu e = vu.c("mco.backup.entry.gameServerVersion");
      private static final vu f = vu.c("mco.backup.entry.uploaded");
      private static final vu g = vu.c("mco.backup.entry.enabledPack");
      private static final vu h = vu.c("mco.backup.entry.description");
      private static final vu i = vu.c("mco.backup.entry.gameMode");
      private static final vu j = vu.c("mco.backup.entry.seed");
      private static final vu k = vu.c("mco.backup.entry.worldType");
      private static final vu l = vu.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(ewn.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(ewn.this.i, ewn.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private vu a(String $$0) {
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
      public vu a() {
         return vu.a("narrator.select", this.m + " " + this.n);
      }
   }
}
