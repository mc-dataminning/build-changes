import com.mojang.serialization.Dynamic;

public final class dhm {
   private final String a;
   private final dhf b;
   private final boolean c;
   private final btg d;
   private final boolean e;
   private final dhe f;
   private final dif g;

   public dhm(String $$0, dhf $$1, boolean $$2, btg $$3, boolean $$4, dhe $$5, dif $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dhm a(Dynamic<?> $$0, dif $$1) {
      dhf $$2 = dhf.a($$0.get("GameType").asInt(0));
      return new dhm(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> btg.a($$0x.byteValue())).result().orElse(btg.c),
         $$0.get("allowCommands").asBoolean($$2 == dhf.b),
         new dhe($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dhf b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public btg d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dhe f() {
      return this.f;
   }

   public dif g() {
      return this.g;
   }

   public dhm a(dhf $$0) {
      return new dhm(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dhm a(btg $$0) {
      return new dhm(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dhm a(dif $$0) {
      return new dhm(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dhm h() {
      return new dhm(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
