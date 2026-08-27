import java.util.Locale;

public class eob extends gfb {
   private static final tm a = tm.c("mco.backup.info.title");
   private static final tm b = tm.c("mco.backup.unknown");
   private final eyk c;
   final eml y;
   final evz z = new evz(this);
   private eob.a A;

   public eob(eyk $$0, eml $$1) {
      super(a);
      this.c = $$0;
      this.y = $$1;
   }

   @Override
   public void aI_() {
      this.z.a(new etw(a, this.i));
      this.A = new eob.a(this.f);
      this.d(this.A);
      this.z.b(esq.a(tl.k, $$0 -> this.az_()).a());
      this.z.a();
      this.z.a($$1 -> {
         eso var10000 = this.d($$1);
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

   tm a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (tm)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : tm.b($$1));
      }
   }

   private tm a(String $$0) {
      try {
         return eoy.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private tm b(String $$0) {
      try {
         return eoy.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends etm<eob.b> {
      public a(eqv $$0) {
         super($$0, eob.this.g, eob.this.h, eob.this.z.c(), eob.this.h - eob.this.z.b(), 36);
         if (eob.this.y.e != null) {
            eob.this.y.e.forEach(($$0x, $$1) -> this.b(eob.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends etm.a<eob.b> {
      private static final tm b = tm.c("mco.backup.entry.templateName");
      private static final tm c = tm.c("mco.backup.entry.gameDifficulty");
      private static final tm d = tm.c("mco.backup.entry.name");
      private static final tm e = tm.c("mco.backup.entry.gameServerVersion");
      private static final tm f = tm.c("mco.backup.entry.uploaded");
      private static final tm g = tm.c("mco.backup.entry.enabledPack");
      private static final tm h = tm.c("mco.backup.entry.description");
      private static final tm i = tm.c("mco.backup.entry.gameMode");
      private static final tm j = tm.c("mco.backup.entry.seed");
      private static final tm k = tm.c("mco.backup.entry.worldType");
      private static final tm l = tm.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(esf $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(eob.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(eob.this.i, eob.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private tm a(String $$0) {
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
      public tm a() {
         return tm.a("narrator.select", this.m + " " + this.n);
      }
   }
}
