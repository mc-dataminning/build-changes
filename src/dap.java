import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dap extends dao {
   public static final MapCodec<dap> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kd.e.q().fieldOf("host").forGetter(dao::b), u()).apply($$0, dap::new));

   @Override
   public MapCodec<dap> a() {
      return b;
   }

   public dap(cwq $$0, djg.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(ddb.i, ic.a.b));
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return ddb.b($$0, $$1);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(ddb.i);
   }

   @Override
   public djh a(cph $$0) {
      return this.o().a(ddb.i, $$0.k().o());
   }
}
