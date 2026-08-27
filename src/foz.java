import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class foz implements AutoCloseable {
   private final Long2ObjectOpenHashMap<foz.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(hx $$0, djg $$1, fsi $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new foz.a(this.b, $$1, $$2.dk()));
   }

   public boolean a(hx $$0, djg $$1) {
      foz.a $$2 = (foz.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fnr $$1) {
      ObjectIterator<Entry<foz.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<foz.a> $$3 = (Entry<foz.a>)$$2.next();
         foz.a $$4 = (foz.a)$$3.getValue();
         if ($$4.b <= $$0) {
            hx $$5 = hx.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public foz a() {
      this.b++;
      this.c = true;
      return this;
   }

   @Override
   public void close() {
      this.c = false;
   }

   public int b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }

   static class a {
      final els a;
      int b;
      djg c;

      a(int $$0, djg $$1, els $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      foz.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(djg $$0) {
         this.c = $$0;
      }
   }
}
