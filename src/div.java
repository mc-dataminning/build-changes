import com.mojang.serialization.Codec;

public enum div implements ayx {
   a("none", h.a),
   b("left_right", h.B),
   c("front_back", h.z);

   public static final Codec<div> d = ayx.a(div::values);
   private final String e;
   private final wx f;
   private final h g;

   private div(String $$0, h $$1) {
      this.e = $$0;
      this.f = wx.c("mirror." + $$0);
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

   public dkl a(it $$0) {
      it.a $$1 = $$0.o();
      return (this != b || $$1 != it.a.c) && (this != c || $$1 != it.a.a) ? dkl.a : dkl.c;
   }

   public it b(it $$0) {
      if (this == c && $$0.o() == it.a.a) {
         return $$0.g();
      } else {
         return this == b && $$0.o() == it.a.c ? $$0.g() : $$0;
      }
   }

   public h a() {
      return this.g;
   }

   public wx b() {
      return this.f;
   }

   @Override
   public String c() {
      return this.e;
   }
}
