import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class cix {
   private final iv a;
   private final jf<ciz> b;
   private int c;
   private final Runnable d;

   cix(iv $$0, jf<ciz> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cix(iv $$0, jf<ciz> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public cix.a a() {
      return new cix.a(this.a, this.b, this.c);
   }

   @Deprecated
   @bax
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

   public iv g() {
      return this.a;
   }

   public jf<ciz> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((cix)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(iv b, jf<ciz> c, int d) {
      public static final Codec<cix.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iv.a.fieldOf("pos").forGetter(cix.a::a),
                  alf.a(mh.aa).fieldOf("type").forGetter(cix.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(cix.a::c)
               )
               .apply($$0, cix.a::new)
      );

      public cix a(Runnable $$0) {
         return new cix(this.b, this.c, this.d, $$0);
      }

      public iv a() {
         return this.b;
      }

      public jf<ciz> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
