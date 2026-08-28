import com.mojang.serialization.Codec;

public enum dmg implements azz {
   a("none", h.a),
   b("left_right", h.B),
   c("front_back", h.z);

   public static final Codec<dmg> d = azz.a(dmg::values);
   private final String e;
   private final xd f;
   private final h g;

   private dmg(final String $$0, final h $$1) {
      this.e = $$0;
      this.f = xd.c("mirror." + $$0);
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

   public dnx a(jj $$0) {
      jj.a $$1 = $$0.o();
      return (this != b || $$1 != jj.a.c) && (this != c || $$1 != jj.a.a) ? dnx.a : dnx.c;
   }

   public jj b(jj $$0) {
      if (this == c && $$0.o() == jj.a.a) {
         return $$0.g();
      } else {
         return this == b && $$0.o() == jj.a.c ? $$0.g() : $$0;
      }
   }

   public h a() {
      return this.g;
   }

   public xd b() {
      return this.f;
   }

   @Override
   public String c() {
      return this.e;
   }
}
