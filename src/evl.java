import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evl extends euy {
   static final MapCodec<evl> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ext.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, evl::new));
   private final exs b;

   private evl(List<eww> $$0, exs $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<ewe<?>> a() {
      return this.b.a();
   }

   @Override
   public eva<evl> b() {
      return evb.R;
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      $$0.b(ks.o, new cyi(this.b.a($$1)));
      return $$0;
   }
}
