import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aeo implements zs<ace> {
   public static final zj<wl, aeo> a = zs.a(aeo::a, aeo::new);
   private final aeo.a b;
   private final List<alb> c;
   private final List<alb> d;
   private final awa e;

   public aeo(aeo.a $$0, Collection<alb> $$1, Collection<alb> $$2, awa $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private aeo(wl $$0) {
      this.b = $$0.b(aeo.a.class);
      this.e = awa.a($$0);
      this.c = $$0.a(wl::q);
      if (this.b == aeo.a.a) {
         this.d = $$0.a(wl::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, wl::a);
      if (this.b == aeo.a.a) {
         $$0.a(this.d, wl::a);
      }
   }

   @Override
   public zu<aeo> a() {
      return agq.ai;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public List<alb> b() {
      return this.c;
   }

   public List<alb> e() {
      return this.d;
   }

   public awa f() {
      return this.e;
   }

   public aeo.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
