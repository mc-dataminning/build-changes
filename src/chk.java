import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class chk {
   private final jh a;
   private final jq<chm> b;
   private int c;
   private final Runnable d;

   chk(jh $$0, jq<chm> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public chk(jh $$0, jq<chm> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public chk.a a() {
      return new chk.a(this.a, this.b, this.c);
   }

   @Deprecated
   @bbl
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

   public jq<chm> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((chk)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(jh b, jq<chm> c, int d) {
      public static final Codec<chk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jh.a.fieldOf("pos").forGetter(chk.a::a),
                  alw.a(mb.aa).fieldOf("type").forGetter(chk.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(chk.a::c)
               )
               .apply($$0, chk.a::new)
      );

      public chk a(Runnable $$0) {
         return new chk(this.b, this.c, this.d, $$0);
      }

      public jh a() {
         return this.b;
      }

      public jq<chm> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
