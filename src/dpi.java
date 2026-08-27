import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dpi<T extends dow> {
   static final Logger a = LogUtils.getLogger();
   final dpe<T> b;
   final doy<T> c;
   final dpb<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dpf<T> f;

   public dpi(Class<T> $$0, dpe<T> $$1) {
      this.c = new doy<>();
      this.d = new dpb<>($$0, $$0x -> this.e.contains($$0x) ? dpj.c : dpj.b);
      this.b = $$1;
      this.f = new dpg<>(this.c, this.d);
   }

   public void a(cuu $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dpj $$1x = $$0x.a(dpj.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::e);
         }
      });
   }

   public void b(cuu $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dpj $$1x = $$0x.a(dpj.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::d);
         }
      });
   }

   public dpf<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jb.c($$0.dm());
      dpa<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dpi.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dL() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @axl
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dpa<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @axl
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dox {
      private final T c;
      private long d;
      private dpa<T> e;

      a(T $$0, long $$1, dpa<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         hz $$0 = this.c.dm();
         long $$1 = jb.c($$0);
         if ($$1 != this.d) {
            dpj $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dpi.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jb.a(this.d), $$1});
            }

            dpi.this.a(this.d, this.e);
            dpa<T> $$3 = dpi.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dpi.this.b.a(this.c);
            if (!this.c.dL()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dpi.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dpi.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bno.c $$0) {
         if (!this.e.b(this.c)) {
            dpi.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jb.a(this.d), $$0});
         }

         dpj $$1 = this.e.c();
         if ($$1.a() || this.c.dL()) {
            dpi.this.b.d(this.c);
         }

         dpi.this.b.b(this.c);
         dpi.this.b.f(this.c);
         dpi.this.c.b(this.c);
         this.c.a(a);
         dpi.this.a(this.d, this.e);
      }
   }
}
