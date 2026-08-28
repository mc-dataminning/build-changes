import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlm extends dll {
   public static final MapCodec<dlm> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lv.e.q().fieldOf("host").forGetter(dll::b), t()).apply($$0, dlm::new));

   @Override
   public MapCodec<dlm> a() {
      return b;
   }

   public dlm(dhm $$0, dur.d $$1) {
      super($$0, $$1);
      this.l(this.n().b(dnz.i, jk.a.b));
   }

   @Override
   protected dus a(dus $$0, doa $$1) {
      return dnz.b($$0, $$1);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(dnz.i);
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(dnz.i, $$0.k().o());
   }
}
