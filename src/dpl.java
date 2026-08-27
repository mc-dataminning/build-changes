import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dpl implements dpt {
   public static final Codec<dpl> a = RecordCodecBuilder.create($$0 -> $$0.group(hz.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dpl::new));
   public static final xo<vb, dpl> b = xo.a(hz.b, $$0 -> $$0.e, dpl::new);
   private final hz e;

   public dpl(hz $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<ens> a(cvn $$0) {
      return Optional.of(ens.b(this.e));
   }

   @Override
   public dpu<dpl> a() {
      return dpu.a;
   }

   public static class a implements dpu<dpl> {
      @Override
      public Codec<dpl> a() {
         return dpl.a;
      }

      @Override
      public xo<vb, dpl> b() {
         return dpl.b;
      }
   }
}
