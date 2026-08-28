import com.mojang.serialization.Codec;
import java.util.UUID;

public abstract class buj {
   private final UUID h;
   protected xc a;
   protected float b;
   protected buj.a c;
   protected buj.b d;
   protected boolean e;
   protected boolean f;
   protected boolean g;

   public buj(UUID $$0, xc $$1, buj.a $$2, buj.b $$3) {
      this.h = $$0;
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.b = 1.0F;
   }

   public UUID i() {
      return this.h;
   }

   public xc j() {
      return this.a;
   }

   public void a(xc $$0) {
      this.a = $$0;
   }

   public float k() {
      return this.b;
   }

   public void a(float $$0) {
      this.b = $$0;
   }

   public buj.a l() {
      return this.c;
   }

   public void a(buj.a $$0) {
      this.c = $$0;
   }

   public buj.b m() {
      return this.d;
   }

   public void a(buj.b $$0) {
      this.d = $$0;
   }

   public boolean n() {
      return this.e;
   }

   public buj a(boolean $$0) {
      this.e = $$0;
      return this;
   }

   public boolean o() {
      return this.f;
   }

   public buj b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public buj c(boolean $$0) {
      this.g = $$0;
      return this;
   }

   public boolean p() {
      return this.g;
   }

   public static enum a implements bao {
      a("pink", o.m),
      b("blue", o.j),
      c("red", o.e),
      d("green", o.k),
      e("yellow", o.o),
      f("purple", o.b),
      g("white", o.p);

      public static final Codec<buj.a> h = bao.a(buj.a::values);
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

   public static enum b implements bao {
      a("progress"),
      b("notched_6"),
      c("notched_10"),
      d("notched_12"),
      e("notched_20");

      public static final Codec<buj.b> f = bao.a(buj.b::values);
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
