import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eeq<T extends eee> {
   static final Logger a = LogUtils.getLogger();
   final eem<T> b;
   final eeg<T> c;
   final eej<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final een<T> f;

   public eeq(Class<T> $$0, eem<T> $$1) {
      this.c = new eeg<>();
      this.d = new eej<>($$0, $$0x -> this.e.contains($$0x) ? eet.c : eet.b);
      this.b = $$1;
      this.f = new eeo<>(this.c, this.d);
   }

   public void a(dic $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         eet $$1x = $$0x.a(eet.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::e);
         }
      });
   }

   public void b(dic $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         eet $$1x = $$0x.a(eet.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::d);
         }
      });
   }

   public een<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jx.c($$0.dv());
      eei<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new eeq.a($$0, $$1, $$2));
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

   void a(long $$0, eei<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bav
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements eef {
      private final T c;
      private long d;
      private eei<T> e;

      a(final T $$0, final long $$1, final eei<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iu $$0 = this.c.dv();
         long $$1 = jx.c($$0);
         if ($$1 != this.d) {
            eet $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               eeq.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jx.a(this.d), $$1});
            }

            eeq.this.a(this.d, this.e);
            eei<T> $$3 = eeq.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            eeq.this.b.a(this.c);
            if (!this.c.dU()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  eeq.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  eeq.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bwd.e $$0) {
         if (!this.e.b(this.c)) {
            eeq.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jx.a(this.d), $$0});
         }

         eet $$1 = this.e.c();
         if ($$1.a() || this.c.dU()) {
            eeq.this.b.d(this.c);
         }

         eeq.this.b.b(this.c);
         eeq.this.b.f(this.c);
         eeq.this.c.b(this.c);
         this.c.a(a);
         eeq.this.a(this.d, this.e);
      }
   }
}
