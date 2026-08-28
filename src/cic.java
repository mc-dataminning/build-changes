import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class cic {
   private final iu a;
   private final je<cie> b;
   private int c;
   private final Runnable d;

   cic(iu $$0, je<cie> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cic(iu $$0, je<cie> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public cic.a a() {
      return new cic.a(this.a, this.b, this.c);
   }

   @Deprecated
   @bat
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

   public iu g() {
      return this.a;
   }

   public je<cie> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((cic)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(iu b, je<cie> c, int d) {
      public static final Codec<cic.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iu.a.fieldOf("pos").forGetter(cic.a::a),
                  alb.a(mg.aa).fieldOf("type").forGetter(cic.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(cic.a::c)
               )
               .apply($$0, cic.a::new)
      );

      public cic a(Runnable $$0) {
         return new cic(this.b, this.c, this.d, $$0);
      }

      public iu a() {
         return this.b;
      }

      public je<cie> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
