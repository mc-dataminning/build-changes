import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eyh implements eyd {
   public static final MapCodec<eyh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eyf.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eyh::new)
   );
   public static final Codec<eyh> b = eyf.b.listOf().xmap(eyh::new, $$0 -> $$0.c);
   private final List<eyd> c;
   private final BiFunction<cxp, ewp, cxp> d;

   private eyh(List<eyd> $$0) {
      this.c = $$0;
      this.d = eyf.a($$0);
   }

   public static eyh a(List<eyd> $$0) {
      return new eyh(List.copyOf($$0));
   }

   public cxp a(cxp $$0, ewp $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ewv $$0) {
      eyd.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eye<eyh> b() {
      return eyf.I;
   }
}
