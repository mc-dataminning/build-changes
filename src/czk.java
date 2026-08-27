import com.mojang.serialization.Dynamic;

public final class czk {
   private final String a;
   private final czd b;
   private final boolean c;
   private final boc d;
   private final boolean e;
   private final czc f;
   private final daa g;

   public czk(String $$0, czd $$1, boolean $$2, boc $$3, boolean $$4, czc $$5, daa $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static czk a(Dynamic<?> $$0, daa $$1) {
      czd $$2 = czd.a($$0.get("GameType").asInt(0));
      return new czk(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> boc.a($$0x.byteValue())).result().orElse(boc.c),
         $$0.get("allowCommands").asBoolean($$2 == czd.b),
         new czc($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public czd b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public boc d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public czc f() {
      return this.f;
   }

   public daa g() {
      return this.g;
   }

   public czk a(czd $$0) {
      return new czk(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public czk a(boc $$0) {
      return new czk(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public czk a(daa $$0) {
      return new czk(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public czk h() {
      return new czk(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
