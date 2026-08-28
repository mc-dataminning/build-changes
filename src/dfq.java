import com.mojang.serialization.Dynamic;

public final class dfq {
   private final String a;
   private final dfj b;
   private final boolean c;
   private final bsh d;
   private final boolean e;
   private final dfi f;
   private final dgj g;

   public dfq(String $$0, dfj $$1, boolean $$2, bsh $$3, boolean $$4, dfi $$5, dgj $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dfq a(Dynamic<?> $$0, dgj $$1) {
      dfj $$2 = dfj.a($$0.get("GameType").asInt(0));
      return new dfq(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bsh.a($$0x.byteValue())).result().orElse(bsh.c),
         $$0.get("allowCommands").asBoolean($$2 == dfj.b),
         new dfi($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dfj b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bsh d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dfi f() {
      return this.f;
   }

   public dgj g() {
      return this.g;
   }

   public dfq a(dfj $$0) {
      return new dfq(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dfq a(bsh $$0) {
      return new dfq(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dfq a(dgj $$0) {
      return new dfq(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dfq h() {
      return new dfq(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
