import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class epr extends epw {
   public static final Codec<epr> a = RecordCodecBuilder.create($$0 -> a($$0).and(eol.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, epr::new));
   private final eol.b b;

   public epr(List<erq> $$0, eol.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public epy b() {
      return epz.y;
   }

   @Override
   public Set<eqz<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      if ($$0.a(ctc.un) && $$1.c(this.b.a()) instanceof clh $$2) {
         $$0.b(ka.S, new cvz($$2.fZ()));
      }

      return $$0;
   }

   public static epw.a<?> a(eol.b $$0) {
      return a($$1 -> new epr($$1, $$0));
   }
}
