import java.util.Locale;

public class fdn extends gwj {
   private static final wy a = wy.c("mco.backup.info.title");
   private static final wy b = wy.c("mco.backup.unknown");
   private final fnx c;
   final fby A;
   final flt B = new flt(this);
   private fdn.a C;

   public fdn(fnx $$0, fby $$1) {
      super(a);
      this.c = $$0;
      this.A = $$1;
   }

   @Override
   public void aP_() {
      this.B.a(a, this.o);
      this.C = this.B.c(new fdn.a(this.l));
      this.B.b(fig.a(wx.k, $$0 -> this.d()).a());
      this.c();
      this.B.a($$1 -> {
         fie var10000 = this.c($$1);
      });
   }

   @Override
   protected void c() {
      this.C.b(this.m, this.B.d());
      this.B.a();
   }

   @Override
   public void d() {
      this.l.a(this.c);
   }

   wy a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (wy)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : wy.b($$1));
      }
   }

   private wy a(String $$0) {
      try {
         return fej.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private wy b(String $$0) {
      try {
         return fej.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends fjc<fdn.b> {
      public a(final fgi $$0) {
         super($$0, fdn.this.m, fdn.this.B.d(), fdn.this.B.c(), 36);
         if (fdn.this.A.e != null) {
            fdn.this.A.e.forEach(($$0x, $$1) -> this.b(fdn.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends fjc.a<fdn.b> {
      private static final wy b = wy.c("mco.backup.entry.templateName");
      private static final wy c = wy.c("mco.backup.entry.gameDifficulty");
      private static final wy d = wy.c("mco.backup.entry.name");
      private static final wy e = wy.c("mco.backup.entry.gameServerVersion");
      private static final wy f = wy.c("mco.backup.entry.uploaded");
      private static final wy g = wy.c("mco.backup.entry.enabledPack");
      private static final wy h = wy.c("mco.backup.entry.description");
      private static final wy i = wy.c("mco.backup.entry.gameMode");
      private static final wy j = wy.c("mco.backup.entry.seed");
      private static final wy k = wy.c("mco.backup.entry.worldType");
      private static final wy l = wy.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(final String $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(fdn.this.o, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(fdn.this.o, fdn.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private wy a(String $$0) {
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
      public wy a() {
         return wy.a("narrator.select", this.m + " " + this.n);
      }
   }
}
