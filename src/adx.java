import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class adx implements zb<abn> {
   public static final ys<vr, adx> a = zb.a(adx::a, adx::new);
   private final adx.a b;
   private final List<akk> c;
   private final List<akk> d;
   private final avj e;

   public adx(adx.a $$0, Collection<akk> $$1, Collection<akk> $$2, avj $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private adx(vr $$0) {
      this.b = $$0.b(adx.a.class);
      this.e = avj.a($$0);
      this.c = $$0.a(vr::q);
      if (this.b == adx.a.a) {
         this.d = $$0.a(vr::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, vr::a);
      if (this.b == adx.a.a) {
         $$0.a(this.d, vr::a);
      }
   }

   @Override
   public zd<adx> a() {
      return afz.ai;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public List<akk> b() {
      return this.c;
   }

   public List<akk> e() {
      return this.d;
   }

   public avj f() {
      return this.e;
   }

   public adx.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
