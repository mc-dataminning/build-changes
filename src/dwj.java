import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dwj<T extends dvx> {
   static final Logger a = LogUtils.getLogger();
   final dwf<T> b;
   final dvz<T> c;
   final dwc<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dwg<T> f;

   public dwj(Class<T> $$0, dwf<T> $$1) {
      this.c = new dvz<>();
      this.d = new dwc<>($$0, $$0x -> this.e.contains($$0x) ? dwk.c : dwk.b);
      this.b = $$1;
      this.f = new dwh<>(this.c, this.d);
   }

   public void a(dba $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dwk $$1x = $$0x.a(dwk.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::e);
         }
      });
   }

   public void b(dba $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dwk $$1x = $$0x.a(dwk.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::d);
         }
      });
   }

   public dwg<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kb.c($$0.dp());
      dwb<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dwj.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dO() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @azy
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dwb<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @azy
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dvy {
      private final T c;
      private long d;
      private dwb<T> e;

      a(final T $$0, final long $$1, final dwb<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iz $$0 = this.c.dp();
         long $$1 = kb.c($$0);
         if ($$1 != this.d) {
            dwk $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dwj.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kb.a(this.d), $$1});
            }

            dwj.this.a(this.d, this.e);
            dwb<T> $$3 = dwj.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dwj.this.b.a(this.c);
            if (!this.c.dO()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dwj.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dwj.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bsp.c $$0) {
         if (!this.e.b(this.c)) {
            dwj.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kb.a(this.d), $$0});
         }

         dwk $$1 = this.e.c();
         if ($$1.a() || this.c.dO()) {
            dwj.this.b.d(this.c);
         }

         dwj.this.b.b(this.c);
         dwj.this.b.f(this.c);
         dwj.this.c.b(this.c);
         this.c.a(a);
         dwj.this.a(this.d, this.e);
      }
   }
}
