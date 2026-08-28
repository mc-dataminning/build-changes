import java.util.function.Function;
import javax.annotation.Nullable;

public class ahu implements zs<agy> {
   public static final zj<wi, ahu> a = zs.a(ahu::a, ahu::new);
   private final int b;
   private final ahu.a c;
   private final boolean d;
   static final ahu.a e = new ahu.a() {
      @Override
      public ahu.b a() {
         return ahu.b.b;
      }

      @Override
      public void a(ahu.c $$0) {
         $$0.a();
      }

      @Override
      public void a(wi $$0) {
      }
   };

   private ahu(int $$0, boolean $$1, ahu.a $$2) {
      this.b = $$0;
      this.c = $$2;
      this.d = $$1;
   }

   public static ahu a(bui $$0, boolean $$1) {
      return new ahu($$0.as(), $$1, e);
   }

   public static ahu a(bui $$0, boolean $$1, bsg $$2) {
      return new ahu($$0.as(), $$1, new ahu.d($$2));
   }

   public static ahu a(bui $$0, boolean $$1, bsg $$2, ezr $$3) {
      return new ahu($$0.as(), $$1, new ahu.e($$2, $$3));
   }

   private ahu(wi $$0) {
      this.b = $$0.l();
      ahu.b $$1 = $$0.b(ahu.b.class);
      this.c = $$1.d.apply($$0);
      this.d = $$0.readBoolean();
   }

   private void a(wi $$0) {
      $$0.c(this.b);
      $$0.a(this.c.a());
      this.c.a($$0);
      $$0.a(this.d);
   }

   @Override
   public zu<ahu> a() {
      return agw.bB;
   }

   public void a(agy $$0) {
      $$0.a(this);
   }

   @Nullable
   public bui a(arq $$0) {
      return $$0.b(this.b);
   }

   public boolean b() {
      return this.d;
   }

   public void a(ahu.c $$0) {
      this.c.a($$0);
   }

   interface a {
      ahu.b a();

      void a(ahu.c var1);

      void a(wi var1);
   }

   static enum b {
      a(ahu.d::new),
      b($$0 -> ahu.e),
      c(ahu.e::new);

      final Function<wi, ahu.a> d;

      private b(final Function<wi, ahu.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bsg var1);

      void a(bsg var1, ezr var2);

      void a();
   }

   static class d implements ahu.a {
      private final bsg a;

      d(bsg $$0) {
         this.a = $$0;
      }

      private d(wi $$0) {
         this.a = $$0.b(bsg.class);
      }

      @Override
      public ahu.b a() {
         return ahu.b.a;
      }

      @Override
      public void a(ahu.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(wi $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements ahu.a {
      private final bsg a;
      private final ezr b;

      e(bsg $$0, ezr $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(wi $$0) {
         this.b = new ezr((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bsg.class);
      }

      @Override
      public ahu.b a() {
         return ahu.b.c;
      }

      @Override
      public void a(ahu.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(wi $$0) {
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a((float)this.b.f);
         $$0.a(this.a);
      }
   }
}
