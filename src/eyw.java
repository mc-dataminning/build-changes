import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyw extends eyy {
   public static final MapCodec<eyw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(exk.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eyw::new));
   private final exk b;

   private eyw(List<fau> $$0, exk $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eza<eyw> b() {
      return ezb.w;
   }

   @Override
   public Set<bat<?>> a() {
      return this.b.a();
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      int $$2 = this.b.a($$1, $$0.M());
      $$0.e($$2);
      return $$0;
   }

   public static eyy.a<?> a(exk $$0) {
      return a($$1 -> new eyw($$1, $$0));
   }
}
