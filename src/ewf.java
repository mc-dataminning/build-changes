import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class ewf implements ewb {
   public static final MapCodec<ewf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ewd.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, ewf::new)
   );
   public static final Codec<ewf> b = ewd.b.listOf().xmap(ewf::new, $$0 -> $$0.c);
   private final List<ewb> c;
   private final BiFunction<cwm, eun, cwm> d;

   private ewf(List<ewb> $$0) {
      this.c = $$0;
      this.d = ewd.a($$0);
   }

   public static ewf a(List<ewb> $$0) {
      return new ewf(List.copyOf($$0));
   }

   public cwm a(cwm $$0, eun $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(eut $$0) {
      ewb.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public ewc<ewf> b() {
      return ewd.I;
   }
}
