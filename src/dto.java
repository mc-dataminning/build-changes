import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dto {
   private Int2ObjectMap<bqa> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bqa> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bqa> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bqa> $$0 = (Entry<bqa>)$$1.next();
            this.b.put($$0.getIntKey(), (bqa)$$0.getValue());
         }

         Int2ObjectMap<bqa> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bqa $$0) {
      this.a();
      this.a.put($$0.aj(), $$0);
   }

   public void b(bqa $$0) {
      this.a();
      this.a.remove($$0.aj());
   }

   public boolean c(bqa $$0) {
      return this.a.containsKey($$0.aj());
   }

   public void a(Consumer<bqa> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bqa $$1 = (bqa)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
