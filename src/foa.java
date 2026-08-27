import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class foa implements AutoCloseable {
   private final Long2ObjectOpenHashMap<foa.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(hv $$0, dip $$1, frk $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new foa.a(this.b, $$1, $$2.dk()));
   }

   public boolean a(hv $$0, dip $$1) {
      foa.a $$2 = (foa.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fmt $$1) {
      ObjectIterator<Entry<foa.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<foa.a> $$3 = (Entry<foa.a>)$$2.next();
         foa.a $$4 = (foa.a)$$3.getValue();
         if ($$4.b <= $$0) {
            hv $$5 = hv.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public foa a() {
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
      final elb a;
      int b;
      dip c;

      a(int $$0, dip $$1, elb $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      foa.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dip $$0) {
         this.c = $$0;
      }
   }
}
