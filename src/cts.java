import com.mojang.serialization.Dynamic;

public final class cts {
   private final String a;
   private final ctl b;
   private final boolean c;
   private final bjx d;
   private final boolean e;
   private final ctk f;
   private final cui g;

   public cts(String $$0, ctl $$1, boolean $$2, bjx $$3, boolean $$4, ctk $$5, cui $$6) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.g = $$6;
   }

   public static cts a(Dynamic<?> $$0, cui $$1) {
      ctl $$2 = ctl.a($$0.get("GameType").asInt(0));
      return new cts(
         $$0.get("LevelName").asString(""),
         $$2,
         $$0.get("hardcore").asBoolean(false),
         $$0.get("Difficulty").asNumber().map($$0x -> bjx.a($$0x.byteValue())).result().orElse(bjx.c),
         $$0.get("allowCommands").asBoolean($$2 == ctl.b),
         new ctk($$0.get("GameRules")),
         $$1
      );
   }

   public String a() {
      return this.a;
   }

   public ctl b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   public bjx d() {
      return this.d;
   }

   public boolean e() {
      return this.e;
   }

   public ctk f() {
      return this.f;
   }

   public cui g() {
      return this.g;
   }

   public cts a(ctl $$0) {
      return new cts(this.a, $$0, this.c, this.d, this.e, this.f, this.g);
   }

   public cts a(bjx $$0) {
      return new cts(this.a, this.b, this.c, $$0, this.e, this.f, this.g);
   }

   public cts a(cui $$0) {
      return new cts(this.a, this.b, this.c, this.d, this.e, this.f, $$0);
   }

   public cts h() {
      return new cts(this.a, this.b, this.c, this.d, this.e, this.f.b(), this.g);
   }
}
