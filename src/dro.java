import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dro extends dna {
   public static final MapCodec<dro> a = b(dro::new);
   public static final eco<jc> b = ecg.S;
   public static final ech c = ecg.i;
   private final Function<ebq, fgw> d;
   private final Map<jc, fgw> e;

   @Override
   public MapCodec<dro> a() {
      return a;
   }

   public dro(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jc.a).b(c, Boolean.valueOf(true)));
      fgw $$1 = dno.b(12.0, 11.0, 16.0);
      this.d = this.b($$1);
      this.e = ImmutableMap.builderWithExpectedSize(5).putAll(fgt.c(fgt.a($$1, dno.a(4.0, 8.0, 10.0, 0.0, 4.0)))).put(jc.a, $$1).build();
   }

   private Function<ebq, fgw> b(fgw $$0) {
      fgw $$1 = fgt.a(dno.b(16.0, 10.0, 16.0), dno.b(8.0, 4.0, 10.0));
      fgw $$2 = fgt.a($$1, $$0, fgg.e);
      Map<jc, fgw> $$3 = fgt.d(dno.a(4.0, 4.0, 8.0, 0.0, 8.0), new fgc(8.0, 6.0, 8.0).c(0.0625));
      return this.a($$2x -> fgt.a($$2, fgt.a($$3.get($$2x.c(b)), fgt.b(), fgg.i)), new ect[]{c});
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2) {
      return this.e.get($$0.c(b));
   }

   @Override
   public ebq a(ded $$0) {
      jc $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == jc.a.b ? jc.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dyo a(iw $$0, ebq $$1) {
      return new dzr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyo> dyp<T> a(dkj $$0, ebq $$1, dyq<T> $$2) {
      return $$0.C ? null : a($$2, dyq.s, dzr::a);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dzr $$5) {
         $$3.a($$5);
         $$3.a(axi.ad);
      }

      return bvc.a;
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, dno $$3, @Nullable ezi $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dkj $$0, iw $$1, ebq $$2) {
      boolean $$3 = !$$0.D($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, boolean $$3) {
      buy.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(ebq $$0) {
      return true;
   }

   @Override
   protected int a(ebq $$0, dkj $$1, iw $$2) {
      return cwb.a($$1.c_($$2));
   }

   @Override
   protected ebq a(ebq $$0, dui $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebq a(ebq $$0, dsr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      dyo $$5 = $$1.c_($$2);
      if ($$5 instanceof dzr) {
         dzr.a($$1, $$2, $$0, $$3, (dzr)$$5);
      }
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
