import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dzi<T extends dyw> {
   static final Logger a = LogUtils.getLogger();
   final dze<T> b;
   final dyy<T> c;
   final dzb<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dzf<T> f;

   public dzi(Class<T> $$0, dze<T> $$1) {
      this.c = new dyy<>();
      this.d = new dzb<>($$0, $$0x -> this.e.contains($$0x) ? dzj.c : dzj.b);
      this.b = $$1;
      this.f = new dzg<>(this.c, this.d);
   }

   public void a(ddp $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dzj $$1x = $$0x.a(dzj.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dR()).forEach(this.b::e);
         }
      });
   }

   public void b(ddp $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dzj $$1x = $$0x.a(dzj.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dR()).forEach(this.b::d);
         }
      });
   }

   public dzf<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kh.c($$0.ds());
      dza<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dzi.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dR() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bal
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dza<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bal
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dyx {
      private final T c;
      private long d;
      private dza<T> e;

      a(final T $$0, final long $$1, final dza<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jf $$0 = this.c.ds();
         long $$1 = kh.c($$0);
         if ($$1 != this.d) {
            dzj $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dzi.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kh.a(this.d), $$1});
            }

            dzi.this.a(this.d, this.e);
            dza<T> $$3 = dzi.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dzi.this.b.a(this.c);
            if (!this.c.dR()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dzi.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dzi.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(btr.c $$0) {
         if (!this.e.b(this.c)) {
            dzi.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kh.a(this.d), $$0});
         }

         dzj $$1 = this.e.c();
         if ($$1.a() || this.c.dR()) {
            dzi.this.b.d(this.c);
         }

         dzi.this.b.b(this.c);
         dzi.this.b.f(this.c);
         dzi.this.c.b(this.c);
         this.c.a(a);
         dzi.this.a(this.d, this.e);
      }
   }
}
