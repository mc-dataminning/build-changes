import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class chc {
   private final jh a;
   private final jq<che> b;
   private int c;
   private final Runnable d;

   chc(jh $$0, jq<che> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public chc(jh $$0, jq<che> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public chc.a a() {
      return new chc.a(this.a, this.b, this.c);
   }

   @Deprecated
   @bbb
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

   public jq<che> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((chc)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(jh b, jq<che> c, int d) {
      public static final Codec<chc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  jh.a.fieldOf("pos").forGetter(chc.a::a),
                  alm.a(mb.aa).fieldOf("type").forGetter(chc.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(chc.a::c)
               )
               .apply($$0, chc.a::new)
      );

      public chc a(Runnable $$0) {
         return new chc(this.b, this.c, this.d, $$0);
      }

      public jh a() {
         return this.b;
      }

      public jq<che> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
