import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class aqy {
   protected final Set<agm> a = Sets.newHashSet();
   protected final Set<agm> b = Sets.newHashSet();
   private final aqz c = new aqz();

   public void a(aqy $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cov<?> $$0) {
      if (!$$0.b().ar_()) {
         this.a($$0.a());
      }
   }

   protected void a(agm $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cov<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(agm $$0) {
      return this.a.contains($$0);
   }

   public void c(cov<?> $$0) {
      this.c($$0.a());
   }

   protected void c(agm $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cov<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cov<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cov<?> $$0) {
      this.d($$0.a());
   }

   protected void d(agm $$0) {
      this.b.add($$0);
   }

   public boolean a(cif $$0) {
      return this.c.a($$0);
   }

   public void a(cif $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cie<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cif $$0) {
      return this.c.b($$0);
   }

   public void b(cif $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(aqz $$0) {
      this.c.a($$0);
   }

   public aqz a() {
      return this.c.a();
   }

   public void a(cif $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
