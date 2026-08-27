import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dlw implements dlo {
   public static final Codec<dlw> a = RecordCodecBuilder.create($$0 -> $$0.group(dlo.b.fieldOf("predicate").forGetter($$0x -> $$0x.e)).apply($$0, dlw::new));
   private final dlo e;

   public dlw(dlo $$0) {
      this.e = $$0;
   }

   public boolean a(cqe $$0, gv $$1) {
      return !this.e.test($$0, $$1);
   }

   @Override
   public dlp<?> a() {
      return dlp.k;
   }
}
