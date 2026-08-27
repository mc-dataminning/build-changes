import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class avl {
   protected final Set<akn> a = Sets.newHashSet();
   protected final Set<akn> b = Sets.newHashSet();
   private final avm c = new avm();

   public void a(avl $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cxy<?> $$0) {
      if (!$$0.b().ao_()) {
         this.a($$0.a());
      }
   }

   protected void a(akn $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cxy<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(akn $$0) {
      return this.a.contains($$0);
   }

   public void c(cxy<?> $$0) {
      this.c($$0.a());
   }

   protected void c(akn $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cxy<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cxy<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cxy<?> $$0) {
      this.d($$0.a());
   }

   protected void d(akn $$0) {
      this.b.add($$0);
   }

   public boolean a(cqj $$0) {
      return this.c.a($$0);
   }

   public void a(cqj $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cqi<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cqj $$0) {
      return this.c.b($$0);
   }

   public void b(cqj $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(avm $$0) {
      this.c.a($$0);
   }

   public avm a() {
      return this.c.a();
   }

   public void a(cqj $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
