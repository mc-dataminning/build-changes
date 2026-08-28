import com.mojang.serialization.Dynamic;

public final class dgm {
   private final String a;
   private final dgf b;
   private final boolean c;
   private final bsh d;
   private final boolean e;
   private final dge f;
   private final dhf g;

   public dgm(String $$0, dgf $$1, boolean $$2, bsh $$3, boolean $$4, dge $$5, dhf $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dgm a(Dynamic<?> $$0, dhf $$1) {
      dgf $$2 = dgf.a($$0.get("GameType").asInt(0));
      return new dgm(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bsh.a($$0x.byteValue())).result().orElse(bsh.c),
         $$0.get("allowCommands").asBoolean($$2 == dgf.b),
         new dge($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dgf b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bsh d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dge f() {
      return this.f;
   }

   public dhf g() {
      return this.g;
   }

   public dgm a(dgf $$0) {
      return new dgm(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dgm a(bsh $$0) {
      return new dgm(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dgm a(dhf $$0) {
      return new dgm(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dgm h() {
      return new dgm(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
