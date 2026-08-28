import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class ezd implements eyz {
   public static final MapCodec<ezd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ezb.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, ezd::new)
   );
   public static final Codec<ezd> b = ezb.b.listOf().xmap(ezd::new, $$0 -> $$0.c);
   private final List<eyz> c;
   private final BiFunction<cxy, exl, cxy> d;

   private ezd(List<eyz> $$0) {
      this.c = $$0;
      this.d = ezb.a($$0);
   }

   public static ezd a(List<eyz> $$0) {
      return new ezd(List.copyOf($$0));
   }

   public cxy a(cxy $$0, exl $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(exr $$0) {
      eyz.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public eza<ezd> b() {
      return ezb.I;
   }
}
