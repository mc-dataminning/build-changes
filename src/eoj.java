import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class eoj {
   private final ayb a;
   private final eqr b;
   private final eoe c;
   private final Set<eoc<?>> d;

   public eoj(ayb $$0, eqr $$1, eoe $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private eoj(ayb $$0, eqr $$1, eoe $$2, Set<eoc<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eoj a(String $$0) {
      return new eoj(this.a.a($$0), this.b, this.c, this.d);
   }

   public eoj a(String $$0, eoc<?> $$1) {
      ImmutableSet<eoc<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eoj(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(eoc<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(eob $$0) {
      this.b.a(this, $$0);
   }

   public eoe a() {
      return this.c;
   }

   public eoj a(eqr $$0) {
      return new eoj(this.a, $$0, this.c, this.d);
   }
}
