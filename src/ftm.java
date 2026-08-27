import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class ftm implements AutoCloseable {
   private final Long2ObjectOpenHashMap<ftm.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(ib $$0, dnb $$1, fwu $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new ftm.a(this.b, $$1, $$2.dk()));
   }

   public boolean a(ib $$0, dnb $$1) {
      ftm.a $$2 = (ftm.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fsa $$1) {
      ObjectIterator<Entry<ftm.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<ftm.a> $$3 = (Entry<ftm.a>)$$2.next();
         ftm.a $$4 = (ftm.a)$$3.getValue();
         if ($$4.b <= $$0) {
            ib $$5 = ib.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public ftm a() {
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
      final ept a;
      int b;
      dnb c;

      a(int $$0, dnb $$1, ept $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      ftm.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dnb $$0) {
         this.c = $$0;
      }
   }
}
