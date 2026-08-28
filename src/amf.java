import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class amf {
   private final Map<alc, ame> a = Maps.newHashMap();

   @Nullable
   public ame a(alc $$0) {
      return this.a.get($$0);
   }

   public ame a(alc $$0, xd $$1) {
      ame $$2 = new ame($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(ame $$0) {
      this.a.remove($$0.a());
   }

   public Collection<alc> a() {
      return this.a.keySet();
   }

   public Collection<ame> b() {
      return this.a.values();
   }

   public uf a(jp.a $$0) {
      uf $$1 = new uf();

      for (ame $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(uf $$0, jp.a $$1) {
      for (String $$2 : $$0.e()) {
         alc $$3 = alc.a($$2);
         this.a.put($$3, ame.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(ari $$0) {
      for (ame $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(ari $$0) {
      for (ame $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
