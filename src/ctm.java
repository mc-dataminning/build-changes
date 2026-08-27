import com.mojang.serialization.Dynamic;

public final class ctm {
   private final String a;
   private final ctf b;
   private final boolean c;
   private final bjs d;
   private final boolean e;
   private final cte f;
   private final cuc g;

   public ctm(String $$0, ctf $$1, boolean $$2, bjs $$3, boolean $$4, cte $$5, cuc $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static ctm a(Dynamic<?> $$0, cuc $$1) {
      ctf $$2 = ctf.a($$0.get("GameType").asInt(0));
      return new ctm(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bjs.a($$0x.byteValue())).result().orElse(bjs.c),
         $$0.get("allowCommands").asBoolean($$2 == ctf.b),
         new cte($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public ctf b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bjs d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cte f() {
      return this.f;
   }

   public cuc g() {
      return this.g;
   }

   public ctm a(ctf $$0) {
      return new ctm(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public ctm a(bjs $$0) {
      return new ctm(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public ctm a(cuc $$0) {
      return new ctm(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public ctm h() {
      return new ctm(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
