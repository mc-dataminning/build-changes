import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dlk extends dch {
   public static final MapCodec<dlk> a = b(dlk::new);
   public static final dqw<dpe> b = dqo.by;

   @Override
   public MapCodec<dlk> a() {
      return a;
   }

   public dlk(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dpe.a));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Nullable
   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dox($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return $$0 instanceof aqe $$3
         ? a($$2, dnf.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().b($$3, $$2x))
         : a($$2, dnf.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x));
   }

   @Override
   public void a(csd $$0, @Nullable cza $$1, List<ws> $$2, ctu $$3, @Nullable jj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dam.a($$0, $$2, "spawn_data");
   }
}
