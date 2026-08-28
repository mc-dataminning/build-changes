import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class asn implements aru {
   public static final aru.a a = new aru.a("synchronize_registries");
   private final List<atv> b;
   private final jp<aln> c;

   public asn(List<atv> $$0, jp<aln> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(Consumer<zv<?>> $$0) {
      $$0.accept(new abt(this.b));
   }

   private void a(Consumer<zv<?>> $$0, Set<atv> $$1) {
      DynamicOps<vo> $$2 = this.c.a().a(vf.a);
      jz.a($$2, this.c.c(aln.b), $$1, ($$1x, $$2x) -> $$0.accept(new abr($$1x, $$2x)));
      $$0.accept(new aak(axh.a(this.c)));
   }

   public void a(List<atv> $$0, Consumer<zv<?>> $$1) {
      if ($$0.equals(this.b)) {
         this.a($$1, Set.copyOf(this.b));
      } else {
         this.a($$1, Set.of());
      }
   }

   @Override
   public aru.a a() {
      return a;
   }
}
