import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dix extends diw {
   public static final MapCodec<dix> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lp.e.q().fieldOf("host").forGetter(diw::b), u()).apply($$0, dix::new));

   @Override
   public MapCodec<dix> a() {
      return b;
   }

   public dix(dex $$0, drz.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dlj.i, je.a.b));
   }

   @Override
   protected dsa a(dsa $$0, dlk $$1) {
      return dlj.b($$0, $$1);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(dlj.i);
   }

   @Override
   public dsa a(cxy $$0) {
      return this.o().a(dlj.i, $$0.k().o());
   }
}
