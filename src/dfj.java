import com.mojang.serialization.Dynamic;

public final class dfj {
   private final String a;
   private final dfc b;
   private final boolean c;
   private final bse d;
   private final boolean e;
   private final dfb f;
   private final dgc g;

   public dfj(String $$0, dfc $$1, boolean $$2, bse $$3, boolean $$4, dfb $$5, dgc $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dfj a(Dynamic<?> $$0, dgc $$1) {
      dfc $$2 = dfc.a($$0.get("GameType").asInt(0));
      return new dfj(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bse.a($$0x.byteValue())).result().orElse(bse.c),
         $$0.get("allowCommands").asBoolean($$2 == dfc.b),
         new dfb($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dfc b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bse d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dfb f() {
      return this.f;
   }

   public dgc g() {
      return this.g;
   }

   public dfj a(dfc $$0) {
      return new dfj(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dfj a(bse $$0) {
      return new dfj(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dfj a(dgc $$0) {
      return new dfj(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dfj h() {
      return new dfj(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
