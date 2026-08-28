import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class cgn {
   private final ji a;
   private final jr<cgp> b;
   private int c;
   private final Runnable d;

   cgn(ji $$0, jr<cgp> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cgn(ji $$0, jr<cgp> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public cgn.a a() {
      return new cgn.a(this.a, this.b, this.c);
   }

   @Deprecated
   @bag
   public int b() {
      return this.c;
   }

   protected boolean c() {
      if (this.c <= 0) {
         return false;
      } else {
         this.c--;
         this.d.run();
         return true;
      }
   }

   protected boolean d() {
      if (this.c >= this.b.a().b()) {
         return false;
      } else {
         this.c++;
         this.d.run();
         return true;
      }
   }

   public boolean e() {
      return this.c > 0;
   }

   public boolean f() {
      return this.c != this.b.a().b();
   }

   public ji g() {
      return this.a;
   }

   public jr<cgp> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((cgn)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(ji b, jr<cgp> c, int d) {
      public static final Codec<cgn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ji.a.fieldOf("pos").forGetter(cgn.a::a),
                  aks.a(mc.aa).fieldOf("type").forGetter(cgn.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(cgn.a::c)
               )
               .apply($$0, cgn.a::new)
      );

      public cgn a(Runnable $$0) {
         return new cgn(this.b, this.c, this.d, $$0);
      }

      public ji a() {
         return this.b;
      }

      public jr<cgp> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
