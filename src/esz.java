import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esz extends esh {
   public static final MapCodec<esz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evc.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, esz::new)
   );
   private final evb b;
   private final boolean c;

   private esz(List<euf> $$0, evb $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public esj<esz> b() {
      return esk.e;
   }

   @Override
   public Set<etn<?>> a() {
      return this.b.a();
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      int $$2 = this.c ? $$0.H() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static esh.a<?> a(evb $$0) {
      return a($$1 -> new esz($$1, $$0, false));
   }

   public static esh.a<?> a(evb $$0, boolean $$1) {
      return a($$2 -> new esz($$2, $$0, $$1));
   }
}
