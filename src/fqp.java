import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;

public class fqp {
   private static final int a = 5;
   private static final int b = -1;
   final fme c;
   private final List<fqp.a<?>> d = new ArrayList<>();
   private final BitSet e = new BitSet(5);
   private final Deque<fqo> f = Queues.newArrayDeque();

   public fqp(fme $$0) {
      this.c = $$0;
   }

   public void a() {
      this.d.removeIf($$0 -> {
         $$0.c();
         if ($$0.b()) {
            this.e.clear($$0.d, $$0.d + $$0.e);
            return true;
         } else {
            return false;
         }
      });
      if (!this.f.isEmpty() && this.e() > 0) {
         this.f.removeIf($$0 -> {
            int $$1 = $$0.g();
            int $$2 = this.a($$1);
            if ($$2 == -1) {
               return false;
            } else {
               this.d.add(new fqp.a<>($$0, $$2, $$1));
               this.e.set($$2, $$2 + $$1);
               return true;
            }
         });
      }
   }

   public void a(fnq $$0) {
      if (!this.c.n.X) {
         int $$1 = $$0.a();

         for (fqp.a<?> $$2 : this.d) {
            $$2.a($$0, $$1);
         }
      }
   }

   private int a(int $$0) {
      if (this.e() >= $$0) {
         int $$1 = 0;

         for (int $$2 = 0; $$2 < 5; $$2++) {
            if (this.e.get($$2)) {
               $$1 = 0;
            } else if (++$$1 == $$0) {
               return $$2 + 1 - $$1;
            }
         }
      }

      return -1;
   }

   private int e() {
      return 5 - this.e.cardinality();
   }

   @Nullable
   public <T extends fqo> T a(Class<? extends T> $$0, Object $$1) {
      for (fqp.a<?> $$2 : this.d) {
         if ($$2 != null && $$0.isAssignableFrom($$2.a().getClass()) && $$2.a().f().equals($$1)) {
            return (T)$$2.a();
         }
      }

      for (fqo $$3 : this.f) {
         if ($$0.isAssignableFrom($$3.getClass()) && $$3.f().equals($$1)) {
            return (T)$$3;
         }
      }

      return null;
   }

   public void b() {
      this.e.clear();
      this.d.clear();
      this.f.clear();
   }

   public void a(fqo $$0) {
      this.f.add($$0);
   }

   public fme c() {
      return this.c;
   }

   public double d() {
      return this.c.n.D().c();
   }

   class a<T extends fqo> {
      private static final long b = 600L;
      private final T c;
      final int d;
      final int e;
      private long f = -1L;
      private long g = -1L;
      private fqo.a h = fqo.a.a;
      private long i;
      private float j;
      private boolean k;

      a(final T $$0, final int $$1, final int $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public T a() {
         return this.c;
      }

      public boolean b() {
         return this.k;
      }

      private void a(long $$0) {
         float $$1 = bae.a((float)($$0 - this.f) / 600.0F, 0.0F, 1.0F);
         $$1 *= $$1;
         if (this.h == fqo.a.b) {
            this.j = 1.0F - $$1;
         } else {
            this.j = $$1;
         }
      }

      public void c() {
         long $$0 = ae.c();
         if (this.f == -1L) {
            this.f = $$0;
            this.h.a(fqp.this.c.ak());
         }

         if (this.h == fqo.a.a && $$0 - this.f <= 600L) {
            this.g = $$0;
         }

         this.i = $$0 - this.g;
         this.a($$0);
         this.c.a(fqp.this, this.i);
         fqo.a $$1 = this.c.a();
         if ($$1 != this.h) {
            this.f = $$0 - (long)((int)((1.0F - this.j) * 600.0F));
            this.h = $$1;
            this.h.a(fqp.this.c.ak());
         }

         this.k = this.h == fqo.a.b && $$0 - this.f > 600L;
      }

      public void a(fnq $$0, int $$1) {
         $$0.c().a();
         $$0.c().a((float)$$1 - (float)this.c.b() * this.j, (float)(this.d * 32), 800.0F);
         this.c.a($$0, fqp.this.c.h, this.i);
         $$0.c().b();
      }
   }
}
