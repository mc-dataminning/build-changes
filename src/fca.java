import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fca extends fbw {
   public static final MapCodec<fca> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(fah.e.fieldOf("component").forGetter($$0x -> $$0x.b), fbz.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, fca::new)
   );
   private final fag<?> b;
   private final fbx c;

   private fca(List<fds> $$0, fag<?> $$1, fbx $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fby<fca> b() {
      return fbz.u;
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(fap $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
