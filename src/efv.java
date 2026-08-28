import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class efv<T extends efj> {
   static final Logger a = LogUtils.getLogger();
   final efr<T> b;
   final efl<T> c;
   final efo<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final efs<T> f;

   public efv(Class<T> $$0, efr<T> $$1) {
      this.c = new efl<>();
      this.d = new efo<>($$0, $$0x -> this.e.contains($$0x) ? efy.c : efy.b);
      this.b = $$1;
      this.f = new eft<>(this.c, this.d);
   }

   public void a(djc $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         efy $$1x = $$0x.a(efy.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::e);
         }
      });
   }

   public void b(djc $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         efy $$1x = $$0x.a(efy.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::d);
         }
      });
   }

   public efs<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jy.c($$0.dv());
      efn<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new efv.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dU() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bax
   public int b() {
      return this.c.b();
   }

   void a(long $$0, efn<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bax
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements efk {
      private final T c;
      private long d;
      private efn<T> e;

      a(final T $$0, final long $$1, final efn<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iv $$0 = this.c.dv();
         long $$1 = jy.c($$0);
         if ($$1 != this.d) {
            efy $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               efv.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jy.a(this.d), $$1});
            }

            efv.this.a(this.d, this.e);
            efn<T> $$3 = efv.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            efv.this.b.a(this.c);
            if (!this.c.dU()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  efv.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  efv.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bwt.d $$0) {
         if (!this.e.b(this.c)) {
            efv.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jy.a(this.d), $$0});
         }

         efy $$1 = this.e.c();
         if ($$1.a() || this.c.dU()) {
            efv.this.b.d(this.c);
         }

         efv.this.b.b(this.c);
         efv.this.b.f(this.c);
         efv.this.c.b(this.c);
         this.c.a(a);
         efv.this.a(this.d, this.e);
      }
   }
}
