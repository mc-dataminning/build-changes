import com.mojang.serialization.MapCodec;

public class egq extends egj {
   public static final MapCodec<egq> b = dtc.b.fieldOf("state").xmap(dtb.a::b, dfy::o).xmap(egq::new, $$0 -> $$0.c);
   private final dfy c;

   public egq(dfy $$0) {
      this.c = $$0;
   }

   @Override
   protected egk<?> a() {
      return egk.f;
   }

   @Override
   public dtc a(ayw $$0, jd $$1) {
      ji.a $$2 = ji.a.a($$0);
      return this.c.o().b(dml.i, $$2);
   }
}
