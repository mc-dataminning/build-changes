import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class cih {
   private final iu a;
   private final je<cij> b;
   private int c;
   private final Runnable d;

   cih(iu $$0, je<cij> $$1, int $$2, Runnable $$3) {
      this.a = $$0.j();
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public cih(iu $$0, je<cij> $$1, Runnable $$2) {
      this($$0, $$1, $$1.a().b(), $$2);
   }

   public cih.a a() {
      return new cih.a(this.a, this.b, this.c);
   }

   @Deprecated
   @bav
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

   public je<cij> h() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 != null && this.getClass() == $$0.getClass() ? Objects.equals(this.a, ((cih)$$0).a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   public static record a(iu b, je<cij> c, int d) {
      public static final Codec<cih.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  iu.a.fieldOf("pos").forGetter(cih.a::a),
                  ald.a(mg.aa).fieldOf("type").forGetter(cih.a::b),
                  Codec.INT.fieldOf("free_tickets").orElse(0).forGetter(cih.a::c)
               )
               .apply($$0, cih.a::new)
      );

      public cih a(Runnable $$0) {
         return new cih(this.b, this.c, this.d, $$0);
      }

      public iu a() {
         return this.b;
      }

      public je<cij> b() {
         return this.c;
      }

      public int c() {
         return this.d;
      }
   }
}
