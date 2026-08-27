import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dns<T extends dng> {
   static final Logger a = LogUtils.getLogger();
   final dno<T> b;
   final dni<T> c;
   final dnl<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dnp<T> f;

   public dns(Class<T> $$0, dno<T> $$1) {
      this.c = new dni<>();
      this.d = new dnl<>($$0, $$0x -> this.e.contains($$0x) ? dnt.c : dnt.b);
      this.b = $$1;
      this.f = new dnq<>(this.c, this.d);
   }

   public void a(cte $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dnt $$1x = $$0x.a(dnt.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dK()).forEach(this.b::e);
         }
      });
   }

   public void b(cte $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dnt $$1x = $$0x.a(dnt.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dK()).forEach(this.b::d);
         }
      });
   }

   public dnp<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = iz.c($$0.dl());
      dnk<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dns.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dK() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @avu
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dnk<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @avu
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dnh {
      private final T c;
      private long d;
      private dnk<T> e;

      a(T $$0, long $$1, dnk<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         hx $$0 = this.c.dl();
         long $$1 = iz.c($$0);
         if ($$1 != this.d) {
            dnt $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dns.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, iz.a(this.d), $$1});
            }

            dns.this.a(this.d, this.e);
            dnk<T> $$3 = dns.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dns.this.b.a(this.c);
            if (!this.c.dK()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dns.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dns.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(blw.c $$0) {
         if (!this.e.b(this.c)) {
            dns.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, iz.a(this.d), $$0});
         }

         dnt $$1 = this.e.c();
         if ($$1.a() || this.c.dK()) {
            dns.this.b.d(this.c);
         }

         dns.this.b.b(this.c);
         dns.this.b.f(this.c);
         dns.this.c.b(this.c);
         this.c.a(a);
         dns.this.a(this.d, this.e);
      }
   }
}
