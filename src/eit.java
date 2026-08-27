import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eit extends eih {
   public static final Codec<eit> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ekq.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, eit::new)
   );
   private final ekp b;
   private final boolean c;

   private eit(List<eju> $$0, ekp $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eij b() {
      return eik.c;
   }

   @Override
   public Set<ejd<?>> a() {
      return this.b.a();
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.f(aun.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static eih.a<?> a(ekp $$0) {
      return a($$1 -> new eit($$1, $$0, false));
   }

   public static eih.a<?> a(ekp $$0, boolean $$1) {
      return a($$2 -> new eit($$2, $$0, $$1));
   }
}
