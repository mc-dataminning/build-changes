import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dkv extends diw {
   public static final MapCodec<dkv> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mb.e.q().fieldOf("candle").forGetter($$0x -> $$0x.h), t()).apply($$0, dkv::new)
   );
   public static final dyh d = diw.b;
   private static final fcr e = fco.a(dke.b(2.0, 8.0, 14.0), dke.b(14.0, 0.0, 8.0));
   private static final Map<dku, dkv> f = Maps.newHashMap();
   private static final Iterable<fbx> g = List.of(new fbx(8.0, 16.0, 8.0).c(0.0625));
   private final dku h;

   @Override
   public MapCodec<dkv> a() {
      return c;
   }

   protected dkv(dke $$0, dxp.d $$1) {
      super($$1);
      this.l(this.B.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dku $$2) {
         f.put($$2, this);
         this.h = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dku.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<fbx> b(dxq $$0) {
      return g;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return e;
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      if ($$0.a(cxl.oZ) || $$0.a(cxl.uX)) {
         return bsy.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bsy.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      bsy $$5 = dkr.a($$1, $$2, dkg.et.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fbt $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(d);
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return new cxh(dkg.et);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return dkr.d;
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }

   public static dxq a(dku $$0) {
      return f.get($$0).m();
   }

   public static boolean h(dxq $$0) {
      return $$0.a(awp.bm, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
