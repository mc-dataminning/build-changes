import com.mojang.serialization.Dynamic;

public final class crd {
   private final String a;
   private final cqw b;
   private final boolean c;
   private final bhy d;
   private final boolean e;
   private final cqv f;
   private final crs g;

   public crd(String $$0, cqw $$1, boolean $$2, bhy $$3, boolean $$4, cqv $$5, crs $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static crd a(Dynamic<?> $$0, crs $$1) {
      cqw $$2 = cqw.a($$0.get("GameType").asInt(0));
      return new crd(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bhy.a($$0x.byteValue())).result().orElse(bhy.c),
         $$0.get("allowCommands").asBoolean($$2 == cqw.b),
         new cqv($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cqw b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bhy d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cqv f() {
      return this.f;
   }

   public crs g() {
      return this.g;
   }

   public crd a(cqw $$0) {
      return new crd(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public crd a(bhy $$0) {
      return new crd(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public crd a(crs $$0) {
      return new crd(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public crd h() {
      return new crd(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
