import com.mojang.serialization.Dynamic;

public final class csj {
   private final String a;
   private final csc b;
   private final boolean c;
   private final biy d;
   private final boolean e;
   private final csb f;
   private final csy g;

   public csj(String $$0, csc $$1, boolean $$2, biy $$3, boolean $$4, csb $$5, csy $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static csj a(Dynamic<?> $$0, csy $$1) {
      csc $$2 = csc.a($$0.get("GameType").asInt(0));
      return new csj(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> biy.a($$0x.byteValue())).result().orElse(biy.c),
         $$0.get("allowCommands").asBoolean($$2 == csc.b),
         new csb($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public csc b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public biy d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public csb f() {
      return this.f;
   }

   public csy g() {
      return this.g;
   }

   public csj a(csc $$0) {
      return new csj(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public csj a(biy $$0) {
      return new csj(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public csj a(csy $$0) {
      return new csj(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public csj h() {
      return new csj(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
