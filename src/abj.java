import java.util.HashSet;
import java.util.Set;

public record abj(Set<akt> b) implements zl<abf> {
   public static final zc<we, abj> a = zl.a(abj::a, abj::new);

   private abj(we $$0) {
      this($$0.a(HashSet::new, we::q));
   }

   private void a(we $$0) {
      $$0.a(this.b, we::a);
   }

   @Override
   public zn<abj> a() {
      return abk.c;
   }

   public void a(abf $$0) {
      $$0.a(this);
   }
}
