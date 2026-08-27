import java.util.UUID;

public abstract class bmb {
   private final UUID h;
   protected vs a;
   protected float b;
   protected bmb.a c;
   protected bmb.b d;
   protected boolean e;
   protected boolean f;
   protected boolean g;

   public bmb(UUID $$0, vs $$1, bmb.a $$2, bmb.b $$3) {
      this.h = $$0;
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.b = 1.0F;
   }

   public UUID i() {
      return this.h;
   }

   public vs j() {
      return this.a;
   }

   public void a(vs $$0) {
      this.a = $$0;
   }

   public float k() {
      return this.b;
   }

   public void a(float $$0) {
      this.b = $$0;
   }

   public bmb.a l() {
      return this.c;
   }

   public void a(bmb.a $$0) {
      this.c = $$0;
   }

   public bmb.b m() {
      return this.d;
   }

   public void a(bmb.b $$0) {
      this.d = $$0;
   }

   public boolean n() {
      return this.e;
   }

   public bmb a(boolean $$0) {
      this.e = $$0;
      return this;
   }

   public boolean o() {
      return this.f;
   }

   public bmb b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public bmb c(boolean $$0) {
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

      public static bmb.a a(String $$0) {
         for (bmb.a $$1 : values()) {
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

      public static bmb.b a(String $$0) {
         for (bmb.b $$1 : values()) {
            if ($$1.f.equals($$0)) {
               return $$1;
            }
         }

         return a;
      }
   }
}
