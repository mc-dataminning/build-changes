import com.mojang.serialization.Dynamic;

public final class dek {
   private final String a;
   private final ded b;
   private final boolean c;
   private final brm d;
   private final boolean e;
   private final dec f;
   private final dfc g;

   public dek(String $$0, ded $$1, boolean $$2, brm $$3, boolean $$4, dec $$5, dfc $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dek a(Dynamic<?> $$0, dfc $$1) {
      ded $$2 = ded.a($$0.get("GameType").asInt(0));
      return new dek(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> brm.a($$0x.byteValue())).result().orElse(brm.c),
         $$0.get("allowCommands").asBoolean($$2 == ded.b),
         new dec($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public ded b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public brm d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dec f() {
      return this.f;
   }

   public dfc g() {
      return this.g;
   }

   public dek a(ded $$0) {
      return new dek(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dek a(brm $$0) {
      return new dek(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dek a(dfc $$0) {
      return new dek(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dek h() {
      return new dek(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
