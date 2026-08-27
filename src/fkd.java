import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fkd implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fkd.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(gw $$0, dfj $$1, fng $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fkd.a(this.b, $$1, $$2.dj()));
   }

   public boolean a(gw $$0, dfj $$1) {
      fkd.a $$2 = (fkd.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fix $$1) {
      ObjectIterator<Entry<fkd.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fkd.a> $$3 = (Entry<fkd.a>)$$2.next();
         fkd.a $$4 = (fkd.a)$$3.getValue();
         if ($$4.b <= $$0) {
            gw $$5 = gw.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fkd a() {
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
      final ehn a;
      int b;
      dfj c;

      a(int $$0, dfj $$1, ehn $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fkd.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dfj $$0) {
         this.c = $$0;
      }
   }
}
