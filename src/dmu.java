import com.mojang.serialization.Codec;

public enum dmu implements baf {
   a("none", h.a),
   b("left_right", h.B),
   c("front_back", h.z);

   public static final Codec<dmu> d = baf.a(dmu::values);
   private final String e;
   private final xh f;
   private final h g;

   private dmu(final String $$0, final h $$1) {
      this.e = $$0;
      this.f = xh.c("mirror." + $$0);
      this.g = $$1;
   }

   public int a(int $$0, int $$1) {
      int $$2 = $$1 / 2;
      int $$3 = $$0 > $$2 ? $$0 - $$1 : $$0;
      switch (this) {
         case b:
            return ($$2 - $$3 + $$1) % $$1;
         case c:
            return ($$1 - $$3) % $$1;
         default:
            return $$0;
      }
   }

   public dol a(jl $$0) {
      jl.a $$1 = $$0.o();
      return (this != b || $$1 != jl.a.c) && (this != c || $$1 != jl.a.a) ? dol.a : dol.c;
   }

   public jl b(jl $$0) {
      if (this == c && $$0.o() == jl.a.a) {
         return $$0.g();
      } else {
         return this == b && $$0.o() == jl.a.c ? $$0.g() : $$0;
      }
   }

   public h a() {
      return this.g;
   }

   public xh b() {
      return this.f;
   }

   @Override
   public String c() {
      return this.e;
   }
}
