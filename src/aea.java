import java.util.function.Function;
import javax.annotation.Nullable;

public class aea implements xd<adg> {
   private final int a;
   private final aea.a b;
   private final boolean c;
   static final aea.a d = new aea.a() {
      @Override
      public aea.b a() {
         return aea.b.b;
      }

      @Override
      public void a(aea.c $$0) {
         $$0.a();
      }

      @Override
      public void a(ug $$0) {
      }
   };

   private aea(int $$0, boolean $$1, aea.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static aea a(blp $$0, boolean $$1) {
      return new aea($$0.aj(), $$1, d);
   }

   public static aea a(blp $$0, boolean $$1, bju $$2) {
      return new aea($$0.aj(), $$1, new aea.d($$2));
   }

   public static aea a(blp $$0, boolean $$1, bju $$2, elm $$3) {
      return new aea($$0.aj(), $$1, new aea.e($$2, $$3));
   }

   public aea(ug $$0) {
      this.a = $$0.n();
      aea.b $$1 = $$0.b(aea.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ug $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(adg $$0) {
      $$0.a(this);
   }

   @Nullable
   public blp a(amz $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(aea.c $$0) {
      this.b.a($$0);
   }

   interface a {
      aea.b a();

      void a(aea.c var1);

      void a(ug var1);
   }

   static enum b {
      a(aea.d::new),
      b($$0 -> aea.d),
      c(aea.e::new);

      final Function<ug, aea.a> d;

      private b(Function<ug, aea.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bju var1);

      void a(bju var1, elm var2);

      void a();
   }

   static class d implements aea.a {
      private final bju a;

      d(bju $$0) {
         this.a = $$0;
      }

      private d(ug $$0) {
         this.a = $$0.b(bju.class);
      }

      @Override
      public aea.b a() {
         return aea.b.a;
      }

      @Override
      public void a(aea.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(ug $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements aea.a {
      private final bju a;
      private final elm b;

      e(bju $$0, elm $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(ug $$0) {
         this.b = new elm((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bju.class);
      }

      @Override
      public aea.b a() {
         return aea.b.c;
      }

      @Override
      public void a(aea.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(ug $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
