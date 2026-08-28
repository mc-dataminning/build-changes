import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eey<T extends eem> {
   static final Logger a = LogUtils.getLogger();
   final eeu<T> b;
   final eeo<T> c;
   final eer<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final eev<T> f;

   public eey(Class<T> $$0, eeu<T> $$1) {
      this.c = new eeo<>();
      this.d = new eer<>($$0, $$0x -> this.e.contains($$0x) ? efb.c : efb.b);
      this.b = $$1;
      this.f = new eew<>(this.c, this.d);
   }

   public void a(dih $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         efb $$1x = $$0x.a(efb.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::e);
         }
      });
   }

   public void b(dih $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         efb $$1x = $$0x.a(efb.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::d);
         }
      });
   }

   public eev<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jx.c($$0.dv());
      eeq<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new eey.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dU() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bav
   public int b() {
      return this.c.b();
   }

   void a(long $$0, eeq<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bav
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements een {
      private final T c;
      private long d;
      private eeq<T> e;

      a(final T $$0, final long $$1, final eeq<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iu $$0 = this.c.dv();
         long $$1 = jx.c($$0);
         if ($$1 != this.d) {
            efb $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               eey.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jx.a(this.d), $$1});
            }

            eey.this.a(this.d, this.e);
            eeq<T> $$3 = eey.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            eey.this.b.a(this.c);
            if (!this.c.dU()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  eey.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  eey.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bwf.e $$0) {
         if (!this.e.b(this.c)) {
            eey.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jx.a(this.d), $$0});
         }

         efb $$1 = this.e.c();
         if ($$1.a() || this.c.dU()) {
            eey.this.b.d(this.c);
         }

         eey.this.b.b(this.c);
         eey.this.b.f(this.c);
         eey.this.c.b(this.c);
         this.c.a(a);
         eey.this.a(this.d, this.e);
      }
   }
}
