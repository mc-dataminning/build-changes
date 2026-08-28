import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ead<T extends dzr> {
   static final Logger a = LogUtils.getLogger();
   final dzz<T> b;
   final dzt<T> c;
   final dzw<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final eaa<T> f;

   public ead(Class<T> $$0, dzz<T> $$1) {
      this.c = new dzt<>();
      this.d = new dzw<>($$0, $$0x -> this.e.contains($$0x) ? eae.c : eae.b);
      this.b = $$1;
      this.f = new eab<>(this.c, this.d);
   }

   public void a(del $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         eae $$1x = $$0x.a(eae.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dX()).forEach(this.b::e);
         }
      });
   }

   public void b(del $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         eae $$1x = $$0x.a(eae.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dX()).forEach(this.b::d);
         }
      });
   }

   public eaa<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kj.c($$0.dy());
      dzv<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new ead.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dX() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bau
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dzv<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bau
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dzs {
      private final T c;
      private long d;
      private dzv<T> e;

      a(final T $$0, final long $$1, final dzv<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jh $$0 = this.c.dy();
         long $$1 = kj.c($$0);
         if ($$1 != this.d) {
            eae $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               ead.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kj.a(this.d), $$1});
            }

            ead.this.a(this.d, this.e);
            dzv<T> $$3 = ead.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            ead.this.b.a(this.c);
            if (!this.c.dX()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  ead.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  ead.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bui.c $$0) {
         if (!this.e.b(this.c)) {
            ead.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kj.a(this.d), $$0});
         }

         eae $$1 = this.e.c();
         if ($$1.a() || this.c.dX()) {
            ead.this.b.d(this.c);
         }

         ead.this.b.b(this.c);
         ead.this.b.f(this.c);
         ead.this.c.b(this.c);
         this.c.a(a);
         ead.this.a(this.d, this.e);
      }
   }
}
