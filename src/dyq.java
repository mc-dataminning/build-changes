import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dyq<T extends dye> {
   static final Logger a = LogUtils.getLogger();
   final dym<T> b;
   final dyg<T> c;
   final dyj<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dyn<T> f;

   public dyq(Class<T> $$0, dym<T> $$1) {
      this.c = new dyg<>();
      this.d = new dyj<>($$0, $$0x -> this.e.contains($$0x) ? dyr.c : dyr.b);
      this.b = $$1;
      this.f = new dyo<>(this.c, this.d);
   }

   public void a(dcy $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dyr $$1x = $$0x.a(dyr.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dR()).forEach(this.b::e);
         }
      });
   }

   public void b(dcy $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dyr $$1x = $$0x.a(dyr.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dR()).forEach(this.b::d);
         }
      });
   }

   public dyn<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kg.c($$0.ds());
      dyi<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dyq.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dR() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bai
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dyi<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bai
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dyf {
      private final T c;
      private long d;
      private dyi<T> e;

      a(final T $$0, final long $$1, final dyi<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         je $$0 = this.c.ds();
         long $$1 = kg.c($$0);
         if ($$1 != this.d) {
            dyr $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dyq.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kg.a(this.d), $$1});
            }

            dyq.this.a(this.d, this.e);
            dyi<T> $$3 = dyq.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dyq.this.b.a(this.c);
            if (!this.c.dR()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dyq.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dyq.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(btj.c $$0) {
         if (!this.e.b(this.c)) {
            dyq.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kg.a(this.d), $$0});
         }

         dyr $$1 = this.e.c();
         if ($$1.a() || this.c.dR()) {
            dyq.this.b.d(this.c);
         }

         dyq.this.b.b(this.c);
         dyq.this.b.f(this.c);
         dyq.this.c.b(this.c);
         this.c.a(a);
         dyq.this.a(this.d, this.e);
      }
   }
}
