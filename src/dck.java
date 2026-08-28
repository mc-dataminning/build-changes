import com.mojang.serialization.Dynamic;

public final class dck {
   private final String a;
   private final dcd b;
   private final boolean c;
   private final bqe d;
   private final boolean e;
   private final dcc f;
   private final ddb g;

   public dck(String $$0, dcd $$1, boolean $$2, bqe $$3, boolean $$4, dcc $$5, ddb $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dck a(Dynamic<?> $$0, ddb $$1) {
      dcd $$2 = dcd.a($$0.get("GameType").asInt(0));
      return new dck(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bqe.a($$0x.byteValue())).result().orElse(bqe.c),
         $$0.get("allowCommands").asBoolean($$2 == dcd.b),
         new dcc($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dcd b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bqe d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dcc f() {
      return this.f;
   }

   public ddb g() {
      return this.g;
   }

   public dck a(dcd $$0) {
      return new dck(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dck a(bqe $$0) {
      return new dck(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dck a(ddb $$0) {
      return new dck(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dck h() {
      return new dck(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
