import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dto extends dlg {
   public static final MapCodec<dto> a = b(dto::new);

   @Override
   public MapCodec<dto> a() {
      return a;
   }

   protected dto(dzn.d $$0) {
      super($$0);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dyf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return a($$2, dwp.j, $$0.C ? dyf::a : dyf::b);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, cys $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         int $$5 = 15 + $$1.A.a(15) + $$1.A.a(15);
         this.a($$1, $$2, $$5);
      }
   }
}
