import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbr extends fbw {
   public static final MapCodec<fbr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cn.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), fbz.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbr::new)
   );
   private final cn b;
   private final fbx c;

   private fbr(List<fds> $$0, cn $$1, fbx $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fby<fbr> b() {
      return fbz.v;
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(fap $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
