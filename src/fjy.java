import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class fjy implements AutoCloseable {
   private final Long2ObjectOpenHashMap<fjy.a> a = new Long2ObjectOpenHashMap();
   private int b;
   private boolean c;

   public void a(gw $$0, dfe $$1, fnb $$2) {
      this.a.compute($$0.a(), ($$2x, $$3) -> $$3 != null ? $$3.a(this.b) : new fjy.a(this.b, $$1, $$2.di()));
   }

   public boolean a(gw $$0, dfe $$1) {
      fjy.a $$2 = (fjy.a)this.a.get($$0.a());
      if ($$2 == null) {
         return false;
      } else {
         $$2.a($$1);
         return true;
      }
   }

   public void a(int $$0, fis $$1) {
      ObjectIterator<Entry<fjy.a>> $$2 = this.a.long2ObjectEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<fjy.a> $$3 = (Entry<fjy.a>)$$2.next();
         fjy.a $$4 = (fjy.a)$$3.getValue();
         if ($$4.b <= $$0) {
            gw $$5 = gw.d($$3.getLongKey());
            $$2.remove();
            $$1.a($$5, $$4.c, $$4.a);
         }
      }
   }

   public fjy a() {
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
      final ehi a;
      int b;
      dfe c;

      a(int $$0, dfe $$1, ehi $$2) {
         this.b = $$0;
         this.c = $$1;
         this.a = $$2;
      }

      fjy.a a(int $$0) {
         this.b = $$0;
         return this;
      }

      void a(dfe $$0) {
         this.c = $$0;
      }
   }
}
