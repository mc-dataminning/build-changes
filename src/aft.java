import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class aft {
   private final Map<aeu, afs> a = Maps.newHashMap();

   @Nullable
   public afs a(aeu $$0) {
      return this.a.get($$0);
   }

   public afs a(aeu $$0, ti $$1) {
      afs $$2 = new afs($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(afs $$0) {
      this.a.remove($$0.a());
   }

   public Collection<aeu> a() {
      return this.a.keySet();
   }

   public Collection<afs> b() {
      return this.a.values();
   }

   public qu c() {
      qu $$0 = new qu();

      for (afs $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(qu $$0) {
      for (String $$1 : $$0.e()) {
         aeu $$2 = new aeu($$1);
         this.a.put($$2, afs.a($$0.p($$1), $$2));
      }
   }

   public void a(ako $$0) {
      for (afs $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(ako $$0) {
      for (afs $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
