import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ela extends eko {
   public static final Codec<ela> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(emx.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ela::new)
   );
   private final emw b;
   private final boolean c;

   private ela(List<emb> $$0, emw $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ekq b() {
      return ekr.c;
   }

   @Override
   public Set<elk<?>> a() {
      return this.b.a();
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.f(awi.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static eko.a<?> a(emw $$0) {
      return a($$1 -> new ela($$1, $$0, false));
   }

   public static eko.a<?> a(emw $$0, boolean $$1) {
      return a($$2 -> new ela($$2, $$0, $$1));
   }
}
