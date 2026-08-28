import java.util.HashSet;
import java.util.Set;

public record abl(Set<alk> b) implements zj<abg> {
   public static final za<vy, abl> a = zj.a(abl::a, abl::new);

   private abl(vy $$0) {
      this($$0.a(HashSet::new, vy::q));
   }

   private void a(vy $$0) {
      $$0.a(this.b, vy::a);
   }

   @Override
   public zl<abl> a() {
      return abm.c;
   }

   public void a(abg $$0) {
      $$0.a(this);
   }
}
