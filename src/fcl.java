import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.BiFunction;

public class fcl implements fch {
   public static final MapCodec<fcl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(fcj.b.listOf().fieldOf("functions").forGetter($$0x -> $$0x.c)).apply($$0, fcl::new)
   );
   public static final Codec<fcl> b = fcj.b.listOf().xmap(fcl::new, $$0 -> $$0.c);
   private final List<fch> c;
   private final BiFunction<dak, fat, dak> d;

   private fcl(List<fch> $$0) {
      this.c = $$0;
      this.d = fcj.a($$0);
   }

   public static fcl a(List<fch> $$0) {
      return new fcl(List.copyOf($$0));
   }

   public dak a(dak $$0, fat $$1) {
      return this.d.apply($$0, $$1);
   }

   @Override
   public void a(faz $$0) {
      fch.super.a($$0);

      for (int $$1 = 0; $$1 < this.c.size(); $$1++) {
         this.c.get($$1).a($$0.a(".function[" + $$1 + "]"));
      }
   }

   @Override
   public fci<fcl> b() {
      return fcj.I;
   }
}
