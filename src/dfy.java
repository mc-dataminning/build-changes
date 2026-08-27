import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dfy {
   private Int2ObjectMap<bfj> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bfj> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bfj> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bfj> $$0 = (Entry<bfj>)$$1.next();
            this.b.put($$0.getIntKey(), (bfj)$$0.getValue());
         }

         Int2ObjectMap<bfj> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bfj $$0) {
      this.a();
      this.a.put($$0.af(), $$0);
   }

   public void b(bfj $$0) {
      this.a();
      this.a.remove($$0.af());
   }

   public boolean c(bfj $$0) {
      return this.a.containsKey($$0.af());
   }

   public void a(Consumer<bfj> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bfj $$1 = (bfj)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
