import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class all {
   private final Map<akk, alk> a = Maps.newHashMap();

   @Nullable
   public alk a(akk $$0) {
      return this.a.get($$0);
   }

   public alk a(akk $$0, wu $$1) {
      alk $$2 = new alk($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(alk $$0) {
      this.a.remove($$0.a());
   }

   public Collection<akk> a() {
      return this.a.keySet();
   }

   public Collection<alk> b() {
      return this.a.values();
   }

   public tx a(jl.a $$0) {
      tx $$1 = new tx();

      for (alk $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(tx $$0, jl.a $$1) {
      for (String $$2 : $$0.e()) {
         akk $$3 = new akk($$2);
         this.a.put($$3, alk.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(aqn $$0) {
      for (alk $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(aqn $$0) {
      for (alk $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
