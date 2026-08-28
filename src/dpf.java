import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class dpf extends dvj implements duk {
   protected static final MapCodec<dca> b = dca.c.fieldOf("suspicious_stew_effects");
   public static final MapCodec<dpf> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(b.forGetter(dpf::c), t()).apply($$0, dpf::new));
   private static final ffc a = dma.b(6.0, 0.0, 10.0);
   private final dca d;

   @Override
   public MapCodec<? extends dpf> a() {
      return c;
   }

   public dpf(je<bvf> $$0, float $$1, dzy.d $$2) {
      this(a($$0, $$1), $$2);
   }

   public dpf(dca $$0, dzy.d $$1) {
      super($$1);
      this.d = $$0;
   }

   protected static dca a(je<bvf> $$0, float $$1) {
      return new dca(List.of(new dca.a($$0, azm.d($$1 * 20.0F))));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return a.a($$0.a($$2));
   }

   @Override
   public dca c() {
      return this.d;
   }

   @Nullable
   public bvh b() {
      return null;
   }
}
