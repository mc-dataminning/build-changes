import java.util.function.Function;
import javax.annotation.Nullable;

public class abx implements vf<abe> {
   private final int a;
   private final abx.a b;
   private final boolean c;
   static final abx.a d = new abx.a() {
      @Override
      public abx.b a() {
         return abx.b.b;
      }

      @Override
      public void a(abx.c $$0) {
         $$0.a();
      }

      @Override
      public void a(sq $$0) {
      }
   };

   private abx(int $$0, boolean $$1, abx.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static abx a(bis $$0, boolean $$1) {
      return new abx($$0.ah(), $$1, d);
   }

   public static abx a(bis $$0, boolean $$1, bgz $$2) {
      return new abx($$0.ah(), $$1, new abx.d($$2));
   }

   public static abx a(bis $$0, boolean $$1, bgz $$2, ehp $$3) {
      return new abx($$0.ah(), $$1, new abx.e($$2, $$3));
   }

   public abx(sq $$0) {
      this.a = $$0.m();
      abx.b $$1 = $$0.b(abx.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sq $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(abe $$0) {
      $$0.a(this);
   }

   @Nullable
   public bis a(aks $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(abx.c $$0) {
      this.b.a($$0);
   }

   interface a {
      abx.b a();

      void a(abx.c var1);

      void a(sq var1);
   }

   static enum b {
      a(abx.d::new),
      b($$0 -> abx.d),
      c(abx.e::new);

      final Function<sq, abx.a> d;

      private b(Function<sq, abx.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bgz var1);

      void a(bgz var1, ehp var2);

      void a();
   }

   static class d implements abx.a {
      private final bgz a;

      d(bgz $$0) {
         this.a = $$0;
      }

      private d(sq $$0) {
         this.a = $$0.b(bgz.class);
      }

      @Override
      public abx.b a() {
         return abx.b.a;
      }

      @Override
      public void a(abx.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(sq $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements abx.a {
      private final bgz a;
      private final ehp b;

      e(bgz $$0, ehp $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(sq $$0) {
         this.b = new ehp((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bgz.class);
      }

      @Override
      public abx.b a() {
         return abx.b.c;
      }

      @Override
      public void a(abx.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(sq $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
