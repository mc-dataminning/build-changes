import com.mojang.serialization.Dynamic;

public final class cpq {
   private final String a;
   private final cpj b;
   private final boolean c;
   private final bgn d;
   private final boolean e;
   private final cpi f;
   private final cqf g;

   public cpq(String $$0, cpj $$1, boolean $$2, bgn $$3, boolean $$4, cpi $$5, cqf $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cpq a(Dynamic<?> $$0, cqf $$1) {
      cpj $$2 = cpj.a($$0.get("GameType").asInt(0));
      return new cpq(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bgn.a($$0x.byteValue())).result().orElse(bgn.c),
         $$0.get("allowCommands").asBoolean($$2 == cpj.b),
         new cpi($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cpj b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bgn d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cpi f() {
      return this.f;
   }

   public cqf g() {
      return this.g;
   }

   public cpq a(cpj $$0) {
      return new cpq(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cpq a(bgn $$0) {
      return new cpq(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cpq a(cqf $$0) {
      return new cpq(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cpq h() {
      return new cpq(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
