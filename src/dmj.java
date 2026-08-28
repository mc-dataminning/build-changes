import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dmj extends dlv {
   public static final MapCodec<dmj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyy.q.fieldOf("color").forGetter(dlv::b), t()).apply($$0, dmj::new));
   public static final ecg b = ebw.bd;
   private static final Map<cyy, dne> c = Maps.newHashMap();
   private static final fgm d = dne.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   public dmj(cyy $$0, ebf.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return d;
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(b, Integer.valueOf(ecm.a($$0.i() + 180.0F)));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4 == jc.a && !$$0.a($$1, $$3) ? dng.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   public static dne a(cyy $$0) {
      return c.getOrDefault($$0, dng.jl);
   }
}
