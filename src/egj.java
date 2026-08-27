import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class egj extends efx {
   public static final Codec<egj> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eig.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, egj::new)
   );
   private final eif b;
   private final boolean c;

   private egj(List<ehk> $$0, eif $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public efz b() {
      return ega.c;
   }

   @Override
   public Set<egt<?>> a() {
      return this.b.a();
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      int $$2 = this.c ? $$0.L() : 0;
      $$0.f(ati.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static efx.a<?> a(eif $$0) {
      return a($$1 -> new egj($$1, $$0, false));
   }

   public static efx.a<?> a(eif $$0, boolean $$1) {
      return a($$2 -> new egj($$2, $$0, $$1));
   }
}
