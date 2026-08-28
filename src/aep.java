import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aep implements zp<ace> {
   public static final zg<wf, aep> a = zp.a(aep::a, aep::new);
   private final aep.a b;
   private final List<ali> c;
   private final List<ali> d;
   private final awp e;

   public aep(aep.a $$0, Collection<ali> $$1, Collection<ali> $$2, awp $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private aep(wf $$0) {
      this.b = $$0.b(aep.a.class);
      this.e = awp.a($$0);
      this.c = $$0.a(wf::q);
      if (this.b == aep.a.a) {
         this.d = $$0.a(wf::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, wf::a);
      if (this.b == aep.a.a) {
         $$0.a(this.d, wf::a);
      }
   }

   @Override
   public zr<aep> a() {
      return agt.aj;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public List<ali> b() {
      return this.c;
   }

   public List<ali> e() {
      return this.d;
   }

   public awp f() {
      return this.e;
   }

   public aep.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
