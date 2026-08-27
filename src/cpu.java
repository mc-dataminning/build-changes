import com.mojang.serialization.Dynamic;

public final class cpu {
   private final String a;
   private final cpn b;
   private final boolean c;
   private final bgq d;
   private final boolean e;
   private final cpm f;
   private final cqj g;

   public cpu(String $$0, cpn $$1, boolean $$2, bgq $$3, boolean $$4, cpm $$5, cqj $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cpu a(Dynamic<?> $$0, cqj $$1) {
      cpn $$2 = cpn.a($$0.get("GameType").asInt(0));
      return new cpu(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bgq.a($$0x.byteValue())).result().orElse(bgq.c),
         $$0.get("allowCommands").asBoolean($$2 == cpn.b),
         new cpm($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cpn b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bgq d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cpm f() {
      return this.f;
   }

   public cqj g() {
      return this.g;
   }

   public cpu a(cpn $$0) {
      return new cpu(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cpu a(bgq $$0) {
      return new cpu(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cpu a(cqj $$0) {
      return new cpu(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cpu h() {
      return new cpu(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
