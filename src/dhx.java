import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dhx extends dde implements dcy {
   public static final MapCodec<dhx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ake.a(ld.aB).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dhx::new)
   );
   protected static final float b = 3.0F;
   protected static final ety c = dcv.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final ake<dyh<?, ?>> d;

   @Override
   public MapCodec<dhx> a() {
      return a;
   }

   public dhx(ake<dyh<?, ?>> $$0, dpx.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c;
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (im $$6 : im.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         im $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

         for (int $$8 = 0; $$8 < 4; $$8++) {
            if ($$1.u($$7) && $$0.a($$1, $$7)) {
               $$2 = $$7;
            }

            $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);
         }

         if ($$1.u($$7) && $$0.a($$1, $$7)) {
            $$1.a($$7, $$0, 2);
         }
      }
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      im $$3 = $$2.d();
      dpy $$4 = $$1.a_($$3);
      return $$4.a(avo.ba) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(aqe $$0, im $$1, dpy $$2, ayd $$3) {
      Optional<? extends iv<dyh<?, ?>>> $$4 = $$0.H_().d(ld.aB).b(this.d);
      if ($$4.isEmpty()) {
         return false;
      } else {
         $$0.a($$1, false);
         if ($$4.get().a().a($$0, $$0.l().g(), $$3, $$1)) {
            return true;
         } else {
            $$0.a($$1, $$2, 3);
            return false;
         }
      }
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return true;
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
