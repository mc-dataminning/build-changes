import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dqc extends dgy {
   public static final MapCodec<dqc> a = b(dqc::new);
   public static final dvq<dty> b = dvi.by;
   public static final dvj c = dvi.bA;

   @Override
   public MapCodec<dqc> a() {
      return a;
   }

   public dqc(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dty.a).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Nullable
   @Override
   public drv a(jf $$0, dus $$1) {
      return new dtr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return $$0 instanceof arj $$3
         ? a($$2, drx.Q, ($$1x, $$2x, $$3x, $$4) -> $$4.c().a($$3, $$2x, $$3x.d(dvi.bA).orElse(false)))
         : a($$2, drx.Q, ($$0x, $$1x, $$2x, $$3x) -> $$3x.c().a($$0x, $$1x, $$2x.d(dvi.bA).orElse(false)));
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      super.a($$0, $$1, $$2, $$3);
      dfd.a($$0, $$2, "spawn_data");
   }
}
