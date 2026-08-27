import java.util.UUID;

public abstract class bpq {
   private final UUID j;
   protected xe a;
   protected float b;
   protected bpq.a c;
   protected bpq.b d;
   protected ewu e;
   protected int f;
   protected boolean g;
   protected boolean h;
   protected boolean i;

   public bpq(UUID $$0, xe $$1, bpq.a $$2, bpq.b $$3, ewu $$4, int $$5) {
      this.j = $$0;
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.b = 1.0F;
   }

   public UUID h() {
      return this.j;
   }

   public xe i() {
      return this.a;
   }

   public void a(xe $$0) {
      this.a = $$0;
   }

   public float j() {
      return this.b;
   }

   public void a(float $$0) {
      this.b = $$0;
   }

   public bpq.a k() {
      return this.c;
   }

   public void a(bpq.a $$0) {
      this.c = $$0;
   }

   public bpq.b l() {
      return this.d;
   }

   public void a(bpq.b $$0) {
      this.d = $$0;
   }

   public boolean m() {
      return this.g;
   }

   public bpq a(boolean $$0) {
      this.g = $$0;
      return this;
   }

   public boolean n() {
      return this.h;
   }

   public bpq b(boolean $$0) {
      this.h = $$0;
      return this;
   }

   public bpq c(boolean $$0) {
      this.i = $$0;
      return this;
   }

   public boolean o() {
      return this.i;
   }

   public void a(ewu $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public ewu p() {
      return this.e;
   }

   public int q() {
      return this.f;
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

      public static bpq.a a(String $$0) {
         for (bpq.a $$1 : values()) {
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

      public static bpq.b a(String $$0) {
         for (bpq.b $$1 : values()) {
            if ($$1.f.equals($$0)) {
               return $$1;
            }
         }

         return a;
      }
   }
}
