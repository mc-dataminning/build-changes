import com.mojang.serialization.Dynamic;

public final class ctc {
   private final String a;
   private final csv b;
   private final boolean c;
   private final bji d;
   private final boolean e;
   private final csu f;
   private final cts g;

   public ctc(String $$0, csv $$1, boolean $$2, bji $$3, boolean $$4, csu $$5, cts $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static ctc a(Dynamic<?> $$0, cts $$1) {
      csv $$2 = csv.a($$0.get("GameType").asInt(0));
      return new ctc(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bji.a($$0x.byteValue())).result().orElse(bji.c),
         $$0.get("allowCommands").asBoolean($$2 == csv.b),
         new csu($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public csv b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bji d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public csu f() {
      return this.f;
   }

   public cts g() {
      return this.g;
   }

   public ctc a(csv $$0) {
      return new ctc(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public ctc a(bji $$0) {
      return new ctc(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public ctc a(cts $$0) {
      return new ctc(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public ctc h() {
      return new ctc(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
