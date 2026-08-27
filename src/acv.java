import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class acv implements yb<aam> {
   public static final xs<uu, acv> a = yb.a(acv::a, acv::new);
   private final acv.a b;
   private final List<ajh> c;
   private final List<ajh> d;
   private final auc e;

   public acv(acv.a $$0, Collection<ajh> $$1, Collection<ajh> $$2, auc $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private acv(uu $$0) {
      this.b = $$0.b(acv.a.class);
      this.e = auc.a($$0);
      this.c = $$0.a(uu::q);
      if (this.b == acv.a.a) {
         this.d = $$0.a(uu::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(uu $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, uu::a);
      if (this.b == acv.a.a) {
         $$0.a(this.d, uu::a);
      }
   }

   @Override
   public yd<acv> a() {
      return aex.ai;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public List<ajh> b() {
      return this.c;
   }

   public List<ajh> e() {
      return this.d;
   }

   public auc f() {
      return this.e;
   }

   public acv.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
