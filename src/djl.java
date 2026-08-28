import com.mojang.serialization.Dynamic;

public final class djl {
   private final String a;
   private final dje b;
   private final boolean c;
   private final bud d;
   private final boolean e;
   private final djd f;
   private final dkf g;

   public djl(String $$0, dje $$1, boolean $$2, bud $$3, boolean $$4, djd $$5, dkf $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static djl a(Dynamic<?> $$0, dkf $$1) {
      dje $$2 = dje.a($$0.get("GameType").asInt(0));
      return new djl(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bud.a($$0x.byteValue())).result().orElse(bud.c),
         $$0.get("allowCommands").asBoolean($$2 == dje.b),
         new djd($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dje b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bud d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public djd f() {
      return this.f;
   }

   public dkf g() {
      return this.g;
   }

   public djl a(dje $$0) {
      return new djl(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public djl a(bud $$0) {
      return new djl(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public djl a(dkf $$0) {
      return new djl(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public djl h() {
      return new djl(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
