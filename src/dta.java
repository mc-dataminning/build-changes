import com.mojang.serialization.Codec;

public class dta extends dst {
   public static final Codec<dta> b = dgb.b.fieldOf("state").xmap(dga.a::b, cua::o).xmap(dta::new, $$0 -> $$0.c).codec();
   private final cua c;

   public dta(cua $$0) {
      this.c = $$0;
   }

   @Override
   protected dsu<?> a() {
      return dsu.f;
   }

   @Override
   public dgb a(ate $$0, ht $$1) {
      hx.a $$2 = hx.a.a($$0);
      return this.c.o().a(dak.i, $$2);
   }
}
