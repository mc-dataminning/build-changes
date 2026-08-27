import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class api {
   protected final Set<aey> a = Sets.newHashSet();
   protected final Set<aey> b = Sets.newHashSet();
   private final apj c = new apj();

   public void a(api $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cmm<?> $$0) {
      if (!$$0.b().am_()) {
         this.a($$0.a());
      }
   }

   protected void a(aey $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cmm<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(aey $$0) {
      return this.a.contains($$0);
   }

   public void c(cmm<?> $$0) {
      this.c($$0.a());
   }

   protected void c(aey $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cmm<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cmm<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cmm<?> $$0) {
      this.d($$0.a());
   }

   protected void d(aey $$0) {
      this.b.add($$0);
   }

   public boolean a(cfy $$0) {
      return this.c.a($$0);
   }

   public void a(cfy $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cfx<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cfy $$0) {
      return this.c.b($$0);
   }

   public void b(cfy $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(apj $$0) {
      this.c.a($$0);
   }

   public apj a() {
      return this.c.a();
   }

   public void a(cfy $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
