import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eff<T extends eet> {
   static final Logger a = LogUtils.getLogger();
   final efb<T> b;
   final eev<T> c;
   final eey<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final efc<T> f;

   public eff(Class<T> $$0, efb<T> $$1) {
      this.c = new eev<>();
      this.d = new eey<>($$0, $$0x -> this.e.contains($$0x) ? efi.c : efi.b);
      this.b = $$1;
      this.f = new efd<>(this.c, this.d);
   }

   public void a(dio $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         efi $$1x = $$0x.a(efi.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dT()).forEach(this.b::e);
         }
      });
   }

   public void b(dio $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         efi $$1x = $$0x.a(efi.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dT()).forEach(this.b::d);
         }
      });
   }

   public efc<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jy.c($$0.du());
      eex<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new eff.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dT() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bav
   public int b() {
      return this.c.b();
   }

   void a(long $$0, eex<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bav
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements eeu {
      private final T c;
      private long d;
      private eex<T> e;

      a(final T $$0, final long $$1, final eex<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iv $$0 = this.c.du();
         long $$1 = jy.c($$0);
         if ($$1 != this.d) {
            efi $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               eff.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jy.a(this.d), $$1});
            }

            eff.this.a(this.d, this.e);
            eex<T> $$3 = eff.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            eff.this.b.a(this.c);
            if (!this.c.dT()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  eff.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  eff.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bwi.d $$0) {
         if (!this.e.b(this.c)) {
            eff.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jy.a(this.d), $$0});
         }

         efi $$1 = this.e.c();
         if ($$1.a() || this.c.dT()) {
            eff.this.b.d(this.c);
         }

         eff.this.b.b(this.c);
         eff.this.b.f(this.c);
         eff.this.c.b(this.c);
         this.c.a(a);
         eff.this.a(this.d, this.e);
      }
   }
}
