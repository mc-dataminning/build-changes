import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dke<T extends djs> {
   static final Logger a = LogUtils.getLogger();
   final dka<T> b;
   final dju<T> c;
   final djx<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dkb<T> f;

   public dke(Class<T> $$0, dka<T> $$1) {
      this.c = new dju<>();
      this.d = new djx<>($$0, $$0x -> this.e.contains($$0x) ? dkf.c : dkf.b);
      this.b = $$1;
      this.f = new dkc<>(this.c, this.d);
   }

   public void a(cqg $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dkf $$1x = $$0x.a(dkf.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dK()).forEach(this.b::e);
         }
      });
   }

   public void b(cqg $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dkf $$1x = $$0x.a(dkf.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dK()).forEach(this.b::d);
         }
      });
   }

   public dkb<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = iu.c($$0.dl());
      djw<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dke.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dK() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @aua
   public int b() {
      return this.c.b();
   }

   void a(long $$0, djw<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @aua
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements djt {
      private final T c;
      private long d;
      private djw<T> e;

      a(T $$0, long $$1, djw<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ht $$0 = this.c.dl();
         long $$1 = iu.c($$0);
         if ($$1 != this.d) {
            dkf $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dke.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, iu.a(this.d), $$1});
            }

            dke.this.a(this.d, this.e);
            djw<T> $$3 = dke.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dke.this.b.a(this.c);
            if (!this.c.dK()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dke.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dke.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bjt.c $$0) {
         if (!this.e.b(this.c)) {
            dke.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, iu.a(this.d), $$0});
         }

         dkf $$1 = this.e.c();
         if ($$1.a() || this.c.dK()) {
            dke.this.b.d(this.c);
         }

         dke.this.b.b(this.c);
         dke.this.b.f(this.c);
         dke.this.c.b(this.c);
         this.c.a(a);
         dke.this.a(this.d, this.e);
      }
   }
}
