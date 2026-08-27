import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cyi extends cvf {
   public static final MapCodec<cyi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kc.f.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, cyi::new)
   );
   private static final Map<cvf, cvf> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final eks c = cvf.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final cvf e;

   @Override
   public MapCodec<cyi> a() {
      return a;
   }

   public cyi(cvf $$0, dhm.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return c;
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      clo $$6 = $$3.b($$4);
      clj $$7 = $$6.d();
      dhn $$8 = ($$7 instanceof cjh ? d.getOrDefault(((cjh)$$7).e(), cvh.a) : cvh.a).o();
      boolean $$9 = $$8.a(cvh.a);
      boolean $$10 = this.g();
      if ($$9 != $$10) {
         if ($$10) {
            $$1.a($$2, $$8, 3);
            $$3.a(arf.ah);
            if (!$$3.fU().d) {
               $$6.h(1);
            }
         } else {
            clo $$11 = new clo(this.e);
            if ($$6.b()) {
               $$3.a($$4, $$11);
            } else if (!$$3.i($$11)) {
               $$3.a($$11, false);
            }

            $$1.a($$2, cvh.fR.o(), 3);
         }

         $$1.a($$3, dlx.c, $$2);
         return bjb.a($$1.B);
      } else {
         return bjb.b;
      }
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new clo(this.e);
   }

   private boolean g() {
      return this.e == cvh.a;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1 == ib.a && !$$0.a($$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cvf b() {
      return this.e;
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
