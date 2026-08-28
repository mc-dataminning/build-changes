import java.util.HashSet;
import java.util.Set;

public record aay(Set<aku> b) implements yw<aat> {
   public static final yn<vl, aay> a = yw.a(aay::a, aay::new);

   private aay(vl $$0) {
      this($$0.a(HashSet::new, vl::q));
   }

   private void a(vl $$0) {
      $$0.a(this.b, vl::a);
   }

   @Override
   public yy<aay> a() {
      return aaz.c;
   }

   public void a(aat $$0) {
      $$0.a(this);
   }
}
