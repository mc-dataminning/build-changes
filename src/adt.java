import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class adt implements yz<abk> {
   public static final yq<vs, adt> a = yz.a(adt::a, adt::new);
   private final adt.a b;
   private final List<akf> c;
   private final List<akf> d;
   private final avd e;

   public adt(adt.a $$0, Collection<akf> $$1, Collection<akf> $$2, avd $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private adt(vs $$0) {
      this.b = $$0.b(adt.a.class);
      this.e = avd.a($$0);
      this.c = $$0.a(vs::q);
      if (this.b == adt.a.a) {
         this.d = $$0.a(vs::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, vs::a);
      if (this.b == adt.a.a) {
         $$0.a(this.d, vs::a);
      }
   }

   @Override
   public zb<adt> a() {
      return afv.ai;
   }

   public void a(abk $$0) {
      $$0.a(this);
   }

   public List<akf> b() {
      return this.c;
   }

   public List<akf> e() {
      return this.d;
   }

   public avd f() {
      return this.e;
   }

   public adt.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
