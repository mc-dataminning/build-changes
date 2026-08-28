import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class avz {
   protected final Set<alb> a = Sets.newHashSet();
   protected final Set<alb> b = Sets.newHashSet();
   private final awa c = new awa();

   public void a(avz $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cys<?> $$0) {
      if (!$$0.b().ao_()) {
         this.a($$0.a());
      }
   }

   protected void a(alb $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cys<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(alb $$0) {
      return this.a.contains($$0);
   }

   public void c(cys<?> $$0) {
      this.c($$0.a());
   }

   protected void c(alb $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cys<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cys<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cys<?> $$0) {
      this.d($$0.a());
   }

   protected void d(alb $$0) {
      this.b.add($$0);
   }

   public boolean a(crd $$0) {
      return this.c.a($$0);
   }

   public void a(crd $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(crc<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(crd $$0) {
      return this.c.b($$0);
   }

   public void b(crd $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(awa $$0) {
      this.c.a($$0);
   }

   public awa a() {
      return this.c.a();
   }

   public void a(crd $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
