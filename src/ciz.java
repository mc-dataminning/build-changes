import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class ciz {
   private final iw a;
   private final jg<cjb> b;
   private int c;
   private final Runnable d;

   ciz(iw $$0, jg<cjb> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public ciz(iw $$0, jg<cjb> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public ciz.a a() {
      return new ciz.a(this.a, this.b, this.c);
   }

   @Deprecated
   @baz
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

   public iw g() {
      return this.a;
   }

   public jg<cjb> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((ciz)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(iw b, jg<cjb> c, int d) {
      public static final Codec<ciz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iw.a.fieldOf("pos").forGetter(ciz.a::a),
                  alh.a(mi.aa).fieldOf("type").forGetter(ciz.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(ciz.a::c)
               )
               .apply($$0, ciz.a::new)
      );

      public ciz a(Runnable $$0) {
         return new ciz(this.b, this.c, this.d, $$0);
      }

      public iw a() {
         return this.b;
      }

      public jg<cjb> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
