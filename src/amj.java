import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class amj {
   private final Map<alg, ami> a = Maps.newHashMap();

   @Nullable
   public ami a(alg $$0) {
      return this.a.get($$0);
   }

   public ami a(alg $$0, wy $$1) {
      ami $$2 = new ami($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(ami $$0) {
      this.a.remove($$0.a());
   }

   public Collection<alg> a() {
      return this.a.keySet();
   }

   public Collection<ami> b() {
      return this.a.values();
   }

   public tz a(jg.a $$0) {
      tz $$1 = new tz();

      for (ami $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(tz $$0, jg.a $$1) {
      for (String $$2 : $$0.e()) {
         alg $$3 = alg.a($$2);
         this.a.put($$3, ami.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(arr $$0) {
      for (ami $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(arr $$0) {
      for (ami $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
