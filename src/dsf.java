import com.mojang.serialization.Codec;

public enum dsf implements bam {
   a("none", h.a),
   b("left_right", h.B),
   c("front_back", h.z);

   public static final Codec<dsf> d = bam.a(dsf::values);
   @Deprecated
   public static final Codec<dsf> e = ayw.c(dsf::valueOf);
   private final String f;
   private final xa g;
   private final h h;

   private dsf(final String $$0, final h $$1) {
      this.f = $$0;
      this.g = xa.c("mirror." + $$0);
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

   public dtw a(jb $$0) {
      jb.a $$1 = $$0.o();
      return (this != b || $$1 != jb.a.c) && (this != c || $$1 != jb.a.a) ? dtw.a : dtw.c;
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

   public xa b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.f;
   }
}
