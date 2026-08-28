import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drc extends dmo {
   public static final MapCodec<drc> a = b(drc::new);
   public static final ecc<jb> b = ebu.S;
   public static final ebv c = ebu.i;
   private final Function<ebe, fgk> d;
   private final Map<jb, fgk> e;

   @Override
   public MapCodec<drc> a() {
      return a;
   }

   public drc(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.a).b(c, Boolean.valueOf(true)));
      fgk $$1 = dnc.b(12.0, 11.0, 16.0);
      this.d = this.b($$1);
      this.e = ImmutableMap.builderWithExpectedSize(5).putAll(fgh.c(fgh.a($$1, dnc.a(4.0, 8.0, 10.0, 0.0, 4.0)))).put(jb.a, $$1).build();
   }

   private Function<ebe, fgk> b(fgk $$0) {
      fgk $$1 = fgh.a(dnc.b(16.0, 10.0, 16.0), dnc.b(8.0, 4.0, 10.0));
      fgk $$2 = fgh.a($$1, $$0, ffu.e);
      Map<jb, fgk> $$3 = fgh.d(dnc.a(4.0, 4.0, 8.0, 0.0, 8.0), new ffq(8.0, 6.0, 8.0).c(0.0625));
      return this.a($$2x -> fgh.a($$2, fgh.a($$3.get($$2x.c(b)), fgh.b(), ffu.i)), new ech[]{c});
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2) {
      return this.e.get($$0.c(b));
   }

   @Override
   public ebe a(ddr $$0) {
      jb $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jb.a.b ? jb.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return $$0.C ? null : a($$2, dye.s, dzf::a);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dzf $$5) {
         $$3.a($$5);
         $$3.a(awz.ad);
      }

      return bur.a;
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(djx $$0, iv $$1, ebe $$2) {
      boolean $$3 = !$$0.D($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      bun.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return cvq.a($$1.c_($$2));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      dyc $$5 = $$1.c_($$2);
      if ($$5 instanceof dzf) {
         dzf.a($$1, $$2, $$0, $$3, (dzf)$$5);
      }
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
