import com.mojang.serialization.Dynamic;

public final class den {
   private final String a;
   private final deg b;
   private final boolean c;
   private final brp d;
   private final boolean e;
   private final def f;
   private final dff g;

   public den(String $$0, deg $$1, boolean $$2, brp $$3, boolean $$4, def $$5, dff $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static den a(Dynamic<?> $$0, dff $$1) {
      deg $$2 = deg.a($$0.get("GameType").asInt(0));
      return new den(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> brp.a($$0x.byteValue())).result().orElse(brp.c),
         $$0.get("allowCommands").asBoolean($$2 == deg.b),
         new def($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public deg b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public brp d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public def f() {
      return this.f;
   }

   public dff g() {
      return this.g;
   }

   public den a(deg $$0) {
      return new den(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public den a(brp $$0) {
      return new den(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public den a(dff $$0) {
      return new den(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public den h() {
      return new den(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
