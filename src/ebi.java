import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebi extends ebo {
   final axi<dgv> a;
   public static final MapCodec<ebi> e = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axi.a(lv.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, ebi::new)
   );

   protected ebi(ki $$0, axi<dgv> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dua $$0) {
      return $$0.a(this.a);
   }

   @Override
   public ebe<?> a() {
      return ebe.b;
   }
}
