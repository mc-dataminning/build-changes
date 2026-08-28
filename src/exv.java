import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class exv extends exd {
   public static final MapCodec<exv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezw.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, exv::new)
   );
   private final ezv b;
   private final boolean c;

   private exv(List<eyz> $$0, ezv $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exf<exv> b() {
      return exg.e;
   }

   @Override
   public Set<bai<?>> a() {
      return this.b.a();
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static exd.a<?> a(ezv $$0) {
      return a($$1 -> new exv($$1, $$0, false));
   }

   public static exd.a<?> a(ezv $$0, boolean $$1) {
      return a($$2 -> new exv($$2, $$0, $$1));
   }
}
