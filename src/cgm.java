import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class cgm {
   private final jh a;
   private final jq<cgo> b;
   private int c;
   private final Runnable d;

   cgm(jh $$0, jq<cgo> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cgm(jh $$0, jq<cgo> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public cgm.a a() {
      return new cgm.a(this.a, this.b, this.c);
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

   public jh g() {
      return this.a;
   }

   public jq<cgo> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((cgm)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(jh b, jq<cgo> c, int d) {
      public static final Codec<cgm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jh.a.fieldOf("pos").forGetter(cgm.a::a),
                  alg.a(ma.aa).fieldOf("type").forGetter(cgm.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(cgm.a::c)
               )
               .apply($$0, cgm.a::new)
      );

      public cgm a(Runnable $$0) {
         return new cgm(this.b, this.c, this.d, $$0);
      }

      public jh a() {
         return this.b;
      }

      public jq<cgo> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
