import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dwt<T extends dwh> {
   static final Logger a = LogUtils.getLogger();
   final dwp<T> b;
   final dwj<T> c;
   final dwm<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dwq<T> f;

   public dwt(Class<T> $$0, dwp<T> $$1) {
      this.c = new dwj<>();
      this.d = new dwm<>($$0, $$0x -> this.e.contains($$0x) ? dwu.c : dwu.b);
      this.b = $$1;
      this.f = new dwr<>(this.c, this.d);
   }

   public void a(dbk $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dwu $$1x = $$0x.a(dwu.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::e);
         }
      });
   }

   public void b(dbk $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dwu $$1x = $$0x.a(dwu.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::d);
         }
      });
   }

   public dwq<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kc.c($$0.dp());
      dwl<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dwt.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dO() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @azi
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dwl<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @azi
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dwi {
      private final T c;
      private long d;
      private dwl<T> e;

      a(final T $$0, final long $$1, final dwl<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ja $$0 = this.c.dp();
         long $$1 = kc.c($$0);
         if ($$1 != this.d) {
            dwu $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dwt.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kc.a(this.d), $$1});
            }

            dwt.this.a(this.d, this.e);
            dwl<T> $$3 = dwt.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dwt.this.b.a(this.c);
            if (!this.c.dO()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dwt.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dwt.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bsd.c $$0) {
         if (!this.e.b(this.c)) {
            dwt.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kc.a(this.d), $$0});
         }

         dwu $$1 = this.e.c();
         if ($$1.a() || this.c.dO()) {
            dwt.this.b.d(this.c);
         }

         dwt.this.b.b(this.c);
         dwt.this.b.f(this.c);
         dwt.this.c.b(this.c);
         this.c.a(a);
         dwt.this.a(this.d, this.e);
      }
   }
}
