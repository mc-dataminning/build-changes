import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aed implements zf<abt> {
   public static final yw<vv, aed> a = zf.a(aed::a, aed::new);
   private final aed.a b;
   private final List<akq> c;
   private final List<akq> d;
   private final avs e;

   public aed(aed.a $$0, Collection<akq> $$1, Collection<akq> $$2, avs $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private aed(vv $$0) {
      this.b = $$0.b(aed.a.class);
      this.e = avs.a($$0);
      this.c = $$0.a(vv::q);
      if (this.b == aed.a.a) {
         this.d = $$0.a(vv::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(vv $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, vv::a);
      if (this.b == aed.a.a) {
         $$0.a(this.d, vv::a);
      }
   }

   @Override
   public zh<aed> a() {
      return agf.ai;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public List<akq> b() {
      return this.c;
   }

   public List<akq> e() {
      return this.d;
   }

   public avs f() {
      return this.e;
   }

   public aed.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
