import com.mojang.serialization.Dynamic;

public final class dbd {
   private final String a;
   private final daw b;
   private final boolean c;
   private final bpt d;
   private final boolean e;
   private final dav f;
   private final dbt g;

   public dbd(String $$0, daw $$1, boolean $$2, bpt $$3, boolean $$4, dav $$5, dbt $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dbd a(Dynamic<?> $$0, dbt $$1) {
      daw $$2 = daw.a($$0.get("GameType").asInt(0));
      return new dbd(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bpt.a($$0x.byteValue())).result().orElse(bpt.c),
         $$0.get("allowCommands").asBoolean($$2 == daw.b),
         new dav($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public daw b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bpt d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dav f() {
      return this.f;
   }

   public dbt g() {
      return this.g;
   }

   public dbd a(daw $$0) {
      return new dbd(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dbd a(bpt $$0) {
      return new dbd(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dbd a(dbt $$0) {
      return new dbd(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dbd h() {
      return new dbd(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
