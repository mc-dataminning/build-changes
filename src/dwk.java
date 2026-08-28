import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwk {
   private Int2ObjectMap<bsw> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<bsw> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<bsw> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<bsw> $$0 = (Entry<bsw>)$$1.next();
            this.b.put($$0.getIntKey(), (bsw)$$0.getValue());
         }

         Int2ObjectMap<bsw> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(bsw $$0) {
      this.a();
      this.a.put($$0.al(), $$0);
   }

   public void b(bsw $$0) {
      this.a();
      this.a.remove($$0.al());
   }

   public boolean c(bsw $$0) {
      return this.a.containsKey($$0.al());
   }

   public void a(Consumer<bsw> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               bsw $$1 = (bsw)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
