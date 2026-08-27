import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fmq implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fmq.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(ht $$0, dhi $$1, fpw $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fmq.a(this.b, $$1, $$2.dl()));
   }

   public boolean a(ht $$0, dhi $$1) {
      fmq.a $$2 = (fmq.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, flj $$1) {
      ObjectIterator<Entry<fmq.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fmq.a> $$3 = (Entry<fmq.a>)$$2.next();
         fmq.a $$4 = (fmq.a)$$3.getValue();
         if ($$4.b <= $$0) {
            ht $$5 = ht.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fmq a() {
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
      final eju a;
      int b;
      dhi c;

      a(int $$0, dhi $$1, eju $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fmq.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dhi $$0) {
         this.c = $$0;
      }
   }
}
