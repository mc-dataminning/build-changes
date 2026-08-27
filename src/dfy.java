import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dfy extends dcv {
   public static final MapCodec<dfy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lc.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dfy::new)
   );
   private static final Map<dcv, dcv> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final ety c = dcv.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final dcv e;

   @Override
   public MapCodec<dfy> a() {
      return a;
   }

   public dfy(dcv $$0, dpx.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c;
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      dpy $$8 = ($$0.f() instanceof cqb $$7 ? d.getOrDefault($$7.d(), dcx.a) : dcx.a).n();
      if ($$8.i()) {
         return bos.d;
      } else if (!this.k()) {
         return bos.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dur.c, $$3);
         $$4.a(avj.ah);
         $$0.a(1, $$4);
         return bos.a($$2.B);
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if (this.k()) {
         return boq.b;
      } else {
         csd $$5 = new csd(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dcx.fR.n(), 3);
         $$1.a($$3, dur.c, $$2);
         return boq.a($$1.B);
      }
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return this.k() ? super.a($$0, $$1, $$2) : new csd(this.e);
   }

   private boolean k() {
      return this.e == dcx.a;
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      return $$1 == ir.a && !$$0.a($$3, $$4) ? dcx.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public dcv b() {
      return this.e;
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
