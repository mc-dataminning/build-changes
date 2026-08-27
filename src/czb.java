import com.mojang.serialization.Dynamic;

public final class czb {
   private final String a;
   private final cyu b;
   private final boolean c;
   private final bnx d;
   private final boolean e;
   private final cyt f;
   private final czr g;

   public czb(String $$0, cyu $$1, boolean $$2, bnx $$3, boolean $$4, cyt $$5, czr $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static czb a(Dynamic<?> $$0, czr $$1) {
      cyu $$2 = cyu.a($$0.get("GameType").asInt(0));
      return new czb(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bnx.a($$0x.byteValue())).result().orElse(bnx.c),
         $$0.get("allowCommands").asBoolean($$2 == cyu.b),
         new cyt($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cyu b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bnx d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cyt f() {
      return this.f;
   }

   public czr g() {
      return this.g;
   }

   public czb a(cyu $$0) {
      return new czb(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public czb a(bnx $$0) {
      return new czb(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public czb a(czr $$0) {
      return new czb(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public czb h() {
      return new czb(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
