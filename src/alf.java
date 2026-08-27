import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class alf {
   private final Map<akf, ale> a = Maps.newHashMap();

   @Nullable
   public ale a(akf $$0) {
      return this.a.get($$0);
   }

   public ale a(akf $$0, ws $$1) {
      ale $$2 = new ale($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(ale $$0) {
      this.a.remove($$0.a());
   }

   public Collection<akf> a() {
      return this.a.keySet();
   }

   public Collection<ale> b() {
      return this.a.values();
   }

   public ty a(ix.a $$0) {
      ty $$1 = new ty();

      for (ale $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(ty $$0, ix.a $$1) {
      for (String $$2 : $$0.e()) {
         akf $$3 = new akf($$2);
         this.a.put($$3, ale.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(aqf $$0) {
      for (ale $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(aqf $$0) {
      for (ale $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
