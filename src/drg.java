import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class drg<T extends dqu> {
   static final Logger a = LogUtils.getLogger();
   final drc<T> b;
   final dqw<T> c;
   final dqz<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final drd<T> f;

   public drg(Class<T> $$0, drc<T> $$1) {
      this.c = new dqw<>();
      this.d = new dqz<>($$0, $$0x -> this.e.contains($$0x) ? drh.c : drh.b);
      this.b = $$1;
      this.f = new dre<>(this.c, this.d);
   }

   public void a(cwg $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         drh $$1x = $$0x.a(drh.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::e);
         }
      });
   }

   public void b(cwg $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         drh $$1x = $$0x.a(drh.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::d);
         }
      });
   }

   public drd<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = je.c($$0.dm());
      dqy<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new drg.a($$0, $$1, $$2));
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

   void a(long $$0, dqy<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @axz
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dqv {
      private final T c;
      private long d;
      private dqy<T> e;

      a(T $$0, long $$1, dqy<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ib $$0 = this.c.dm();
         long $$1 = je.c($$0);
         if ($$1 != this.d) {
            drh $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               drg.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, je.a(this.d), $$1});
            }

            drg.this.a(this.d, this.e);
            dqy<T> $$3 = drg.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            drg.this.b.a(this.c);
            if (!this.c.dL()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  drg.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  drg.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bow.c $$0) {
         if (!this.e.b(this.c)) {
            drg.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, je.a(this.d), $$0});
         }

         drh $$1 = this.e.c();
         if ($$1.a() || this.c.dL()) {
            drg.this.b.d(this.c);
         }

         drg.this.b.b(this.c);
         drg.this.b.f(this.c);
         drg.this.c.b(this.c);
         this.c.a(a);
         drg.this.a(this.d, this.e);
      }
   }
}
