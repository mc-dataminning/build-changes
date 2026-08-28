import java.util.HashSet;
import java.util.Set;

public record abr(Set<ali> b) implements zp<abm> {
   public static final zg<wf, abr> a = zp.a(abr::a, abr::new);

   private abr(wf $$0) {
      this($$0.a(HashSet::new, wf::q));
   }

   private void a(wf $$0) {
      $$0.a(this.b, wf::a);
   }

   @Override
   public zr<abr> a() {
      return abs.c;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }
}
