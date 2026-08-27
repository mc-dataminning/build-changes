import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class aln {
   private final Map<akm, alm> a = Maps.newHashMap();

   @Nullable
   public alm a(akm $$0) {
      return this.a.get($$0);
   }

   public alm a(akm $$0, wx $$1) {
      alm $$2 = new alm($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(alm $$0) {
      this.a.remove($$0.a());
   }

   public Collection<akm> a() {
      return this.a.keySet();
   }

   public Collection<alm> b() {
      return this.a.values();
   }

   public ud a(iz.a $$0) {
      ud $$1 = new ud();

      for (alm $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(ud $$0, iz.a $$1) {
      for (String $$2 : $$0.e()) {
         akm $$3 = new akm($$2);
         this.a.put($$3, alm.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(aqn $$0) {
      for (alm $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(aqn $$0) {
      for (alm $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
