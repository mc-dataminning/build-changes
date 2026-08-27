import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class eje {
   private final awm a;
   private final ele b;
   private final eiz c;
   private final Set<eix<?>> d;

   public eje(awm $$0, ele $$1, eiz $$2) {
      this($$0, $$1, $$2, Set.of());
   }

   private eje(awm $$0, ele $$1, eiz $$2, Set<eix<?>> $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public eje a(String $$0) {
      return new eje(this.a.a($$0), this.b, this.c, this.d);
   }

   public eje a(String $$0, eix<?> $$1) {
      ImmutableSet<eix<?>> $$2 = ImmutableSet.builder().addAll(this.d).add($$1).build();
      return new eje(this.a.a($$0), this.b, this.c, $$2);
   }

   public boolean a(eix<?> $$0) {
      return this.d.contains($$0);
   }

   public void b(String $$0) {
      this.a.b($$0);
   }

   public void a(eiw $$0) {
      this.b.a(this, $$0);
   }

   public eiz a() {
      return this.c;
   }

   public eje a(ele $$0) {
      return new eje(this.a, $$0, this.c, this.d);
   }
}
