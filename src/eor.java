import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class eor {
   private final aye a;
   private final era b;
   private final ix.a c;
   private final Set<akg<?>> d;

   public eor(aye $$0, era $$1, ix.a $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private eor(aye $$0, era $$1, ix.a $$2, Set<akg<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eor a(String $$0) {
      return new eor(this.a.a($$0), this.b, this.c, this.d);
   }

   public eor a(String $$0, akg<?> $$1) {
      Set<akg<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eor(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(akg<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(eom $$0) {
      this.b.a(this, $$0);
   }

   public ix.a a() {
      return this.c;
   }

   public eor a(era $$0) {
      return new eor(this.a, $$0, this.c, this.d);
   }
}
