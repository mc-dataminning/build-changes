import java.util.HashSet;
import java.util.Set;

public record abr(Set<alb> b) implements zs<abm> {
   public static final zj<wl, abr> a = zs.a(abr::a, abr::new);

   private abr(wl $$0) {
      this($$0.a(HashSet::new, wl::q));
   }

   private void a(wl $$0) {
      $$0.a(this.b, wl::a);
   }

   @Override
   public zu<abr> a() {
      return abs.c;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }
}
