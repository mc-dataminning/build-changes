import java.util.UUID;

public abstract class bry {
   private final UUID h;
   protected wo a;
   protected float b;
   protected bry.a c;
   protected bry.b d;
   protected boolean e;
   protected boolean f;
   protected boolean g;

   public bry(UUID $$0, wo $$1, bry.a $$2, bry.b $$3) {
      this.h = $$0;
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.b = 1.0F;
   }

   public UUID h() {
      return this.h;
   }

   public wo i() {
      return this.a;
   }

   public void a(wo $$0) {
      this.a = $$0;
   }

   public float j() {
      return this.b;
   }

   public void a(float $$0) {
      this.b = $$0;
   }

   public bry.a k() {
      return this.c;
   }

   public void a(bry.a $$0) {
      this.c = $$0;
   }

   public bry.b l() {
      return this.d;
   }

   public void a(bry.b $$0) {
      this.d = $$0;
   }

   public boolean m() {
      return this.e;
   }

   public bry a(boolean $$0) {
      this.e = $$0;
      return this;
   }

   public boolean n() {
      return this.f;
   }

   public bry b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public bry c(boolean $$0) {
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

      public static bry.a a(String $$0) {
         for (bry.a $$1 : values()) {
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

      public static bry.b a(String $$0) {
         for (bry.b $$1 : values()) {
            if ($$1.f.equals($$0)) {
               return $$1;
            }
         }

         return a;
      }
   }
}
