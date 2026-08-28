import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class diy extends dix {
   public static final MapCodec<diy> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lp.e.q().fieldOf("host").forGetter(dix::b), u()).apply($$0, diy::new));

   @Override
   public MapCodec<diy> a() {
      return b;
   }

   public diy(dey $$0, dsa.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dlk.i, je.a.b));
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return dlk.b($$0, $$1);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(dlk.i);
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(dlk.i, $$0.k().o());
   }
}
