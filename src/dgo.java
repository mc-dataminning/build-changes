import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dgo extends deq {
   public static final MapCodec<dgo> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lt.e.r().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, dgo::new)
   );
   public static final dtt d = deq.b;
   protected static final float e = 1.0F;
   protected static final ext f = dfy.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final ext g = dfy.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final ext h = exq.a(f, g);
   private static final Map<dgn, dgo> i = Maps.newHashMap();
   private static final Iterable<exa> j = ImmutableList.of(new exa(0.5, 1.0, 0.5));
   private final dgn k;

   @Override
   public MapCodec<dgo> a() {
      return c;
   }

   protected dgo(dfy $$0, dtb.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dgn $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dgn.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<exa> b(dtc $$0) {
      return j;
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return h;
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, eww $$6) {
      if ($$0.a(cut.os) || $$0.a(cut.tX)) {
         return bqt.e;
      } else if (a($$6) && $$0.e() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bqt.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      bqr $$5 = dgk.a($$1, $$2, dga.eg.o(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(eww $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(d);
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return new cuq(dga.eg);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return dgk.d;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }

   public static dtc a(dgn $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dtc $$0) {
      return $$0.a(awe.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
