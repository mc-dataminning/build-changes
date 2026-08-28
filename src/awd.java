import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class awd {
   protected final Set<alf> a = Sets.newHashSet();
   protected final Set<alf> b = Sets.newHashSet();
   private final awe c = new awe();

   public void a(awd $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cyz<?> $$0) {
      if (!$$0.b().an_()) {
         this.a($$0.a());
      }
   }

   protected void a(alf $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cyz<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(alf $$0) {
      return this.a.contains($$0);
   }

   public void c(cyz<?> $$0) {
      this.c($$0.a());
   }

   protected void c(alf $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cyz<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cyz<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cyz<?> $$0) {
      this.d($$0.a());
   }

   protected void d(alf $$0) {
      this.b.add($$0);
   }

   public boolean a(crk $$0) {
      return this.c.a($$0);
   }

   public void a(crk $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(crj<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(crk $$0) {
      return this.c.b($$0);
   }

   public void b(crk $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(awe $$0) {
      this.c.a($$0);
   }

   public awe a() {
      return this.c.a();
   }

   public void a(crk $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
