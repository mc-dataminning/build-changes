import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class avc {
   protected final Set<akf> a = Sets.newHashSet();
   protected final Set<akf> b = Sets.newHashSet();
   private final avd c = new avd();

   public void a(avc $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cwi<?> $$0) {
      if (!$$0.b().an_()) {
         this.a($$0.a());
      }
   }

   protected void a(akf $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cwi<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(akf $$0) {
      return this.a.contains($$0);
   }

   public void c(cwi<?> $$0) {
      this.c($$0.a());
   }

   protected void c(akf $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cwi<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cwi<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cwi<?> $$0) {
      this.d($$0.a());
   }

   protected void d(akf $$0) {
      this.b.add($$0);
   }

   public boolean a(cow $$0) {
      return this.c.a($$0);
   }

   public void a(cow $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cov<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cow $$0) {
      return this.c.b($$0);
   }

   public void b(cow $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(avd $$0) {
      this.c.a($$0);
   }

   public avd a() {
      return this.c.a();
   }

   public void a(cow $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
