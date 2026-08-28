import com.mojang.serialization.Dynamic;

public final class dkb {
   private final String a;
   private final dju b;
   private final boolean c;
   private final buo d;
   private final boolean e;
   private final djt f;
   private final dkv g;

   public dkb(String $$0, dju $$1, boolean $$2, buo $$3, boolean $$4, djt $$5, dkv $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dkb a(Dynamic<?> $$0, dkv $$1) {
      dju $$2 = dju.a($$0.get("GameType").asInt(0));
      return new dkb(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> buo.a($$0x.byteValue())).result().orElse(buo.c),
         $$0.get("allowCommands").asBoolean($$2 == dju.b),
         new djt($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dju b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public buo d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public djt f() {
      return this.f;
   }

   public dkv g() {
      return this.g;
   }

   public dkb a(dju $$0) {
      return new dkb(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dkb a(buo $$0) {
      return new dkb(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dkb a(dkv $$0) {
      return new dkb(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dkb h() {
      return new dkb(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
