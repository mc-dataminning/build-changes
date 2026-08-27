import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class ffv implements AutoCloseable {
   private final Long2ObjectOpenHashMap<ffv.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(gu $$0, dcb $$1, fiy $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new ffv.a(this.b, $$1, $$2.dg()));
   }

   public boolean a(gu $$0, dcb $$1) {
      ffv.a $$2 = (ffv.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, few $$1) {
      ObjectIterator<Entry<ffv.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<ffv.a> $$3 = (Entry<ffv.a>)$$2.next();
         ffv.a $$4 = (ffv.a)$$3.getValue();
         if ($$4.b <= $$0) {
            gu $$5 = gu.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public ffv a() {
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
      final eei a;
      int b;
      dcb c;

      a(int $$0, dcb $$1, eei $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      ffv.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dcb $$0) {
         this.c = $$0;
      }
   }
}
