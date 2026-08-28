import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ezv extends eyy {
   static final MapCodec<ezv> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fbr.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, ezv::new));
   private final fbq b;

   private ezv(List<fau> $$0, fbq $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bat<?>> a() {
      return this.b.a();
   }

   @Override
   public eza<ezv> b() {
      return ezb.Q;
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      int $$2 = azk.a(this.b.a($$1), 0, 4);
      $$0.b(kx.ac, new dat($$2));
      return $$0;
   }

   public fbq c() {
      return this.b;
   }

   public static eyy.a<?> a(fbq $$0) {
      return a($$1 -> new ezv($$1, $$0));
   }
}
