import com.mojang.serialization.Dynamic;

public final class cqb {
   private final String a;
   private final cpu b;
   private final boolean c;
   private final bgx d;
   private final boolean e;
   private final cpt f;
   private final cqq g;

   public cqb(String $$0, cpu $$1, boolean $$2, bgx $$3, boolean $$4, cpt $$5, cqq $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cqb a(Dynamic<?> $$0, cqq $$1) {
      cpu $$2 = cpu.a($$0.get("GameType").asInt(0));
      return new cqb(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bgx.a($$0x.byteValue())).result().orElse(bgx.c),
         $$0.get("allowCommands").asBoolean($$2 == cpu.b),
         new cpt($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cpu b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bgx d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cpt f() {
      return this.f;
   }

   public cqq g() {
      return this.g;
   }

   public cqb a(cpu $$0) {
      return new cqb(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cqb a(bgx $$0) {
      return new cqb(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cqb a(cqq $$0) {
      return new cqb(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cqb h() {
      return new cqb(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
