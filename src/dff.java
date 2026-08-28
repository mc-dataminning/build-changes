import com.mojang.serialization.Dynamic;

public final class dff {
   private final String a;
   private final dey b;
   private final boolean c;
   private final bsa d;
   private final boolean e;
   private final dex f;
   private final dfx g;

   public dff(String $$0, dey $$1, boolean $$2, bsa $$3, boolean $$4, dex $$5, dfx $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dff a(Dynamic<?> $$0, dfx $$1) {
      dey $$2 = dey.a($$0.get("GameType").asInt(0));
      return new dff(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bsa.a($$0x.byteValue())).result().orElse(bsa.c),
         $$0.get("allowCommands").asBoolean($$2 == dey.b),
         new dex($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dey b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bsa d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dex f() {
      return this.f;
   }

   public dfx g() {
      return this.g;
   }

   public dff a(dey $$0) {
      return new dff(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dff a(bsa $$0) {
      return new dff(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dff a(dfx $$0) {
      return new dff(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dff h() {
      return new dff(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
