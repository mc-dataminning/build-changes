import com.mojang.serialization.Dynamic;

public final class dah {
   private final String a;
   private final daa b;
   private final boolean c;
   private final bpj d;
   private final boolean e;
   private final czz f;
   private final dax g;

   public dah(String $$0, daa $$1, boolean $$2, bpj $$3, boolean $$4, czz $$5, dax $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dah a(Dynamic<?> $$0, dax $$1) {
      daa $$2 = daa.a($$0.get("GameType").asInt(0));
      return new dah(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bpj.a($$0x.byteValue())).result().orElse(bpj.c),
         $$0.get("allowCommands").asBoolean($$2 == daa.b),
         new czz($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public daa b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bpj d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public czz f() {
      return this.f;
   }

   public dax g() {
      return this.g;
   }

   public dah a(daa $$0) {
      return new dah(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dah a(bpj $$0) {
      return new dah(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dah a(dax $$0) {
      return new dah(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dah h() {
      return new dah(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
