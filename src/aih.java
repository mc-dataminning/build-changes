import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class aih {
   private final Map<ahh, aig> a = Maps.newHashMap();

   @Nullable
   public aig a(ahh $$0) {
      return this.a.get($$0);
   }

   public aig a(ahh $$0, vg $$1) {
      aig $$2 = new aig($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(aig $$0) {
      this.a.remove($$0.a());
   }

   public Collection<ahh> a() {
      return this.a.keySet();
   }

   public Collection<aig> b() {
      return this.a.values();
   }

   public so c() {
      so $$0 = new so();

      for (aig $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(so $$0) {
      for (String $$1 : $$0.e()) {
         ahh $$2 = new ahh($$1);
         this.a.put($$2, aig.a($$0.p($$1), $$2));
      }
   }

   public void a(anf $$0) {
      for (aig $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(anf $$0) {
      for (aig $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
