import com.mojang.serialization.Dynamic;

public final class dkd {
   private final String a;
   private final djw b;
   private final boolean c;
   private final buq d;
   private final boolean e;
   private final djv f;
   private final dkx g;

   public dkd(String $$0, djw $$1, boolean $$2, buq $$3, boolean $$4, djv $$5, dkx $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dkd a(Dynamic<?> $$0, dkx $$1) {
      djw $$2 = djw.a($$0.get("GameType").asInt(0));
      return new dkd(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> buq.a($$0x.byteValue())).result().orElse(buq.c),
         $$0.get("allowCommands").asBoolean($$2 == djw.b),
         new djv($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public djw b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public buq d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public djv f() {
      return this.f;
   }

   public dkx g() {
      return this.g;
   }

   public dkd a(djw $$0) {
      return new dkd(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dkd a(buq $$0) {
      return new dkd(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dkd a(dkx $$0) {
      return new dkd(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dkd h() {
      return new dkd(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
