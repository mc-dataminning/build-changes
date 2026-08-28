import com.mojang.serialization.MapCodec;

public class egp extends egi {
   public static final MapCodec<egp> b = dtc.b.fieldOf("state").xmap(dtb.a::b, dfy::o).xmap(egp::new, $$0 -> $$0.c);
   private final dfy c;

   public egp(dfy $$0) {
      this.c = $$0;
   }

   @Override
   protected egj<?> a() {
      return egj.f;
   }

   @Override
   public dtc a(ayw $$0, jd $$1) {
      ji.a $$2 = ji.a.a($$0);
      return this.c.o().b(dml.i, $$2);
   }
}
