import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exw extends exe {
   public static final MapCodec<exw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezx.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, exw::new)
   );
   private final ezw b;
   private final boolean c;

   private exw(List<eza> $$0, ezw $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exg<exw> b() {
      return exh.e;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static exe.a<?> a(ezw $$0) {
      return a($$1 -> new exw($$1, $$0, false));
   }

   public static exe.a<?> a(ezw $$0, boolean $$1) {
      return a($$2 -> new exw($$2, $$0, $$1));
   }
}
