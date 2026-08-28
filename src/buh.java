import com.mojang.serialization.Codec;
import java.util.UUID;

public abstract class buh {
   private final UUID h;
   protected xa a;
   protected float b;
   protected buh.a c;
   protected buh.b d;
   protected boolean e;
   protected boolean f;
   protected boolean g;

   public buh(UUID $$0, xa $$1, buh.a $$2, buh.b $$3) {
      this.h = $$0;
      this.a = $$1;
      this.c = $$2;
      this.d = $$3;
      this.b = 1.0F;
   }

   public UUID i() {
      return this.h;
   }

   public xa j() {
      return this.a;
   }

   public void a(xa $$0) {
      this.a = $$0;
   }

   public float k() {
      return this.b;
   }

   public void a(float $$0) {
      this.b = $$0;
   }

   public buh.a l() {
      return this.c;
   }

   public void a(buh.a $$0) {
      this.c = $$0;
   }

   public buh.b m() {
      return this.d;
   }

   public void a(buh.b $$0) {
      this.d = $$0;
   }

   public boolean n() {
      return this.e;
   }

   public buh a(boolean $$0) {
      this.e = $$0;
      return this;
   }

   public boolean o() {
      return this.f;
   }

   public buh b(boolean $$0) {
      this.f = $$0;
      return this;
   }

   public buh c(boolean $$0) {
      this.g = $$0;
      return this;
   }

   public boolean p() {
      return this.g;
   }

   public static enum a implements bam {
      a("pink", o.m),
      b("blue", o.j),
      c("red", o.e),
      d("green", o.k),
      e("yellow", o.o),
      f("purple", o.b),
      g("white", o.p);

      public static final Codec<buh.a> h = bam.a(buh.a::values);
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

   public static enum b implements bam {
      a("progress"),
      b("notched_6"),
      c("notched_10"),
      d("notched_12"),
      e("notched_20");

      public static final Codec<buh.b> f = bam.a(buh.b::values);
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
