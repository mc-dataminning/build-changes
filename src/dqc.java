import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqc extends dpk implements dqp {
   public static final MapCodec<dqc> c = b(dqc::new);

   @Override
   public MapCodec<dqc> a() {
      return c;
   }

   protected dqc(dzn.d $$0) {
      super($$0, ja.b, fen.b(), true);
   }

   @Override
   protected dpl c() {
      return (dpl)dlw.mE;
   }

   @Override
   protected evv b_(dzo $$0) {
      return evw.c.a(false);
   }

   @Override
   protected boolean o(dzo $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable bwz $$0, dhv $$1, iu $$2, dzo $$3, evu $$4) {
      return false;
   }

   @Override
   public boolean a(diq $$0, iu $$1, dzo $$2, evv $$3) {
      return false;
   }
}
