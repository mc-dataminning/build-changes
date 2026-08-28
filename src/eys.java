import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eys extends eyy {
   public static final MapCodec<eys> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(exl.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, eys::new)
   );
   private final exl.b b;

   public eys(List<fau> $$0, exl.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eza<eys> b() {
      return ezb.B;
   }

   @Override
   public Set<bat<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      if ($$0.a(cyc.vq) && $$1.c(this.b.a()) instanceof cqi $$2) {
         $$0.b(kx.ai, new dau($$2.gh()));
      }

      return $$0;
   }

   public static eyy.a<?> a(exl.b $$0) {
      return a($$1 -> new eys($$1, $$0));
   }
}
