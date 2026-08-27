import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aab implements wb<xu> {
   private final aab.a a;
   private final List<afw> b;
   private final List<afw> c;
   private final aqh d;

   public aab(aab.a $$0, Collection<afw> $$1, Collection<afw> $$2, aqh $$3) {
      this.a = $$0;
      this.b = ImmutableList.copyOf($$1);
      this.c = ImmutableList.copyOf($$2);
      this.d = $$3;
   }

   public aab(tl $$0) {
      this.a = $$0.b(aab.a.class);
      this.d = aqh.a($$0);
      this.b = $$0.a(tl::t);
      if (this.a == aab.a.a) {
         this.c = $$0.a(tl::t);
      } else {
         this.c = ImmutableList.of();
      }
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.a);
      this.d.b($$0);
      $$0.a(this.b, tl::a);
      if (this.a == aab.a.a) {
         $$0.a(this.c, tl::a);
      }
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public List<afw> a() {
      return this.b;
   }

   public List<afw> d() {
      return this.c;
   }

   public aqh e() {
      return this.d;
   }

   public aab.a f() {
      return this.a;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
