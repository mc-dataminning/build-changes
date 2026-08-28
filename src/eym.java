import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eym extends exu {
   public static final MapCodec<eym> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fap.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eym::new)
   );
   private final fao b;
   private final boolean c;

   private eym(List<ezs> $$0, fao $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public exw<eym> b() {
      return exx.e;
   }

   @Override
   public Set<eza<?>> a() {
      return this.b.a();
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static exu.a<?> a(fao $$0) {
      return a($$1 -> new eym($$1, $$0, false));
   }

   public static exu.a<?> a(fao $$0, boolean $$1) {
      return a($$2 -> new eym($$2, $$0, $$1));
   }
}
