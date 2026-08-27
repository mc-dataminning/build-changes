import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dym extends dyt {
   public final aqd<csq> a;
   public static final Codec<dym> b = aqd.b(je.e).xmap(dym::new, $$0 -> $$0.a);

   public dym(aqd<csq> $$0) {
      this.a = $$0;
   }

   @Nullable
   @Override
   public dyw.c a(cpt $$0, gw $$1, gw $$2, dyw.c $$3, dyw.c $$4, dys $$5) {
      return dnr.a(this.a).test($$0.a_($$4.a())) ? $$4 : null;
   }

   @Override
   protected dyv<?> a() {
      return dyv.n;
   }
}
