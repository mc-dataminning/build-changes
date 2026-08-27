import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class djb<T extends dip> {
   static final Logger a = LogUtils.getLogger();
   final dix<T> b;
   final dir<T> c;
   final diu<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final diy<T> f;

   public djb(Class<T> $$0, dix<T> $$1) {
      this.c = new dir<>();
      this.d = new diu<>($$0, $$0x -> this.e.contains($$0x) ? djc.c : djc.b);
      this.b = $$1;
      this.f = new diz<>(this.c, this.d);
   }

   public void a(cor $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         djc $$1x = $$0x.a(djc.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dJ()).forEach(this.b::e);
         }
      });
   }

   public void b(cor $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         djc $$1x = $$0x.a(djc.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dJ()).forEach(this.b::d);
         }
      });
   }

   public diy<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = hy.c($$0.dk());
      dit<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new djb.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dJ() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @aso
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dit<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @aso
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements diq {
      private final T c;
      private long d;
      private dit<T> e;

      a(T $$0, long $$1, dit<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         gv $$0 = this.c.dk();
         long $$1 = hy.c($$0);
         if ($$1 != this.d) {
            djc $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               djb.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, hy.a(this.d), $$1});
            }

            djb.this.a(this.d, this.e);
            dit<T> $$3 = djb.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            djb.this.b.a(this.c);
            if (!this.c.dJ()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  djb.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  djb.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(big.c $$0) {
         if (!this.e.b(this.c)) {
            djb.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, hy.a(this.d), $$0});
         }

         djc $$1 = this.e.c();
         if ($$1.a() || this.c.dJ()) {
            djb.this.b.d(this.c);
         }

         djb.this.b.b(this.c);
         djb.this.b.f(this.c);
         djb.this.c.b(this.c);
         this.c.a(a);
         djb.this.a(this.d, this.e);
      }
   }
}
