import com.mojang.serialization.Dynamic;

public final class cvr {
   private final String a;
   private final cvk b;
   private final boolean c;
   private final blr d;
   private final boolean e;
   private final cvj f;
   private final cwh g;

   public cvr(String $$0, cvk $$1, boolean $$2, blr $$3, boolean $$4, cvj $$5, cwh $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cvr a(Dynamic<?> $$0, cwh $$1) {
      cvk $$2 = cvk.a($$0.get("GameType").asInt(0));
      return new cvr(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> blr.a($$0x.byteValue())).result().orElse(blr.c),
         $$0.get("allowCommands").asBoolean($$2 == cvk.b),
         new cvj($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cvk b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public blr d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cvj f() {
      return this.f;
   }

   public cwh g() {
      return this.g;
   }

   public cvr a(cvk $$0) {
      return new cvr(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cvr a(blr $$0) {
      return new cvr(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cvr a(cwh $$0) {
      return new cvr(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cvr h() {
      return new cvr(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
