import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class cji {
   private final iw a;
   private final jg<cjk> b;
   private int c;
   private final Runnable d;

   cji(iw $$0, jg<cjk> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cji(iw $$0, jg<cjk> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public cji.a a() {
      return new cji.a(this.a, this.b, this.c);
   }

   @Deprecated
   @bbi
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

   public jg<cjk> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((cji)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(iw b, jg<cjk> c, int d) {
      public static final Codec<cji.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iw.a.fieldOf("pos").forGetter(cji.a::a),
                  alo.a(mi.aa).fieldOf("type").forGetter(cji.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(cji.a::c)
               )
               .apply($$0, cji.a::new)
      );

      public cji a(Runnable $$0) {
         return new cji(this.b, this.c, this.d, $$0);
      }

      public iw a() {
         return this.b;
      }

      public jg<cjk> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
