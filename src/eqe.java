import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eqe extends epw {
   public static final Codec<eqe> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axh.a(aqy.a(axh.b(0, 32)), "title").forGetter($$0x -> $$0x.c),
                  axh.a(Codec.STRING, "author").forGetter($$0x -> $$0x.b),
                  axh.a(axh.a(0, 3), "generation").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eqe::new)
   );
   private final Optional<String> b;
   private final Optional<aqy<String>> c;
   private final Optional<Integer> d;

   public eqe(List<erq> $$0, Optional<aqy<String>> $$1, Optional<String> $$2, Optional<Integer> $$3) {
      super($$0);
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   @Override
   protected csz a(csz $$0, eol $$1) {
      $$0.a(ka.H, cwg.a, this::a);
      return $$0;
   }

   private cwg a(cwg $$0) {
      return new cwg(this.c.orElseGet($$0::d), this.b.orElseGet($$0::e), this.d.orElseGet($$0::f), $$0.a(), $$0.g());
   }

   @Override
   public epy b() {
      return epz.J;
   }
}
