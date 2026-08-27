import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class epl {
   private final ayi a;
   private final erv b;
   private final iy.a c;
   private final Set<akl<?>> d;

   public epl(ayi $$0, erv $$1, iy.a $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private epl(ayi $$0, erv $$1, iy.a $$2, Set<akl<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public epl a(String $$0) {
      return new epl(this.a.a($$0), this.b, this.c, this.d);
   }

   public epl a(String $$0, akl<?> $$1) {
      Set<akl<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new epl(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(akl<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(epg $$0) {
      this.b.a(this, $$0);
   }

   public iy.a a() {
      return this.c;
   }

   public epl a(erv $$0) {
      return new epl(this.a, $$0, this.c, this.d);
   }
}
