import com.mojang.serialization.Dynamic;

public final class dcb {
   private final String a;
   private final dbu b;
   private final boolean c;
   private final bqq d;
   private final boolean e;
   private final dbt f;
   private final dcr g;

   public dcb(String $$0, dbu $$1, boolean $$2, bqq $$3, boolean $$4, dbt $$5, dcr $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dcb a(Dynamic<?> $$0, dcr $$1) {
      dbu $$2 = dbu.a($$0.get("GameType").asInt(0));
      return new dcb(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bqq.a($$0x.byteValue())).result().orElse(bqq.c),
         $$0.get("allowCommands").asBoolean($$2 == dbu.b),
         new dbt($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dbu b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bqq d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dbt f() {
      return this.f;
   }

   public dcr g() {
      return this.g;
   }

   public dcb a(dbu $$0) {
      return new dcb(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dcb a(bqq $$0) {
      return new dcb(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dcb a(dcr $$0) {
      return new dcb(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dcb h() {
      return new dcb(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
