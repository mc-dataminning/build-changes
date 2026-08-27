import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyz extends cyy {
   public static final MapCodec<cyz> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(jy.f.q().fieldOf("host").forGetter(cyy::b), u()).apply($$0, cyz::new));

   @Override
   public MapCodec<cyz> a() {
      return b;
   }

   public cyz(cva $$0, dhh.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dbl.i, hx.a.b));
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return dbl.b($$0, $$1);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(dbl.i);
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(dbl.i, $$0.k().o());
   }
}
