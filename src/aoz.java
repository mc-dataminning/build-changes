import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class aoz {
   protected final Set<aer> a = Sets.newHashSet();
   protected final Set<aer> b = Sets.newHashSet();
   private final apa c = new apa();

   public void a(aoz $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cmb<?> $$0) {
      if (!$$0.ai_()) {
         this.a($$0.e());
      }
   }

   protected void a(aer $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cmb<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.e());
   }

   public boolean b(aer $$0) {
      return this.a.contains($$0);
   }

   public void c(cmb<?> $$0) {
      this.c($$0.e());
   }

   protected void c(aer $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cmb<?> $$0) {
      return this.b.contains($$0.e());
   }

   public void e(cmb<?> $$0) {
      this.b.remove($$0.e());
   }

   public void f(cmb<?> $$0) {
      this.d($$0.e());
   }

   protected void d(aer $$0) {
      this.b.add($$0);
   }

   public boolean a(cfp $$0) {
      return this.c.a($$0);
   }

   public void a(cfp $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cfo<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cfp $$0) {
      return this.c.b($$0);
   }

   public void b(cfp $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(apa $$0) {
      this.c.a($$0);
   }

   public apa a() {
      return this.c.a();
   }

   public void a(cfp $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
