import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class cim {
   private final iv a;
   private final jf<cio> b;
   private int c;
   private final Runnable d;

   cim(iv $$0, jf<cio> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cim(iv $$0, jf<cio> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public cim.a a() {
      return new cim.a(this.a, this.b, this.c);
   }

   @Deprecated
   @bav
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

   public jf<cio> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((cim)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(iv b, jf<cio> c, int d) {
      public static final Codec<cim.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iv.a.fieldOf("pos").forGetter(cim.a::a),
                  ald.a(mh.aa).fieldOf("type").forGetter(cim.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(cim.a::c)
               )
               .apply($$0, cim.a::new)
      );

      public cim a(Runnable $$0) {
         return new cim(this.b, this.c, this.d, $$0);
      }

      public iv a() {
         return this.b;
      }

      public jf<cio> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
