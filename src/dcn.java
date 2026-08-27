import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcn extends dcm {
   public static final MapCodec<dcn> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(kf.e.q().fieldOf("host").forGetter(dcm::b), u()).apply($$0, dcn::new));

   @Override
   public MapCodec<dcn> a() {
      return b;
   }

   public dcn(cyo $$0, dle.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(dez.i, ie.a.b));
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return dez.b($$0, $$1);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(dez.i);
   }

   @Override
   public dlf a(crg $$0) {
      return this.o().a(dez.i, $$0.k().o());
   }
}
