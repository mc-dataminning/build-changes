import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class erc extends eqq {
   public static final MapCodec<erc> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vb.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, erc::new));
   private final ud b;

   private erc(List<esl> $$0, ud $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eqs b() {
      return eqt.i;
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      cwd.a(kb.a, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static eqq.a<?> a(ud $$0) {
      return a($$1 -> new erc($$1, $$0));
   }
}
