import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dzt<T extends dzh> {
   static final Logger a = LogUtils.getLogger();
   final dzp<T> b;
   final dzj<T> c;
   final dzm<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dzq<T> f;

   public dzt(Class<T> $$0, dzp<T> $$1) {
      this.c = new dzj<>();
      this.d = new dzm<>($$0, $$0x -> this.e.contains($$0x) ? dzu.c : dzu.b);
      this.b = $$1;
      this.f = new dzr<>(this.c, this.d);
   }

   public void a(deb $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dzu $$1x = $$0x.a(dzu.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dW()).forEach(this.b::e);
         }
      });
   }

   public void b(deb $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dzu $$1x = $$0x.a(dzu.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dW()).forEach(this.b::d);
         }
      });
   }

   public dzq<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = ki.c($$0.dx());
      dzl<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dzt.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dW() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bap
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dzl<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bap
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dzi {
      private final T c;
      private long d;
      private dzl<T> e;

      a(final T $$0, final long $$1, final dzl<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jg $$0 = this.c.dx();
         long $$1 = ki.c($$0);
         if ($$1 != this.d) {
            dzu $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dzt.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, ki.a(this.d), $$1});
            }

            dzt.this.a(this.d, this.e);
            dzl<T> $$3 = dzt.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dzt.this.b.a(this.c);
            if (!this.c.dW()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dzt.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dzt.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(btz.c $$0) {
         if (!this.e.b(this.c)) {
            dzt.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, ki.a(this.d), $$0});
         }

         dzu $$1 = this.e.c();
         if ($$1.a() || this.c.dW()) {
            dzt.this.b.d(this.c);
         }

         dzt.this.b.b(this.c);
         dzt.this.b.f(this.c);
         dzt.this.c.b(this.c);
         this.c.a(a);
         dzt.this.a(this.d, this.e);
      }
   }
}
