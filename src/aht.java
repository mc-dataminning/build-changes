import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class aht {
   private final Map<agt, ahs> a = Maps.newHashMap();

   @Nullable
   public ahs a(agt $$0) {
      return this.a.get($$0);
   }

   public ahs a(agt $$0, vb $$1) {
      ahs $$2 = new ahs($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(ahs $$0) {
      this.a.remove($$0.a());
   }

   public Collection<agt> a() {
      return this.a.keySet();
   }

   public Collection<ahs> b() {
      return this.a.values();
   }

   public sj c() {
      sj $$0 = new sj();

      for (ahs $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(sj $$0) {
      for (String $$1 : $$0.e()) {
         agt $$2 = new agt($$1);
         this.a.put($$2, ahs.a($$0.p($$1), $$2));
      }
   }

   public void a(amq $$0) {
      for (ahs $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(amq $$0) {
      for (ahs $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
