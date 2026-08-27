import com.mojang.serialization.Codec;

public enum dhd implements ayg {
   a("none", h.a),
   b("left_right", h.B),
   c("front_back", h.z);

   public static final Codec<dhd> d = ayg.a(dhd::values);
   private final String e;
   private final wi f;
   private final h g;

   private dhd(String $$0, h $$1) {
      this.e = $$0;
      this.f = wi.c("mirror." + $$0);
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

   public dit a(ij $$0) {
      ij.a $$1 = $$0.o();
      return (this != b || $$1 != ij.a.c) && (this != c || $$1 != ij.a.a) ? dit.a : dit.c;
   }

   public ij b(ij $$0) {
      if (this == c && $$0.o() == ij.a.a) {
         return $$0.g();
      } else {
         return this == b && $$0.o() == ij.a.c ? $$0.g() : $$0;
      }
   }

   public h a() {
      return this.g;
   }

   public wi b() {
      return this.f;
   }

   @Override
   public String c() {
      return this.e;
   }
}
