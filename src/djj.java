import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class djj extends dde implements dcy {
   public static final MapCodec<djj> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpn.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, djj::new)
   );
   public static final dqy f = dqo.aU;
   protected static final float g = 6.0F;
   protected static final ety h = dcv.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
   protected final dpn i;

   @Override
   public MapCodec<? extends djj> a() {
      return e;
   }

   protected djj(dpn $$0, dpx.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(this.E.b().a(f, Integer.valueOf(0)));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return h;
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$1.A($$2.c()) >= 9 && $$3.a(7) == 0) {
         this.a($$1, $$2, $$0, $$3);
      }
   }

   public void a(aqe $$0, im $$1, dpy $$2, ayd $$3) {
      if ($$2.c(f) == 0) {
         $$0.a($$1, $$2.a(f), 4);
      } else {
         this.i.a($$0, $$0.l().g(), $$1, $$2, $$3);
      }
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return true;
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      this.a($$0, $$2, $$3, $$1);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(f);
   }
}
