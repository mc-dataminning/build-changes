import java.util.function.Function;
import javax.annotation.Nullable;

public class abv implements vd<abc> {
   private final int a;
   private final abv.a b;
   private final boolean c;
   static final abv.a d = new abv.a() {
      @Override
      public abv.b a() {
         return abv.b.b;
      }

      @Override
      public void a(abv.c $$0) {
         $$0.a();
      }

      @Override
      public void a(so $$0) {
      }
   };

   private abv(int $$0, boolean $$1, abv.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static abv a(biq $$0, boolean $$1) {
      return new abv($$0.ah(), $$1, d);
   }

   public static abv a(biq $$0, boolean $$1, bgx $$2) {
      return new abv($$0.ah(), $$1, new abv.d($$2));
   }

   public static abv a(biq $$0, boolean $$1, bgx $$2, ehn $$3) {
      return new abv($$0.ah(), $$1, new abv.e($$2, $$3));
   }

   public abv(so $$0) {
      this.a = $$0.m();
      abv.b $$1 = $$0.b(abv.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(so $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(abc $$0) {
      $$0.a(this);
   }

   @Nullable
   public biq a(akq $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(abv.c $$0) {
      this.b.a($$0);
   }

   interface a {
      abv.b a();

      void a(abv.c var1);

      void a(so var1);
   }

   static enum b {
      a(abv.d::new),
      b($$0 -> abv.d),
      c(abv.e::new);

      final Function<so, abv.a> d;

      private b(Function<so, abv.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bgx var1);

      void a(bgx var1, ehn var2);

      void a();
   }

   static class d implements abv.a {
      private final bgx a;

      d(bgx $$0) {
         this.a = $$0;
      }

      private d(so $$0) {
         this.a = $$0.b(bgx.class);
      }

      @Override
      public abv.b a() {
         return abv.b.a;
      }

      @Override
      public void a(abv.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(so $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements abv.a {
      private final bgx a;
      private final ehn b;

      e(bgx $$0, ehn $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(so $$0) {
         this.b = new ehn((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bgx.class);
      }

      @Override
      public abv.b a() {
         return abv.b.c;
      }

      @Override
      public void a(abv.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(so $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
