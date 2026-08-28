import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dwz<T extends dwn> {
   static final Logger a = LogUtils.getLogger();
   final dwv<T> b;
   final dwp<T> c;
   final dws<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dww<T> f;

   public dwz(Class<T> $$0, dwv<T> $$1) {
      this.c = new dwp<>();
      this.d = new dws<>($$0, $$0x -> this.e.contains($$0x) ? dxa.c : dxa.b);
      this.b = $$1;
      this.f = new dwx<>(this.c, this.d);
   }

   public void a(dbm $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dxa $$1x = $$0x.a(dxa.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dP()).forEach(this.b::e);
         }
      });
   }

   public void b(dbm $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dxa $$1x = $$0x.a(dxa.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dP()).forEach(this.b::d);
         }
      });
   }

   public dww<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kc.c($$0.dq());
      dwr<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dwz.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dP() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @azl
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dwr<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @azl
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dwo {
      private final T c;
      private long d;
      private dwr<T> e;

      a(final T $$0, final long $$1, final dwr<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ja $$0 = this.c.dq();
         long $$1 = kc.c($$0);
         if ($$1 != this.d) {
            dxa $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dwz.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kc.a(this.d), $$1});
            }

            dwz.this.a(this.d, this.e);
            dwr<T> $$3 = dwz.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dwz.this.b.a(this.c);
            if (!this.c.dP()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dwz.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dwz.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bsg.c $$0) {
         if (!this.e.b(this.c)) {
            dwz.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kc.a(this.d), $$0});
         }

         dxa $$1 = this.e.c();
         if ($$1.a() || this.c.dP()) {
            dwz.this.b.d(this.c);
         }

         dwz.this.b.b(this.c);
         dwz.this.b.f(this.c);
         dwz.this.c.b(this.c);
         this.c.a(a);
         dwz.this.a(this.d, this.e);
      }
   }
}
