import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class djh<T extends div> {
   static final Logger a = LogUtils.getLogger();
   final djd<T> b;
   final dix<T> c;
   final dja<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dje<T> f;

   public djh(Class<T> $$0, djd<T> $$1) {
      this.c = new dix<>();
      this.d = new dja<>($$0, $$0x -> this.e.contains($$0x) ? dji.c : dji.b);
      this.b = $$1;
      this.f = new djf<>(this.c, this.d);
   }

   public void a(cox $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dji $$1x = $$0x.a(dji.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dJ()).forEach(this.b::e);
         }
      });
   }

   public void b(cox $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dji $$1x = $$0x.a(dji.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dJ()).forEach(this.b::d);
         }
      });
   }

   public dje<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = hz.c($$0.dk());
      diz<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new djh.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dJ() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @ast
   public int b() {
      return this.c.b();
   }

   void a(long $$0, diz<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @ast
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements diw {
      private final T c;
      private long d;
      private diz<T> e;

      a(T $$0, long $$1, diz<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         gw $$0 = this.c.dk();
         long $$1 = hz.c($$0);
         if ($$1 != this.d) {
            dji $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               djh.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, hz.a(this.d), $$1});
            }

            djh.this.a(this.d, this.e);
            diz<T> $$3 = djh.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            djh.this.b.a(this.c);
            if (!this.c.dJ()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  djh.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  djh.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bil.c $$0) {
         if (!this.e.b(this.c)) {
            djh.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, hz.a(this.d), $$0});
         }

         dji $$1 = this.e.c();
         if ($$1.a() || this.c.dJ()) {
            djh.this.b.d(this.c);
         }

         djh.this.b.b(this.c);
         djh.this.b.f(this.c);
         djh.this.c.b(this.c);
         this.c.a(a);
         djh.this.a(this.d, this.e);
      }
   }
}
