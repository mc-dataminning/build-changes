import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dlj extends dli {
   public static final MapCodec<dlj> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(lu.e.q().fieldOf("host").forGetter(dli::b), u()).apply($$0, dlj::new));

   @Override
   public MapCodec<dlj> a() {
      return b;
   }

   public dlj(dhj $$0, dun.d $$1) {
      super($$0, $$1);
      this.l(this.o().b(dnw.i, jj.a.b));
   }

   @Override
   protected duo a(duo $$0, dnx $$1) {
      return dnw.b($$0, $$1);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(dnw.i);
   }

   @Override
   public duo a(czk $$0) {
      return this.o().b(dnw.i, $$0.k().o());
   }
}
