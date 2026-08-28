import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aeo implements zo<acd> {
   public static final zf<we, aeo> a = zo.a(aeo::a, aeo::new);
   private final aeo.a b;
   private final List<alh> c;
   private final List<alh> d;
   private final awo e;

   public aeo(aeo.a $$0, Collection<alh> $$1, Collection<alh> $$2, awo $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private aeo(we $$0) {
      this.b = $$0.b(aeo.a.class);
      this.e = awo.a($$0);
      this.c = $$0.a(we::q);
      if (this.b == aeo.a.a) {
         this.d = $$0.a(we::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(we $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, we::a);
      if (this.b == aeo.a.a) {
         $$0.a(this.d, we::a);
      }
   }

   @Override
   public zq<aeo> a() {
      return ags.aj;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public List<alh> b() {
      return this.c;
   }

   public List<alh> e() {
      return this.d;
   }

   public awo f() {
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
