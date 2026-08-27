import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class duk<T extends dty> {
   static final Logger a = LogUtils.getLogger();
   final dug<T> b;
   final dua<T> c;
   final dud<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final duh<T> f;

   public duk(Class<T> $$0, dug<T> $$1) {
      this.c = new dua<>();
      this.d = new dud<>($$0, $$0x -> this.e.contains($$0x) ? dul.c : dul.b);
      this.b = $$1;
      this.f = new dui<>(this.c, this.d);
   }

   public void a(czb $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dul $$1x = $$0x.a(dul.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dM()).forEach(this.b::e);
         }
      });
   }

   public void b(czb $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dul $$1x = $$0x.a(dul.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dM()).forEach(this.b::d);
         }
      });
   }

   public duh<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jo.c($$0.dn());
      duc<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new duk.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dM() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @ayz
   public int b() {
      return this.c.b();
   }

   void a(long $$0, duc<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @ayz
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dtz {
      private final T c;
      private long d;
      private duc<T> e;

      a(T $$0, long $$1, duc<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         im $$0 = this.c.dn();
         long $$1 = jo.c($$0);
         if ($$1 != this.d) {
            dul $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               duk.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jo.a(this.d), $$1});
            }

            duk.this.a(this.d, this.e);
            duc<T> $$3 = duk.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            duk.this.b.a(this.c);
            if (!this.c.dM()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  duk.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  duk.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bql.c $$0) {
         if (!this.e.b(this.c)) {
            duk.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jo.a(this.d), $$0});
         }

         dul $$1 = this.e.c();
         if ($$1.a() || this.c.dM()) {
            duk.this.b.d(this.c);
         }

         duk.this.b.b(this.c);
         duk.this.b.f(this.c);
         duk.this.c.b(this.c);
         this.c.a(a);
         duk.this.a(this.d, this.e);
      }
   }
}
