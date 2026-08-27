import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dnj<T extends dmx> {
   static final Logger a = LogUtils.getLogger();
   final dnf<T> b;
   final dmz<T> c;
   final dnc<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dng<T> f;

   public dnj(Class<T> $$0, dnf<T> $$1) {
      this.c = new dmz<>();
      this.d = new dnc<>($$0, $$0x -> this.e.contains($$0x) ? dnk.c : dnk.b);
      this.b = $$1;
      this.f = new dnh<>(this.c, this.d);
   }

   public void a(csv $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dnk $$1x = $$0x.a(dnk.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::e);
         }
      });
   }

   public void b(csv $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dnk $$1x = $$0x.a(dnk.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::d);
         }
      });
   }

   public dng<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = iz.c($$0.dm());
      dnb<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dnj.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dL() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @avs
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dnb<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @avs
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dmy {
      private final T c;
      private long d;
      private dnb<T> e;

      a(T $$0, long $$1, dnb<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         hx $$0 = this.c.dm();
         long $$1 = iz.c($$0);
         if ($$1 != this.d) {
            dnk $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dnj.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, iz.a(this.d), $$1});
            }

            dnj.this.a(this.d, this.e);
            dnb<T> $$3 = dnj.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dnj.this.b.a(this.c);
            if (!this.c.dL()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dnj.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dnj.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(blu.c $$0) {
         if (!this.e.b(this.c)) {
            dnj.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, iz.a(this.d), $$0});
         }

         dnk $$1 = this.e.c();
         if ($$1.a() || this.c.dL()) {
            dnj.this.b.d(this.c);
         }

         dnj.this.b.b(this.c);
         dnj.this.b.f(this.c);
         dnj.this.c.b(this.c);
         this.c.a(a);
         dnj.this.a(this.d, this.e);
      }
   }
}
