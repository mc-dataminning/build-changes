import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class apc {
   protected final Set<aeu> a = Sets.newHashSet();
   protected final Set<aeu> b = Sets.newHashSet();
   private final apd c = new apd();

   public void a(apc $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cmf<?> $$0) {
      if (!$$0.b().ah_()) {
         this.a($$0.a());
      }
   }

   protected void a(aeu $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cmf<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(aeu $$0) {
      return this.a.contains($$0);
   }

   public void c(cmf<?> $$0) {
      this.c($$0.a());
   }

   protected void c(aeu $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cmf<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cmf<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cmf<?> $$0) {
      this.d($$0.a());
   }

   protected void d(aeu $$0) {
      this.b.add($$0);
   }

   public boolean a(cfr $$0) {
      return this.c.a($$0);
   }

   public void a(cfr $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cfq<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cfr $$0) {
      return this.c.b($$0);
   }

   public void b(cfr $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(apd $$0) {
      this.c.a($$0);
   }

   public apd a() {
      return this.c.a();
   }

   public void a(cfr $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
