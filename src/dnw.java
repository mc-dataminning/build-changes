import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dnw extends dlw {
   public static final MapCodec<dnw> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mh.e.q().fieldOf("candle").forGetter($$0x -> $$0x.h), t()).apply($$0, dnw::new)
   );
   public static final ebx d = dlw.b;
   private static final fgm e = fgj.a(dne.b(2.0, 8.0, 14.0), dne.b(14.0, 0.0, 8.0));
   private static final Map<dnv, dnw> f = Maps.newHashMap();
   private static final Iterable<ffs> g = List.of(new ffs(8.0, 16.0, 8.0).c(0.0625));
   private final dnv h;

   @Override
   public MapCodec<dnw> a() {
      return c;
   }

   protected dnw(dne $$0, ebf.d $$1) {
      super($$1);
      this.l(this.C.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dnv $$2) {
         f.put($$2, this);
         this.h = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dnv.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<ffs> b(ebg $$0) {
      return g;
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return e;
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      if ($$0.a(dae.pg) || $$0.a(dae.vg)) {
         return but.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return but.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      but $$5 = dns.a($$1, $$2, dng.ex.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(ffo $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(d);
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return new daa(dng.ex);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4 == jc.a && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return dns.d;
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }

   public static ebg a(dnv $$0) {
      return f.get($$0).m();
   }

   public static boolean h(ebg $$0) {
      return $$0.a(axg.bn, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
