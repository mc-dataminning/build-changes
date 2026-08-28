import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class ecd<T extends ebr> {
   static final Logger a = LogUtils.getLogger();
   final ebz<T> b;
   final ebt<T> c;
   final ebw<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final eca<T> f;

   public ecd(Class<T> $$0, ebz<T> $$1) {
      this.c = new ebt<>();
      this.d = new ebw<>($$0, $$0x -> this.e.contains($$0x) ? ece.c : ece.b);
      this.b = $$1;
      this.f = new ecb<>(this.c, this.d);
   }

   public void a(dgf $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         ece $$1x = $$0x.a(ece.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dV()).forEach(this.b::e);
         }
      });
   }

   public void b(dgf $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         ece $$1x = $$0x.a(ece.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dV()).forEach(this.b::d);
         }
      });
   }

   public eca<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kj.c($$0.dw());
      ebv<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new ecd.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dV() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bbb
   public int b() {
      return this.c.b();
   }

   void a(long $$0, ebv<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bbb
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements ebs {
      private final T c;
      private long d;
      private ebv<T> e;

      a(final T $$0, final long $$1, final ebv<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jh $$0 = this.c.dw();
         long $$1 = kj.c($$0);
         if ($$1 != this.d) {
            ece $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               ecd.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kj.a(this.d), $$1});
            }

            ecd.this.a(this.d, this.e);
            ebv<T> $$3 = ecd.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            ecd.this.b.a(this.c);
            if (!this.c.dV()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  ecd.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  ecd.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bvb.d $$0) {
         if (!this.e.b(this.c)) {
            ecd.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kj.a(this.d), $$0});
         }

         ece $$1 = this.e.c();
         if ($$1.a() || this.c.dV()) {
            ecd.this.b.d(this.c);
         }

         ecd.this.b.b(this.c);
         ecd.this.b.f(this.c);
         ecd.this.c.b(this.c);
         this.c.a(a);
         ecd.this.a(this.d, this.e);
      }
   }
}
