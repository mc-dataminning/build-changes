import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;

public class dnj extends dlj {
   public static final MapCodec<dnj> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("candle").forGetter($$0x -> $$0x.h), t()).apply($$0, dnj::new)
   );
   public static final ebk d = dlj.b;
   private static final ffw e = fft.a(dmr.b(2.0, 8.0, 14.0), dmr.b(14.0, 0.0, 8.0));
   private static final Map<dni, dnj> f = Maps.newHashMap();
   private static final Iterable<ffc> g = List.of(new ffc(8.0, 16.0, 8.0).c(0.0625));
   private final dni h;

   @Override
   public MapCodec<dnj> a() {
      return c;
   }

   protected dnj(dmr $$0, eas.d $$1) {
      super($$1);
      this.l(this.C.b().b(d, Boolean.valueOf(false)));
      if ($$0 instanceof dni $$2) {
         f.put($$2, this);
         this.h = $$2;
      } else {
         throw new IllegalArgumentException("Expected block to be of " + dni.class + " was " + $$0.getClass());
      }
   }

   @Override
   protected Iterable<ffc> b(eat $$0) {
      return g;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return e;
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      if ($$0.a(czr.pg) || $$0.a(czr.vg)) {
         return bug.e;
      } else if (a($$6) && $$0.f() && $$1.c(d)) {
         a($$4, $$1, $$2, $$3);
         return bug.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   @Override
   protected bug a(eat $$0, djm $$1, iv $$2, crm $$3, fey $$4) {
      bug $$5 = dnf.a($$1, $$2, dmt.ex.m(), $$3);
      if ($$5.a()) {
         c($$0, $$1, $$2);
      }

      return $$5;
   }

   private static boolean a(fey $$0) {
      return $$0.g().e - (double)$$0.b().v() > 0.5;
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(d);
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return new czn(dmt.ex);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4 == jb.a && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected int a(eat $$0, djm $$1, iv $$2) {
      return dnf.d;
   }

   @Override
   protected boolean c_(eat $$0) {
      return true;
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }

   public static eat a(dni $$0) {
      return f.get($$0).m();
   }

   public static boolean h(eat $$0) {
      return $$0.a(axc.bn, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
