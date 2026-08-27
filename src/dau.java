import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dau extends dae implements dbg {
   public static final MapCodec<dau> c = b(dau::new);

   @Override
   public MapCodec<dau> a() {
      return c;
   }

   protected dau(djg.d $$0) {
      super($$0, ic.b, emj.b(), true);
   }

   @Override
   protected daf c() {
      return (daf)cws.mc;
   }

   @Override
   public eer c_(djh $$0) {
      return ees.c.a(false);
   }

   @Override
   protected boolean h(djh $$0) {
      return this.c().h($$0);
   }

   @Override
   public boolean a(@Nullable cfi $$0, csv $$1, hx $$2, djh $$3, eeq $$4) {
      return false;
   }

   @Override
   public boolean a(ctq $$0, hx $$1, djh $$2, eer $$3) {
      return false;
   }
}
