import com.mojang.serialization.Codec;

public enum eqv implements bam {
   a(jb.b, 1, "ceiling"),
   b(jb.a, -1, "floor");

   public static final Codec<eqv> c = bam.a(eqv::values);
   private final jb d;
   private final int e;
   private final String f;

   private eqv(final jb $$0, final int $$1, final String $$2) {
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
