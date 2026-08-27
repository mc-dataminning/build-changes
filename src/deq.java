import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class deq extends dcs {
   public static final MapCodec<deq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(le.e.q().fieldOf("candle").forGetter($$0x -> $$0x.k), u()).apply($$0, deq::new)
   );
   public static final dru d = dcs.b;
   protected static final float e = 1.0F;
   protected static final evf f = dea.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final evf g = dea.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final evf h = evc.a(f, g);
   private static final Map<dep, deq> i = Maps.newHashMap();
   private static final Iterable<eum> j = ImmutableList.of(new eum(0.5, 1.0, 0.5));
   private final dep k;

   @Override
   public MapCodec<deq> a() {
      return c;
   }

   protected deq(dea $$0, drc.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      if ($$0 instanceof dep $$2) {
         i.put($$2, this);
         this.k = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dep.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<eum> b(drd $$0) {
      return j;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return h;
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if ($$0.a(ctt.os) || $$0.a(ctt.tX)) {
         return bpy.e;
      } else if (a($$6) && $$0.e() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bpy.a($$2.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      bpw $$5 = dem.a($$1, $$2, dec.eg.n(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(eui $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(d);
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return new ctq(dec.eg);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1 == it.a && !$$0.a($$3, $$4) ? dec.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return dem.d;
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   public static drd a(dep $$0) {
      return i.get($$0).n();
   }

   public static boolean g(drd $$0) {
      return $$0.a(avx.bk, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
