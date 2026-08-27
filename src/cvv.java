import com.mojang.serialization.Dynamic;

public final class cvv {
   private final String a;
   private final cvo b;
   private final boolean c;
   private final blt d;
   private final boolean e;
   private final cvn f;
   private final cwl g;

   public cvv(String $$0, cvo $$1, boolean $$2, blt $$3, boolean $$4, cvn $$5, cwl $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cvv a(Dynamic<?> $$0, cwl $$1) {
      cvo $$2 = cvo.a($$0.get("GameType").asInt(0));
      return new cvv(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> blt.a($$0x.byteValue())).result().orElse(blt.c),
         $$0.get("allowCommands").asBoolean($$2 == cvo.b),
         new cvn($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cvo b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public blt d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cvn f() {
      return this.f;
   }

   public cwl g() {
      return this.g;
   }

   public cvv a(cvo $$0) {
      return new cvv(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cvv a(blt $$0) {
      return new cvv(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cvv a(cwl $$0) {
      return new cvv(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cvv h() {
      return new cvv(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
