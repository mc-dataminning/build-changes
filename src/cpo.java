import com.mojang.serialization.Dynamic;

public final class cpo {
   private final String a;
   private final cph b;
   private final boolean c;
   private final bgl d;
   private final boolean e;
   private final cpg f;
   private final cqd g;

   public cpo(String $$0, cph $$1, boolean $$2, bgl $$3, boolean $$4, cpg $$5, cqd $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cpo a(Dynamic<?> $$0, cqd $$1) {
      cph $$2 = cph.a($$0.get("GameType").asInt(0));
      return new cpo(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bgl.a($$0x.byteValue())).result().orElse(bgl.c),
         $$0.get("allowCommands").asBoolean($$2 == cph.b),
         new cpg($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cph b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bgl d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cpg f() {
      return this.f;
   }

   public cqd g() {
      return this.g;
   }

   public cpo a(cph $$0) {
      return new cpo(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cpo a(bgl $$0) {
      return new cpo(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cpo a(cqd $$0) {
      return new cpo(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cpo h() {
      return new cpo(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
