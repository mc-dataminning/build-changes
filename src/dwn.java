import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class dwn<T extends dwb> {
   static final Logger a = LogUtils.getLogger();
   final dwj<T> b;
   final dwd<T> c;
   final dwg<T> d;
   private final LongSet e = new LongOpenHashSet();
   private final dwk<T> f;

   public dwn(Class<T> $$0, dwj<T> $$1) {
      this.c = new dwd<>();
      this.d = new dwg<>($$0, $$0x -> this.e.contains($$0x) ? dwo.c : dwo.b);
      this.b = $$1;
      this.f = new dwl<>(this.c, this.d);
   }

   public void a(dbe $$0) {
      long $$1 = $$0.a();
      this.e.add($$1);
      this.d.b($$1).forEach($$0x -> {
         dwo $$1x = $$0x.a(dwo.c);
         if (!$$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::e);
         }
      });
   }

   public void b(dbe $$0) {
      long $$1 = $$0.a();
      this.e.remove($$1);
      this.d.b($$1).forEach($$0x -> {
         dwo $$1x = $$0x.a(dwo.b);
         if ($$1x.a()) {
            $$0x.b().filter($$0xx -> !$$0xx.dO()).forEach(this.b::d);
         }
      });
   }

   public dwk<T> a() {
      return this.f;
   }

   public void a(T $$0) {
      this.c.a($$0);
      long $$1 = kb.c($$0.dp());
      dwf<T> $$2 = this.d.c($$1);
      $$2.a($$0);
      $$0.a(new dwn.a($$0, $$1, $$2));
      this.b.g($$0);
      this.b.c($$0);
      if ($$0.dO() || $$2.c().a()) {
         this.b.e($$0);
      }
   }

   @bac
   public int b() {
      return this.c.b();
   }

   void a(long $$0, dwf<T> $$1) {
      if ($$1.a()) {
         this.d.e($$0);
      }
   }

   @bac
   public String c() {
      return this.c.b() + "," + this.d.b() + "," + this.e.size();
   }

   class a implements dwc {
      private final T c;
      private long d;
      private dwf<T> e;

      a(final T $$0, final long $$1, final dwf<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iz $$0 = this.c.dp();
         long $$1 = kb.c($$0);
         if ($$1 != this.d) {
            dwo $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dwn.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kb.a(this.d), $$1});
            }

            dwn.this.a(this.d, this.e);
            dwf<T> $$3 = dwn.this.d.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            dwn.this.b.a(this.c);
            if (!this.c.dO()) {
               boolean $$4 = $$2.a();
               boolean $$5 = $$3.c().a();
               if ($$4 && !$$5) {
                  dwn.this.b.d(this.c);
               } else if (!$$4 && $$5) {
                  dwn.this.b.e(this.c);
               }
            }
         }
      }

      @Override
      public void a(bst.c $$0) {
         if (!this.e.b(this.c)) {
            dwn.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kb.a(this.d), $$0});
         }

         dwo $$1 = this.e.c();
         if ($$1.a() || this.c.dO()) {
            dwn.this.b.d(this.c);
         }

         dwn.this.b.b(this.c);
         dwn.this.b.f(this.c);
         dwn.this.c.b(this.c);
         this.c.a(a);
         dwn.this.a(this.d, this.e);
      }
   }
}
