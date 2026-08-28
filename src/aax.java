import java.util.HashSet;
import java.util.Set;

public record aax(Set<aku> b) implements yv<aas> {
   public static final ym<vl, aax> a = yv.a(aax::a, aax::new);

   private aax(vl $$0) {
      this($$0.a(HashSet::new, vl::q));
   }

   private void a(vl $$0) {
      $$0.a(this.b, vl::a);
   }

   @Override
   public yx<aax> a() {
      return aay.c;
   }

   public void a(aas $$0) {
      $$0.a(this);
   }
}
