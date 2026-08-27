import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class alo {
   private final Map<akn, aln> a = Maps.newHashMap();

   @Nullable
   public aln a(akn $$0) {
      return this.a.get($$0);
   }

   public aln a(akn $$0, wx $$1) {
      aln $$2 = new aln($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(aln $$0) {
      this.a.remove($$0.a());
   }

   public Collection<akn> a() {
      return this.a.keySet();
   }

   public Collection<aln> b() {
      return this.a.values();
   }

   public ud a(iz.a $$0) {
      ud $$1 = new ud();

      for (aln $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(ud $$0, iz.a $$1) {
      for (String $$2 : $$0.e()) {
         akn $$3 = new akn($$2);
         this.a.put($$3, aln.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(aqo $$0) {
      for (aln $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(aqo $$0) {
      for (aln $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
