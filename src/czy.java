import com.mojang.serialization.Dynamic;

public final class czy {
   private final String a;
   private final czr b;
   private final boolean c;
   private final bon d;
   private final boolean e;
   private final czq f;
   private final dao g;

   public czy(String $$0, czr $$1, boolean $$2, bon $$3, boolean $$4, czq $$5, dao $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static czy a(Dynamic<?> $$0, dao $$1) {
      czr $$2 = czr.a($$0.get("GameType").asInt(0));
      return new czy(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bon.a($$0x.byteValue())).result().orElse(bon.c),
         $$0.get("allowCommands").asBoolean($$2 == czr.b),
         new czq($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public czr b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bon d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public czq f() {
      return this.f;
   }

   public dao g() {
      return this.g;
   }

   public czy a(czr $$0) {
      return new czy(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public czy a(bon $$0) {
      return new czy(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public czy a(dao $$0) {
      return new czy(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public czy h() {
      return new czy(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
