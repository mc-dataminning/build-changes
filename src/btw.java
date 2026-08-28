import com.mojang.serialization.Codec;
import java.util.UUID;

public abstract class btw {
   private final UUID h;
   protected wy a;
   protected float b;
   protected btw.a c;
   protected btw.b d;
   protected boolean e;
   protected boolean f;
   protected boolean g;

   public btw(UUID $$0, wy $$1, btw.a $$2, btw.b $$3) {
      this.h = $$0;
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.b = 1.0F;
   }

   public UUID i() {
      return this.h;
   }

   public wy j() {
      return this.a;
   }

   public void a(wy $$0) {
      this.a = $$0;
   }

   public float k() {
      return this.b;
   }

   public void a(float $$0) {
      this.b = $$0;
   }

   public btw.a l() {
      return this.c;
   }

   public void a(btw.a $$0) {
      this.c = $$0;
   }

   public btw.b m() {
      return this.d;
   }

   public void a(btw.b $$0) {
      this.d = $$0;
   }

   public boolean n() {
      return this.e;
   }

   public btw a(boolean $$0) {
      this.e = $$0;
      return this;
   }

   public boolean o() {
      return this.f;
   }

   public btw b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public btw c(boolean $$0) {
      this.g = $$0;
      return this;
   }

   public boolean p() {
      return this.g;
   }

   public static enum a implements bak {
      a("pink", o.m),
      b("blue", o.j),
      c("red", o.e),
      d("green", o.k),
      e("yellow", o.o),
      f("purple", o.b),
      g("white", o.p);

      public static final Codec<btw.a> h = bak.a(btw.a::values);
      private final String i;
      private final o j;

      private a(final String $$0, final o $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public o a() {
         return this.j;
      }

      public String b() {
         return this.i;
      }

      @Override
      public String c() {
         return this.i;
      }
   }

   public static enum b implements bak {
      a("progress"),
      b("notched_6"),
      c("notched_10"),
      d("notched_12"),
      e("notched_20");

      public static final Codec<btw.b> f = bak.a(btw.b::values);
      private final String g;

      private b(final String $$0) {
         this.g = $$0;
      }

      public String a() {
         return this.g;
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
