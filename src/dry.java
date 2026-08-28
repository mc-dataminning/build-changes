import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dry extends drg implements dsl {
   public static final MapCodec<dry> c = b(dry::new);

   @Override
   public MapCodec<dry> a() {
      return c;
   }

   protected dry(ebp.d $$0) {
      super($$0, jc.b, fgt.b(), true);
   }

   @Override
   protected drh c() {
      return (drh)dnq.mI;
   }

   @Override
   protected eya b_(ebq $$0) {
      return eyb.c.a(false);
   }

   @Override
   protected boolean o(ebq $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable byf $$0, djn $$1, iw $$2, ebq $$3, exz $$4) {
      return false;
   }

   @Override
   public boolean a(dkk $$0, iw $$1, ebq $$2, eya $$3) {
      return false;
   }
}
