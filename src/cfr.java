import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class cfr {
   private final jf a;
   private final jo<cft> b;
   private int c;
   private final Runnable d;

   cfr(jf $$0, jo<cft> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cfr(jf $$0, jo<cft> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public cfr.a a() {
      return new cfr.a(this.a, this.b, this.c);
   }

   @Deprecated
   @bal
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

   public jf g() {
      return this.a;
   }

   public jo<cft> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((cfr)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(jf b, jo<cft> c, int d) {
      public static final Codec<cfr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jf.a.fieldOf("pos").forGetter(cfr.a::a),
                  alb.a(lw.aa).fieldOf("type").forGetter(cfr.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(cfr.a::c)
               )
               .apply($$0, cfr.a::new)
      );

      public cfr a(Runnable $$0) {
         return new cfr(this.b, this.c, this.d, $$0);
      }

      public jf a() {
         return this.b;
      }

      public jo<cft> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
