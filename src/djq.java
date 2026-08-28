import com.mojang.serialization.Dynamic;

public final class djq {
   private final String a;
   private final djj b;
   private final boolean c;
   private final bud d;
   private final boolean e;
   private final dji f;
   private final dkk g;

   public djq(String $$0, djj $$1, boolean $$2, bud $$3, boolean $$4, dji $$5, dkk $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static djq a(Dynamic<?> $$0, dkk $$1) {
      djj $$2 = djj.a($$0.get("GameType").asInt(0));
      return new djq(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bud.a($$0x.byteValue())).result().orElse(bud.c),
         $$0.get("allowCommands").asBoolean($$2 == djj.b),
         new dji($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public djj b() {
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

   public dji f() {
      return this.f;
   }

   public dkk g() {
      return this.g;
   }

   public djq a(djj $$0) {
      return new djq(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public djq a(bud $$0) {
      return new djq(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public djq a(dkk $$0) {
      return new djq(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public djq h() {
      return new djq(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
