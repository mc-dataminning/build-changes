import com.mojang.serialization.Dynamic;

public final class dbx {
   private final String a;
   private final dbq b;
   private final boolean c;
   private final bqm d;
   private final boolean e;
   private final dbp f;
   private final dcn g;

   public dbx(String $$0, dbq $$1, boolean $$2, bqm $$3, boolean $$4, dbp $$5, dcn $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dbx a(Dynamic<?> $$0, dcn $$1) {
      dbq $$2 = dbq.a($$0.get("GameType").asInt(0));
      return new dbx(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bqm.a($$0x.byteValue())).result().orElse(bqm.c),
         $$0.get("allowCommands").asBoolean($$2 == dbq.b),
         new dbp($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dbq b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bqm d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dbp f() {
      return this.f;
   }

   public dcn g() {
      return this.g;
   }

   public dbx a(dbq $$0) {
      return new dbx(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dbx a(bqm $$0) {
      return new dbx(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dbx a(dcn $$0) {
      return new dbx(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dbx h() {
      return new dbx(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
