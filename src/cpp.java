import com.mojang.serialization.Dynamic;

public final class cpp {
   private final String a;
   private final cpi b;
   private final boolean c;
   private final bgn d;
   private final boolean e;
   private final cph f;
   private final cqe g;

   public cpp(String $$0, cpi $$1, boolean $$2, bgn $$3, boolean $$4, cph $$5, cqe $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cpp a(Dynamic<?> $$0, cqe $$1) {
      cpi $$2 = cpi.a($$0.get("GameType").asInt(0));
      return new cpp(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bgn.a($$0x.byteValue())).result().orElse(bgn.c),
         $$0.get("allowCommands").asBoolean($$2 == cpi.b),
         new cph($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cpi b() {
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

   public cph f() {
      return this.f;
   }

   public cqe g() {
      return this.g;
   }

   public cpp a(cpi $$0) {
      return new cpp(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cpp a(bgn $$0) {
      return new cpp(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cpp a(cqe $$0) {
      return new cpp(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cpp h() {
      return new cpp(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
