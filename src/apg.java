import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class apg {
   protected final Set<aew> a = Sets.newHashSet();
   protected final Set<aew> b = Sets.newHashSet();
   private final aph c = new aph();

   public void a(apg $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cmk<?> $$0) {
      if (!$$0.b().am_()) {
         this.a($$0.a());
      }
   }

   protected void a(aew $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cmk<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(aew $$0) {
      return this.a.contains($$0);
   }

   public void c(cmk<?> $$0) {
      this.c($$0.a());
   }

   protected void c(aew $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cmk<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cmk<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cmk<?> $$0) {
      this.d($$0.a());
   }

   protected void d(aew $$0) {
      this.b.add($$0);
   }

   public boolean a(cfw $$0) {
      return this.c.a($$0);
   }

   public void a(cfw $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cfv<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cfw $$0) {
      return this.c.b($$0);
   }

   public void b(cfw $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(aph $$0) {
      this.c.a($$0);
   }

   public aph a() {
      return this.c.a();
   }

   public void a(cfw $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
