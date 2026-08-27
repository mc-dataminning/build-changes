import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cxg extends cvi {
   public static final MapCodec<cxg> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, cxg::new)
   );
   public static final djy d = cvi.b;
   protected static final float e = 1.0F;
   protected static final emm f = cwq.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final emm g = cwq.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final emm h = emj.a(f, g);
   private static final Map<cwq, cxg> i = Maps.newHashMap();
   private static final Iterable<elt> j = ImmutableList.of(new elt(0.5, 1.0, 0.5));
   private final cwq k;

   @Override
   public MapCodec<cxg> a() {
      return c;
   }

   protected cxg(cwq $$0, djg.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      i.put($$0, this);
      this.k = $$0;
   }

   @Override
   protected Iterable<elt> b(djh $$0) {
      return j;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return h;
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      cmy $$6 = $$3.b($$4);
      if ($$6.a(cnb.op) || $$6.a(cnb.tS)) {
         return bkb.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(d)) {
         a($$3, $$0, $$1, $$2);
         return bkb.a($$1.B);
      } else {
         bkb $$7 = cxc.a($$1, $$2, cws.eg.o(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(elp $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(d);
   }

   @Override
   public cmy a(cts $$0, hx $$1, djh $$2) {
      return new cmy(cws.eg);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(djh $$0, ctp $$1, hx $$2) {
      return cxc.d;
   }

   @Override
   public boolean d_(djh $$0) {
      return true;
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   public static djh a(cwq $$0) {
      return i.get($$0).o();
   }

   public static boolean g(djh $$0) {
      return $$0.a(ash.bj, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
