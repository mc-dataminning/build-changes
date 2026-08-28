import com.mojang.serialization.Codec;

public enum dru implements bak {
   a("none", h.a),
   b("left_right", h.B),
   c("front_back", h.z);

   public static final Codec<dru> d = bak.a(dru::values);
   @Deprecated
   public static final Codec<dru> e = ayu.c(dru::valueOf);
   private final String f;
   private final wy g;
   private final h h;

   private dru(final String $$0, final h $$1) {
      this.f = $$0;
      this.g = wy.c("mirror." + $$0);
      this.h = $$1;
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

   public dtl a(jb $$0) {
      jb.a $$1 = $$0.o();
      return (this != b || $$1 != jb.a.c) && (this != c || $$1 != jb.a.a) ? dtl.a : dtl.c;
   }

   public jb b(jb $$0) {
      if (this == c && $$0.o() == jb.a.a) {
         return $$0.g();
      } else {
         return this == b && $$0.o() == jb.a.c ? $$0.g() : $$0;
      }
   }

   public h a() {
      return this.h;
   }

   public wy b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.f;
   }
}
