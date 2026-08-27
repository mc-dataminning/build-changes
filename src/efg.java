import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class efg extends eeu {
   public static final Codec<efg> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ehd.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, efg::new)
   );
   private final ehc b;
   private final boolean c;

   private efg(List<egh> $$0, ehc $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eew b() {
      return eex.c;
   }

   @Override
   public Set<efq<?>> a() {
      return this.b.a();
   }

   @Override
   public ckj a(ckj $$0, edi $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.f(asy.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static eeu.a<?> a(ehc $$0) {
      return a($$1 -> new efg($$1, $$0, false));
   }

   public static eeu.a<?> a(ehc $$0, boolean $$1) {
      return a($$2 -> new efg($$2, $$0, $$1));
   }
}
