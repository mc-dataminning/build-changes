import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dpc {
   private Int2ObjectMap<bno> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bno> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bno> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bno> $$0 = (Entry<bno>)$$1.next();
            this.b.put($$0.getIntKey(), (bno)$$0.getValue());
         }

         Int2ObjectMap<bno> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bno $$0) {
      this.a();
      this.a.put($$0.aj(), $$0);
   }

   public void b(bno $$0) {
      this.a();
      this.a.remove($$0.aj());
   }

   public boolean c(bno $$0) {
      return this.a.containsKey($$0.aj());
   }

   public void a(Consumer<bno> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bno $$1 = (bno)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
