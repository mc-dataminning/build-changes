import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class den extends cvl {
   public static final MapCodec<den> a = b(den::new);
   public static final djn<dic> b = djf.by;

   @Override
   public MapCodec<den> a() {
      return a;
   }

   public den(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dic.a));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   @Override
   public dce b_(dip $$0) {
      return dce.c;
   }

   @Nullable
   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dhw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return $$0 instanceof amp $$3
         ? a($$2, dgf.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.d().b($$3, $$2x))
         : a($$2, dgf.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.d().a($$0x, $$1x));
   }

   @Override
   public void a(cmh $$0, @Nullable cse $$1, List<vb> $$2, cny $$3) {
      super.a($$0, $$1, $$2, $$3);
      ctq.a($$0, $$2, "spawn_data");
   }
}
