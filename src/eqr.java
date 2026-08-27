import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqr extends epw {
   public static final Codec<eqr> a = RecordCodecBuilder.create($$0 -> a($$0).and(ld.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eqr::new));
   private final iw<cuw> b;

   private eqr(List<erq> $$0, iw<cuw> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public epy b() {
      return epz.C;
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      $$0.a(ka.E, cuy.a, this.b, cuy::b);
      return $$0;
   }

   public static epw.a<?> a(iw<cuw> $$0) {
      return a($$1 -> new eqr($$1, $$0));
   }
}
