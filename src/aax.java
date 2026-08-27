import java.util.HashSet;
import java.util.Set;

public record aax(Set<akf> b) implements yz<aat> {
   public static final yq<vs, aax> a = yz.a(aax::a, aax::new);

   private aax(vs $$0) {
      this($$0.a(HashSet::new, vs::q));
   }

   private void a(vs $$0) {
      $$0.a(this.b, vs::a);
   }

   @Override
   public zb<aax> a() {
      return aay.c;
   }

   public void a(aat $$0) {
      $$0.a(this);
   }
}
