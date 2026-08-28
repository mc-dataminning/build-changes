import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class evt extends ewa {
   public final axt<dnc> a;
   public static final MapCodec<evt> b = axt.b(mh.i).xmap(evt::new, $$0 -> $$0.a).fieldOf("value");

   public evt(axt<dnc> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public ewd.d a(dka $$0, iv $$1, iv $$2, ewd.d $$3, ewd.d $$4, evz $$5) {
      return ekk.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected ewc<?> a() {
      return ewc.n;
   }
}
