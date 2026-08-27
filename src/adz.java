import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class adz implements ze<abq> {
   public static final yv<vx, adz> a = ze.a(adz::a, adz::new);
   private final adz.a b;
   private final List<akm> c;
   private final List<akm> d;
   private final avl e;

   public adz(adz.a $$0, Collection<akm> $$1, Collection<akm> $$2, avl $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private adz(vx $$0) {
      this.b = $$0.b(adz.a.class);
      this.e = avl.a($$0);
      this.c = $$0.a(vx::q);
      if (this.b == adz.a.a) {
         this.d = $$0.a(vx::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(vx $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, vx::a);
      if (this.b == adz.a.a) {
         $$0.a(this.d, vx::a);
      }
   }

   @Override
   public zg<adz> a() {
      return agb.ai;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public List<akm> b() {
      return this.c;
   }

   public List<akm> e() {
      return this.d;
   }

   public avl f() {
      return this.e;
   }

   public adz.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
