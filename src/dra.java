import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dra {
   private Int2ObjectMap<bow> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bow> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bow> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bow> $$0 = (Entry<bow>)$$1.next();
            this.b.put($$0.getIntKey(), (bow)$$0.getValue());
         }

         Int2ObjectMap<bow> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bow $$0) {
      this.a();
      this.a.put($$0.aj(), $$0);
   }

   public void b(bow $$0) {
      this.a();
      this.a.remove($$0.aj());
   }

   public boolean c(bow $$0) {
      return this.a.containsKey($$0.aj());
   }

   public void a(Consumer<bow> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bow $$1 = (bow)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
