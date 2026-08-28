import com.mojang.serialization.Codec;

public enum ekl implements baf {
   a(jl.b, 1, "ceiling"),
   b(jl.a, -1, "floor");

   public static final Codec<ekl> c = baf.a(ekl::values);
   private final jl d;
   private final int e;
   private final String f;

   private ekl(final jl $$0, final int $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public jl a() {
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
