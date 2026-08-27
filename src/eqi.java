import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eqi extends epw {
   public static final Codec<eqi> a = RecordCodecBuilder.create($$0 -> a($$0).and(uy.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eqi::new));
   private final ua b;

   private eqi(List<erq> $$0, ua $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public epy b() {
      return epz.i;
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      cvm.a(ka.a, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static epw.a<?> a(ua $$0) {
      return a($$1 -> new eqi($$1, $$0));
   }
}
