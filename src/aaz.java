import java.util.HashSet;
import java.util.Set;

public record aaz(Set<akh> b) implements zb<aav> {
   public static final ys<vu, aaz> a = zb.a(aaz::a, aaz::new);

   private aaz(vu $$0) {
      this($$0.a(HashSet::new, vu::q));
   }

   private void a(vu $$0) {
      $$0.a(this.b, vu::a);
   }

   @Override
   public zd<aaz> a() {
      return aba.c;
   }

   public void a(aav $$0) {
      $$0.a(this);
   }
}
