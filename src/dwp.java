import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dwp<T extends dwd> {
   static final Logger a = LogUtils.getLogger();
   final dwl<T> b;
   final dwf<T> c;
   final dwi<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dwm<T> f;

   public dwp(Class<T> $$0, dwl<T> $$1) {
      this.c = new dwf<>();
      this.d = new dwi<>($$0, $$0x -> this.e.contains($$0x) ? dwq.c : dwq.b);
      this.b = $$1;
      this.f = new dwn<>(this.c, this.d);
   }

   public void a(dbg $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dwq $$1x = $$0x.a(dwq.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::e);
         }
      });
   }

   public void b(dbg $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dwq $$1x = $$0x.a(dwq.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::d);
         }
      });
   }

   public dwm<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kb.c($$0.dp());
      dwh<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dwp.a($$0, $$1, $$2));
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

   void a(long $$0, dwh<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bad
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dwe {
      private final T c;
      private long d;
      private dwh<T> e;

      a(final T $$0, final long $$1, final dwh<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iz $$0 = this.c.dp();
         long $$1 = kb.c($$0);
         if ($$1 != this.d) {
            dwq $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dwp.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kb.a(this.d), $$1});
            }

            dwp.this.a(this.d, this.e);
            dwh<T> $$3 = dwp.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dwp.this.b.a(this.c);
            if (!this.c.dO()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dwp.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dwp.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bsv.c $$0) {
         if (!this.e.b(this.c)) {
            dwp.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kb.a(this.d), $$0});
         }

         dwq $$1 = this.e.c();
         if ($$1.a() || this.c.dO()) {
            dwp.this.b.d(this.c);
         }

         dwp.this.b.b(this.c);
         dwp.this.b.f(this.c);
         dwp.this.c.b(this.c);
         this.c.a(a);
         dwp.this.a(this.d, this.e);
      }
   }
}
