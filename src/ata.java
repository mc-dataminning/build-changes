import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class ata implements asf {
   public static final asf.a a = new asf.a("synchronize_registries");
   private final List<auh> b;
   private final jl<aln> c;

   public ata(List<auh> $$0, jl<aln> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zd<?>> $$0) {
      $$0.accept(new abe(this.b));
   }

   private void a(Consumer<zd<?>> $$0, Set<auh> $$1) {
      DynamicOps<uu> $$2 = this.c.a().a(ul.a);
      jv.a($$2, this.c.c(aln.b), $$1, ($$1x, $$2x) -> $$0.accept(new abc($$1x, $$2x)));
      $$0.accept(new zu(axr.a(this.c)));
   }

   public void a(List<auh> $$0, Consumer<zd<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public asf.a a() {
      return a;
   }
}
