import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class chl {
   private final jh a;
   private final jq<chn> b;
   private int c;
   private final Runnable d;

   chl(jh $$0, jq<chn> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public chl(jh $$0, jq<chn> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public chl.a a() {
      return new chl.a(this.a, this.b, this.c);
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

   public jq<chn> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((chl)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(jh b, jq<chn> c, int d) {
      public static final Codec<chl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jh.a.fieldOf("pos").forGetter(chl.a::a),
                  alw.a(mb.aa).fieldOf("type").forGetter(chl.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(chl.a::c)
               )
               .apply($$0, chl.a::new)
      );

      public chl a(Runnable $$0) {
         return new chl(this.b, this.c, this.d, $$0);
      }

      public jh a() {
         return this.b;
      }

      public jq<chn> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
