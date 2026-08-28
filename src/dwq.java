import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dwq<T extends dwe> {
   static final Logger a = LogUtils.getLogger();
   final dwm<T> b;
   final dwg<T> c;
   final dwj<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dwn<T> f;

   public dwq(Class<T> $$0, dwm<T> $$1) {
      this.c = new dwg<>();
      this.d = new dwj<>($$0, $$0x -> this.e.contains($$0x) ? dwr.c : dwr.b);
      this.b = $$1;
      this.f = new dwo<>(this.c, this.d);
   }

   public void a(dbh $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dwr $$1x = $$0x.a(dwr.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::e);
         }
      });
   }

   public void b(dbh $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dwr $$1x = $$0x.a(dwr.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::d);
         }
      });
   }

   public dwn<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kb.c($$0.dp());
      dwi<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dwq.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dO() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bad
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dwi<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bad
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dwf {
      private final T c;
      private long d;
      private dwi<T> e;

      a(final T $$0, final long $$1, final dwi<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iz $$0 = this.c.dp();
         long $$1 = kb.c($$0);
         if ($$1 != this.d) {
            dwr $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dwq.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kb.a(this.d), $$1});
            }

            dwq.this.a(this.d, this.e);
            dwi<T> $$3 = dwq.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dwq.this.b.a(this.c);
            if (!this.c.dO()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dwq.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dwq.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bsw.c $$0) {
         if (!this.e.b(this.c)) {
            dwq.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kb.a(this.d), $$0});
         }

         dwr $$1 = this.e.c();
         if ($$1.a() || this.c.dO()) {
            dwq.this.b.d(this.c);
         }

         dwq.this.b.b(this.c);
         dwq.this.b.f(this.c);
         dwq.this.c.b(this.c);
         this.c.a(a);
         dwq.this.a(this.d, this.e);
      }
   }
}
