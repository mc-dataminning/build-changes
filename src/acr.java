import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class acr implements xz<aai> {
   public static final xq<us, acr> a = xz.a(acr::a, acr::new);
   private final acr.a b;
   private final List<ajc> c;
   private final List<ajc> d;
   private final att e;

   public acr(acr.a $$0, Collection<ajc> $$1, Collection<ajc> $$2, att $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private acr(us $$0) {
      this.b = $$0.b(acr.a.class);
      this.e = att.a($$0);
      this.c = $$0.a(us::q);
      if (this.b == acr.a.a) {
         this.d = $$0.a(us::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(us $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, us::a);
      if (this.b == acr.a.a) {
         $$0.a(this.d, us::a);
      }
   }

   @Override
   public yb<acr> a() {
      return aet.ai;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public List<ajc> b() {
      return this.c;
   }

   public List<ajc> e() {
      return this.d;
   }

   public att f() {
      return this.e;
   }

   public acr.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
