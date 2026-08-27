import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class adh implements yn<aay> {
   public static final ye<vg, adh> a = yn.a(adh::a, adh::new);
   private final adh.a b;
   private final List<ajt> c;
   private final List<ajt> d;
   private final auq e;

   public adh(adh.a $$0, Collection<ajt> $$1, Collection<ajt> $$2, auq $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private adh(vg $$0) {
      this.b = $$0.b(adh.a.class);
      this.e = auq.a($$0);
      this.c = $$0.a(vg::q);
      if (this.b == adh.a.a) {
         this.d = $$0.a(vg::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(vg $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, vg::a);
      if (this.b == adh.a.a) {
         $$0.a(this.d, vg::a);
      }
   }

   @Override
   public yp<adh> a() {
      return afj.ai;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public List<ajt> b() {
      return this.c;
   }

   public List<ajt> e() {
      return this.d;
   }

   public auq f() {
      return this.e;
   }

   public adh.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
