import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class epw extends epo {
   public static final Codec<epw> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axe.a(aqv.a(axe.b(0, 32)), "title").forGetter($$0x -> $$0x.c),
                  axe.a(Codec.STRING, "author").forGetter($$0x -> $$0x.b),
                  axe.a(axe.a(0, 3), "generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, epw::new)
   );
   private final Optional<String> b;
   private final Optional<aqv<String>> c;
   private final Optional<Integer> d;

   public epw(List<erh> $$0, Optional<aqv<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected csd a(csd $$0, eoa $$1) {
      $$0.a(jz.A, cvj.a, this::a);
      return $$0;
   }

   private cvj a(cvj $$0) {
      return new cvj(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public epq b() {
      return epr.H;
   }
}
