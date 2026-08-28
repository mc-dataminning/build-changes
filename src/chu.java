import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class chu {
   private final jj a;
   private final js<chw> b;
   private int c;
   private final Runnable d;

   chu(jj $$0, js<chw> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public chu(jj $$0, js<chw> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public chu.a a() {
      return new chu.a(this.a, this.b, this.c);
   }

   @Deprecated
   @bar
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

   public jj g() {
      return this.a;
   }

   public js<chw> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((chu)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(jj b, js<chw> c, int d) {
      public static final Codec<chu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jj.a.fieldOf("pos").forGetter(chu.a::a),
                  ala.a(me.aa).fieldOf("type").forGetter(chu.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(chu.a::c)
               )
               .apply($$0, chu.a::new)
      );

      public chu a(Runnable $$0) {
         return new chu(this.b, this.c, this.d, $$0);
      }

      public jj a() {
         return this.b;
      }

      public js<chw> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
