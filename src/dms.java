import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dms<T extends dmg> {
   static final Logger a = LogUtils.getLogger();
   final dmo<T> b;
   final dmi<T> c;
   final dml<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dmp<T> f;

   public dms(Class<T> $$0, dmo<T> $$1) {
      this.c = new dmi<>();
      this.d = new dml<>($$0, $$0x -> this.e.contains($$0x) ? dmt.c : dmt.b);
      this.b = $$1;
      this.f = new dmq<>(this.c, this.d);
   }

   public void a(csf $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dmt $$1x = $$0x.a(dmt.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::e);
         }
      });
   }

   public void b(csf $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dmt $$1x = $$0x.a(dmt.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::d);
         }
      });
   }

   public dmp<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = ix.c($$0.dm());
      dmk<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dms.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dL() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @avd
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dmk<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @avd
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dmh {
      private final T c;
      private long d;
      private dmk<T> e;

      a(T $$0, long $$1, dmk<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         hv $$0 = this.c.dm();
         long $$1 = ix.c($$0);
         if ($$1 != this.d) {
            dmt $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dms.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, ix.a(this.d), $$1});
            }

            dms.this.a(this.d, this.e);
            dmk<T> $$3 = dms.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dms.this.b.a(this.c);
            if (!this.c.dL()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dms.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dms.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(blf.c $$0) {
         if (!this.e.b(this.c)) {
            dms.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, ix.a(this.d), $$0});
         }

         dmt $$1 = this.e.c();
         if ($$1.a() || this.c.dL()) {
            dms.this.b.d(this.c);
         }

         dms.this.b.b(this.c);
         dms.this.b.f(this.c);
         dms.this.c.b(this.c);
         this.c.a(a);
         dms.this.a(this.d, this.e);
      }
   }
}
