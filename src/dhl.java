import com.mojang.serialization.Dynamic;

public final class dhl {
   private final String a;
   private final dhe b;
   private final boolean c;
   private final btf d;
   private final boolean e;
   private final dhd f;
   private final die g;

   public dhl(String $$0, dhe $$1, boolean $$2, btf $$3, boolean $$4, dhd $$5, die $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dhl a(Dynamic<?> $$0, die $$1) {
      dhe $$2 = dhe.a($$0.get("GameType").asInt(0));
      return new dhl(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> btf.a($$0x.byteValue())).result().orElse(btf.c),
         $$0.get("allowCommands").asBoolean($$2 == dhe.b),
         new dhd($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dhe b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public btf d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dhd f() {
      return this.f;
   }

   public die g() {
      return this.g;
   }

   public dhl a(dhe $$0) {
      return new dhl(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dhl a(btf $$0) {
      return new dhl(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dhl a(die $$0) {
      return new dhl(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dhl h() {
      return new dhl(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
