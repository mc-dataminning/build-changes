import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class adv implements zb<abm> {
   public static final ys<vu, adv> a = zb.a(adv::a, adv::new);
   private final adv.a b;
   private final List<akh> c;
   private final List<akh> d;
   private final avg e;

   public adv(adv.a $$0, Collection<akh> $$1, Collection<akh> $$2, avg $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private adv(vu $$0) {
      this.b = $$0.b(adv.a.class);
      this.e = avg.a($$0);
      this.c = $$0.a(vu::q);
      if (this.b == adv.a.a) {
         this.d = $$0.a(vu::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, vu::a);
      if (this.b == adv.a.a) {
         $$0.a(this.d, vu::a);
      }
   }

   @Override
   public zd<adv> a() {
      return afx.ai;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public List<akh> b() {
      return this.c;
   }

   public List<akh> e() {
      return this.d;
   }

   public avg f() {
      return this.e;
   }

   public adv.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
