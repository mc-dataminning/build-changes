import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class cfo {
   private final je a;
   private final jn<cfq> b;
   private int c;
   private final Runnable d;

   cfo(je $$0, jn<cfq> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cfo(je $$0, jn<cfq> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public cfo.a a() {
      return new cfo.a(this.a, this.b, this.c);
   }

   @Deprecated
   @baj
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

   public je g() {
      return this.a;
   }

   public jn<cfq> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((cfo)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(je b, jn<cfq> c, int d) {
      public static final Codec<cfo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  je.a.fieldOf("pos").forGetter(cfo.a::a),
                  akz.a(lv.aa).fieldOf("type").forGetter(cfo.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(cfo.a::c)
               )
               .apply($$0, cfo.a::new)
      );

      public cfo a(Runnable $$0) {
         return new cfo(this.b, this.c, this.d, $$0);
      }

      public je a() {
         return this.b;
      }

      public jn<cfq> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
