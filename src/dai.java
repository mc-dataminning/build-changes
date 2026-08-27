import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dai extends dah {
   public static final MapCodec<dai> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kd.e.q().fieldOf("host").forGetter(dah::b), u()).apply($$0, dai::new));

   @Override
   public MapCodec<dai> a() {
      return b;
   }

   public dai(cwj $$0, diz.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dcu.i, ic.a.b));
   }

   @Override
   public dja a(dja $$0, dcv $$1) {
      return dcu.b($$0, $$1);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(dcu.i);
   }

   @Override
   public dja a(cpa $$0) {
      return this.o().a(dcu.i, $$0.k().o());
   }
}
