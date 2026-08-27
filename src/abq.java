import java.util.function.Function;
import javax.annotation.Nullable;

public class abq implements ux<aaw> {
   private final int a;
   private final abq.a b;
   private final boolean c;
   static final abq.a d = new abq.a() {
      @Override
      public abq.b a() {
         return abq.b.b;
      }

      @Override
      public void a(abq.c $$0) {
         $$0.a();
      }

      @Override
      public void a(si $$0) {
      }
   };

   private abq(int $$0, boolean $$1, abq.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static abq a(bii $$0, boolean $$1) {
      return new abq($$0.ah(), $$1, d);
   }

   public static abq a(bii $$0, boolean $$1, bgp $$2) {
      return new abq($$0.ah(), $$1, new abq.d($$2));
   }

   public static abq a(bii $$0, boolean $$1, bgp $$2, ehe $$3) {
      return new abq($$0.ah(), $$1, new abq.e($$2, $$3));
   }

   public abq(si $$0) {
      this.a = $$0.m();
      abq.b $$1 = $$0.b(abq.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(si $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(aaw $$0) {
      $$0.a(this);
   }

   @Nullable
   public bii a(akk $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(abq.c $$0) {
      this.b.a($$0);
   }

   interface a {
      abq.b a();

      void a(abq.c var1);

      void a(si var1);
   }

   static enum b {
      a(abq.d::new),
      b($$0 -> abq.d),
      c(abq.e::new);

      final Function<si, abq.a> d;

      private b(Function<si, abq.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bgp var1);

      void a(bgp var1, ehe var2);

      void a();
   }

   static class d implements abq.a {
      private final bgp a;

      d(bgp $$0) {
         this.a = $$0;
      }

      private d(si $$0) {
         this.a = $$0.b(bgp.class);
      }

      @Override
      public abq.b a() {
         return abq.b.a;
      }

      @Override
      public void a(abq.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(si $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements abq.a {
      private final bgp a;
      private final ehe b;

      e(bgp $$0, ehe $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(si $$0) {
         this.b = new ehe((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bgp.class);
      }

      @Override
      public abq.b a() {
         return abq.b.c;
      }

      @Override
      public void a(abq.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(si $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
