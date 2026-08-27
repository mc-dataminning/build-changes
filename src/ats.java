import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class ats {
   protected final Set<ajc> a = Sets.newHashSet();
   protected final Set<ajc> b = Sets.newHashSet();
   private final att c = new att();

   public void a(ats $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(csu<?> $$0) {
      if (!$$0.b().ar_()) {
         this.a($$0.a());
      }
   }

   protected void a(ajc $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable csu<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(ajc $$0) {
      return this.a.contains($$0);
   }

   public void c(csu<?> $$0) {
      this.c($$0.a());
   }

   protected void c(ajc $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(csu<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(csu<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(csu<?> $$0) {
      this.d($$0.a());
   }

   protected void d(ajc $$0) {
      this.b.add($$0);
   }

   public boolean a(cmi $$0) {
      return this.c.a($$0);
   }

   public void a(cmi $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cmh<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cmi $$0) {
      return this.c.b($$0);
   }

   public void b(cmi $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(att $$0) {
      this.c.a($$0);
   }

   public att a() {
      return this.c.a();
   }

   public void a(cmi $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
