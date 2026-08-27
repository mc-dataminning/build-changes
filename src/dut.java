import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dut<T extends duh> {
   static final Logger a = LogUtils.getLogger();
   final dup<T> b;
   final duj<T> c;
   final dum<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final duq<T> f;

   public dut(Class<T> $$0, dup<T> $$1) {
      this.c = new duj<>();
      this.d = new dum<>($$0, $$0x -> this.e.contains($$0x) ? duu.c : duu.b);
      this.b = $$1;
      this.f = new dur<>(this.c, this.d);
   }

   public void a(czk $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         duu $$1x = $$0x.a(duu.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dM()).forEach(this.b::e);
         }
      });
   }

   public void b(czk $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         duu $$1x = $$0x.a(duu.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dM()).forEach(this.b::d);
         }
      });
   }

   public duq<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = jp.c($$0.dn());
      dul<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dut.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dM() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @azc
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dul<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @azc
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dui {
      private final T c;
      private long d;
      private dul<T> e;

      a(T $$0, long $$1, dul<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         in $$0 = this.c.dn();
         long $$1 = jp.c($$0);
         if ($$1 != this.d) {
            duu $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dut.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jp.a(this.d), $$1});
            }

            dut.this.a(this.d, this.e);
            dul<T> $$3 = dut.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dut.this.b.a(this.c);
            if (!this.c.dM()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dut.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dut.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(brh.c $$0) {
         if (!this.e.b(this.c)) {
            dut.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jp.a(this.d), $$0});
         }

         duu $$1 = this.e.c();
         if ($$1.a() || this.c.dM()) {
            dut.this.b.d(this.c);
         }

         dut.this.b.b(this.c);
         dut.this.b.f(this.c);
         dut.this.c.b(this.c);
         this.c.a(a);
         dut.this.a(this.d, this.e);
      }
   }
}
