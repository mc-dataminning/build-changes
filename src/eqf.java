import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqf extends epw {
   public static final Codec<eqf> a = RecordCodecBuilder.create($$0 -> a($$0).and(jx.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, eqf::new));
   private final jx b;

   private eqf(List<erq> $$0, jx $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public epy b() {
      return epz.j;
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> epw.a<?> a(jz<T> $$0, T $$1) {
      return a($$2 -> new eqf($$2, jx.a().a($$0, $$1).a()));
   }
}
