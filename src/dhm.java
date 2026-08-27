import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dhm extends dfn {
   public static final MapCodec<dhm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dms.a.fieldOf("wood_type").forGetter(dfn::d), u()).apply($$0, dhm::new));
   public static final dlz b = dcj.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ie, eol> i = Maps.newEnumMap(
      ImmutableMap.of(
         ie.c,
         cyo.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ie.d,
         cyo.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ie.f,
         cyo.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ie.e,
         cyo.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dhm> a() {
      return a;
   }

   public dhm(dms $$0, dle.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ie.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String h() {
      return this.j().a();
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dlf a(crg $$0) {
      dlf $$1 = this.o();
      egp $$2 = $$0.q().b_($$0.a());
      cvq $$3 = $$0.q();
      hz $$4 = $$0.a();
      ie[] $$5 = $$0.f();

      for (ie $$6 : $$5) {
         if ($$6.o().d()) {
            ie $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == egq.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dlf $$0) {
      return $$0.c(b).p();
   }

   @Override
   public ens m(dlf $$0) {
      eol $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, f);
   }
}
