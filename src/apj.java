import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class apj {
   protected final Set<aez> a = Sets.newHashSet();
   protected final Set<aez> b = Sets.newHashSet();
   private final apk c = new apk();

   public void a(apj $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(cmq<?> $$0) {
      if (!$$0.b().am_()) {
         this.a($$0.a());
      }
   }

   protected void a(aez $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable cmq<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(aez $$0) {
      return this.a.contains($$0);
   }

   public void c(cmq<?> $$0) {
      this.c($$0.a());
   }

   protected void c(aez $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(cmq<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(cmq<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(cmq<?> $$0) {
      this.d($$0.a());
   }

   protected void d(aez $$0) {
      this.b.add($$0);
   }

   public boolean a(cgc $$0) {
      return this.c.a($$0);
   }

   public void a(cgc $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean a(cgb<?> $$0) {
      return this.b($$0.t());
   }

   public boolean b(cgc $$0) {
      return this.c.b($$0);
   }

   public void b(cgc $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(apk $$0) {
      this.c.a($$0);
   }

   public apk a() {
      return this.c.a();
   }

   public void a(cgc $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
