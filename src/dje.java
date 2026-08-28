import com.mojang.serialization.Dynamic;

public final class dje {
   private final String a;
   private final dix b;
   private final boolean c;
   private final bua d;
   private final boolean e;
   private final diw f;
   private final djy g;

   public dje(String $$0, dix $$1, boolean $$2, bua $$3, boolean $$4, diw $$5, djy $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dje a(Dynamic<?> $$0, djy $$1) {
      dix $$2 = dix.a($$0.get("GameType").asInt(0));
      return new dje(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bua.a($$0x.byteValue())).result().orElse(bua.c),
         $$0.get("allowCommands").asBoolean($$2 == dix.b),
         new diw($$1.b(), $$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dix b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bua d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public diw f() {
      return this.f;
   }

   public djy g() {
      return this.g;
   }

   public dje a(dix $$0) {
      return new dje(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dje a(bua $$0) {
      return new dje(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dje a(djy $$0) {
      return new dje(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dje h() {
      return new dje(this.a, this.b, this.c, this.d, this.e, this.f.a(this.g.b()), this.g);
   }
}
