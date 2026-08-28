import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class amk {
   private final Map<alh, amj> a = Maps.newHashMap();

   @Nullable
   public amj a(alh $$0) {
      return this.a.get($$0);
   }

   public amj a(alh $$0, xh $$1) {
      amj $$2 = new amj($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(amj $$0) {
      this.a.remove($$0.a());
   }

   public Collection<alh> a() {
      return this.a.keySet();
   }

   public Collection<amj> b() {
      return this.a.values();
   }

   public uj a(jr.a $$0) {
      uj $$1 = new uj();

      for (amj $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(uj $$0, jr.a $$1) {
      for (String $$2 : $$0.e()) {
         alh $$3 = alh.a($$2);
         this.a.put($$3, amj.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(arn $$0) {
      for (amj $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(arn $$0) {
      for (amj $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
