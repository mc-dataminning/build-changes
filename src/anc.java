import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class anc {
   private final Map<alz, anb> a = Maps.newHashMap();

   @Nullable
   public anb a(alz $$0) {
      return this.a.get($$0);
   }

   public anb a(alz $$0, xv $$1) {
      anb $$2 = new anb($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(anb $$0) {
      this.a.remove($$0.a());
   }

   public Collection<alz> a() {
      return this.a.keySet();
   }

   public Collection<anb> b() {
      return this.a.values();
   }

   public ux a(js.a $$0) {
      ux $$1 = new ux();

      for (anb $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(ux $$0, js.a $$1) {
      for (String $$2 : $$0.e()) {
         alz $$3 = alz.a($$2);
         this.a.put($$3, anb.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(asi $$0) {
      for (anb $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(asi $$0) {
      for (anb $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
