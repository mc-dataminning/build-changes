import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class doo extends dfk {
   public static final MapCodec<doo> a = b(doo::new);
   public static final dua<dsi> b = dts.by;
   public static final dtt c = dts.bA;

   @Override
   public MapCodec<doo> a() {
      return a;
   }

   public doo(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsi.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.c;
   }

   @Nullable
   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dsc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return $$0 instanceof aqu $$3
         ? a($$2, dqj.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dts.bA).orElse(false)))
         : a($$2, dqj.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dts.bA).orElse(false)));
   }

   @Override
   public void a(cuq $$0, cul.b $$1, List<wz> $$2, cwm $$3) {
      super.a($$0, $$1, $$2, $$3);
      ddp.a($$0, $$2, "spawn_data");
   }
}
