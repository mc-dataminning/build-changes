import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dnu extends dlu {
   public static final MapCodec<dnu> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("candle").forGetter($$0x -> $$0x.h), t()).apply($$0, dnu::new)
   );
   public static final ebv d = dlu.b;
   private static final fgk e = fgh.a(dnc.b(2.0, 8.0, 14.0), dnc.b(14.0, 0.0, 8.0));
   private static final Map<dnt, dnu> f = Maps.newHashMap();
   private static final Iterable<ffq> g = List.of(new ffq(8.0, 16.0, 8.0).c(0.0625));
   private final dnt h;

   @Override
   public MapCodec<dnu> a() {
      return c;
   }

   protected dnu(dnc $$0, ebd.d $$1) {
      super($$1);
      this.l(this.C.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dnt $$2) {
         f.put($$2, this);
         this.h = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dnt.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<ffq> b(ebe $$0) {
      return g;
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return e;
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if ($$0.a(dac.pg) || $$0.a(dac.vg)) {
         return bur.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bur.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      bur $$5 = dnq.a($$1, $$2, dne.ex.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(ffm $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(d);
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return new czy(dne.ex);
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4 == jb.a && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return dnq.d;
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }

   public static ebe a(dnt $$0) {
      return f.get($$0).m();
   }

   public static boolean h(ebe $$0) {
      return $$0.a(axe.bn, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
