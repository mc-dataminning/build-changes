import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evv extends euy {
   static final MapCodec<evv> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ext.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, evv::new));
   private final exs b;

   private evv(List<eww> $$0, exs $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<ewe<?>> a() {
      return this.b.a();
   }

   @Override
   public eva<evv> b() {
      return evb.Q;
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      int $$2 = azf.a(this.b.a($$1), 0, 4);
      $$0.b(ks.V, new cyu($$2));
      return $$0;
   }

   public exs c() {
      return this.b;
   }

   public static euy.a<?> a(exs $$0) {
      return a($$1 -> new evv($$1, $$0));
   }
}
