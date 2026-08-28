import com.mojang.serialization.Dynamic;

public final class dez {
   private final String a;
   private final des b;
   private final boolean c;
   private final brv d;
   private final boolean e;
   private final der f;
   private final dfr g;

   public dez(String $$0, des $$1, boolean $$2, brv $$3, boolean $$4, der $$5, dfr $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dez a(Dynamic<?> $$0, dfr $$1) {
      des $$2 = des.a($$0.get("GameType").asInt(0));
      return new dez(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> brv.a($$0x.byteValue())).result().orElse(brv.c),
         $$0.get("allowCommands").asBoolean($$2 == des.b),
         new der($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public des b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public brv d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public der f() {
      return this.f;
   }

   public dfr g() {
      return this.g;
   }

   public dez a(des $$0) {
      return new dez(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dez a(brv $$0) {
      return new dez(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dez a(dfr $$0) {
      return new dez(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dez h() {
      return new dez(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
