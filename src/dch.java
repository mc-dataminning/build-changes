import com.mojang.serialization.Dynamic;

public final class dch {
   private final String a;
   private final dca b;
   private final boolean c;
   private final bqa d;
   private final boolean e;
   private final dbz f;
   private final dcy g;

   public dch(String $$0, dca $$1, boolean $$2, bqa $$3, boolean $$4, dbz $$5, dcy $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dch a(Dynamic<?> $$0, dcy $$1) {
      dca $$2 = dca.a($$0.get("GameType").asInt(0));
      return new dch(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bqa.a($$0x.byteValue())).result().orElse(bqa.c),
         $$0.get("allowCommands").asBoolean($$2 == dca.b),
         new dbz($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dca b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bqa d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dbz f() {
      return this.f;
   }

   public dcy g() {
      return this.g;
   }

   public dch a(dca $$0) {
      return new dch(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dch a(bqa $$0) {
      return new dch(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dch a(dcy $$0) {
      return new dch(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dch h() {
      return new dch(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
