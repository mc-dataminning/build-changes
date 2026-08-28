import com.mojang.serialization.Dynamic;

public final class dit {
   private final String a;
   private final dim b;
   private final boolean c;
   private final btv d;
   private final boolean e;
   private final dil f;
   private final djn g;

   public dit(String $$0, dim $$1, boolean $$2, btv $$3, boolean $$4, dil $$5, djn $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dit a(Dynamic<?> $$0, djn $$1) {
      dim $$2 = dim.a($$0.get("GameType").asInt(0));
      return new dit(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> btv.a($$0x.byteValue())).result().orElse(btv.c),
         $$0.get("allowCommands").asBoolean($$2 == dim.b),
         new dil($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dim b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public btv d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dil f() {
      return this.f;
   }

   public djn g() {
      return this.g;
   }

   public dit a(dim $$0) {
      return new dit(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dit a(btv $$0) {
      return new dit(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dit a(djn $$0) {
      return new dit(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dit h() {
      return new dit(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
