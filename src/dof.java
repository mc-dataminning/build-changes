import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dof extends dlu {
   public static final MapCodec<dof> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(btd.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dof::new)
   );
   private final btd b;

   @Override
   public MapCodec<? extends dof> a() {
      return a;
   }

   public dof(btd $$0, dzn.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, cys $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
