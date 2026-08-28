import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dze<T extends dys> {
   static final Logger a = LogUtils.getLogger();
   final dza<T> b;
   final dyu<T> c;
   final dyx<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dzb<T> f;

   public dze(Class<T> $$0, dza<T> $$1) {
      this.c = new dyu<>();
      this.d = new dyx<>($$0, $$0x -> this.e.contains($$0x) ? dzf.c : dzf.b);
      this.b = $$1;
      this.f = new dzc<>(this.c, this.d);
   }

   public void a(ddm $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dzf $$1x = $$0x.a(dzf.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dR()).forEach(this.b::e);
         }
      });
   }

   public void b(ddm $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dzf $$1x = $$0x.a(dzf.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dR()).forEach(this.b::d);
         }
      });
   }

   public dzb<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kg.c($$0.ds());
      dyw<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dze.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dR() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @baj
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dyw<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @baj
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dyt {
      private final T c;
      private long d;
      private dyw<T> e;

      a(final T $$0, final long $$1, final dyw<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         je $$0 = this.c.ds();
         long $$1 = kg.c($$0);
         if ($$1 != this.d) {
            dzf $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dze.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kg.a(this.d), $$1});
            }

            dze.this.a(this.d, this.e);
            dyw<T> $$3 = dze.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dze.this.b.a(this.c);
            if (!this.c.dR()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dze.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dze.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bto.c $$0) {
         if (!this.e.b(this.c)) {
            dze.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kg.a(this.d), $$0});
         }

         dzf $$1 = this.e.c();
         if ($$1.a() || this.c.dR()) {
            dze.this.b.d(this.c);
         }

         dze.this.b.b(this.c);
         dze.this.b.f(this.c);
         dze.this.c.b(this.c);
         this.c.a(a);
         dze.this.a(this.d, this.e);
      }
   }
}
