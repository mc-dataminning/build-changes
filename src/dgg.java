import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dgg extends dgf {
   public static final MapCodec<dgg> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kt.e.q().fieldOf("host").forGetter(dgf::b), u()).apply($$0, dgg::new));

   @Override
   public MapCodec<dgg> a() {
      return b;
   }

   public dgg(dch $$0, dph.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(dis.i, ij.a.b));
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return dis.b($$0, $$1);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(dis.i);
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(dis.i, $$0.k().o());
   }
}
