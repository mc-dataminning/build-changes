import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class frn implements AutoCloseable {
   private final Long2ObjectOpenHashMap<frn.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(hz $$0, dlj $$1, fuv $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new frn.a(this.b, $$1, $$2.dk()));
   }

   public boolean a(hz $$0, dlj $$1) {
      frn.a $$2 = (frn.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fqe $$1) {
      ObjectIterator<Entry<frn.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<frn.a> $$3 = (Entry<frn.a>)$$2.next();
         frn.a $$4 = (frn.a)$$3.getValue();
         if ($$4.b <= $$0) {
            hz $$5 = hz.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public frn a() {
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
      final enz a;
      int b;
      dlj c;

      a(int $$0, dlj $$1, enz $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      frn.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dlj $$0) {
         this.c = $$0;
      }
   }
}
