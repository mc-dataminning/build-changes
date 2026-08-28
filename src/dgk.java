import com.mojang.serialization.Dynamic;

public final class dgk {
   private final String a;
   private final dgd b;
   private final boolean c;
   private final bsf d;
   private final boolean e;
   private final dgc f;
   private final dhd g;

   public dgk(String $$0, dgd $$1, boolean $$2, bsf $$3, boolean $$4, dgc $$5, dhd $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dgk a(Dynamic<?> $$0, dhd $$1) {
      dgd $$2 = dgd.a($$0.get("GameType").asInt(0));
      return new dgk(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bsf.a($$0x.byteValue())).result().orElse(bsf.c),
         $$0.get("allowCommands").asBoolean($$2 == dgd.b),
         new dgc($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dgd b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bsf d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dgc f() {
      return this.f;
   }

   public dhd g() {
      return this.g;
   }

   public dgk a(dgd $$0) {
      return new dgk(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dgk a(bsf $$0) {
      return new dgk(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dgk a(dhd $$0) {
      return new dgk(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dgk h() {
      return new dgk(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
