import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fsk implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fsk.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(ib $$0, dme $$1, fvs $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fsk.a(this.b, $$1, $$2.dh()));
   }

   public boolean a(ib $$0, dme $$1) {
      fsk.a $$2 = (fsk.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fra $$1) {
      ObjectIterator<Entry<fsk.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fsk.a> $$3 = (Entry<fsk.a>)$$2.next();
         fsk.a $$4 = (fsk.a)$$3.getValue();
         if ($$4.b <= $$0) {
            ib $$5 = ib.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fsk a() {
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
      final eov a;
      int b;
      dme c;

      a(int $$0, dme $$1, eov $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fsk.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dme $$0) {
         this.c = $$0;
      }
   }
}
