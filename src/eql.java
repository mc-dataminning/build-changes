import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eql extends epw {
   public static final Codec<eql> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  axh.a(axh.a(cvq.c.listOf(), 256), "explosions", List.of()).forGetter($$0x -> $$0x.c),
                  epv.a(256).forGetter($$0x -> $$0x.d),
                  axh.a(axh.h, "flight_duration").forGetter($$0x -> $$0x.e)
               )
            )
            .apply($$0, eql::new)
   );
   public static final cvr b = new cvr(0, List.of());
   private final List<cvq> c;
   private final epv d;
   private final Optional<Integer> e;

   protected eql(List<erq> $$0, List<cvq> $$1, epv $$2, Optional<Integer> $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   @Override
   protected csz a(csz $$0, eol $$1) {
      $$0.a(ka.R, b, this::a);
      return $$0;
   }

   private cvr a(cvr $$0) {
      List<cvq> $$1 = this.d.a($$0.b(), this.c, 256);
      return new cvr(this.e.orElseGet($$0::a), $$1);
   }

   @Override
   public epy b() {
      return epz.H;
   }
}
