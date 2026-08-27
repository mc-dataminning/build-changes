import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fjk implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fjk.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(gu $$0, dfa $$1, fmn $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fjk.a(this.b, $$1, $$2.di()));
   }

   public boolean a(gu $$0, dfa $$1) {
      fjk.a $$2 = (fjk.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fii $$1) {
      ObjectIterator<Entry<fjk.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fjk.a> $$3 = (Entry<fjk.a>)$$2.next();
         fjk.a $$4 = (fjk.a)$$3.getValue();
         if ($$4.b <= $$0) {
            gu $$5 = gu.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fjk a() {
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
      final ehe a;
      int b;
      dfa c;

      a(int $$0, dfa $$1, ehe $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fjk.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dfa $$0) {
         this.c = $$0;
      }
   }
}
