import com.mojang.serialization.Dynamic;

public final class dca {
   private final String a;
   private final dbt b;
   private final boolean c;
   private final bqp d;
   private final boolean e;
   private final dbs f;
   private final dcq g;

   public dca(String $$0, dbt $$1, boolean $$2, bqp $$3, boolean $$4, dbs $$5, dcq $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dca a(Dynamic<?> $$0, dcq $$1) {
      dbt $$2 = dbt.a($$0.get("GameType").asInt(0));
      return new dca(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bqp.a($$0x.byteValue())).result().orElse(bqp.c),
         $$0.get("allowCommands").asBoolean($$2 == dbt.b),
         new dbs($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dbt b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bqp d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dbs f() {
      return this.f;
   }

   public dcq g() {
      return this.g;
   }

   public dca a(dbt $$0) {
      return new dca(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dca a(bqp $$0) {
      return new dca(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dca a(dcq $$0) {
      return new dca(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dca h() {
      return new dca(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
