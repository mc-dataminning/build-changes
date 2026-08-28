import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dom extends dfi {
   public static final MapCodec<dom> a = b(dom::new);
   public static final dty<dsg> b = dtq.by;
   public static final dtr c = dtq.bA;

   @Override
   public MapCodec<dom> a() {
      return a;
   }

   public dom(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dsg.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Nullable
   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dsa($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return $$0 instanceof aqt $$3
         ? a($$2, dqh.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dtq.bA).orElse(false)))
         : a($$2, dqh.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dtq.bA).orElse(false)));
   }

   @Override
   public void a(cuo $$0, cuj.b $$1, List<wy> $$2, cwk $$3) {
      super.a($$0, $$1, $$2, $$3);
      ddn.a($$0, $$2, "spawn_data");
   }
}
