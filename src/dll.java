import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dll<T extends dkz> {
   static final Logger a = LogUtils.getLogger();
   final dlh<T> b;
   final dlb<T> c;
   final dle<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dli<T> f;

   public dll(Class<T> $$0, dlh<T> $$1) {
      this.c = new dlb<>();
      this.d = new dle<>($$0, $$0x -> this.e.contains($$0x) ? dlm.c : dlm.b);
      this.b = $$1;
      this.f = new dlj<>(this.c, this.d);
   }

   public void a(crh $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dlm $$1x = $$0x.a(dlm.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dM()).forEach(this.b::e);
         }
      });
   }

   public void b(crh $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dlm $$1x = $$0x.a(dlm.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dM()).forEach(this.b::d);
         }
      });
   }

   public dli<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = iu.c($$0.dn());
      dld<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dll.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dM() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @aup
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dld<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @aup
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dla {
      private final T c;
      private long d;
      private dld<T> e;

      a(T $$0, long $$1, dld<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ht $$0 = this.c.dn();
         long $$1 = iu.c($$0);
         if ($$1 != this.d) {
            dlm $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dll.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, iu.a(this.d), $$1});
            }

            dll.this.a(this.d, this.e);
            dld<T> $$3 = dll.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dll.this.b.a(this.c);
            if (!this.c.dM()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dll.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dll.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bkq.c $$0) {
         if (!this.e.b(this.c)) {
            dll.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, iu.a(this.d), $$0});
         }

         dlm $$1 = this.e.c();
         if ($$1.a() || this.c.dM()) {
            dll.this.b.d(this.c);
         }

         dll.this.b.b(this.c);
         dll.this.b.f(this.c);
         dll.this.c.b(this.c);
         this.c.a(a);
         dll.this.a(this.d, this.e);
      }
   }
}
