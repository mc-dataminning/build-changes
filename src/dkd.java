import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkd extends djm implements dkp {
   public static final MapCodec<dkd> c = b(dkd::new);

   @Override
   public MapCodec<dkd> a() {
      return c;
   }

   protected dkd(dtb.d $$0) {
      super($$0, ji.b, exq.b(), true);
   }

   @Override
   protected djn c() {
      return (djn)dga.mc;
   }

   @Override
   protected epc b_(dtc $$0) {
      return epd.c.a(false);
   }

   @Override
   protected boolean m(dtc $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cmx $$0, dcc $$1, jd $$2, dtc $$3, epb $$4) {
      return false;
   }

   @Override
   public boolean a(dcx $$0, jd $$1, dtc $$2, epc $$3) {
      return false;
   }
}
