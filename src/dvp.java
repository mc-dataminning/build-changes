import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dvp<T extends dvd> {
   static final Logger a = LogUtils.getLogger();
   final dvl<T> b;
   final dvf<T> c;
   final dvi<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dvm<T> f;

   public dvp(Class<T> $$0, dvl<T> $$1) {
      this.c = new dvf<>();
      this.d = new dvi<>($$0, $$0x -> this.e.contains($$0x) ? dvq.c : dvq.b);
      this.b = $$1;
      this.f = new dvn<>(this.c, this.d);
   }

   public void a(dag $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dvq $$1x = $$0x.a(dvq.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::e);
         }
      });
   }

   public void b(dag $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dvq $$1x = $$0x.a(dvq.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::d);
         }
      });
   }

   public dvm<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jq.c($$0.dp());
      dvh<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dvp.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dO() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @azi
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dvh<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @azi
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dve {
      private final T c;
      private long d;
      private dvh<T> e;

      a(T $$0, long $$1, dvh<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         io $$0 = this.c.dp();
         long $$1 = jq.c($$0);
         if ($$1 != this.d) {
            dvq $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dvp.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jq.a(this.d), $$1});
            }

            dvp.this.a(this.d, this.e);
            dvh<T> $$3 = dvp.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dvp.this.b.a(this.c);
            if (!this.c.dO()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dvp.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dvp.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(brw.c $$0) {
         if (!this.e.b(this.c)) {
            dvp.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jq.a(this.d), $$0});
         }

         dvq $$1 = this.e.c();
         if ($$1.a() || this.c.dO()) {
            dvp.this.b.d(this.c);
         }

         dvp.this.b.b(this.c);
         dvp.this.b.f(this.c);
         dvp.this.c.b(this.c);
         this.c.a(a);
         dvp.this.a(this.d, this.e);
      }
   }
}
