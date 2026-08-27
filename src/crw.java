import com.mojang.serialization.Dynamic;

public final class crw {
   private final String a;
   private final crp b;
   private final boolean c;
   private final bin d;
   private final boolean e;
   private final cro f;
   private final csl g;

   public crw(String $$0, crp $$1, boolean $$2, bin $$3, boolean $$4, cro $$5, csl $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static crw a(Dynamic<?> $$0, csl $$1) {
      crp $$2 = crp.a($$0.get("GameType").asInt(0));
      return new crw(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bin.a($$0x.byteValue())).result().orElse(bin.c),
         $$0.get("allowCommands").asBoolean($$2 == crp.b),
         new cro($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public crp b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bin d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cro f() {
      return this.f;
   }

   public csl g() {
      return this.g;
   }

   public crw a(crp $$0) {
      return new crw(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public crw a(bin $$0) {
      return new crw(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public crw a(csl $$0) {
      return new crw(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public crw h() {
      return new crw(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
