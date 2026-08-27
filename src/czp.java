import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class czp extends dcw {
   public static final MapCodec<czp> b = b(czp::new);

   @Override
   public MapCodec<czp> a() {
      return b;
   }

   protected czp(dga.d $$0) {
      super(dba.b.e, $$0);
   }

   @Override
   public void a(cqz $$0, ht $$1, dgb $$2, @Nullable bkj $$3, ckj $$4) {
      cuc.gK.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<ckj> a(dgb $$0, edo.a $$1) {
      return cuc.gK.a($$0, $$1);
   }
}
