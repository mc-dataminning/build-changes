import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class efk<T extends eey> {
   static final Logger a = LogUtils.getLogger();
   final efg<T> b;
   final efa<T> c;
   final efd<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final efh<T> f;

   public efk(Class<T> $$0, efg<T> $$1) {
      this.c = new efa<>();
      this.d = new efd<>($$0, $$0x -> this.e.contains($$0x) ? efn.c : efn.b);
      this.b = $$1;
      this.f = new efi<>(this.c, this.d);
   }

   public void a(dir $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         efn $$1x = $$0x.a(efn.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dT()).forEach(this.b::e);
         }
      });
   }

   public void b(dir $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         efn $$1x = $$0x.a(efn.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dT()).forEach(this.b::d);
         }
      });
   }

   public efh<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jy.c($$0.du());
      efc<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new efk.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dT() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bav
   public int b() {
      return this.c.b();
   }

   void a(long $$0, efc<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bav
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements eez {
      private final T c;
      private long d;
      private efc<T> e;

      a(final T $$0, final long $$1, final efc<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iv $$0 = this.c.du();
         long $$1 = jy.c($$0);
         if ($$1 != this.d) {
            efn $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               efk.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jy.a(this.d), $$1});
            }

            efk.this.a(this.d, this.e);
            efc<T> $$3 = efk.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            efk.this.b.a(this.c);
            if (!this.c.dT()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  efk.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  efk.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bwi.d $$0) {
         if (!this.e.b(this.c)) {
            efk.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jy.a(this.d), $$0});
         }

         efn $$1 = this.e.c();
         if ($$1.a() || this.c.dT()) {
            efk.this.b.d(this.c);
         }

         efk.this.b.b(this.c);
         efk.this.b.f(this.c);
         efk.this.c.b(this.c);
         this.c.a(a);
         efk.this.a(this.d, this.e);
      }
   }
}
