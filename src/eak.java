import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eak<T extends dzy> {
   static final Logger a = LogUtils.getLogger();
   final eag<T> b;
   final eaa<T> c;
   final ead<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final eah<T> f;

   public eak(Class<T> $$0, eag<T> $$1) {
      this.c = new eaa<>();
      this.d = new ead<>($$0, $$0x -> this.e.contains($$0x) ? eal.c : eal.b);
      this.b = $$1;
      this.f = new eai<>(this.c, this.d);
   }

   public void a(des $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         eal $$1x = $$0x.a(eal.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::e);
         }
      });
   }

   public void b(des $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         eal $$1x = $$0x.a(eal.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::d);
         }
      });
   }

   public eah<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kj.c($$0.dv());
      eac<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new eak.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dU() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bat
   public int b() {
      return this.c.b();
   }

   void a(long $$0, eac<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bat
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dzz {
      private final T c;
      private long d;
      private eac<T> e;

      a(final T $$0, final long $$1, final eac<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jh $$0 = this.c.dv();
         long $$1 = kj.c($$0);
         if ($$1 != this.d) {
            eal $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               eak.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kj.a(this.d), $$1});
            }

            eak.this.a(this.d, this.e);
            eac<T> $$3 = eak.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            eak.this.b.a(this.c);
            if (!this.c.dU()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  eak.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  eak.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bul.c $$0) {
         if (!this.e.b(this.c)) {
            eak.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kj.a(this.d), $$0});
         }

         eal $$1 = this.e.c();
         if ($$1.a() || this.c.dU()) {
            eak.this.b.d(this.c);
         }

         eak.this.b.b(this.c);
         eak.this.b.f(this.c);
         eak.this.c.b(this.c);
         this.c.a(a);
         eak.this.a(this.d, this.e);
      }
   }
}
