import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class djg<T extends diu> {
   static final Logger a = LogUtils.getLogger();
   final djc<T> b;
   final diw<T> c;
   final diz<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final djd<T> f;

   public djg(Class<T> $$0, djc<T> $$1) {
      this.c = new diw<>();
      this.d = new diz<>($$0, $$0x -> this.e.contains($$0x) ? djh.c : djh.b);
      this.b = $$1;
      this.f = new dje<>(this.c, this.d);
   }

   public void a(cpi $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         djh $$1x = $$0x.a(djh.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dK()).forEach(this.b::e);
         }
      });
   }

   public void b(cpi $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         djh $$1x = $$0x.a(djh.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dK()).forEach(this.b::d);
         }
      });
   }

   public djd<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = hw.c($$0.dl());
      diy<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new djg.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dK() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @atd
   public int b() {
      return this.c.b();
   }

   void a(long $$0, diy<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @atd
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements div {
      private final T c;
      private long d;
      private diy<T> e;

      a(T $$0, long $$1, diy<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         gw $$0 = this.c.dl();
         long $$1 = hw.c($$0);
         if ($$1 != this.d) {
            djh $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               djg.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, hw.a(this.d), $$1});
            }

            djg.this.a(this.d, this.e);
            diy<T> $$3 = djg.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            djg.this.b.a(this.c);
            if (!this.c.dK()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  djg.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  djg.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(biw.c $$0) {
         if (!this.e.b(this.c)) {
            djg.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, hw.a(this.d), $$0});
         }

         djh $$1 = this.e.c();
         if ($$1.a() || this.c.dK()) {
            djg.this.b.d(this.c);
         }

         djg.this.b.b(this.c);
         djg.this.b.f(this.c);
         djg.this.c.b(this.c);
         this.c.a(a);
         djg.this.a(this.d, this.e);
      }
   }
}
