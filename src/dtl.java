import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dtl<T extends dsz> {
   static final Logger a = LogUtils.getLogger();
   final dth<T> b;
   final dtb<T> c;
   final dte<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dti<T> f;

   public dtl(Class<T> $$0, dth<T> $$1) {
      this.c = new dtb<>();
      this.d = new dte<>($$0, $$0x -> this.e.contains($$0x) ? dtm.c : dtm.b);
      this.b = $$1;
      this.f = new dtj<>(this.c, this.d);
   }

   public void a(cye $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dtm $$1x = $$0x.a(dtm.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::e);
         }
      });
   }

   public void b(cye $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dtm $$1x = $$0x.a(dtm.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::d);
         }
      });
   }

   public dti<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = je.c($$0.dm());
      dtd<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dtl.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dL() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @ayn
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dtd<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @ayn
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dta {
      private final T c;
      private long d;
      private dtd<T> e;

      a(T $$0, long $$1, dtd<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ib $$0 = this.c.dm();
         long $$1 = je.c($$0);
         if ($$1 != this.d) {
            dtm $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dtl.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, je.a(this.d), $$1});
            }

            dtl.this.a(this.d, this.e);
            dtd<T> $$3 = dtl.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dtl.this.b.a(this.c);
            if (!this.c.dL()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dtl.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dtl.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bpv.c $$0) {
         if (!this.e.b(this.c)) {
            dtl.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, je.a(this.d), $$0});
         }

         dtm $$1 = this.e.c();
         if ($$1.a() || this.c.dL()) {
            dtl.this.b.d(this.c);
         }

         dtl.this.b.b(this.c);
         dtl.this.b.f(this.c);
         dtl.this.c.b(this.c);
         this.c.a(a);
         dtl.this.a(this.d, this.e);
      }
   }
}
