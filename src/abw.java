import java.util.function.Function;
import javax.annotation.Nullable;

public class abw implements ve<abd> {
   private final int a;
   private final abw.a b;
   private final boolean c;
   static final abw.a d = new abw.a() {
      @Override
      public abw.b a() {
         return abw.b.b;
      }

      @Override
      public void a(abw.c $$0) {
         $$0.a();
      }

      @Override
      public void a(sp $$0) {
      }
   };

   private abw(int $$0, boolean $$1, abw.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static abw a(biq $$0, boolean $$1) {
      return new abw($$0.ah(), $$1, d);
   }

   public static abw a(biq $$0, boolean $$1, bgx $$2) {
      return new abw($$0.ah(), $$1, new abw.d($$2));
   }

   public static abw a(biq $$0, boolean $$1, bgx $$2, ehn $$3) {
      return new abw($$0.ah(), $$1, new abw.e($$2, $$3));
   }

   public abw(sp $$0) {
      this.a = $$0.m();
      abw.b $$1 = $$0.b(abw.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sp $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(abd $$0) {
      $$0.a(this);
   }

   @Nullable
   public biq a(akr $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(abw.c $$0) {
      this.b.a($$0);
   }

   interface a {
      abw.b a();

      void a(abw.c var1);

      void a(sp var1);
   }

   static enum b {
      a(abw.d::new),
      b($$0 -> abw.d),
      c(abw.e::new);

      final Function<sp, abw.a> d;

      private b(Function<sp, abw.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bgx var1);

      void a(bgx var1, ehn var2);

      void a();
   }

   static class d implements abw.a {
      private final bgx a;

      d(bgx $$0) {
         this.a = $$0;
      }

      private d(sp $$0) {
         this.a = $$0.b(bgx.class);
      }

      @Override
      public abw.b a() {
         return abw.b.a;
      }

      @Override
      public void a(abw.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(sp $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements abw.a {
      private final bgx a;
      private final ehn b;

      e(bgx $$0, ehn $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(sp $$0) {
         this.b = new ehn((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bgx.class);
      }

      @Override
      public abw.b a() {
         return abw.b.c;
      }

      @Override
      public void a(abw.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(sp $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
