import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fbm extends fau {
   public static final MapCodec<fbm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fdn.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, fbm::new)
   );
   private final fdm b;
   private final boolean c;

   private fbm(List<fcq> $$0, fdm $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public faw<fbm> b() {
      return fax.e;
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static fau.a<?> a(fdm $$0) {
      return a($$1 -> new fbm($$1, $$0, false));
   }

   public static fau.a<?> a(fdm $$0, boolean $$1) {
      return a($$2 -> new fbm($$2, $$0, $$1));
   }
}
