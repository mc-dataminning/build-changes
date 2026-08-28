import com.mojang.serialization.Dynamic;

public final class dda {
   private final String a;
   private final dct b;
   private final boolean c;
   private final bqo d;
   private final boolean e;
   private final dcs f;
   private final ddr g;

   public dda(String $$0, dct $$1, boolean $$2, bqo $$3, boolean $$4, dcs $$5, ddr $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dda a(Dynamic<?> $$0, ddr $$1) {
      dct $$2 = dct.a($$0.get("GameType").asInt(0));
      return new dda(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bqo.a($$0x.byteValue())).result().orElse(bqo.c),
         $$0.get("allowCommands").asBoolean($$2 == dct.b),
         new dcs($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dct b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bqo d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dcs f() {
      return this.f;
   }

   public ddr g() {
      return this.g;
   }

   public dda a(dct $$0) {
      return new dda(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dda a(bqo $$0) {
      return new dda(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dda a(ddr $$0) {
      return new dda(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dda h() {
      return new dda(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
