import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class awn {
   protected final Set<alh> a = Sets.newHashSet();
   protected final Set<alh> b = Sets.newHashSet();
   private final awo c = new awo();

   public void a(awn $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(dal<?> $$0) {
      if (!$$0.b().aq_()) {
         this.a($$0.a());
      }
   }

   protected void a(alh $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable dal<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(alh $$0) {
      return this.a.contains($$0);
   }

   public void c(dal<?> $$0) {
      this.c($$0.a());
   }

   protected void c(alh $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(dal<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(dal<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(dal<?> $$0) {
      this.d($$0.a());
   }

   protected void d(alh $$0) {
      this.b.add($$0);
   }

   public boolean a(csz $$0) {
      return this.c.a($$0);
   }

   public void a(csz $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean b(csz $$0) {
      return this.c.b($$0);
   }

   public void b(csz $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(awo $$0) {
      this.c.a($$0);
   }

   public awo a() {
      return this.c.a();
   }

   public void a(csz $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
