import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class egh<T extends efv> {
   static final Logger a = LogUtils.getLogger();
   final egd<T> b;
   final efx<T> c;
   final ega<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final ege<T> f;

   public egh(Class<T> $$0, egd<T> $$1) {
      this.c = new efx<>();
      this.d = new ega<>($$0, $$0x -> this.e.contains($$0x) ? egk.c : egk.b);
      this.b = $$1;
      this.f = new egf<>(this.c, this.d);
   }

   public void a(djo $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         egk $$1x = $$0x.a(egk.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::e);
         }
      });
   }

   public void b(djo $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         egk $$1x = $$0x.a(egk.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::d);
         }
      });
   }

   public ege<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jz.c($$0.dv());
      efz<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new egh.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dU() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bbi
   public int b() {
      return this.c.b();
   }

   void a(long $$0, efz<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bbi
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements efw {
      private final T c;
      private long d;
      private efz<T> e;

      a(final T $$0, final long $$1, final efz<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iw $$0 = this.c.dv();
         long $$1 = jz.c($$0);
         if ($$1 != this.d) {
            egk $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               egh.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jz.a(this.d), $$1});
            }

            egh.this.a(this.d, this.e);
            efz<T> $$3 = egh.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            egh.this.b.a(this.c);
            if (!this.c.dU()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  egh.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  egh.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bxe.d $$0) {
         if (!this.e.b(this.c)) {
            egh.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jz.a(this.d), $$0});
         }

         egk $$1 = this.e.c();
         if ($$1.a() || this.c.dU()) {
            egh.this.b.d(this.c);
         }

         egh.this.b.b(this.c);
         egh.this.b.f(this.c);
         egh.this.c.b(this.c);
         this.c.a(a);
         egh.this.a(this.d, this.e);
      }
   }
}
