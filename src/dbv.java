import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dbv extends cys {
   public static final MapCodec<dbv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dbv::new)
   );
   private static final Map<cys, cys> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final eos c = cys.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final cys e;

   @Override
   public MapCodec<dbv> a() {
      return a;
   }

   public dbv(cys $$0, dli.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return c;
   }

   @Override
   protected bly a(cpd $$0, dlj $$1, cvr $$2, hz $$3, chl $$4, blv $$5, env $$6) {
      dlj $$8 = ($$0.d() instanceof cmw $$7 ? d.getOrDefault($$7.e(), cyu.a) : cyu.a).o();
      if ($$8.i()) {
         return bly.d;
      } else if (!this.g()) {
         return bly.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dpw.c, $$3);
         $$4.a(atv.ah);
         if (!$$4.fU().d) {
            $$0.h(1);
         }

         return bly.a($$2.B);
      }
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if (this.g()) {
         return blw.b;
      } else {
         cpd $$5 = new cpd(this.e);
         if (!$$3.i($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, cyu.fR.o(), 3);
         $$1.a($$3, dpw.c, $$2);
         return blw.a($$1.B);
      }
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new cpd(this.e);
   }

   private boolean g() {
      return this.e == cyu.a;
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !$$0.a($$3, $$4) ? cyu.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cys b() {
      return this.e;
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
