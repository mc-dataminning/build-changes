import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class elw extends elk {
   public static final Codec<elw> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(ent.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, elw::new)
   );
   private final ens b;
   private final boolean c;

   private elw(List<emx> $$0, ens $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public elm b() {
      return eln.c;
   }

   @Override
   public Set<emg<?>> a() {
      return this.b.a();
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.f(awm.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static elk.a<?> a(ens $$0) {
      return a($$1 -> new elw($$1, $$0, false));
   }

   public static elk.a<?> a(ens $$0, boolean $$1) {
      return a($$2 -> new elw($$2, $$0, $$1));
   }
}
