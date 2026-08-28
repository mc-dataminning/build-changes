import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dxp<T extends dxd> {
   static final Logger a = LogUtils.getLogger();
   final dxl<T> b;
   final dxf<T> c;
   final dxi<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dxm<T> f;

   public dxp(Class<T> $$0, dxl<T> $$1) {
      this.c = new dxf<>();
      this.d = new dxi<>($$0, $$0x -> this.e.contains($$0x) ? dxq.c : dxq.b);
      this.b = $$1;
      this.f = new dxn<>(this.c, this.d);
   }

   public void a(dcb $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dxq $$1x = $$0x.a(dxq.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dP()).forEach(this.b::e);
         }
      });
   }

   public void b(dcb $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dxq $$1x = $$0x.a(dxq.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dP()).forEach(this.b::d);
         }
      });
   }

   public dxm<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kf.c($$0.dq());
      dxh<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dxp.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dP() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @azs
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dxh<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @azs
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dxe {
      private final T c;
      private long d;
      private dxh<T> e;

      a(final T $$0, final long $$1, final dxh<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jd $$0 = this.c.dq();
         long $$1 = kf.c($$0);
         if ($$1 != this.d) {
            dxq $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dxp.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kf.a(this.d), $$1});
            }

            dxp.this.a(this.d, this.e);
            dxh<T> $$3 = dxp.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dxp.this.b.a(this.c);
            if (!this.c.dP()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dxp.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dxp.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bsq.c $$0) {
         if (!this.e.b(this.c)) {
            dxp.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kf.a(this.d), $$0});
         }

         dxq $$1 = this.e.c();
         if ($$1.a() || this.c.dP()) {
            dxp.this.b.d(this.c);
         }

         dxp.this.b.b(this.c);
         dxp.this.b.f(this.c);
         dxp.this.c.b(this.c);
         this.c.a(a);
         dxp.this.a(this.d, this.e);
      }
   }
}
