import com.mojang.serialization.Dynamic;

public final class cxf {
   private final String a;
   private final cwy b;
   private final boolean c;
   private final bna d;
   private final boolean e;
   private final cwx f;
   private final cxv g;

   public cxf(String $$0, cwy $$1, boolean $$2, bna $$3, boolean $$4, cwx $$5, cxv $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cxf a(Dynamic<?> $$0, cxv $$1) {
      cwy $$2 = cwy.a($$0.get("GameType").asInt(0));
      return new cxf(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bna.a($$0x.byteValue())).result().orElse(bna.c),
         $$0.get("allowCommands").asBoolean($$2 == cwy.b),
         new cwx($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cwy b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bna d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cwx f() {
      return this.f;
   }

   public cxv g() {
      return this.g;
   }

   public cxf a(cwy $$0) {
      return new cxf(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cxf a(bna $$0) {
      return new cxf(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cxf a(cxv $$0) {
      return new cxf(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cxf h() {
      return new cxf(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
