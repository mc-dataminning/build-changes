import com.mojang.serialization.Dynamic;

public final class dcj {
   private final String a;
   private final dcc b;
   private final boolean c;
   private final bqd d;
   private final boolean e;
   private final dcb f;
   private final dda g;

   public dcj(String $$0, dcc $$1, boolean $$2, bqd $$3, boolean $$4, dcb $$5, dda $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dcj a(Dynamic<?> $$0, dda $$1) {
      dcc $$2 = dcc.a($$0.get("GameType").asInt(0));
      return new dcj(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bqd.a($$0x.byteValue())).result().orElse(bqd.c),
         $$0.get("allowCommands").asBoolean($$2 == dcc.b),
         new dcb($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dcc b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bqd d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dcb f() {
      return this.f;
   }

   public dda g() {
      return this.g;
   }

   public dcj a(dcc $$0) {
      return new dcj(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dcj a(bqd $$0) {
      return new dcj(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dcj a(dda $$0) {
      return new dcj(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dcj h() {
      return new dcj(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
