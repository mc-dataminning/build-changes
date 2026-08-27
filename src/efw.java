import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class efw extends efx {
   public static final Codec<efw> a = RecordCodecBuilder.create($$0 -> a($$0).and(eek.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, efw::new));
   private final eek b;

   private efw(List<ehk> $$0, eek $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public efz b() {
      return ega.q;
   }

   @Override
   public Set<egt<?>> a() {
      return this.b.a();
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.f($$2);
      return $$0;
   }

   public static efx.a<?> a(eek $$0) {
      return a($$1 -> new efw($$1, $$0));
   }
}
