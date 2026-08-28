import com.mojang.logging.LogUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exi implements exn {
   private static final Logger b = LogUtils.getLogger();
   private final div c;
   private final int d;
   private final ArrayDeque<exi.c> e = new ArrayDeque<>();
   private final List<exi.c> f = new ArrayList<>();
   private int g = 0;

   public exi(div $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ja $$0, dzz $$1, iu $$2, iu $$3, int $$4, int $$5) {
      this.a($$2, new exi.d($$0, $$1, $$2.j(), $$3.j(), $$4, $$5));
   }

   @Override
   public void a(iu $$0, dma $$1, @Nullable exo $$2) {
      this.a($$0, new exi.e($$0, $$1, $$2));
   }

   @Override
   public void a(dzz $$0, iu $$1, dma $$2, @Nullable exo $$3, boolean $$4) {
      this.a($$1, new exi.a($$0, $$1.j(), $$2, $$3, $$4));
   }

   @Override
   public void a(iu $$0, dma $$1, @Nullable ja $$2, @Nullable exo $$3) {
      this.a($$0, new exi.b($$0.j(), $$1, $$3, $$2));
   }

   private void a(iu $$0, exi.c $$1) {
      boolean $$2 = this.g > 0;
      boolean $$3 = this.d >= 0 && this.g >= this.d;
      this.g++;
      if (!$$3) {
         if ($$2) {
            this.f.add($$1);
         } else {
            this.e.push($$1);
         }
      } else if (this.g - 1 == this.d) {
         b.error("Too many chained neighbor updates. Skipping the rest. First skipped position: " + $$0.x());
      }

      if (!$$2) {
         this.a();
      }
   }

   private void a() {
      try {
         while (!this.e.isEmpty() || !this.f.isEmpty()) {
            for (int $$0 = this.f.size() - 1; $$0 >= 0; $$0--) {
               this.e.push(this.f.get($$0));
            }

            this.f.clear();
            exi.c $$1 = this.e.peek();

            while (this.f.isEmpty()) {
               if (!$$1.a(this.c)) {
                  this.e.pop();
                  break;
               }
            }
         }
      } finally {
         this.e.clear();
         this.f.clear();
         this.g = 0;
      }
   }

   static record a(dzz a, iu b, dma c, @Nullable exo d, boolean e) implements exi.c {
      @Override
      public boolean a(div $$0) {
         exn.a($$0, this.a, this.b, this.c, this.d, this.e);
         return false;
      }
   }

   static final class b implements exi.c {
      private final iu a;
      private final dma b;
      @Nullable
      private exo c;
      @Nullable
      private final ja d;
      private int e = 0;

      b(iu $$0, dma $$1, @Nullable exo $$2, @Nullable ja $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         if (exn.a[this.e] == $$3) {
            this.e++;
         }
      }

      @Override
      public boolean a(div $$0) {
         ja $$1 = exn.a[this.e++];
         iu $$2 = this.a.a($$1);
         dzz $$3 = $$0.a_($$2);
         exo $$4 = null;
         if ($$0.K().b(cuj.c)) {
            if (this.c == null) {
               this.c = exk.a($$0, this.d == null ? null : this.d.g(), null);
            }

            $$4 = this.c.b($$1);
         }

         exn.a($$0, $$3, $$2, this.b, $$4, false);
         if (this.e < exn.a.length && exn.a[this.e] == this.d) {
            this.e++;
         }

         return this.e < exn.a.length;
      }
   }

   interface c {
      boolean a(div var1);
   }

   static record d(ja a, dzz b, iu c, iu d, int e, int f) implements exi.c {
      @Override
      public boolean a(div $$0) {
         exn.a($$0, this.a, this.c, this.d, this.b, this.e, this.f);
         return false;
      }
   }

   static record e(iu a, dma b, @Nullable exo c) implements exi.c {
      @Override
      public boolean a(div $$0) {
         dzz $$1 = $$0.a_(this.a);
         exn.a($$0, $$1, this.a, this.b, this.c, false);
         return false;
      }
   }
}
