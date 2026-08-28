import com.mojang.serialization.Dynamic;

public final class dgn {
   private final String a;
   private final dgg b;
   private final boolean c;
   private final bsi d;
   private final boolean e;
   private final dgf f;
   private final dhg g;

   public dgn(String $$0, dgg $$1, boolean $$2, bsi $$3, boolean $$4, dgf $$5, dhg $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dgn a(Dynamic<?> $$0, dhg $$1) {
      dgg $$2 = dgg.a($$0.get("GameType").asInt(0));
      return new dgn(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bsi.a($$0x.byteValue())).result().orElse(bsi.c),
         $$0.get("allowCommands").asBoolean($$2 == dgg.b),
         new dgf($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dgg b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bsi d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dgf f() {
      return this.f;
   }

   public dhg g() {
      return this.g;
   }

   public dgn a(dgg $$0) {
      return new dgn(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dgn a(bsi $$0) {
      return new dgn(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dgn a(dhg $$0) {
      return new dgn(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dgn h() {
      return new dgn(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
