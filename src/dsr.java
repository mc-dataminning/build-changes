import com.mojang.serialization.Codec;

public enum dsr implements bax {
   a("none", h.a),
   b("left_right", h.B),
   c("front_back", h.z);

   public static final Codec<dsr> d = bax.a(dsr::values);
   @Deprecated
   public static final Codec<dsr> e = azg.c(dsr::valueOf);
   private final String f;
   private final xg g;
   private final h h;

   private dsr(final String $$0, final h $$1) {
      this.f = $$0;
      this.g = xg.c("mirror." + $$0);
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

   public dui a(jc $$0) {
      jc.a $$1 = $$0.o();
      return (this != b || $$1 != jc.a.c) && (this != c || $$1 != jc.a.a) ? dui.a : dui.c;
   }

   public jc b(jc $$0) {
      if (this == c && $$0.o() == jc.a.a) {
         return $$0.g();
      } else {
         return this == b && $$0.o() == jc.a.c ? $$0.g() : $$0;
      }
   }

   public h a() {
      return this.h;
   }

   public xg b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.f;
   }
}
