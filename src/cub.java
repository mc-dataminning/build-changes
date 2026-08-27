import com.mojang.serialization.Dynamic;

public final class cub {
   private final String a;
   private final ctu b;
   private final boolean c;
   private final bjz d;
   private final boolean e;
   private final ctt f;
   private final cur g;

   public cub(String $$0, ctu $$1, boolean $$2, bjz $$3, boolean $$4, ctt $$5, cur $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cub a(Dynamic<?> $$0, cur $$1) {
      ctu $$2 = ctu.a($$0.get("GameType").asInt(0));
      return new cub(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bjz.a($$0x.byteValue())).result().orElse(bjz.c),
         $$0.get("allowCommands").asBoolean($$2 == ctu.b),
         new ctt($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public ctu b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bjz d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public ctt f() {
      return this.f;
   }

   public cur g() {
      return this.g;
   }

   public cub a(ctu $$0) {
      return new cub(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cub a(bjz $$0) {
      return new cub(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cub a(cur $$0) {
      return new cub(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cub h() {
      return new cub(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
