import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djy extends djx {
   public static final MapCodec<djy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lt.e.r().fieldOf("host").forGetter(djx::b), u()).apply($$0, djy::new));

   @Override
   public MapCodec<djy> a() {
      return b;
   }

   public djy(dfy $$0, dtb.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dml.i, ji.a.b));
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return dml.b($$0, $$1);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(dml.i);
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(dml.i, $$0.k().o());
   }
}
