import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class ato {
   protected final Set<aiy> a = Sets.newHashSet();
   protected final Set<aiy> b = Sets.newHashSet();
   private final atp c = new atp();

   public void a(ato $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(csh<?> $$0) {
      if (!$$0.b().as_()) {
         this.a($$0.a());
      }
   }

   protected void a(aiy $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable csh<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(aiy $$0) {
      return this.a.contains($$0);
   }

   public void c(csh<?> $$0) {
      this.c($$0.a());
   }

   protected void c(aiy $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(csh<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(csh<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(csh<?> $$0) {
      this.d($$0.a());
   }

   protected void d(aiy $$0) {
      this.b.add($$0);
   }

   public boolean a(clt $$0) {
      return this.c.a($$0);
   }

   public void a(clt $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cls<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(clt $$0) {
      return this.c.b($$0);
   }

   public void b(clt $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(atp $$0) {
      this.c.a($$0);
   }

   public atp a() {
      return this.c.a();
   }

   public void a(clt $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
