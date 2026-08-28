import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eya implements exw {
   public static final MapCodec<eya> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(exy.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eya::new)
   );
   public static final Codec<eya> b = exy.b.listOf().xmap(eya::new, $$0 -> $$0.c);
   private final List<exw> c;
   private final BiFunction<cxg, ewi, cxg> d;

   private eya(List<exw> $$0) {
      this.c = $$0;
      this.d = exy.a($$0);
   }

   public static eya a(List<exw> $$0) {
      return new eya(List.copyOf($$0));
   }

   public cxg a(cxg $$0, ewi $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ewo $$0) {
      exw.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public exx<eya> b() {
      return exy.I;
   }
}
