import com.mojang.serialization.MapCodec;

public class efi extends efb {
   public static final MapCodec<efi> b = dsa.b.fieldOf("state").xmap(drz.a::b, dex::o).xmap(efi::new, $$0 -> $$0.c);
   private final dex c;

   public efi(dex $$0) {
      this.c = $$0;
   }

   @Override
   protected efc<?> a() {
      return efc.f;
   }

   @Override
   public dsa a(azf $$0, iz $$1) {
      je.a $$2 = je.a.a($$0);
      return this.c.o().a(dlj.i, $$2);
   }
}
