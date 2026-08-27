import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cxf extends cvh {
   public static final MapCodec<cxf> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, cxf::new)
   );
   public static final djx d = cvh.b;
   protected static final float e = 1.0F;
   protected static final eml f = cwp.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final eml g = cwp.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final eml h = emi.a(f, g);
   private static final Map<cwp, cxf> i = Maps.newHashMap();
   private static final Iterable<els> j = ImmutableList.of(new els(0.5, 1.0, 0.5));
   private final cwp k;

   @Override
   public MapCodec<cxf> a() {
      return c;
   }

   protected cxf(cwp $$0, djf.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      i.put($$0, this);
      this.k = $$0;
   }

   @Override
   protected Iterable<els> b(djg $$0) {
      return j;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return h;
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      cmx $$6 = $$3.b($$4);
      if ($$6.a(cna.op) || $$6.a(cna.tS)) {
         return bka.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(d)) {
         a($$3, $$0, $$1, $$2);
         return bka.a($$1.B);
      } else {
         bka $$7 = cxb.a($$1, $$2, cwr.eg.o(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(elo $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(d);
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return new cmx(cwr.eg);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return cxb.d;
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   public static djg a(cwp $$0) {
      return i.get($$0).o();
   }

   public static boolean g(djg $$0) {
      return $$0.a(asg.bj, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
