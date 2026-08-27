import com.mojang.serialization.Codec;

public class dsk extends dsd {
   public static final Codec<dsk> b = dfl.b.fieldOf("state").xmap(dfk.a::b, csx::n).xmap(dsk::new, $$0 -> $$0.c).codec();
   private final csx c;

   public dsk(csx $$0) {
      this.c = $$0;
   }

   @Override
   protected dse<?> a() {
      return dse.f;
   }

   @Override
   public dfl a(ase $$0, gw $$1) {
      hc.a $$2 = hc.a.a($$0);
      return this.c.n().a(czi.g, $$2);
   }
}
