import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cxx extends cxj {
   public static final MapCodec<cxx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cnr.q.fieldOf("color").forGetter(cxj::b), u()).apply($$0, cxx::new));
   public static final dmj b = dlz.ba;
   private static final Map<cnr, cys> c = Maps.newHashMap();
   private static final eos d = cys.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<cxx> a() {
      return a;
   }

   public cxx(cnr $$0, dli.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return d;
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(b, Integer.valueOf(dmp.a($$0.i() + 180.0F)));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b);
   }

   public static cys a(cnr $$0) {
      return c.getOrDefault($$0, cyu.iJ);
   }
}
