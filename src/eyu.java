import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyu extends eyc {
   public static final MapCodec<eyu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fav.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eyu::new)
   );
   private final fau b;
   private final boolean c;

   private eyu(List<ezy> $$0, fau $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eye<eyu> b() {
      return eyf.e;
   }

   @Override
   public Set<bbn<?>> a() {
      return this.b.a();
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static eyc.a<?> a(fau $$0) {
      return a($$1 -> new eyu($$1, $$0, false));
   }

   public static eyc.a<?> a(fau $$0, boolean $$1) {
      return a($$2 -> new eyu($$2, $$0, $$1));
   }
}
