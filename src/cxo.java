import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cxo extends cvq {
   public static final MapCodec<cxo> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, cxo::new)
   );
   public static final dkg d = cvq.b;
   protected static final float e = 1.0F;
   protected static final emv f = cwy.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final emv g = cwy.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final emv h = ems.a(f, g);
   private static final Map<cxn, cxo> i = Maps.newHashMap();
   private static final Iterable<emc> j = ImmutableList.of(new emc(0.5, 1.0, 0.5));
   private final cxn k;

   @Override
   public MapCodec<cxo> a() {
      return c;
   }

   protected cxo(cwy $$0, djo.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof cxn $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + cxn.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<emc> b(djp $$0) {
      return j;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return h;
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      if ($$0.a(cnj.or) || $$0.a(cnj.tV)) {
         return bke.e;
      } else if (a($$6) && $$0.b() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bke.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      bkc $$5 = cxk.a($$1, $$2, cxa.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(ely $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(d);
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return new cng(cxa.eg);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return cxk.d;
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   public static djp a(cxn $$0) {
      return i.get($$0).o();
   }

   public static boolean g(djp $$0) {
      return $$0.a(asi.bj, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
