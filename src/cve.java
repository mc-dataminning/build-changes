import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cve extends cuq {
   public static final MapCodec<cve> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ckv.q.fieldOf("color").forGetter(cuq::b), u()).apply($$0, cve::new));
   public static final djp b = djf.ba;
   private static final Map<ckv, cvz> c = Maps.newHashMap();
   private static final elu d = cvz.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<cve> a() {
      return a;
   }

   public cve(ckv $$0, dio.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return d;
   }

   @Override
   public dip a(coq $$0) {
      return this.o().a(b, Integer.valueOf(djv.a($$0.i() + 180.0F)));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1 == ia.a && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }

   public static cvz a(ckv $$0) {
      return c.getOrDefault($$0, cwb.iJ);
   }
}
