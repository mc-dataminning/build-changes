import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class elf {
   private final axb a;
   private final enf b;
   private final ela c;
   private final Set<eky<?>> d;

   public elf(axb $$0, enf $$1, ela $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private elf(axb $$0, enf $$1, ela $$2, Set<eky<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public elf a(String $$0) {
      return new elf(this.a.a($$0), this.b, this.c, this.d);
   }

   public elf a(String $$0, eky<?> $$1) {
      ImmutableSet<eky<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new elf(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(eky<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(ekx $$0) {
      this.b.a(this, $$0);
   }

   public ela a() {
      return this.c;
   }

   public elf a(enf $$0) {
      return new elf(this.a, $$0, this.c, this.d);
   }
}
