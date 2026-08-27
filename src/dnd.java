import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dnd<T extends dmr> {
   static final Logger a = LogUtils.getLogger();
   final dmz<T> b;
   final dmt<T> c;
   final dmw<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dna<T> f;

   public dnd(Class<T> $$0, dmz<T> $$1) {
      this.c = new dmt<>();
      this.d = new dmw<>($$0, $$0x -> this.e.contains($$0x) ? dne.c : dne.b);
      this.b = $$1;
      this.f = new dnb<>(this.c, this.d);
   }

   public void a(csp $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dne $$1x = $$0x.a(dne.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::e);
         }
      });
   }

   public void b(csp $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dne $$1x = $$0x.a(dne.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dL()).forEach(this.b::d);
         }
      });
   }

   public dna<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = iz.c($$0.dm());
      dmv<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dnd.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dL() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @avn
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dmv<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @avn
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dms {
      private final T c;
      private long d;
      private dmv<T> e;

      a(T $$0, long $$1, dmv<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         hx $$0 = this.c.dm();
         long $$1 = iz.c($$0);
         if ($$1 != this.d) {
            dne $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dnd.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, iz.a(this.d), $$1});
            }

            dnd.this.a(this.d, this.e);
            dmv<T> $$3 = dnd.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dnd.this.b.a(this.c);
            if (!this.c.dL()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dnd.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dnd.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(blp.c $$0) {
         if (!this.e.b(this.c)) {
            dnd.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, iz.a(this.d), $$0});
         }

         dne $$1 = this.e.c();
         if ($$1.a() || this.c.dL()) {
            dnd.this.b.d(this.c);
         }

         dnd.this.b.b(this.c);
         dnd.this.b.f(this.c);
         dnd.this.c.b(this.c);
         this.c.a(a);
         dnd.this.a(this.d, this.e);
      }
   }
}
