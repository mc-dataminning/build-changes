import java.util.HashSet;
import java.util.Set;

public record abm(Set<alc> b) implements zk<abh> {
   public static final zb<wa, abm> a = zk.a(abm::a, abm::new);

   private abm(wa $$0) {
      this($$0.a(HashSet::new, wa::q));
   }

   private void a(wa $$0) {
      $$0.a(this.b, wa::a);
   }

   @Override
   public zm<abm> a() {
      return abn.c;
   }

   public void a(abh $$0) {
      $$0.a(this);
   }
}
