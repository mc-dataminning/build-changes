import com.mojang.serialization.Dynamic;

public final class diz {
   private final String a;
   private final dis b;
   private final boolean c;
   private final bty d;
   private final boolean e;
   private final dir f;
   private final djt g;

   public diz(String $$0, dis $$1, boolean $$2, bty $$3, boolean $$4, dir $$5, djt $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static diz a(Dynamic<?> $$0, djt $$1) {
      dis $$2 = dis.a($$0.get("GameType").asInt(0));
      return new diz(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bty.a($$0x.byteValue())).result().orElse(bty.c),
         $$0.get("allowCommands").asBoolean($$2 == dis.b),
         new dir($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dis b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bty d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dir f() {
      return this.f;
   }

   public djt g() {
      return this.g;
   }

   public diz a(dis $$0) {
      return new diz(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public diz a(bty $$0) {
      return new diz(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public diz a(djt $$0) {
      return new diz(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public diz h() {
      return new diz(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
