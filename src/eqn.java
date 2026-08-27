import java.util.Locale;

public class eqn extends ghw {
   private static final uv a = uv.c("mco.backup.info.title");
   private static final uv b = uv.c("mco.backup.unknown");
   private final faz c;
   final eox v;
   final eyo w = new eyo(this);
   private eqn.a x;

   public eqn(faz $$0, eox $$1) {
      super(a);
      this.c = $$0;
      this.v = $$1;
   }

   @Override
   public void aQ_() {
      this.w.a(new ewl(a, this.i));
      this.x = new eqn.a(this.f);
      this.d(this.x);
      this.w.b(eve.a(uu.k, $$0 -> this.aG_()).a());
      this.w.a();
      this.w.a($$1 -> {
         evc var10000 = this.d($$1);
      });
   }

   @Override
   protected void c() {
      this.w.a();
      this.x.a(this.g, this.h, this.w.c(), this.h - this.w.b());
   }

   @Override
   public void aG_() {
      this.f.a(this.c);
   }

   uv a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (uv)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : uv.b($$1));
      }
   }

   private uv a(String $$0) {
      try {
         return erk.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private uv b(String $$0) {
      try {
         return erk.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends ewa<eqn.b> {
      public a(eti $$0) {
         super($$0, eqn.this.g, eqn.this.h, eqn.this.w.c(), eqn.this.h - eqn.this.w.b(), 36);
         if (eqn.this.v.e != null) {
            eqn.this.v.e.forEach(($$0x, $$1) -> this.b(eqn.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends ewa.a<eqn.b> {
      private static final uv b = uv.c("mco.backup.entry.templateName");
      private static final uv c = uv.c("mco.backup.entry.gameDifficulty");
      private static final uv d = uv.c("mco.backup.entry.name");
      private static final uv e = uv.c("mco.backup.entry.gameServerVersion");
      private static final uv f = uv.c("mco.backup.entry.uploaded");
      private static final uv g = uv.c("mco.backup.entry.enabledPack");
      private static final uv h = uv.c("mco.backup.entry.description");
      private static final uv i = uv.c("mco.backup.entry.gameMode");
      private static final uv j = uv.c("mco.backup.entry.seed");
      private static final uv k = uv.c("mco.backup.entry.worldType");
      private static final uv l = uv.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(eut $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(eqn.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(eqn.this.i, eqn.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private uv a(String $$0) {
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
      public uv a() {
         return uv.a("narrator.select", this.m + " " + this.n);
      }
   }
}
