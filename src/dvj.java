import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dvj {
   private Int2ObjectMap<brw> a = new Int2ObjectLinkedOpenHashMap();
   private Int2ObjectMap<brw> b = new Int2ObjectLinkedOpenHashMap();
   @Nullable
   private Int2ObjectMap<brw> c;

   private void a() {
      if (this.c == this.a) {
         this.b.clear();
         ObjectIterator $$1 = Int2ObjectMaps.fastIterable(this.a).iterator();

         while ($$1.hasNext()) {
            Entry<brw> $$0 = (Entry<brw>)$$1.next();
            this.b.put($$0.getIntKey(), (brw)$$0.getValue());
         }

         Int2ObjectMap<brw> $$1x = this.a;
         this.a = this.b;
         this.b = $$1x;
      }
   }

   public void a(brw $$0) {
      this.a();
      this.a.put($$0.al(), $$0);
   }

   public void b(brw $$0) {
      this.a();
      this.a.remove($$0.al());
   }

   public boolean c(brw $$0) {
      return this.a.containsKey($$0.al());
   }

   public void a(Consumer<brw> $$0) {
      if (this.c != null) {
         throw new UnsupportedOperationException("Only one concurrent iteration supported");
      } else {
         this.c = this.a;

         try {
            ObjectIterator var2 = this.a.values().iterator();

            while (var2.hasNext()) {
               brw $$1 = (brw)var2.next();
               $$0.accept($$1);
            }
         } finally {
            this.c = null;
         }
      }
   }
}
