import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dis extends dcj {
   public static final MapCodec<dis> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqn.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dis::new)
   );
   public static final dqp f = dqo.w;

   @Override
   public MapCodec<dis> a() {
      return e;
   }

   protected dis(dqn $$0, dpx.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(dpy $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected dpy a(dpy $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(czu $$0, im $$1) {
      Class<? extends bql> $$2 = switch (this.d.f()) {
         case a -> bql.class;
         case b -> bre.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(f);
   }
}
