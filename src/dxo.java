import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dxo<T extends dxc> {
   static final Logger a = LogUtils.getLogger();
   final dxk<T> b;
   final dxe<T> c;
   final dxh<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dxl<T> f;

   public dxo(Class<T> $$0, dxk<T> $$1) {
      this.c = new dxe<>();
      this.d = new dxh<>($$0, $$0x -> this.e.contains($$0x) ? dxp.c : dxp.b);
      this.b = $$1;
      this.f = new dxm<>(this.c, this.d);
   }

   public void a(dbh $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dxp $$1x = $$0x.a(dxp.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dT()).forEach(this.b::e);
         }
      });
   }

   public void b(dbh $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dxp $$1x = $$0x.a(dxp.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dT()).forEach(this.b::d);
         }
      });
   }

   public dxl<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jt.c($$0.du());
      dxg<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dxo.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dT() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @azp
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dxg<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @azp
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dxd {
      private final T c;
      private long d;
      private dxg<T> e;

      a(T $$0, long $$1, dxg<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ir $$0 = this.c.du();
         long $$1 = jt.c($$0);
         if ($$1 != this.d) {
            dxp $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dxo.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jt.a(this.d), $$1});
            }

            dxo.this.a(this.d, this.e);
            dxg<T> $$3 = dxo.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dxo.this.b.a(this.c);
            if (!this.c.dT()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dxo.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dxo.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(brv.d $$0) {
         if (!this.e.b(this.c)) {
            dxo.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jt.a(this.d), $$0});
         }

         dxp $$1 = this.e.c();
         if ($$1.a() || this.c.dT()) {
            dxo.this.b.d(this.c);
         }

         dxo.this.b.b(this.c);
         dxo.this.b.f(this.c);
         dxo.this.c.b(this.c);
         this.c.a(a);
         dxo.this.a(this.d, this.e);
      }
   }
}
