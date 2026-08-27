import com.mojang.serialization.Codec;

public enum bol implements axc {
   a("monster", 70, false, false, 128),
   b("creature", 10, true, true, 128),
   c("ambient", 15, true, false, 128),
   d("axolotls", 5, true, false, 128),
   e("underground_water_creature", 5, true, false, 128),
   f("water_creature", 5, true, false, 128),
   g("water_ambient", 20, true, false, 64),
   h("misc", -1, true, true, 128);

   public static final Codec<bol> i = axc.a(bol::values);
   private final int j;
   private final boolean k;
   private final boolean l;
   private final String m;
   private final int n = 32;
   private final int o;

   private bol(String $$0, int $$1, boolean $$2, boolean $$3, int $$4) {
      this.m = $$0;
      this.j = $$1;
      this.k = $$2;
      this.l = $$3;
      this.o = $$4;
   }

   public String a() {
      return this.m;
   }

   @Override
   public String c() {
      return this.m;
   }

   public int b() {
      return this.j;
   }

   public boolean d() {
      return this.k;
   }

   public boolean e() {
      return this.l;
   }

   public int f() {
      return this.o;
   }

   public int g() {
      return 32;
   }
}
