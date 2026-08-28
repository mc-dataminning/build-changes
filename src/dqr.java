import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dqr extends dmd {
   public static final MapCodec<dqr> a = b(dqr::new);
   public static final ebr<jb> b = ebj.S;
   public static final ebk c = ebj.i;
   private final Function<eat, ffw> d;
   private final Map<jb, ffw> e;

   @Override
   public MapCodec<dqr> a() {
      return a;
   }

   public dqr(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.a).b(c, Boolean.valueOf(true)));
      ffw $$1 = dmr.b(12.0, 11.0, 16.0);
      this.d = this.b($$1);
      this.e = ImmutableMap.builderWithExpectedSize(5).putAll(fft.c(fft.a($$1, dmr.a(4.0, 8.0, 10.0, 0.0, 4.0)))).put(jb.a, $$1).build();
   }

   private Function<eat, ffw> b(ffw $$0) {
      ffw $$1 = fft.a(dmr.b(16.0, 10.0, 16.0), dmr.b(8.0, 4.0, 10.0));
      ffw $$2 = fft.a($$1, $$0, ffg.e);
      Map<jb, ffw> $$3 = fft.d(dmr.a(4.0, 4.0, 8.0, 0.0, 8.0), new ffc(8.0, 6.0, 8.0).c(0.0625));
      return this.a($$2x -> fft.a($$2, fft.a($$3.get($$2x.c(b)), fft.b(), ffg.i)), new ebw[]{c});
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2) {
      return this.e.get($$0.c(b));
   }

   @Override
   public eat a(ddg $$0) {
      jb $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jb.a.b ? jb.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dyu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return $$0.C ? null : a($$2, dxt.s, dyu::a);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dyu $$5) {
         $$3.a($$5);
         $$3.a(awx.ad);
      }

      return bug.a;
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(djm $$0, iv $$1, eat $$2) {
      boolean $$3 = !$$0.D($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      buc.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return cvf.a($$1.c_($$2));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      dxr $$5 = $$1.c_($$2);
      if ($$5 instanceof dyu) {
         dyu.a($$1, $$2, $$0, $$3, (dyu)$$5);
      }
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
