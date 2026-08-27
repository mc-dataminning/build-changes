import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dqk<T extends dpy> {
   static final Logger a = LogUtils.getLogger();
   final dqg<T> b;
   final dqa<T> c;
   final dqd<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dqh<T> f;

   public dqk(Class<T> $$0, dqg<T> $$1) {
      this.c = new dqa<>();
      this.d = new dqd<>($$0, $$0x -> this.e.contains($$0x) ? dql.c : dql.b);
      this.b = $$1;
      this.f = new dqi<>(this.c, this.d);
   }

   public void a(cvl $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dql $$1x = $$0x.a(dql.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dI()).forEach(this.b::e);
         }
      });
   }

   public void b(cvl $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dql $$1x = $$0x.a(dql.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dI()).forEach(this.b::d);
         }
      });
   }

   public dqh<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jd.c($$0.dj());
      dqc<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dqk.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dI() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @axp
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dqc<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @axp
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dpz {
      private final T c;
      private long d;
      private dqc<T> e;

      a(T $$0, long $$1, dqc<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ib $$0 = this.c.dj();
         long $$1 = jd.c($$0);
         if ($$1 != this.d) {
            dql $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dqk.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jd.a(this.d), $$1});
            }

            dqk.this.a(this.d, this.e);
            dqc<T> $$3 = dqk.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dqk.this.b.a(this.c);
            if (!this.c.dI()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dqk.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dqk.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bof.c $$0) {
         if (!this.e.b(this.c)) {
            dqk.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jd.a(this.d), $$0});
         }

         dql $$1 = this.e.c();
         if ($$1.a() || this.c.dI()) {
            dqk.this.b.d(this.c);
         }

         dqk.this.b.b(this.c);
         dqk.this.b.f(this.c);
         dqk.this.c.b(this.c);
         this.c.a(a);
         dqk.this.a(this.d, this.e);
      }
   }
}
