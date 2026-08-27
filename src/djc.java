import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class djc<T extends diq> {
   static final Logger a = LogUtils.getLogger();
   final diy<T> b;
   final dis<T> c;
   final div<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final diz<T> f;

   public djc(Class<T> $$0, diy<T> $$1) {
      this.c = new dis<>();
      this.d = new div<>($$0, $$0x -> this.e.contains($$0x) ? djd.c : djd.b);
      this.b = $$1;
      this.f = new dja<>(this.c, this.d);
   }

   public void a(cos $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         djd $$1x = $$0x.a(djd.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dJ()).forEach(this.b::e);
         }
      });
   }

   public void b(cos $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         djd $$1x = $$0x.a(djd.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dJ()).forEach(this.b::d);
         }
      });
   }

   public diz<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = hx.c($$0.dk());
      diu<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new djc.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dJ() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @asq
   public int b() {
      return this.c.b();
   }

   void a(long $$0, diu<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @asq
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dir {
      private final T c;
      private long d;
      private diu<T> e;

      a(T $$0, long $$1, diu<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         gu $$0 = this.c.dk();
         long $$1 = hx.c($$0);
         if ($$1 != this.d) {
            djd $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               djc.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, hx.a(this.d), $$1});
            }

            djc.this.a(this.d, this.e);
            diu<T> $$3 = djc.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            djc.this.b.a(this.c);
            if (!this.c.dJ()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  djc.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  djc.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bii.c $$0) {
         if (!this.e.b(this.c)) {
            djc.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, hx.a(this.d), $$0});
         }

         djd $$1 = this.e.c();
         if ($$1.a() || this.c.dJ()) {
            djc.this.b.d(this.c);
         }

         djc.this.b.b(this.c);
         djc.this.b.f(this.c);
         djc.this.c.b(this.c);
         this.c.a(a);
         djc.this.a(this.d, this.e);
      }
   }
}
