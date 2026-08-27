import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dnk<T extends dmy> {
   static final Logger a = LogUtils.getLogger();
   final dng<T> b;
   final dna<T> c;
   final dnd<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dnh<T> f;

   public dnk(Class<T> $$0, dng<T> $$1) {
      this.c = new dna<>();
      this.d = new dnd<>($$0, $$0x -> this.e.contains($$0x) ? dnl.c : dnl.b);
      this.b = $$1;
      this.f = new dni<>(this.c, this.d);
   }

   public void a(csw $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dnl $$1x = $$0x.a(dnl.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::e);
         }
      });
   }

   public void b(csw $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dnl $$1x = $$0x.a(dnl.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::d);
         }
      });
   }

   public dnh<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = iz.c($$0.dm());
      dnc<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dnk.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dL() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @avt
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dnc<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @avt
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dmz {
      private final T c;
      private long d;
      private dnc<T> e;

      a(T $$0, long $$1, dnc<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         hx $$0 = this.c.dm();
         long $$1 = iz.c($$0);
         if ($$1 != this.d) {
            dnl $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dnk.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, iz.a(this.d), $$1});
            }

            dnk.this.a(this.d, this.e);
            dnc<T> $$3 = dnk.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dnk.this.b.a(this.c);
            if (!this.c.dL()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dnk.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dnk.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(blv.c $$0) {
         if (!this.e.b(this.c)) {
            dnk.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, iz.a(this.d), $$0});
         }

         dnl $$1 = this.e.c();
         if ($$1.a() || this.c.dL()) {
            dnk.this.b.d(this.c);
         }

         dnk.this.b.b(this.c);
         dnk.this.b.f(this.c);
         dnk.this.c.b(this.c);
         this.c.a(a);
         dnk.this.a(this.d, this.e);
      }
   }
}
