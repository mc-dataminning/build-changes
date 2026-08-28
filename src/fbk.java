import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbk extends fbg {
   public static final MapCodec<fbk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(ezr.e.fieldOf("component").forGetter($$0x -> $$0x.b), fbj.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, fbk::new)
   );
   private final ezq<?> b;
   private final fbh c;

   private fbk(List<fdc> $$0, ezq<?> $$1, fbh $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fbi<fbk> b() {
      return fbj.u;
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(ezz $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
