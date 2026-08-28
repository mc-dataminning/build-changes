import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkv extends dku {
   public static final MapCodec<dkv> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lu.e.q().fieldOf("host").forGetter(dku::b), u()).apply($$0, dkv::new));

   @Override
   public MapCodec<dkv> a() {
      return b;
   }

   public dkv(dgv $$0, dtz.d $$1) {
      super($$0, $$1);
      this.l(this.o().b(dni.i, jj.a.b));
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return dni.b($$0, $$1);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(dni.i);
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(dni.i, $$0.k().o());
   }
}
