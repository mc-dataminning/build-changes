import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class aes implements zw<aci> {
   public static final zn<wm, aes> a = zw.a(aes::a, aes::new);
   private final aes.a b;
   private final List<alf> c;
   private final List<alf> d;
   private final awe e;

   public aes(aes.a $$0, Collection<alf> $$1, Collection<alf> $$2, awe $$3) {
      this.b = $$0;
      this.c = ImmutableList.copyOf($$1);
      this.d = ImmutableList.copyOf($$2);
      this.e = $$3;
   }

   private aes(wm $$0) {
      this.b = $$0.b(aes.a.class);
      this.e = awe.a($$0);
      this.c = $$0.a(wm::q);
      if (this.b == aes.a.a) {
         this.d = $$0.a(wm::q);
      } else {
         this.d = ImmutableList.of();
      }
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      this.e.b($$0);
      $$0.a(this.c, wm::a);
      if (this.b == aes.a.a) {
         $$0.a(this.d, wm::a);
      }
   }

   @Override
   public zy<aes> a() {
      return agu.ai;
   }

   public void a(aci $$0) {
      $$0.a(this);
   }

   public List<alf> b() {
      return this.c;
   }

   public List<alf> e() {
      return this.d;
   }

   public awe f() {
      return this.e;
   }

   public aes.a g() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
