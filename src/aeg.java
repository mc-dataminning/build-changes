import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aeg implements zl<abw> {
   public static final zc<we, aeg> a = zl.a(aeg::a, aeg::new);
   private final aeg.a b;
   private final List<akt> c;
   private final List<akt> d;
   private final avt e;

   public aeg(aeg.a $$0, Collection<akt> $$1, Collection<akt> $$2, avt $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private aeg(we $$0) {
      this.b = $$0.b(aeg.a.class);
      this.e = avt.a($$0);
      this.c = $$0.a(we::q);
      if (this.b == aeg.a.a) {
         this.d = $$0.a(we::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(we $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, we::a);
      if (this.b == aeg.a.a) {
         $$0.a(this.d, we::a);
      }
   }

   @Override
   public zn<aeg> a() {
      return agj.aj;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public List<akt> b() {
      return this.c;
   }

   public List<akt> e() {
      return this.d;
   }

   public avt f() {
      return this.e;
   }

   public aeg.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
