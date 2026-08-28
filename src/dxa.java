import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dxa<T extends dwo> {
   static final Logger a = LogUtils.getLogger();
   final dww<T> b;
   final dwq<T> c;
   final dwt<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dwx<T> f;

   public dxa(Class<T> $$0, dww<T> $$1) {
      this.c = new dwq<>();
      this.d = new dwt<>($$0, $$0x -> this.e.contains($$0x) ? dxb.c : dxb.b);
      this.b = $$1;
      this.f = new dwy<>(this.c, this.d);
   }

   public void a(dbn $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dxb $$1x = $$0x.a(dxb.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dQ()).forEach(this.b::e);
         }
      });
   }

   public void b(dbn $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dxb $$1x = $$0x.a(dxb.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dQ()).forEach(this.b::d);
         }
      });
   }

   public dwx<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kc.c($$0.dr());
      dws<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dxa.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dQ() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @azl
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dws<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @azl
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dwp {
      private final T c;
      private long d;
      private dws<T> e;

      a(final T $$0, final long $$1, final dws<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ja $$0 = this.c.dr();
         long $$1 = kc.c($$0);
         if ($$1 != this.d) {
            dxb $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dxa.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kc.a(this.d), $$1});
            }

            dxa.this.a(this.d, this.e);
            dws<T> $$3 = dxa.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dxa.this.b.a(this.c);
            if (!this.c.dQ()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dxa.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dxa.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bsh.d $$0) {
         if (!this.e.b(this.c)) {
            dxa.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kc.a(this.d), $$0});
         }

         dxb $$1 = this.e.c();
         if ($$1.a() || this.c.dQ()) {
            dxa.this.b.d(this.c);
         }

         dxa.this.b.b(this.c);
         dxa.this.b.f(this.c);
         dxa.this.c.b(this.c);
         this.c.a(a);
         dxa.this.a(this.d, this.e);
      }
   }
}
