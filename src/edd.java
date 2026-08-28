import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class edd<T extends ecr> {
   static final Logger a = LogUtils.getLogger();
   final ecz<T> b;
   final ect<T> c;
   final ecw<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final eda<T> f;

   public edd(Class<T> $$0, ecz<T> $$1) {
      this.c = new ect<>();
      this.d = new ecw<>($$0, $$0x -> this.e.contains($$0x) ? edg.c : edg.b);
      this.b = $$1;
      this.f = new edb<>(this.c, this.d);
   }

   public void a(dgw $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         edg $$1x = $$0x.a(edg.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::e);
         }
      });
   }

   public void b(dgw $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         edg $$1x = $$0x.a(edg.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dU()).forEach(this.b::d);
         }
      });
   }

   public eda<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kl.c($$0.dv());
      ecv<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new edd.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dU() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bar
   public int b() {
      return this.c.b();
   }

   void a(long $$0, ecv<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bar
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements ecs {
      private final T c;
      private long d;
      private ecv<T> e;

      a(final T $$0, final long $$1, final ecv<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jj $$0 = this.c.dv();
         long $$1 = kl.c($$0);
         if ($$1 != this.d) {
            edg $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               edd.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kl.a(this.d), $$1});
            }

            edd.this.a(this.d, this.e);
            ecv<T> $$3 = edd.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            edd.this.b.a(this.c);
            if (!this.c.dU()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  edd.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  edd.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bvs.e $$0) {
         if (!this.e.b(this.c)) {
            edd.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kl.a(this.d), $$0});
         }

         edg $$1 = this.e.c();
         if ($$1.a() || this.c.dU()) {
            edd.this.b.d(this.c);
         }

         edd.this.b.b(this.c);
         edd.this.b.f(this.c);
         edd.this.c.b(this.c);
         this.c.a(a);
         edd.this.a(this.d, this.e);
      }
   }
}
