import com.mojang.serialization.Dynamic;

public final class cxd {
   private final String a;
   private final cww b;
   private final boolean c;
   private final bmz d;
   private final boolean e;
   private final cwv f;
   private final cxt g;

   public cxd(String $$0, cww $$1, boolean $$2, bmz $$3, boolean $$4, cwv $$5, cxt $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cxd a(Dynamic<?> $$0, cxt $$1) {
      cww $$2 = cww.a($$0.get("GameType").asInt(0));
      return new cxd(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bmz.a($$0x.byteValue())).result().orElse(bmz.c),
         $$0.get("allowCommands").asBoolean($$2 == cww.b),
         new cwv($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public cww b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bmz d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public cwv f() {
      return this.f;
   }

   public cxt g() {
      return this.g;
   }

   public cxd a(cww $$0) {
      return new cxd(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cxd a(bmz $$0) {
      return new cxd(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cxd a(cxt $$0) {
      return new cxd(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cxd h() {
      return new cxd(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
