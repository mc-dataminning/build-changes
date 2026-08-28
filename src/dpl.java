import com.mojang.serialization.Codec;

public enum dpl implements bba {
   a("none", h.a),
   b("left_right", h.B),
   c("front_back", h.z);

   public static final Codec<dpl> d = bba.a(dpl::values);
   private final String e;
   private final xv f;
   private final h g;

   private dpl(final String $$0, final h $$1) {
      this.e = $$0;
      this.f = xv.c("mirror." + $$0);
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

   public drc a(jm $$0) {
      jm.a $$1 = $$0.o();
      return (this != b || $$1 != jm.a.c) && (this != c || $$1 != jm.a.a) ? drc.a : drc.c;
   }

   public jm b(jm $$0) {
      if (this == c && $$0.o() == jm.a.a) {
         return $$0.g();
      } else {
         return this == b && $$0.o() == jm.a.c ? $$0.g() : $$0;
      }
   }

   public h a() {
      return this.g;
   }

   public xv b() {
      return this.f;
   }

   @Override
   public String c() {
      return this.e;
   }
}
