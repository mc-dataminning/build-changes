import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dhl extends dcv implements ddc {
   private static final Codec<elp> f = lc.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof elp $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dhl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, dhl::new));
   public static final dqy b = dqo.aP;
   protected final elp c;
   private final List<elr> g;
   public static final ety d = dcv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ir> e = ImmutableList.of(ir.a, ir.d, ir.c, ir.f, ir.e);

   @Override
   public MapCodec<dhl> a() {
      return a;
   }

   protected dhl(elp $$0, dpx.d $$1) {
      super($$1);
      this.c = $$0;
      this.g = Lists.newArrayList();
      this.g.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.g.add($$0.a(8 - $$2, false));
      }

      this.g.add($$0.a(8, true));
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : etv.a();
   }

   @Override
   protected boolean e_(dpy $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dpy $$0, cza $$1, im $$2) {
      return false;
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return !this.c.a(avt.b);
   }

   @Override
   protected elr c_(dpy $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dpy $$0, dpy $$1, ir $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.a;
   }

   @Override
   protected List<csd> a(dpy $$0, eog.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return etv.a();
   }

   @Override
   protected void b(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((czx)$$1));
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((czx)$$1));
      }
   }

   private boolean a(czu $$0, im $$1, dpy $$2) {
      if (this.c.a(avt.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dcx.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ir $$4 = (ir)var5.next();
            im $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(avt.a)) {
               dcv $$6 = $$0.b_($$1).b() ? dcx.co : dcx.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dcx.mW)) {
               $$0.b($$1, dcx.dY.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(czv $$0, im $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   public csd a(@Nullable ckl $$0, czv $$1, im $$2, dpy $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dcx.a.n(), 11);
         return new csd(this.c.a());
      } else {
         return csd.i;
      }
   }

   @Override
   public Optional<auy> as_() {
      return this.c.j();
   }
}
