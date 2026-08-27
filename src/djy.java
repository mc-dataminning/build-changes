import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class djy {
   private Int2ObjectMap<bjt> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bjt> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bjt> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bjt> $$0 = (Entry<bjt>)$$1.next();
            this.b.put($$0.getIntKey(), (bjt)$$0.getValue());
         }

         Int2ObjectMap<bjt> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bjt $$0) {
      this.a();
      this.a.put($$0.ah(), $$0);
   }

   public void b(bjt $$0) {
      this.a();
      this.a.remove($$0.ah());
   }

   public boolean c(bjt $$0) {
      return this.a.containsKey($$0.ah());
   }

   public void a(Consumer<bjt> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bjt $$1 = (bjt)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
