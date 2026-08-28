import com.mojang.serialization.Dynamic;

public final class dkn {
   private final String a;
   private final dkg b;
   private final boolean c;
   private final buz d;
   private final boolean e;
   private final dkf f;
   private final dlh g;

   public dkn(String $$0, dkg $$1, boolean $$2, buz $$3, boolean $$4, dkf $$5, dlh $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dkn a(Dynamic<?> $$0, dlh $$1) {
      dkg $$2 = dkg.a($$0.get("GameType").asInt(0));
      return new dkn(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> buz.a($$0x.byteValue())).result().orElse(buz.c),
         $$0.get("allowCommands").asBoolean($$2 == dkg.b),
         new dkf($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dkg b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public buz d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dkf f() {
      return this.f;
   }

   public dlh g() {
      return this.g;
   }

   public dkn a(dkg $$0) {
      return new dkn(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dkn a(buz $$0) {
      return new dkn(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dkn a(dlh $$0) {
      return new dkn(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dkn h() {
      return new dkn(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
