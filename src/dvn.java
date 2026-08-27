import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dvn<T extends dvb> {
   static final Logger a = LogUtils.getLogger();
   final dvj<T> b;
   final dvd<T> c;
   final dvg<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dvk<T> f;

   public dvn(Class<T> $$0, dvj<T> $$1) {
      this.c = new dvd<>();
      this.d = new dvg<>($$0, $$0x -> this.e.contains($$0x) ? dvo.c : dvo.b);
      this.b = $$1;
      this.f = new dvl<>(this.c, this.d);
   }

   public void a(dae $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dvo $$1x = $$0x.a(dvo.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::e);
         }
      });
   }

   public void b(dae $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dvo $$1x = $$0x.a(dvo.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::d);
         }
      });
   }

   public dvk<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jq.c($$0.dp());
      dvf<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dvn.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dO() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @azg
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dvf<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @azg
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dvc {
      private final T c;
      private long d;
      private dvf<T> e;

      a(T $$0, long $$1, dvf<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         io $$0 = this.c.dp();
         long $$1 = jq.c($$0);
         if ($$1 != this.d) {
            dvo $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dvn.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jq.a(this.d), $$1});
            }

            dvn.this.a(this.d, this.e);
            dvf<T> $$3 = dvn.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dvn.this.b.a(this.c);
            if (!this.c.dO()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dvn.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dvn.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bru.c $$0) {
         if (!this.e.b(this.c)) {
            dvn.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jq.a(this.d), $$0});
         }

         dvo $$1 = this.e.c();
         if ($$1.a() || this.c.dO()) {
            dvn.this.b.d(this.c);
         }

         dvn.this.b.b(this.c);
         dvn.this.b.f(this.c);
         dvn.this.c.b(this.c);
         this.c.a(a);
         dvn.this.a(this.d, this.e);
      }
   }
}
