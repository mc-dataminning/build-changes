import com.mojang.serialization.Dynamic;

public final class dcd {
   private final String a;
   private final dbw b;
   private final boolean c;
   private final bqs d;
   private final boolean e;
   private final dbv f;
   private final dct g;

   public dcd(String $$0, dbw $$1, boolean $$2, bqs $$3, boolean $$4, dbv $$5, dct $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dcd a(Dynamic<?> $$0, dct $$1) {
      dbw $$2 = dbw.a($$0.get("GameType").asInt(0));
      return new dcd(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bqs.a($$0x.byteValue())).result().orElse(bqs.c),
         $$0.get("allowCommands").asBoolean($$2 == dbw.b),
         new dbv($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dbw b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bqs d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dbv f() {
      return this.f;
   }

   public dct g() {
      return this.g;
   }

   public dcd a(dbw $$0) {
      return new dcd(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dcd a(bqs $$0) {
      return new dcd(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dcd a(dct $$0) {
      return new dcd(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dcd h() {
      return new dcd(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
