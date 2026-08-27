import com.mojang.serialization.Dynamic;

public final class dce {
   private final String a;
   private final dbx b;
   private final boolean c;
   private final bpx d;
   private final boolean e;
   private final dbw f;
   private final dcu g;

   public dce(String $$0, dbx $$1, boolean $$2, bpx $$3, boolean $$4, dbw $$5, dcu $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static dce a(Dynamic<?> $$0, dcu $$1) {
      dbx $$2 = dbx.a($$0.get("GameType").asInt(0));
      return new dce(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bpx.a($$0x.byteValue())).result().orElse(bpx.c),
         $$0.get("allowCommands").asBoolean($$2 == dbx.b),
         new dbw($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public dbx b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bpx d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public dbw f() {
      return this.f;
   }

   public dcu g() {
      return this.g;
   }

   public dce a(dbx $$0) {
      return new dce(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public dce a(bpx $$0) {
      return new dce(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public dce a(dcu $$0) {
      return new dce(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public dce h() {
      return new dce(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
