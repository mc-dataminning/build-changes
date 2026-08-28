import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class eck<T extends eby> {
   static final Logger a = LogUtils.getLogger();
   final ecg<T> b;
   final eca<T> c;
   final ecd<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final ech<T> f;

   public eck(Class<T> $$0, ecg<T> $$1) {
      this.c = new eca<>();
      this.d = new ecd<>($$0, $$0x -> this.e.contains($$0x) ? ecl.c : ecl.b);
      this.b = $$1;
      this.f = new eci<>(this.c, this.d);
   }

   public void a(dgo $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         ecl $$1x = $$0x.a(ecl.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dV()).forEach(this.b::e);
         }
      });
   }

   public void b(dgo $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         ecl $$1x = $$0x.a(ecl.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dV()).forEach(this.b::d);
         }
      });
   }

   public ech<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kj.c($$0.dw());
      ecc<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new eck.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dV() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bbl
   public int b() {
      return this.c.b();
   }

   void a(long $$0, ecc<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bbl
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements ebz {
      private final T c;
      private long d;
      private ecc<T> e;

      a(final T $$0, final long $$1, final ecc<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jh $$0 = this.c.dw();
         long $$1 = kj.c($$0);
         if ($$1 != this.d) {
            ecl $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               eck.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kj.a(this.d), $$1});
            }

            eck.this.a(this.d, this.e);
            ecc<T> $$3 = eck.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            eck.this.b.a(this.c);
            if (!this.c.dV()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  eck.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  eck.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bvk.d $$0) {
         if (!this.e.b(this.c)) {
            eck.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kj.a(this.d), $$0});
         }

         ecl $$1 = this.e.c();
         if ($$1.a() || this.c.dV()) {
            eck.this.b.d(this.c);
         }

         eck.this.b.b(this.c);
         eck.this.b.f(this.c);
         eck.this.c.b(this.c);
         this.c.a(a);
         eck.this.a(this.d, this.e);
      }
   }
}
