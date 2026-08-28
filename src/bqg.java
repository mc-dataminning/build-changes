import java.util.UUID;

public abstract class bqg {
   private final UUID h;
   protected wy a;
   protected float b;
   protected bqg.a c;
   protected bqg.b d;
   protected boolean e;
   protected boolean f;
   protected boolean g;

   public bqg(UUID $$0, wy $$1, bqg.a $$2, bqg.b $$3) {
      this.h = $$0;
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.b = 1.0F;
   }

   public UUID h() {
      return this.h;
   }

   public wy i() {
      return this.a;
   }

   public void a(wy $$0) {
      this.a = $$0;
   }

   public float j() {
      return this.b;
   }

   public void a(float $$0) {
      this.b = $$0;
   }

   public bqg.a k() {
      return this.c;
   }

   public void a(bqg.a $$0) {
      this.c = $$0;
   }

   public bqg.b l() {
      return this.d;
   }

   public void a(bqg.b $$0) {
      this.d = $$0;
   }

   public boolean m() {
      return this.e;
   }

   public bqg a(boolean $$0) {
      this.e = $$0;
      return this;
   }

   public boolean n() {
      return this.f;
   }

   public bqg b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public bqg c(boolean $$0) {
      this.g = $$0;
      return this;
   }

   public boolean o() {
      return this.g;
   }

   public static enum a {
      a("pink", n.m),
      b("blue", n.j),
      c("red", n.e),
      d("green", n.k),
      e("yellow", n.o),
      f("purple", n.b),
      g("white", n.p);

      private final String h;
      private final n i;

      private a(final String $$0, final n $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public n a() {
         return this.i;
      }

      public String b() {
         return this.h;
      }

      public static bqg.a a(String $$0) {
         for (bqg.a $$1 : values()) {
            if ($$1.h.equals($$0)) {
               return $$1;
            }
         }

         return g;
      }
   }

   public static enum b {
      a("progress"),
      b("notched_6"),
      c("notched_10"),
      d("notched_12"),
      e("notched_20");

      private final String f;

      private b(final String $$0) {
         this.f = $$0;
      }

      public String a() {
         return this.f;
      }

      public static bqg.b a(String $$0) {
         for (bqg.b $$1 : values()) {
            if ($$1.f.equals($$0)) {
               return $$1;
            }
         }

         return a;
      }
   }
}
