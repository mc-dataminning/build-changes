import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dmh extends dlt {
   public static final MapCodec<dmh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyw.q.fieldOf("color").forGetter(dlt::b), t()).apply($$0, dmh::new));
   public static final ece b = ebu.bd;
   private static final Map<cyw, dnc> c = Maps.newHashMap();
   private static final fgk d = dnc.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dmh> a() {
      return a;
   }

   public dmh(cyw $$0, ebd.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return d;
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(b, Integer.valueOf(eck.a($$0.i() + 180.0F)));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4 == jb.a && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   public static dnc a(cyw $$0) {
      return c.getOrDefault($$0, dne.jl);
   }
}
