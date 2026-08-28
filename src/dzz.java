import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dzz<T extends dzn> {
   static final Logger a = LogUtils.getLogger();
   final dzv<T> b;
   final dzp<T> c;
   final dzs<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dzw<T> f;

   public dzz(Class<T> $$0, dzv<T> $$1) {
      this.c = new dzp<>();
      this.d = new dzs<>($$0, $$0x -> this.e.contains($$0x) ? eaa.c : eaa.b);
      this.b = $$1;
      this.f = new dzx<>(this.c, this.d);
   }

   public void a(deh $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         eaa $$1x = $$0x.a(eaa.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dW()).forEach(this.b::e);
         }
      });
   }

   public void b(deh $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         eaa $$1x = $$0x.a(eaa.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dW()).forEach(this.b::d);
         }
      });
   }

   public dzw<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kj.c($$0.dx());
      dzr<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dzz.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dW() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @baq
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dzr<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @baq
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dzo {
      private final T c;
      private long d;
      private dzr<T> e;

      a(final T $$0, final long $$1, final dzr<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jh $$0 = this.c.dx();
         long $$1 = kj.c($$0);
         if ($$1 != this.d) {
            eaa $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dzz.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kj.a(this.d), $$1});
            }

            dzz.this.a(this.d, this.e);
            dzr<T> $$3 = dzz.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dzz.this.b.a(this.c);
            if (!this.c.dW()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dzz.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dzz.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bue.c $$0) {
         if (!this.e.b(this.c)) {
            dzz.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kj.a(this.d), $$0});
         }

         eaa $$1 = this.e.c();
         if ($$1.a() || this.c.dW()) {
            dzz.this.b.d(this.c);
         }

         dzz.this.b.b(this.c);
         dzz.this.b.f(this.c);
         dzz.this.c.b(this.c);
         this.c.a(a);
         dzz.this.a(this.d, this.e);
      }
   }
}
