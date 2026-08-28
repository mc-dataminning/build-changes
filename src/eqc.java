import com.mojang.serialization.Codec;

public enum eqc implements bak {
   a(jb.b, 1, "ceiling"),
   b(jb.a, -1, "floor");

   public static final Codec<eqc> c = bak.a(eqc::values);
   private final jb d;
   private final int e;
   private final String f;

   private eqc(final jb $$0, final int $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public jb a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   @Override
   public String c() {
      return this.f;
   }
}
