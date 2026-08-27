import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class djb {
   private Int2ObjectMap<bil> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bil> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bil> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bil> $$0 = (Entry<bil>)$$1.next();
            this.b.put($$0.getIntKey(), (bil)$$0.getValue());
         }

         Int2ObjectMap<bil> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bil $$0) {
      this.a();
      this.a.put($$0.ah(), $$0);
   }

   public void b(bil $$0) {
      this.a();
      this.a.remove($$0.ah());
   }

   public boolean c(bil $$0) {
      return this.a.containsKey($$0.ah());
   }

   public void a(Consumer<bil> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bil $$1 = (bil)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
