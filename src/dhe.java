import com.mojang.serialization.Dynamic;

public final class dhe {
   private final String a;
   private final dgx b;
   private final boolean c;
   private final btb d;
   private final boolean e;
   private final dgw f;
   private final dhx g;

   public dhe(String $$0, dgx $$1, boolean $$2, btb $$3, boolean $$4, dgw $$5, dhx $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dhe a(Dynamic<?> $$0, dhx $$1) {
      dgx $$2 = dgx.a($$0.get("GameType").asInt(0));
      return new dhe(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> btb.a($$0x.byteValue())).result().orElse(btb.c),
         $$0.get("allowCommands").asBoolean($$2 == dgx.b),
         new dgw($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dgx b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public btb d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dgw f() {
      return this.f;
   }

   public dhx g() {
      return this.g;
   }

   public dhe a(dgx $$0) {
      return new dhe(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dhe a(btb $$0) {
      return new dhe(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dhe a(dhx $$0) {
      return new dhe(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dhe h() {
      return new dhe(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
