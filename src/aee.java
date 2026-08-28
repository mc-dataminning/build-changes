import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aee implements zg<abu> {
   public static final yx<vw, aee> a = zg.a(aee::a, aee::new);
   private final aee.a b;
   private final List<akr> c;
   private final List<akr> d;
   private final avt e;

   public aee(aee.a $$0, Collection<akr> $$1, Collection<akr> $$2, avt $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private aee(vw $$0) {
      this.b = $$0.b(aee.a.class);
      this.e = avt.a($$0);
      this.c = $$0.a(vw::q);
      if (this.b == aee.a.a) {
         this.d = $$0.a(vw::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(vw $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, vw::a);
      if (this.b == aee.a.a) {
         $$0.a(this.d, vw::a);
      }
   }

   @Override
   public zi<aee> a() {
      return agg.ai;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public List<akr> b() {
      return this.c;
   }

   public List<akr> e() {
      return this.d;
   }

   public avt f() {
      return this.e;
   }

   public aee.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
