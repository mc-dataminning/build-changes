import com.mojang.serialization.Dynamic;

public final class cpz {
   private final String a;
   private final cps b;
   private final boolean c;
   private final bgv d;
   private final boolean e;
   private final cpr f;
   private final cqo g;

   public cpz(String $$0, cps $$1, boolean $$2, bgv $$3, boolean $$4, cpr $$5, cqo $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cpz a(Dynamic<?> $$0, cqo $$1) {
      cps $$2 = cps.a($$0.get("GameType").asInt(0));
      return new cpz(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bgv.a($$0x.byteValue())).result().orElse(bgv.c),
         $$0.get("allowCommands").asBoolean($$2 == cps.b),
         new cpr($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cps b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bgv d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cpr f() {
      return this.f;
   }

   public cqo g() {
      return this.g;
   }

   public cpz a(cps $$0) {
      return new cpz(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cpz a(bgv $$0) {
      return new cpz(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cpz a(cqo $$0) {
      return new cpz(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cpz h() {
      return new cpz(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
