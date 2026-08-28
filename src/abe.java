import java.util.HashSet;
import java.util.Set;

public record abe(Set<ald> b) implements zc<aaz> {
   public static final yt<vr, abe> a = zc.a(abe::a, abe::new);

   private abe(vr $$0) {
      this($$0.a(HashSet::new, vr::q));
   }

   private void a(vr $$0) {
      $$0.a(this.b, vr::a);
   }

   @Override
   public ze<abe> a() {
      return abf.c;
   }

   public void a(aaz $$0) {
      $$0.a(this);
   }
}
