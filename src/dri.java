import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dri<T extends dqw> {
   static final Logger a = LogUtils.getLogger();
   final dre<T> b;
   final dqy<T> c;
   final drb<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final drf<T> f;

   public dri(Class<T> $$0, dre<T> $$1) {
      this.c = new dqy<>();
      this.d = new drb<>($$0, $$0x -> this.e.contains($$0x) ? drj.c : drj.b);
      this.b = $$1;
      this.f = new drg<>(this.c, this.d);
   }

   public void a(cwi $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         drj $$1x = $$0x.a(drj.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::e);
         }
      });
   }

   public void b(cwi $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         drj $$1x = $$0x.a(drj.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::d);
         }
      });
   }

   public drf<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = je.c($$0.dm());
      dra<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dri.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dL() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @axz
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dra<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @axz
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dqx {
      private final T c;
      private long d;
      private dra<T> e;

      a(T $$0, long $$1, dra<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ib $$0 = this.c.dm();
         long $$1 = je.c($$0);
         if ($$1 != this.d) {
            drj $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dri.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, je.a(this.d), $$1});
            }

            dri.this.a(this.d, this.e);
            dra<T> $$3 = dri.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dri.this.b.a(this.c);
            if (!this.c.dL()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dri.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dri.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(box.c $$0) {
         if (!this.e.b(this.c)) {
            dri.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, je.a(this.d), $$0});
         }

         drj $$1 = this.e.c();
         if ($$1.a() || this.c.dL()) {
            dri.this.b.d(this.c);
         }

         dri.this.b.b(this.c);
         dri.this.b.f(this.c);
         dri.this.c.b(this.c);
         this.c.a(a);
         dri.this.a(this.d, this.e);
      }
   }
}
