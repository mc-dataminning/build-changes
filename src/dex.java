import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dex extends dcy {
   public static final MapCodec<dex> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkc.a.fieldOf("wood_type").forGetter(dcy::d), u()).apply($$0, dex::new));
   public static final djj b = czu.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ia, elu> i = Maps.newEnumMap(
      ImmutableMap.of(
         ia.c,
         cvz.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ia.d,
         cvz.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ia.f,
         cvz.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ia.e,
         cvz.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dex> a() {
      return a;
   }

   public dex(dkc $$0, dio.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ia.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      dip $$1 = this.o();
      edz $$2 = $$0.q().b_($$0.a());
      ctb $$3 = $$0.q();
      hv $$4 = $$0.a();
      ia[] $$5 = $$0.f();

      for (ia $$6 : $$5) {
         if ($$6.o().d()) {
            ia $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eea.c));
            }
         }
      }

      return null;
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dip $$0) {
      return $$0.c(b).p();
   }

   @Override
   public elb h(dip $$0) {
      elu $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, f);
   }
}
