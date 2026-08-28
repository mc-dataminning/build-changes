import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class avs {
   protected final Set<akr> a = Sets.newHashSet();
   protected final Set<akr> b = Sets.newHashSet();
   private final avt c = new avt();

   public void a(avs $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(czb<?> $$0) {
      if (!$$0.b().as_()) {
         this.a($$0.a());
      }
   }

   protected void a(akr $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable czb<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(akr $$0) {
      return this.a.contains($$0);
   }

   public void c(czb<?> $$0) {
      this.c($$0.a());
   }

   protected void c(akr $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(czb<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(czb<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(czb<?> $$0) {
      this.d($$0.a());
   }

   protected void d(akr $$0) {
      this.b.add($$0);
   }

   public boolean a(crj $$0) {
      return this.c.a($$0);
   }

   public void a(crj $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cri<?, ?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(crj $$0) {
      return this.c.b($$0);
   }

   public void b(crj $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(avt $$0) {
      this.c.a($$0);
   }

   public avt a() {
      return this.c.a();
   }

   public void a(crj $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
