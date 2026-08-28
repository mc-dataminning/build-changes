import java.util.UUID;

public abstract class bsa {
   private final UUID h;
   protected wp a;
   protected float b;
   protected bsa.a c;
   protected bsa.b d;
   protected boolean e;
   protected boolean f;
   protected boolean g;

   public bsa(UUID $$0, wp $$1, bsa.a $$2, bsa.b $$3) {
      this.h = $$0;
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.b = 1.0F;
   }

   public UUID h() {
      return this.h;
   }

   public wp i() {
      return this.a;
   }

   public void a(wp $$0) {
      this.a = $$0;
   }

   public float j() {
      return this.b;
   }

   public void a(float $$0) {
      this.b = $$0;
   }

   public bsa.a k() {
      return this.c;
   }

   public void a(bsa.a $$0) {
      this.c = $$0;
   }

   public bsa.b l() {
      return this.d;
   }

   public void a(bsa.b $$0) {
      this.d = $$0;
   }

   public boolean m() {
      return this.e;
   }

   public bsa a(boolean $$0) {
      this.e = $$0;
      return this;
   }

   public boolean n() {
      return this.f;
   }

   public bsa b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public bsa c(boolean $$0) {
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

      public static bsa.a a(String $$0) {
         for (bsa.a $$1 : values()) {
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

      public static bsa.b a(String $$0) {
         for (bsa.b $$1 : values()) {
            if ($$1.f.equals($$0)) {
               return $$1;
            }
         }

         return a;
      }
   }
}
