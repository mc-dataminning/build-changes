import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class erh extends eqq {
   public static final MapCodec<erh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eth.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, erh::new)
   );
   private final etg b;
   private final boolean c;

   private erh(List<esl> $$0, etg $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eqs b() {
      return eqt.e;
   }

   @Override
   public Set<eru<?>> a() {
      return this.b.a();
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      int $$2 = this.c ? $$0.I() : 0;
      $$0.e(ayd.a($$2 + this.b.a($$1), 0, $$0.j()));
      return $$0;
   }

   public static eqq.a<?> a(etg $$0) {
      return a($$1 -> new erh($$1, $$0, false));
   }

   public static eqq.a<?> a(etg $$0, boolean $$1) {
      return a($$2 -> new erh($$2, $$0, $$1));
   }
}
