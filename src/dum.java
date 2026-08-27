import com.mojang.serialization.Codec;

public class dum extends duf {
   public static final Codec<dum> b = dhn.b.fieldOf("state").xmap(dhm.a::b, cvf::o).xmap(dum::new, $$0 -> $$0.c).codec();
   private final cvf c;

   public dum(cvf $$0) {
      this.c = $$0;
   }

   @Override
   protected dug<?> a() {
      return dug.f;
   }

   @Override
   public dhn a(atw $$0, hx $$1) {
      ib.a $$2 = ib.a.a($$0);
      return this.c.o().a(dbq.i, $$2);
   }
}
