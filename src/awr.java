import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class awr {
   protected final Set<all> a = Sets.newHashSet();
   protected final Set<all> b = Sets.newHashSet();
   private final aws c = new aws();

   public void a(awr $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(dav<?> $$0) {
      if (!$$0.b().ap_()) {
         this.a($$0.a());
      }
   }

   protected void a(all $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable dav<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(all $$0) {
      return this.a.contains($$0);
   }

   public void c(dav<?> $$0) {
      this.c($$0.a());
   }

   protected void c(all $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(dav<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(dav<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(dav<?> $$0) {
      this.d($$0.a());
   }

   protected void d(all $$0) {
      this.b.add($$0);
   }

   public boolean a(cti $$0) {
      return this.c.a($$0);
   }

   public void a(cti $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean b(cti $$0) {
      return this.c.b($$0);
   }

   public void b(cti $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(aws $$0) {
      this.c.a($$0);
   }

   public aws a() {
      return this.c.a();
   }

   public void a(cti $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
