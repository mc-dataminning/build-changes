import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class etr extends eta {
   public static final Codec<etr> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(evr.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, etr::new)
   );
   private final evq b;
   private final boolean c;

   private etr(List<euu> $$0, evq $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public etc b() {
      return etd.e;
   }

   @Override
   public Set<eud<?>> a() {
      return this.b.a();
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      int $$2 = this.c ? $$0.G() : 0;
      $$0.e(aym.a($$2 + this.b.a($$1), 0, $$0.i()));
      return $$0;
   }

   public static eta.a<?> a(evq $$0) {
      return a($$1 -> new etr($$1, $$0, false));
   }

   public static eta.a<?> a(evq $$0, boolean $$1) {
      return a($$2 -> new etr($$2, $$0, $$1));
   }
}
