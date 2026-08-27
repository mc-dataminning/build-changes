import java.util.Locale;

public class erp extends gjl {
   private static final vb a = vb.c("mco.backup.info.title");
   private static final vb b = vb.c("mco.backup.unknown");
   private final fcc c;
   final epz v;
   final ezr w = new ezr(this);
   private erp.a x;

   public erp(fcc $$0, epz $$1) {
      super(a);
      this.c = $$0;
      this.v = $$1;
   }

   @Override
   public void aP_() {
      this.w.a(new exo(a, this.i));
      this.x = new erp.a(this.f);
      this.d(this.x);
      this.w.b(ewh.a(va.k, $$0 -> this.aF_()).a());
      this.w.a();
      this.w.a($$1 -> {
         ewf var10000 = this.d($$1);
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

   vb a(String $$0, String $$1) {
      String $$2 = $$0.toLowerCase(Locale.ROOT);
      if ($$2.contains("game") && $$2.contains("mode")) {
         return this.b($$1);
      } else {
         return (vb)($$2.contains("game") && $$2.contains("difficulty") ? this.a($$1) : vb.b($$1));
      }
   }

   private vb a(String $$0) {
      try {
         return esm.a.get(Integer.parseInt($$0)).b();
      } catch (Exception var3) {
         return b;
      }
   }

   private vb b(String $$0) {
      try {
         return esm.b.get(Integer.parseInt($$0)).e();
      } catch (Exception var3) {
         return b;
      }
   }

   class a extends exd<erp.b> {
      public a(euk $$0) {
         super($$0, erp.this.g, erp.this.h, erp.this.w.c(), erp.this.h - erp.this.w.b(), 36);
         if (erp.this.v.e != null) {
            erp.this.v.e.forEach(($$0x, $$1) -> this.b(erp.this.new b($$0x, $$1)));
         }
      }
   }

   class b extends exd.a<erp.b> {
      private static final vb b = vb.c("mco.backup.entry.templateName");
      private static final vb c = vb.c("mco.backup.entry.gameDifficulty");
      private static final vb d = vb.c("mco.backup.entry.name");
      private static final vb e = vb.c("mco.backup.entry.gameServerVersion");
      private static final vb f = vb.c("mco.backup.entry.uploaded");
      private static final vb g = vb.c("mco.backup.entry.enabledPack");
      private static final vb h = vb.c("mco.backup.entry.description");
      private static final vb i = vb.c("mco.backup.entry.gameMode");
      private static final vb j = vb.c("mco.backup.entry.seed");
      private static final vb k = vb.c("mco.backup.entry.worldType");
      private static final vb l = vb.c("mco.backup.entry.undefined");
      private final String m;
      private final String n;

      public b(String $$0, String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public void a(evw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.b(erp.this.i, this.a(this.m), $$3, $$2, -6250336);
         $$0.b(erp.this.i, erp.this.a(this.m, this.n), $$3, $$2 + 12, -1);
      }

      private vb a(String $$0) {
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
      public vb a() {
         return vb.a("narrator.select", this.m + " " + this.n);
      }
   }
}
