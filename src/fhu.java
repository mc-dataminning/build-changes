import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.Iterator;
import javax.annotation.Nullable;

public class fhu {
   private static final int a = 4096;
   private final gga b;
   private final fhu.a c;

   public fhu(gga $$0, fhu.a $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public fhu.b a() {
      Reference2ObjectMap<gfo, fax> $$0 = new Reference2ObjectArrayMap();
      fbc $$1 = new fbc();
      ayt $$2 = ayt.a();

      for (ir $$3 : this.c) {
         dtc $$4 = this.c.a_($$3);
         epe $$5 = $$4.u();
         if (!$$5.c()) {
            fax $$6 = a($$0, gfb.a($$5));
            this.b.a($$3, this.c, $$6, $$4, $$5, $$3.u(), $$3.v(), $$3.w());
         }

         if ($$4.l() != dlw.a) {
            fax $$7 = a($$0, gfb.a($$4));
            $$1.a();
            $$1.a((float)$$3.u(), (float)$$3.v(), (float)$$3.w());
            this.b.a($$4, $$3, this.c, $$1, $$7, true, $$2);
            $$1.b();
         }
      }

      return new fhu.b($$0);
   }

   private static fax a(Reference2ObjectMap<gfo, fax> $$0, gfo $$1) {
      return (fax)$$0.computeIfAbsent($$1, $$0x -> {
         fax $$1x = new fax(4096);
         $$1x.a(fbh.b.h, fba.j);
         return $$1x;
      });
   }

   public static record a(dca a, cpb b, ja<dcz> c) implements dbd, Iterable<ir> {
      public static fhu.a a(fht $$0) {
         return new fhu.a($$0.a(), $$0.e().d(), $$0.g());
      }

      @Override
      public float a(iw $$0, boolean $$1) {
         return this.a.a($$0, $$1);
      }

      @Override
      public eot y_() {
         return cpd.a;
      }

      @Override
      public int a(ir $$0, dbl $$1) {
         return $$1.getColor(this.c.a(), (double)$$0.u(), (double)$$0.w());
      }

      @Nullable
      @Override
      public dqc c_(ir $$0) {
         return null;
      }

      @Override
      public dtc a_(ir $$0) {
         return this.b.b($$0);
      }

      @Override
      public epe b_(ir $$0) {
         return this.a_($$0).u();
      }

      @Override
      public boolean z_() {
         return false;
      }

      @Override
      public int K_() {
         return this.b.b();
      }

      @Override
      public int J_() {
         return 0;
      }

      @Override
      public Iterator<ir> iterator() {
         return ir.b(0, 0, 0, this.b.a() - 1, this.b.b() - 1, this.b.c() - 1).iterator();
      }
   }

   public static class b implements AutoCloseable {
      private final Reference2ObjectMap<gfo, fax> a;

      public b(Reference2ObjectMap<gfo, fax> $$0) {
         this.a = $$0;
      }

      public void a(Reference2ObjectMap<gfo, fbf> $$0) {
         for (gfo $$1 : gfo.I()) {
            fax.b $$2 = this.a($$1);
            if ($$2 == null) {
               fbf $$3 = (fbf)$$0.remove($$1);
               if ($$3 != null) {
                  $$3.close();
               }
            } else {
               fbf $$4 = (fbf)$$0.get($$1);
               if ($$4 == null) {
                  $$4 = new fbf(fbf.a.a);
                  $$0.put($$1, $$4);
               }

               $$4.a();
               $$4.a($$2);
            }
         }
      }

      @Nullable
      public fax.b a(gfo $$0) {
         fax $$1 = (fax)this.a.get($$0);
         return $$1 != null ? $$1.c() : null;
      }

      @Override
      public void close() {
         this.a.values().forEach(fax::i);
      }
   }
}
