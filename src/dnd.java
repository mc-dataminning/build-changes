import com.mojang.serialization.MapCodec;

public class dnd extends djm {
   public static final MapCodec<dnd> d = b(dnd::new);

   @Override
   protected MapCodec<? extends dnd> a() {
      return d;
   }

   protected dnd(dww.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(dwx $$0, dwx $$1, jn $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
