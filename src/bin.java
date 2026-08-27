import java.util.UUID;

public abstract class bin {
   private final UUID h;
   protected ur a;
   protected float b;
   protected bin.a c;
   protected bin.b d;
   protected boolean e;
   protected boolean f;
   protected boolean g;

   public bin(UUID $$0, ur $$1, bin.a $$2, bin.b $$3) {
      this.h = $$0;
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.b = 1.0F;
   }

   public UUID i() {
      return this.h;
   }

   public ur j() {
      return this.a;
   }

   public void a(ur $$0) {
      this.a = $$0;
   }

   public float k() {
      return this.b;
   }

   public void a(float $$0) {
      this.b = $$0;
   }

   public bin.a l() {
      return this.c;
   }

   public void a(bin.a $$0) {
      this.c = $$0;
   }

   public bin.b m() {
      return this.d;
   }

   public void a(bin.b $$0) {
      this.d = $$0;
   }

   public boolean n() {
      return this.e;
   }

   public bin a(boolean $$0) {
      this.e = $$0;
      return this;
   }

   public boolean o() {
      return this.f;
   }

   public bin b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public bin c(boolean $$0) {
      this.g = $$0;
      return this;
   }

   public boolean p() {
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

      private a(String $$0, n $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public n a() {
         return this.i;
      }

      public String b() {
         return this.h;
      }

      public static bin.a a(String $$0) {
         for (bin.a $$1 : values()) {
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

      private b(String $$0) {
         this.f = $$0;
      }

      public String a() {
         return this.f;
      }

      public static bin.b a(String $$0) {
         for (bin.b $$1 : values()) {
            if ($$1.f.equals($$0)) {
               return $$1;
            }
         }

         return a;
      }
   }
}
