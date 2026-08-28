import com.mojang.serialization.Dynamic;

public final class dht {
   private final String a;
   private final dhm b;
   private final boolean c;
   private final btn d;
   private final boolean e;
   private final dhl f;
   private final din g;

   public dht(String $$0, dhm $$1, boolean $$2, btn $$3, boolean $$4, dhl $$5, din $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dht a(Dynamic<?> $$0, din $$1) {
      dhm $$2 = dhm.a($$0.get("GameType").asInt(0));
      return new dht(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> btn.a($$0x.byteValue())).result().orElse(btn.c),
         $$0.get("allowCommands").asBoolean($$2 == dhm.b),
         new dhl($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dhm b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public btn d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dhl f() {
      return this.f;
   }

   public din g() {
      return this.g;
   }

   public dht a(dhm $$0) {
      return new dht(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dht a(btn $$0) {
      return new dht(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dht a(din $$0) {
      return new dht(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dht h() {
      return new dht(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
