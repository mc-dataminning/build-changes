import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dlq<T extends dle> {
   static final Logger a = LogUtils.getLogger();
   final dlm<T> b;
   final dlg<T> c;
   final dlj<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dln<T> f;

   public dlq(Class<T> $$0, dlm<T> $$1) {
      this.c = new dlg<>();
      this.d = new dlj<>($$0, $$0x -> this.e.contains($$0x) ? dlr.c : dlr.b);
      this.b = $$1;
      this.f = new dlo<>(this.c, this.d);
   }

   public void a(crm $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dlr $$1x = $$0x.a(dlr.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dM()).forEach(this.b::e);
         }
      });
   }

   public void b(crm $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dlr $$1x = $$0x.a(dlr.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dM()).forEach(this.b::d);
         }
      });
   }

   public dln<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = iy.c($$0.dn());
      dli<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dlq.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dM() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @aut
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dli<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @aut
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dlf {
      private final T c;
      private long d;
      private dli<T> e;

      a(T $$0, long $$1, dli<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         hx $$0 = this.c.dn();
         long $$1 = iy.c($$0);
         if ($$1 != this.d) {
            dlr $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dlq.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, iy.a(this.d), $$1});
            }

            dlq.this.a(this.d, this.e);
            dli<T> $$3 = dlq.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dlq.this.b.a(this.c);
            if (!this.c.dM()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dlq.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dlq.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bkv.c $$0) {
         if (!this.e.b(this.c)) {
            dlq.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, iy.a(this.d), $$0});
         }

         dlr $$1 = this.e.c();
         if ($$1.a() || this.c.dM()) {
            dlq.this.b.d(this.c);
         }

         dlq.this.b.b(this.c);
         dlq.this.b.f(this.c);
         dlq.this.c.b(this.c);
         this.c.a(a);
         dlq.this.a(this.d, this.e);
      }
   }
}
