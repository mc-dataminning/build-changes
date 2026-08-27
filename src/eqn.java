import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eqn extends epw {
   public static final Codec<eqn> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(esm.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eqn::new)
   );
   private final esl b;
   private final boolean c;

   private eqn(List<erq> $$0, esl $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public epy b() {
      return epz.e;
   }

   @Override
   public Set<eqz<?>> a() {
      return this.b.a();
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      int $$2 = this.c ? $$0.G() : 0;
      $$0.e(axz.a($$2 + this.b.a($$1), 0, $$0.i()));
      return $$0;
   }

   public static epw.a<?> a(esl $$0) {
      return a($$1 -> new eqn($$1, $$0, false));
   }

   public static epw.a<?> a(esl $$0, boolean $$1) {
      return a($$2 -> new eqn($$2, $$0, $$1));
   }
}
