import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dtu<T extends dti> {
   static final Logger a = LogUtils.getLogger();
   final dtq<T> b;
   final dtk<T> c;
   final dtn<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dtr<T> f;

   public dtu(Class<T> $$0, dtq<T> $$1) {
      this.c = new dtk<>();
      this.d = new dtn<>($$0, $$0x -> this.e.contains($$0x) ? dtv.c : dtv.b);
      this.b = $$1;
      this.f = new dts<>(this.c, this.d);
   }

   public void a(cyn $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dtv $$1x = $$0x.a(dtv.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::e);
         }
      });
   }

   public void b(cyn $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dtv $$1x = $$0x.a(dtv.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::d);
         }
      });
   }

   public dtr<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jg.c($$0.dm());
      dtm<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dtu.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dL() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @ayp
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dtm<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @ayp
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dtj {
      private final T c;
      private long d;
      private dtm<T> e;

      a(T $$0, long $$1, dtm<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         id $$0 = this.c.dm();
         long $$1 = jg.c($$0);
         if ($$1 != this.d) {
            dtv $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dtu.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jg.a(this.d), $$1});
            }

            dtu.this.a(this.d, this.e);
            dtm<T> $$3 = dtu.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dtu.this.b.a(this.c);
            if (!this.c.dL()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dtu.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dtu.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bqa.c $$0) {
         if (!this.e.b(this.c)) {
            dtu.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jg.a(this.d), $$0});
         }

         dtv $$1 = this.e.c();
         if ($$1.a() || this.c.dL()) {
            dtu.this.b.d(this.c);
         }

         dtu.this.b.b(this.c);
         dtu.this.b.f(this.c);
         dtu.this.c.b(this.c);
         this.c.a(a);
         dtu.this.a(this.d, this.e);
      }
   }
}
