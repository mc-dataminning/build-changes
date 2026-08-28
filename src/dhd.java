import com.mojang.serialization.Dynamic;

public final class dhd {
   private final String a;
   private final dgw b;
   private final boolean c;
   private final bsv d;
   private final boolean e;
   private final dgv f;
   private final dhx g;

   public dhd(String $$0, dgw $$1, boolean $$2, bsv $$3, boolean $$4, dgv $$5, dhx $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dhd a(Dynamic<?> $$0, dhx $$1) {
      dgw $$2 = dgw.a($$0.get("GameType").asInt(0));
      return new dhd(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bsv.a($$0x.byteValue())).result().orElse(bsv.c),
         $$0.get("allowCommands").asBoolean($$2 == dgw.b),
         new dgv($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dgw b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bsv d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dgv f() {
      return this.f;
   }

   public dhx g() {
      return this.g;
   }

   public dhd a(dgw $$0) {
      return new dhd(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dhd a(bsv $$0) {
      return new dhd(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dhd a(dhx $$0) {
      return new dhd(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dhd h() {
      return new dhd(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
