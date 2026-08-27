import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcr extends dcq {
   public static final MapCodec<dcr> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kf.e.q().fieldOf("host").forGetter(dcq::b), u()).apply($$0, dcr::new));

   @Override
   public MapCodec<dcr> a() {
      return b;
   }

   public dcr(cys $$0, dli.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dfd.i, ie.a.b));
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return dfd.b($$0, $$1);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(dfd.i);
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(dfd.i, $$0.k().o());
   }
}
