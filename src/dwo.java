import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dwo<T extends dwc> {
   static final Logger a = LogUtils.getLogger();
   final dwk<T> b;
   final dwe<T> c;
   final dwh<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dwl<T> f;

   public dwo(Class<T> $$0, dwk<T> $$1) {
      this.c = new dwe<>();
      this.d = new dwh<>($$0, $$0x -> this.e.contains($$0x) ? dwp.c : dwp.b);
      this.b = $$1;
      this.f = new dwm<>(this.c, this.d);
   }

   public void a(dbf $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dwp $$1x = $$0x.a(dwp.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::e);
         }
      });
   }

   public void b(dbf $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dwp $$1x = $$0x.a(dwp.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::d);
         }
      });
   }

   public dwl<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kb.c($$0.dp());
      dwg<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dwo.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dO() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bad
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dwg<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bad
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dwd {
      private final T c;
      private long d;
      private dwg<T> e;

      a(final T $$0, final long $$1, final dwg<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iz $$0 = this.c.dp();
         long $$1 = kb.c($$0);
         if ($$1 != this.d) {
            dwp $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dwo.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kb.a(this.d), $$1});
            }

            dwo.this.a(this.d, this.e);
            dwg<T> $$3 = dwo.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dwo.this.b.a(this.c);
            if (!this.c.dO()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dwo.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dwo.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bsu.c $$0) {
         if (!this.e.b(this.c)) {
            dwo.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kb.a(this.d), $$0});
         }

         dwp $$1 = this.e.c();
         if ($$1.a() || this.c.dO()) {
            dwo.this.b.d(this.c);
         }

         dwo.this.b.b(this.c);
         dwo.this.b.f(this.c);
         dwo.this.c.b(this.c);
         this.c.a(a);
         dwo.this.a(this.d, this.e);
      }
   }
}
