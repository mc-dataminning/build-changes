import com.mojang.serialization.Dynamic;

public final class cwi {
   private final String a;
   private final cwb b;
   private final boolean c;
   private final bmi d;
   private final boolean e;
   private final cwa f;
   private final cwy g;

   public cwi(String $$0, cwb $$1, boolean $$2, bmi $$3, boolean $$4, cwa $$5, cwy $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cwi a(Dynamic<?> $$0, cwy $$1) {
      cwb $$2 = cwb.a($$0.get("GameType").asInt(0));
      return new cwi(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bmi.a($$0x.byteValue())).result().orElse(bmi.c),
         $$0.get("allowCommands").asBoolean($$2 == cwb.b),
         new cwa($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cwb b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bmi d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cwa f() {
      return this.f;
   }

   public cwy g() {
      return this.g;
   }

   public cwi a(cwb $$0) {
      return new cwi(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cwi a(bmi $$0) {
      return new cwi(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cwi a(cwy $$0) {
      return new cwi(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cwi h() {
      return new cwi(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
