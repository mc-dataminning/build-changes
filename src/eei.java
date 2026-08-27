import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eei extends edw {
   public static final Codec<eei> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(egf.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eei::new)
   );
   private final ege b;
   private final boolean c;

   private eei(List<efj> $$0, ege $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public edy b() {
      return edz.c;
   }

   @Override
   public Set<ees<?>> a() {
      return this.b.a();
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.f(asb.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static edw.a<?> a(ege $$0) {
      return a($$1 -> new eei($$1, $$0, false));
   }

   public static edw.a<?> a(ege $$0, boolean $$1) {
      return a($$2 -> new eei($$2, $$0, $$1));
   }
}
