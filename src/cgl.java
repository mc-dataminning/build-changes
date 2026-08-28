import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class cgl {
   private final ji a;
   private final jr<cgn> b;
   private int c;
   private final Runnable d;

   cgl(ji $$0, jr<cgn> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cgl(ji $$0, jr<cgn> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public cgl.a a() {
      return new cgl.a(this.a, this.b, this.c);
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

   public jr<cgn> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((cgl)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(ji b, jr<cgn> c, int d) {
      public static final Codec<cgl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  ji.a.fieldOf("pos").forGetter(cgl.a::a),
                  akr.a(mc.aa).fieldOf("type").forGetter(cgl.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(cgl.a::c)
               )
               .apply($$0, cgl.a::new)
      );

      public cgl a(Runnable $$0) {
         return new cgl(this.b, this.c, this.d, $$0);
      }

      public ji a() {
         return this.b;
      }

      public jr<cgn> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
