import com.mojang.serialization.Dynamic;

public final class dcy {
   private final String a;
   private final dcr b;
   private final boolean c;
   private final bqn d;
   private final boolean e;
   private final dcq f;
   private final ddp g;

   public dcy(String $$0, dcr $$1, boolean $$2, bqn $$3, boolean $$4, dcq $$5, ddp $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dcy a(Dynamic<?> $$0, ddp $$1) {
      dcr $$2 = dcr.a($$0.get("GameType").asInt(0));
      return new dcy(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bqn.a($$0x.byteValue())).result().orElse(bqn.c),
         $$0.get("allowCommands").asBoolean($$2 == dcr.b),
         new dcq($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dcr b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bqn d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dcq f() {
      return this.f;
   }

   public ddp g() {
      return this.g;
   }

   public dcy a(dcr $$0) {
      return new dcy(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dcy a(bqn $$0) {
      return new dcy(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dcy a(ddp $$0) {
      return new dcy(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dcy h() {
      return new dcy(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
