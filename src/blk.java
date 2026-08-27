import java.util.UUID;

public abstract class blk {
   private final UUID h;
   protected vq a;
   protected float b;
   protected blk.a c;
   protected blk.b d;
   protected boolean e;
   protected boolean f;
   protected boolean g;

   public blk(UUID $$0, vq $$1, blk.a $$2, blk.b $$3) {
      this.h = $$0;
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.b = 1.0F;
   }

   public UUID i() {
      return this.h;
   }

   public vq j() {
      return this.a;
   }

   public void a(vq $$0) {
      this.a = $$0;
   }

   public float k() {
      return this.b;
   }

   public void a(float $$0) {
      this.b = $$0;
   }

   public blk.a l() {
      return this.c;
   }

   public void a(blk.a $$0) {
      this.c = $$0;
   }

   public blk.b m() {
      return this.d;
   }

   public void a(blk.b $$0) {
      this.d = $$0;
   }

   public boolean n() {
      return this.e;
   }

   public blk a(boolean $$0) {
      this.e = $$0;
      return this;
   }

   public boolean o() {
      return this.f;
   }

   public blk b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public blk c(boolean $$0) {
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

      public static blk.a a(String $$0) {
         for (blk.a $$1 : values()) {
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

      public static blk.b a(String $$0) {
         for (blk.b $$1 : values()) {
            if ($$1.f.equals($$0)) {
               return $$1;
            }
         }

         return a;
      }
   }
}
