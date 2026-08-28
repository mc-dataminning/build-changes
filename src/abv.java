import java.util.HashSet;
import java.util.Set;

public record abv(Set<alf> b) implements zw<abq> {
   public static final zn<wm, abv> a = zw.a(abv::a, abv::new);

   private abv(wm $$0) {
      this($$0.a(HashSet::new, wm::q));
   }

   private void a(wm $$0) {
      $$0.a(this.b, wm::a);
   }

   @Override
   public zy<abv> a() {
      return abw.c;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }
}
