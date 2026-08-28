import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evu extends euu {
   public static final MapCodec<evu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cza.d.fieldOf("pages").forGetter($$0x -> $$0x.b), eut.a(100).forGetter($$0x -> $$0x.c))).apply($$0, evu::new)
   );
   private final List<ary<String>> b;
   private final eut c;

   protected evu(List<ews> $$0, List<ary<String>> $$1, eut $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cvp a(cvp $$0, eth $$1) {
      $$0.a(kr.N, cza.a, this::a);
      return $$0;
   }

   public cza a(cza $$0) {
      List<ary<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public euw<evu> b() {
      return eux.O;
   }
}
