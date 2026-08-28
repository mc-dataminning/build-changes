import com.mojang.serialization.MapCodec;

public class dur extends dmx {
   public static final MapCodec<dur> g = b(dur::new);

   @Override
   public MapCodec<dur> a() {
      return g;
   }

   public dur(dzn.d $$0) {
      super(() -> dwp.c, $$0);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dym($$0, $$1);
   }

   @Override
   protected aws<ale> c() {
      return awv.i.b(awv.ai);
   }

   @Override
   protected boolean f_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return azk.a(dwv.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$3 == ja.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
