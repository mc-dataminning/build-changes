import com.mojang.serialization.Dynamic;

public final class dcc {
   private final String a;
   private final dbv b;
   private final boolean c;
   private final bqr d;
   private final boolean e;
   private final dbu f;
   private final dcs g;

   public dcc(String $$0, dbv $$1, boolean $$2, bqr $$3, boolean $$4, dbu $$5, dcs $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dcc a(Dynamic<?> $$0, dcs $$1) {
      dbv $$2 = dbv.a($$0.get("GameType").asInt(0));
      return new dcc(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bqr.a($$0x.byteValue())).result().orElse(bqr.c),
         $$0.get("allowCommands").asBoolean($$2 == dbv.b),
         new dbu($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dbv b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bqr d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dbu f() {
      return this.f;
   }

   public dcs g() {
      return this.g;
   }

   public dcc a(dbv $$0) {
      return new dcc(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dcc a(bqr $$0) {
      return new dcc(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dcc a(dcs $$0) {
      return new dcc(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dcc h() {
      return new dcc(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
