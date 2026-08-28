import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class eyg implements eyc {
   public static final MapCodec<eyg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eye.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, eyg::new)
   );
   public static final Codec<eyg> b = eye.b.listOf().xmap(eyg::new, $$0 -> $$0.c);
   private final List<eyc> c;
   private final BiFunction<cxh, ewo, cxh> d;

   private eyg(List<eyc> $$0) {
      this.c = $$0;
      this.d = eye.a($$0);
   }

   public static eyg a(List<eyc> $$0) {
      return new eyg(List.copyOf($$0));
   }

   public cxh a(cxh $$0, ewo $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(ewu $$0) {
      eyc.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eyd<eyg> b() {
      return eye.I;
   }
}
