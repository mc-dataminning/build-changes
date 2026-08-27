import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dlt extends dcq {
   public static final MapCodec<dlt> a = b(dlt::new);
   public static final drf<dpn> b = dqx.by;

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dpn.a));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.c;
   }

   @Nullable
   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dpg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return $$0 instanceof aqh $$3
         ? a($$2, dno.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().b($$3, $$2x))
         : a($$2, dno.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x));
   }

   @Override
   public void a(csz $$0, @Nullable czj $$1, List<wu> $$2, cuq $$3, @Nullable jk $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dav.a($$0, $$2, "spawn_data");
   }
}
