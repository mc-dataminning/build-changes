import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ezg extends eyy {
   public static final MapCodec<ezg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  asf.a(Codec.string(0, 32)).optionalFieldOf("title").forGetter($$0x -> $$0x.c),
                  Codec.STRING.optionalFieldOf("author").forGetter($$0x -> $$0x.b),
                  ays.a(0, 3).optionalFieldOf("generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ezg::new)
   );
   private final Optional<String> b;
   private final Optional<asf<String>> c;
   private final Optional<Integer> d;

   public ezg(List<fau> $$0, Optional<asf<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected cxy a(cxy $$0, exl $$1) {
      $$0.a(kx.V, dbe.a, this::a);
      return $$0;
   }

   private dbe a(dbe $$0) {
      return new dbe(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public eza<ezg> b() {
      return ezb.M;
   }
}
