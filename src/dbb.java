import com.mojang.serialization.Dynamic;

public final class dbb {
   private final String a;
   private final dau b;
   private final boolean c;
   private final bpr d;
   private final boolean e;
   private final dat f;
   private final dbr g;

   public dbb(String $$0, dau $$1, boolean $$2, bpr $$3, boolean $$4, dat $$5, dbr $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dbb a(Dynamic<?> $$0, dbr $$1) {
      dau $$2 = dau.a($$0.get("GameType").asInt(0));
      return new dbb(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bpr.a($$0x.byteValue())).result().orElse(bpr.c),
         $$0.get("allowCommands").asBoolean($$2 == dau.b),
         new dat($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dau b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bpr d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dat f() {
      return this.f;
   }

   public dbr g() {
      return this.g;
   }

   public dbb a(dau $$0) {
      return new dbb(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dbb a(bpr $$0) {
      return new dbb(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dbb a(dbr $$0) {
      return new dbb(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dbb h() {
      return new dbb(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
