import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class ddx extends dbz {
   public static final MapCodec<ddx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(div.a.fieldOf("wood_type").forGetter(dbz::d), u()).apply($$0, ddx::new));
   public static final dic b = cyv.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<hx, ekn> i = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cva.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         hx.d,
         cva.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         hx.f,
         cva.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         hx.e,
         cva.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   public ddx(div $$0, dhh.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, hx.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = this.o();
      ecs $$2 = $$0.q().b_($$0.a());
      csd $$3 = $$0.q();
      ht $$4 = $$0.a();
      hx[] $$5 = $$0.f();

      for (hx $$6 : $$5) {
         if ($$6.o().d()) {
            hx $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == ect.c));
            }
         }
      }

      return null;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dhi $$0) {
      return $$0.c(b).p();
   }

   @Override
   public eju h(dhi $$0) {
      ekn $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, f);
   }
}
