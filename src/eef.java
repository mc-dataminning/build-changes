import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eef<T extends edt> {
   static final Logger a = LogUtils.getLogger();
   final eeb<T> b;
   final edv<T> c;
   final edy<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final eec<T> f;

   public eef(Class<T> $$0, eeb<T> $$1) {
      this.c = new edv<>();
      this.d = new edy<>($$0, $$0x -> this.e.contains($$0x) ? eei.c : eei.b);
      this.b = $$1;
      this.f = new eed<>(this.c, this.d);
   }

   public void a(dhw $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         eei $$1x = $$0x.a(eei.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::e);
         }
      });
   }

   public void b(dhw $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         eei $$1x = $$0x.a(eei.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::d);
         }
      });
   }

   public eec<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jx.c($$0.dv());
      edx<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new eef.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dU() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bat
   public int b() {
      return this.c.b();
   }

   void a(long $$0, edx<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bat
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements edu {
      private final T c;
      private long d;
      private edx<T> e;

      a(final T $$0, final long $$1, final edx<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iu $$0 = this.c.dv();
         long $$1 = jx.c($$0);
         if ($$1 != this.d) {
            eei $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               eef.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jx.a(this.d), $$1});
            }

            eef.this.a(this.d, this.e);
            edx<T> $$3 = eef.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            eef.this.b.a(this.c);
            if (!this.c.dU()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  eef.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  eef.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bwa.e $$0) {
         if (!this.e.b(this.c)) {
            eef.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jx.a(this.d), $$0});
         }

         eei $$1 = this.e.c();
         if ($$1.a() || this.c.dU()) {
            eef.this.b.d(this.c);
         }

         eef.this.b.b(this.c);
         eef.this.b.f(this.c);
         eef.this.c.b(this.c);
         this.c.a(a);
         eef.this.a(this.d, this.e);
      }
   }
}
