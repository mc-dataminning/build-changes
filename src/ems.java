import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ems extends emg {
   public static final Codec<ems> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and($$0.group(eop.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
            .apply($$0, ems::new)
   );
   private final eoo b;
   private final boolean c;

   private ems(List<ent> $$0, eoo $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public emi b() {
      return emj.c;
   }

   @Override
   public Set<enc<?>> a() {
      return this.b.a();
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.f(aww.a($$2 + this.b.a($$1), 0, $$0.g()));
      return $$0;
   }

   public static emg.a<?> a(eoo $$0) {
      return a($$1 -> new ems($$1, $$0, false));
   }

   public static emg.a<?> a(eoo $$0, boolean $$1) {
      return a($$2 -> new ems($$2, $$0, $$1));
   }
}
