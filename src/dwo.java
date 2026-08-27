import com.mojang.serialization.Codec;

public class dwo extends dwh {
   public static final Codec<dwo> b = djp.b.fieldOf("state").xmap(djo.a::b, cwy::o).xmap(dwo::new, $$0 -> $$0.c).codec();
   private final cwy c;

   public dwo(cwy $$0) {
      this.c = $$0;
   }

   @Override
   protected dwi<?> a() {
      return dwi.f;
   }

   @Override
   public djp a(auw $$0, hx $$1) {
      ic.a $$2 = ic.a.a($$0);
      return this.c.o().a(ddj.i, $$2);
   }
}
