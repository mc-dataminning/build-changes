import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ein extends eib {
   public static final Codec<ein> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ekk.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ein::new)
   );
   private final ekj b;
   private final boolean c;

   private ein(List<ejo> $$0, ekj $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public eid b() {
      return eie.c;
   }

   @Override
   public Set<eix<?>> a() {
      return this.b.a();
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.f(aui.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static eib.a<?> a(ekj $$0) {
      return a($$1 -> new ein($$1, $$0, false));
   }

   public static eib.a<?> a(ekj $$0, boolean $$1) {
      return a($$2 -> new ein($$2, $$0, $$1));
   }
}
