import com.mojang.serialization.Dynamic;

public final class dgl {
   private final String a;
   private final dge b;
   private final boolean c;
   private final bsg d;
   private final boolean e;
   private final dgd f;
   private final dhe g;

   public dgl(String $$0, dge $$1, boolean $$2, bsg $$3, boolean $$4, dgd $$5, dhe $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dgl a(Dynamic<?> $$0, dhe $$1) {
      dge $$2 = dge.a($$0.get("GameType").asInt(0));
      return new dgl(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bsg.a($$0x.byteValue())).result().orElse(bsg.c),
         $$0.get("allowCommands").asBoolean($$2 == dge.b),
         new dgd($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dge b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bsg d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dgd f() {
      return this.f;
   }

   public dhe g() {
      return this.g;
   }

   public dgl a(dge $$0) {
      return new dgl(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dgl a(bsg $$0) {
      return new dgl(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dgl a(dhe $$0) {
      return new dgl(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dgl h() {
      return new dgl(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
