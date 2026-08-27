import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fte {
   public final Int2ObjectMap<ggu> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<ggn> b = new Int2ObjectOpenHashMap(256);
   private final ggt c;

   public fte(ggt $$0) {
      this.c = $$0;
   }

   public ggn a(cmy $$0) {
      ggn $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public ggn a(cmt $$0) {
      return (ggn)this.b.get(b($$0));
   }

   private static int b(cmt $$0) {
      return cmt.a($$0);
   }

   public void a(cmt $$0, ggu $$1) {
      this.a.put(b($$0), $$1);
   }

   public ggt a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, ggu> $$0 = (Entry<Integer, ggu>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
