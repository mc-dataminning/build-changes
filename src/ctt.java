import com.mojang.serialization.Dynamic;

public final class ctt {
   private final String a;
   private final ctm b;
   private final boolean c;
   private final bjy d;
   private final boolean e;
   private final ctl f;
   private final cuj g;

   public ctt(String $$0, ctm $$1, boolean $$2, bjy $$3, boolean $$4, ctl $$5, cuj $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static ctt a(Dynamic<?> $$0, cuj $$1) {
      ctm $$2 = ctm.a($$0.get("GameType").asInt(0));
      return new ctt(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bjy.a($$0x.byteValue())).result().orElse(bjy.c),
         $$0.get("allowCommands").asBoolean($$2 == ctm.b),
         new ctl($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public ctm b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bjy d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public ctl f() {
      return this.f;
   }

   public cuj g() {
      return this.g;
   }

   public ctt a(ctm $$0) {
      return new ctt(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public ctt a(bjy $$0) {
      return new ctt(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public ctt a(cuj $$0) {
      return new ctt(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public ctt h() {
      return new ctt(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
