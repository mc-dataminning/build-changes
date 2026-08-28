import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dwm<T extends dwa> {
   static final Logger a = LogUtils.getLogger();
   final dwi<T> b;
   final dwc<T> c;
   final dwf<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dwj<T> f;

   public dwm(Class<T> $$0, dwi<T> $$1) {
      this.c = new dwc<>();
      this.d = new dwf<>($$0, $$0x -> this.e.contains($$0x) ? dwn.c : dwn.b);
      this.b = $$1;
      this.f = new dwk<>(this.c, this.d);
   }

   public void a(dbd $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dwn $$1x = $$0x.a(dwn.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::e);
         }
      });
   }

   public void b(dbd $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dwn $$1x = $$0x.a(dwn.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::d);
         }
      });
   }

   public dwj<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kb.c($$0.dp());
      dwe<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dwm.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dO() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bab
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dwe<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bab
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dwb {
      private final T c;
      private long d;
      private dwe<T> e;

      a(final T $$0, final long $$1, final dwe<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iz $$0 = this.c.dp();
         long $$1 = kb.c($$0);
         if ($$1 != this.d) {
            dwn $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dwm.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kb.a(this.d), $$1});
            }

            dwm.this.a(this.d, this.e);
            dwe<T> $$3 = dwm.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dwm.this.b.a(this.c);
            if (!this.c.dO()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dwm.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dwm.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bss.c $$0) {
         if (!this.e.b(this.c)) {
            dwm.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kb.a(this.d), $$0});
         }

         dwn $$1 = this.e.c();
         if ($$1.a() || this.c.dO()) {
            dwm.this.b.d(this.c);
         }

         dwm.this.b.b(this.c);
         dwm.this.b.f(this.c);
         dwm.this.c.b(this.c);
         this.c.a(a);
         dwm.this.a(this.d, this.e);
      }
   }
}
