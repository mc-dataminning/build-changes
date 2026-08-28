import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class avi {
   protected final Set<akk> a = Sets.newHashSet();
   protected final Set<akk> b = Sets.newHashSet();
   private final avj c = new avj();

   public void a(avi $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cyi<?> $$0) {
      if (!$$0.b().ao_()) {
         this.a($$0.a());
      }
   }

   protected void a(akk $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cyi<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(akk $$0) {
      return this.a.contains($$0);
   }

   public void c(cyi<?> $$0) {
      this.c($$0.a());
   }

   protected void c(akk $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cyi<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cyi<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cyi<?> $$0) {
      this.d($$0.a());
   }

   protected void d(akk $$0) {
      this.b.add($$0);
   }

   public boolean a(cqt $$0) {
      return this.c.a($$0);
   }

   public void a(cqt $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cqs<?, ?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cqt $$0) {
      return this.c.b($$0);
   }

   public void b(cqt $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(avj $$0) {
      this.c.a($$0);
   }

   public avj a() {
      return this.c.a();
   }

   public void a(cqt $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
