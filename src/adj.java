import java.util.function.Function;
import javax.annotation.Nullable;

public class adj implements wo<acp> {
   private final int a;
   private final adj.a b;
   private final boolean c;
   static final adj.a d = new adj.a() {
      @Override
      public adj.b a() {
         return adj.b.b;
      }

      @Override
      public void a(adj.c $$0) {
         $$0.a();
      }

      @Override
      public void a(ty $$0) {
      }
   };

   private adj(int $$0, boolean $$1, adj.a $$2) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
   }

   public static adj a(bkv $$0, boolean $$1) {
      return new adj($$0.aj(), $$1, d);
   }

   public static adj a(bkv $$0, boolean $$1, bja $$2) {
      return new adj($$0.aj(), $$1, new adj.d($$2));
   }

   public static adj a(bkv $$0, boolean $$1, bja $$2, ejz $$3) {
      return new adj($$0.aj(), $$1, new adj.e($$2, $$3));
   }

   public adj(ty $$0) {
      this.a = $$0.n();
      adj.b $$1 = $$0.b(adj.b.class);
      this.b = $$1.d.apply($$0);
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.a);
      $$0.a(this.b.a());
      this.b.a($$0);
      $$0.a(this.c);
   }

   public void a(acp $$0) {
      $$0.a(this);
   }

   @Nullable
   public bkv a(ami $$0) {
      return $$0.b(this.a);
   }

   public boolean a() {
      return this.c;
   }

   public void a(adj.c $$0) {
      this.b.a($$0);
   }

   interface a {
      adj.b a();

      void a(adj.c var1);

      void a(ty var1);
   }

   static enum b {
      a(adj.d::new),
      b($$0 -> adj.d),
      c(adj.e::new);

      final Function<ty, adj.a> d;

      private b(Function<ty, adj.a> $$0) {
         this.d = $$0;
      }
   }

   public interface c {
      void a(bja var1);

      void a(bja var1, ejz var2);

      void a();
   }

   static class d implements adj.a {
      private final bja a;

      d(bja $$0) {
         this.a = $$0;
      }

      private d(ty $$0) {
         this.a = $$0.b(bja.class);
      }

      @Override
      public adj.b a() {
         return adj.b.a;
      }

      @Override
      public void a(adj.c $$0) {
         $$0.a(this.a);
      }

      @Override
      public void a(ty $$0) {
         $$0.a(this.a);
      }
   }

   static class e implements adj.a {
      private final bja a;
      private final ejz b;

      e(bja $$0, ejz $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      private e(ty $$0) {
         this.b = new ejz((double)$$0.readFloat(), (double)$$0.readFloat(), (double)$$0.readFloat());
         this.a = $$0.b(bja.class);
      }

      @Override
      public adj.b a() {
         return adj.b.c;
      }

      @Override
      public void a(adj.c $$0) {
         $$0.a(this.a, this.b);
      }

      @Override
      public void a(ty $$0) {
         $$0.a((float)this.b.c);
         $$0.a((float)this.b.d);
         $$0.a((float)this.b.e);
         $$0.a(this.a);
      }
   }
}
