import com.mojang.serialization.Dynamic;

public final class cse {
   private final String a;
   private final crx b;
   private final boolean c;
   private final biu d;
   private final boolean e;
   private final crw f;
   private final cst g;

   public cse(String $$0, crx $$1, boolean $$2, biu $$3, boolean $$4, crw $$5, cst $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cse a(Dynamic<?> $$0, cst $$1) {
      crx $$2 = crx.a($$0.get("GameType").asInt(0));
      return new cse(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> biu.a($$0x.byteValue())).result().orElse(biu.c),
         $$0.get("allowCommands").asBoolean($$2 == crx.b),
         new crw($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public crx b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public biu d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public crw f() {
      return this.f;
   }

   public cst g() {
      return this.g;
   }

   public cse a(crx $$0) {
      return new cse(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cse a(biu $$0) {
      return new cse(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cse a(cst $$0) {
      return new cse(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cse h() {
      return new cse(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
