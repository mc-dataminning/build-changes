import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dax extends daw {
   public static final MapCodec<dax> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kd.e.q().fieldOf("host").forGetter(daw::b), u()).apply($$0, dax::new));

   @Override
   public MapCodec<dax> a() {
      return b;
   }

   public dax(cwy $$0, djo.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(ddj.i, ic.a.b));
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return ddj.b($$0, $$1);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(ddj.i);
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(ddj.i, $$0.k().o());
   }
}
