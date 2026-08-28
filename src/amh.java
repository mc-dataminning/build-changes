import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class amh {
   private final Map<ale, amg> a = Maps.newHashMap();

   @Nullable
   public amg a(ale $$0) {
      return this.a.get($$0);
   }

   public amg a(ale $$0, ww $$1) {
      amg $$2 = new amg($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(amg $$0) {
      this.a.remove($$0.a());
   }

   public Collection<ale> a() {
      return this.a.keySet();
   }

   public Collection<amg> b() {
      return this.a.values();
   }

   public tx a(jg.a $$0) {
      tx $$1 = new tx();

      for (amg $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(tx $$0, jg.a $$1) {
      for (String $$2 : $$0.e()) {
         ale $$3 = ale.a($$2);
         this.a.put($$3, amg.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(arp $$0) {
      for (amg $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(arp $$0) {
      for (amg $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
