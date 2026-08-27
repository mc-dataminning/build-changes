import com.mojang.serialization.Codec;

public enum dew implements axq {
   a("none", h.a),
   b("left_right", h.B),
   c("front_back", h.z);

   public static final Codec<dew> d = axq.a(dew::values);
   private final String e;
   private final vu f;
   private final h g;

   private dew(String $$0, h $$1) {
      this.e = $$0;
      this.f = vu.c("mirror." + $$0);
      this.g = $$1;
   }

   public int a(int $$0, int $$1) {
      int $$2 = $$1 / 2;
      int $$3 = $$0 > $$2 ? $$0 - $$1 : $$0;
      switch (this) {
         case c:
            return ($$1 - $$3) % $$1;
         case b:
            return ($$2 - $$3 + $$1) % $$1;
         default:
            return $$0;
      }
   }

   public dgm a(ih $$0) {
      ih.a $$1 = $$0.o();
      return (this != b || $$1 != ih.a.c) && (this != c || $$1 != ih.a.a) ? dgm.a : dgm.c;
   }

   public ih b(ih $$0) {
      if (this == c && $$0.o() == ih.a.a) {
         return $$0.g();
      } else {
         return this == b && $$0.o() == ih.a.c ? $$0.g() : $$0;
      }
   }

   public h a() {
      return this.g;
   }

   public vu b() {
      return this.f;
   }

   @Override
   public String c() {
      return this.e;
   }
}
