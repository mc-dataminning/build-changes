import com.mojang.serialization.Codec;

public enum cxh implements ash {
   a("none", h.a),
   b("left_right", h.B),
   c("front_back", h.z);

   public static final Codec<cxh> d = ash.a(cxh::values);
   private final String e;
   private final tf f;
   private final h g;

   private cxh(String $$0, h $$1) {
      this.e = $$0;
      this.f = tf.c("mirror." + $$0);
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

   public cyy a(ha $$0) {
      ha.a $$1 = $$0.o();
      return (this != b || $$1 != ha.a.c) && (this != c || $$1 != ha.a.a) ? cyy.a : cyy.c;
   }

   public ha b(ha $$0) {
      if (this == c && $$0.o() == ha.a.a) {
         return $$0.g();
      } else {
         return this == b && $$0.o() == ha.a.c ? $$0.g() : $$0;
      }
   }

   public h a() {
      return this.g;
   }

   public tf b() {
      return this.f;
   }

   @Override
   public String c() {
      return this.e;
   }
}
