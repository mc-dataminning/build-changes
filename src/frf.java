import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class frf implements AutoCloseable {
   private final Long2ObjectOpenHashMap<frf.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(hz $$0, dlf $$1, fun $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new frf.a(this.b, $$1, $$2.dk()));
   }

   public boolean a(hz $$0, dlf $$1) {
      frf.a $$2 = (frf.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fpx $$1) {
      ObjectIterator<Entry<frf.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<frf.a> $$3 = (Entry<frf.a>)$$2.next();
         frf.a $$4 = (frf.a)$$3.getValue();
         if ($$4.b <= $$0) {
            hz $$5 = hz.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public frf a() {
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
      final ens a;
      int b;
      dlf c;

      a(int $$0, dlf $$1, ens $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      frf.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dlf $$0) {
         this.c = $$0;
      }
   }
}
