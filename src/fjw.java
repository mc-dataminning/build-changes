import com.google.common.collect.Queues;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;

public class fjw {
   private static final int a = 5;
   private static final int b = -1;
   final ffn c;
   private final List<fjw.a<?>> d = new ArrayList<>();
   private final BitSet e = new BitSet(5);
   private final Deque<fjv> f = Queues.newArrayDeque();

   public fjw(ffn $$0) {
      this.c = $$0;
   }

   public void a(fgz $$0) {
      if (!this.c.m.Y) {
         int $$1 = $$0.a();
         this.d.removeIf($$2 -> {
            if ($$2 != null && $$2.a($$1, $$0)) {
               this.e.clear($$2.d, $$2.d + $$2.e);
               return true;
            } else {
               return false;
            }
         });
         if (!this.f.isEmpty() && this.d() > 0) {
            this.f.removeIf($$0x -> {
               int $$1x = $$0x.f();
               int $$2 = this.a($$1x);
               if ($$2 != -1) {
                  this.d.add(new fjw.a<>($$0x, $$2, $$1x));
                  this.e.set($$2, $$2 + $$1x);
                  return true;
               } else {
                  return false;
               }
            });
         }
      }
   }

   private int a(int $$0) {
      if (this.d() >= $$0) {
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

   private int d() {
      return 5 - this.e.cardinality();
   }

   @Nullable
   public <T extends fjv> T a(Class<? extends T> $$0, Object $$1) {
      for (fjw.a<?> $$2 : this.d) {
         if ($$2 != null && $$0.isAssignableFrom($$2.a().getClass()) && $$2.a().e().equals($$1)) {
            return (T)$$2.a();
         }
      }

      for (fjv $$3 : this.f) {
         if ($$0.isAssignableFrom($$3.getClass()) && $$3.e().equals($$1)) {
            return (T)$$3;
         }
      }

      return null;
   }

   public void a() {
      this.e.clear();
      this.d.clear();
      this.f.clear();
   }

   public void a(fjv $$0) {
      this.f.add($$0);
   }

   public ffn b() {
      return this.c;
   }

   public double c() {
      return this.c.m.B().c();
   }

   class a<T extends fjv> {
      private static final long b = 600L;
      private final T c;
      final int d;
      final int e;
      private long f = -1L;
      private long g = -1L;
      private fjv.a h = fjv.a.a;

      a(final T $$0, final int $$1, final int $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      public T a() {
         return this.c;
      }

      private float a(long $$0) {
         float $$1 = aye.a((float)($$0 - this.f) / 600.0F, 0.0F, 1.0F);
         $$1 *= $$1;
         return this.h == fjv.a.b ? 1.0F - $$1 : $$1;
      }

      public boolean a(int $$0, fgz $$1) {
         long $$2 = ac.c();
         if (this.f == -1L) {
            this.f = $$2;
            this.h.a(fjw.this.c.aj());
         }

         if (this.h == fjv.a.a && $$2 - this.f <= 600L) {
            this.g = $$2;
         }

         $$1.c().a();
         $$1.c().a((float)$$0 - (float)this.c.a() * this.a($$2), (float)(this.d * 32), 800.0F);
         fjv.a $$3 = this.c.a($$1, fjw.this, $$2 - this.g);
         $$1.c().b();
         if ($$3 != this.h) {
            this.f = $$2 - (long)((int)((1.0F - this.a($$2)) * 600.0F));
            this.h = $$3;
            this.h.a(fjw.this.c.aj());
         }

         return this.h == fjv.a.b && $$2 - this.f > 600L;
      }
   }
}
