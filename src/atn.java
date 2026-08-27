import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class atn {
   protected final Set<aiy> a = Sets.newHashSet();
   protected final Set<aiy> b = Sets.newHashSet();
   private final ato c = new ato();

   public void a(atn $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(csd<?> $$0) {
      if (!$$0.b().as_()) {
         this.a($$0.a());
      }
   }

   protected void a(aiy $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable csd<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(aiy $$0) {
      return this.a.contains($$0);
   }

   public void c(csd<?> $$0) {
      this.c($$0.a());
   }

   protected void c(aiy $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(csd<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(csd<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(csd<?> $$0) {
      this.d($$0.a());
   }

   protected void d(aiy $$0) {
      this.b.add($$0);
   }

   public boolean a(clp $$0) {
      return this.c.a($$0);
   }

   public void a(clp $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(clo<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(clp $$0) {
      return this.c.b($$0);
   }

   public void b(clp $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(ato $$0) {
      this.c.a($$0);
   }

   public ato a() {
      return this.c.a();
   }

   public void a(clp $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
