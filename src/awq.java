import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;

public class awq {
   protected final Set<alj> a = Sets.newHashSet();
   protected final Set<alj> b = Sets.newHashSet();
   private final awr c = new awr();

   public void a(awq $$0) {
      this.a.clear();
      this.b.clear();
      this.c.a($$0.c);
      this.a.addAll($$0.a);
      this.b.addAll($$0.b);
   }

   public void a(dbc<?> $$0) {
      if (!$$0.b().ao_()) {
         this.a($$0.a());
      }
   }

   protected void a(alj $$0) {
      this.a.add($$0);
   }

   public boolean b(@Nullable dbc<?> $$0) {
      return $$0 == null ? false : this.a.contains($$0.a());
   }

   public boolean b(alj $$0) {
      return this.a.contains($$0);
   }

   public void c(dbc<?> $$0) {
      this.c($$0.a());
   }

   protected void c(alj $$0) {
      this.a.remove($$0);
      this.b.remove($$0);
   }

   public boolean d(dbc<?> $$0) {
      return this.b.contains($$0.a());
   }

   public void e(dbc<?> $$0) {
      this.b.remove($$0.a());
   }

   public void f(dbc<?> $$0) {
      this.d($$0.a());
   }

   protected void d(alj $$0) {
      this.b.add($$0);
   }

   public boolean a(ctp $$0) {
      return this.c.a($$0);
   }

   public void a(ctp $$0, boolean $$1) {
      this.c.a($$0, $$1);
   }

   public boolean b(ctp $$0) {
      return this.c.b($$0);
   }

   public void b(ctp $$0, boolean $$1) {
      this.c.b($$0, $$1);
   }

   public void a(awr $$0) {
      this.c.a($$0);
   }

   public awr a() {
      return this.c.a();
   }

   public void a(ctp $$0, boolean $$1, boolean $$2) {
      this.c.a($$0, $$1);
      this.c.b($$0, $$2);
   }
}
