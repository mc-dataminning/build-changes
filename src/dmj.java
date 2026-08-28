import com.mojang.serialization.Codec;

public enum dmj implements bab {
   a("none", h.a),
   b("left_right", h.B),
   c("front_back", h.z);

   public static final Codec<dmj> d = bab.a(dmj::values);
   private final String e;
   private final xe f;
   private final h g;

   private dmj(final String $$0, final h $$1) {
      this.e = $$0;
      this.f = xe.c("mirror." + $$0);
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

   public doa a(jk $$0) {
      jk.a $$1 = $$0.o();
      return (this != b || $$1 != jk.a.c) && (this != c || $$1 != jk.a.a) ? doa.a : doa.c;
   }

   public jk b(jk $$0) {
      if (this == c && $$0.o() == jk.a.a) {
         return $$0.g();
      } else {
         return this == b && $$0.o() == jk.a.c ? $$0.g() : $$0;
      }
   }

   public h a() {
      return this.g;
   }

   public xe b() {
      return this.f;
   }

   @Override
   public String c() {
      return this.e;
   }
}
