import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class cga {
   private final jg a;
   private final jp<cgc> b;
   private int c;
   private final Runnable d;

   cga(jg $$0, jp<cgc> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cga(jg $$0, jp<cgc> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public cga.a a() {
      return new cga.a(this.a, this.b, this.c);
   }

   @Deprecated
   @bap
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

   public jg g() {
      return this.a;
   }

   public jp<cgc> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((cga)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(jg b, jp<cgc> c, int d) {
      public static final Codec<cga.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jg.a.fieldOf("pos").forGetter(cga.a::a),
                  ale.a(ly.aa).fieldOf("type").forGetter(cga.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(cga.a::c)
               )
               .apply($$0, cga.a::new)
      );

      public cga a(Runnable $$0) {
         return new cga(this.b, this.c, this.d, $$0);
      }

      public jg a() {
         return this.b;
      }

      public jp<cgc> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
