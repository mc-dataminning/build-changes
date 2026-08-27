import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fjf implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fjf.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(gv $$0, dey $$1, fmi $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fjf.a(this.b, $$1, $$2.di()));
   }

   public boolean a(gv $$0, dey $$1) {
      fjf.a $$2 = (fjf.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fie $$1) {
      ObjectIterator<Entry<fjf.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fjf.a> $$3 = (Entry<fjf.a>)$$2.next();
         fjf.a $$4 = (fjf.a)$$3.getValue();
         if ($$4.b <= $$0) {
            gv $$5 = gv.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fjf a() {
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
      final ehf a;
      int b;
      dey c;

      a(int $$0, dey $$1, ehf $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fjf.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dey $$0) {
         this.c = $$0;
      }
   }
}
