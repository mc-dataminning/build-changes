import com.mojang.serialization.Dynamic;

public final class cqf {
   private final String a;
   private final cpy b;
   private final boolean c;
   private final bhb d;
   private final boolean e;
   private final cpx f;
   private final cqu g;

   public cqf(String $$0, cpy $$1, boolean $$2, bhb $$3, boolean $$4, cpx $$5, cqu $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cqf a(Dynamic<?> $$0, cqu $$1) {
      cpy $$2 = cpy.a($$0.get("GameType").asInt(0));
      return new cqf(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bhb.a($$0x.byteValue())).result().orElse(bhb.c),
         $$0.get("allowCommands").asBoolean($$2 == cpy.b),
         new cpx($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cpy b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bhb d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cpx f() {
      return this.f;
   }

   public cqu g() {
      return this.g;
   }

   public cqf a(cpy $$0) {
      return new cqf(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cqf a(bhb $$0) {
      return new cqf(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cqf a(cqu $$0) {
      return new cqf(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cqf h() {
      return new cqf(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
