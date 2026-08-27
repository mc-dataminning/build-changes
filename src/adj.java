import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class adj implements yp<aba> {
   public static final yg<vi, adj> a = yp.a(adj::a, adj::new);
   private final adj.a b;
   private final List<ajv> c;
   private final List<ajv> d;
   private final aus e;

   public adj(adj.a $$0, Collection<ajv> $$1, Collection<ajv> $$2, aus $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private adj(vi $$0) {
      this.b = $$0.b(adj.a.class);
      this.e = aus.a($$0);
      this.c = $$0.a(vi::q);
      if (this.b == adj.a.a) {
         this.d = $$0.a(vi::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, vi::a);
      if (this.b == adj.a.a) {
         $$0.a(this.d, vi::a);
      }
   }

   @Override
   public yr<adj> a() {
      return afl.ai;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public List<ajv> b() {
      return this.c;
   }

   public List<ajv> e() {
      return this.d;
   }

   public aus f() {
      return this.e;
   }

   public adj.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
