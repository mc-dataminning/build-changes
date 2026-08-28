import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class ame {
   private final Map<alb, amd> a = Maps.newHashMap();

   @Nullable
   public amd a(alb $$0) {
      return this.a.get($$0);
   }

   public amd a(alb $$0, xd $$1) {
      amd $$2 = new amd($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(amd $$0) {
      this.a.remove($$0.a());
   }

   public Collection<alb> a() {
      return this.a.keySet();
   }

   public Collection<amd> b() {
      return this.a.values();
   }

   public uf a(jp.a $$0) {
      uf $$1 = new uf();

      for (amd $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(uf $$0, jp.a $$1) {
      for (String $$2 : $$0.e()) {
         alb $$3 = alb.a($$2);
         this.a.put($$3, amd.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(arh $$0) {
      for (amd $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(arh $$0) {
      for (amd $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
