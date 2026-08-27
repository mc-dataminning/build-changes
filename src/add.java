import java.util.function.Function;
import javax.annotation.Nullable;

public class add implements wk<acj> {
   private final int a;
   private final add.a b;
   private final boolean c;
   static final add.a d = new add.a() {
      @Override
      public add.b a() {
         return add.b.b;
      }

      @Override
      public void a(add.c $$0) {
         $$0.a();
      }

      @Override
      public void a(tu $$0) {
      }
   };

   private add(int $$0, boolean $$1, add.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static add a(bki $$0, boolean $$1) {
      return new add($$0.ah(), $$1, d);
   }

   public static add a(bki $$0, boolean $$1, bip $$2) {
      return new add($$0.ah(), $$1, new add.d($$2));
   }

   public static add a(bki $$0, boolean $$1, bip $$2, eji $$3) {
      return new add($$0.ah(), $$1, new add.e($$2, $$3));
   }

   public add(tu $$0) {
      this.a = $$0.n();
      add.b $$1 = $$0.b(add.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(acj $$0) {
      $$0.a(this);
   }

   @Nullable
   public bki a(ama $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(add.c $$0) {
      this.b.a($$0);
   }

   interface a {
      add.b a();

      void a(add.c var1);

      void a(tu var1);
   }

   static enum b {
      a(add.d::new),
      b($$0 -> add.d),
      c(add.e::new);

      final Function<tu, add.a> d;

      private b(Function<tu, add.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bip var1);

      void a(bip var1, eji var2);

      void a();
   }

   static class d implements add.a {
      private final bip a;

      d(bip $$0) {
         this.a = $$0;
      }

      private d(tu $$0) {
         this.a = $$0.b(bip.class);
      }

      @Override
      public add.b a() {
         return add.b.a;
      }

      @Override
      public void a(add.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(tu $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements add.a {
      private final bip a;
      private final eji b;

      e(bip $$0, eji $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(tu $$0) {
         this.b = new eji((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bip.class);
      }

      @Override
      public add.b a() {
         return add.b.c;
      }

      @Override
      public void a(add.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(tu $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
