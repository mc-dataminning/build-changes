import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class djo<T extends djc> {
   static final Logger a = LogUtils.getLogger();
   final djk<T> b;
   final dje<T> c;
   final djh<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final djl<T> f;

   public djo(Class<T> $$0, djk<T> $$1) {
      this.c = new dje<>();
      this.d = new djh<>($$0, $$0x -> this.e.contains($$0x) ? djp.c : djp.b);
      this.b = $$1;
      this.f = new djm<>(this.c, this.d);
   }

   public void a(cpe $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         djp $$1x = $$0x.a(djp.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dK()).forEach(this.b::e);
         }
      });
   }

   public void b(cpe $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         djp $$1x = $$0x.a(djp.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dK()).forEach(this.b::d);
         }
      });
   }

   public djl<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = hz.c($$0.dl());
      djg<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new djo.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dK() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @ata
   public int b() {
      return this.c.b();
   }

   void a(long $$0, djg<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @ata
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements djd {
      private final T c;
      private long d;
      private djg<T> e;

      a(T $$0, long $$1, djg<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         gw $$0 = this.c.dl();
         long $$1 = hz.c($$0);
         if ($$1 != this.d) {
            djp $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               djo.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, hz.a(this.d), $$1});
            }

            djo.this.a(this.d, this.e);
            djg<T> $$3 = djo.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            djo.this.b.a(this.c);
            if (!this.c.dK()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  djo.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  djo.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bis.c $$0) {
         if (!this.e.b(this.c)) {
            djo.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, hz.a(this.d), $$0});
         }

         djp $$1 = this.e.c();
         if ($$1.a() || this.c.dK()) {
            djo.this.b.d(this.c);
         }

         djo.this.b.b(this.c);
         djo.this.b.f(this.c);
         djo.this.c.b(this.c);
         this.c.a(a);
         djo.this.a(this.d, this.e);
      }
   }
}
