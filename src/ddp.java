import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class ddp extends dbs {
   public static final MapCodec<ddp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dij.a.fieldOf("wood_type").forGetter(dbs::d), t()).apply($$0, ddp::new));
   public static final dhq b = cyo.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<hx, ekb> i = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cut.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         hx.d,
         cut.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         hx.f,
         cut.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         hx.e,
         cut.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<ddp> a() {
      return a;
   }

   public ddp(dij $$0, dgv.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, hx.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = this.o();
      ecg $$2 = $$0.q().b_($$0.a());
      crv $$3 = $$0.q();
      ht $$4 = $$0.a();
      hx[] $$5 = $$0.f();

      for (hx $$6 : $$5) {
         if ($$6.o().d()) {
            hx $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == ech.c));
            }
         }
      }

      return null;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dgw $$0) {
      return $$0.c(b).p();
   }

   @Override
   public eji h(dgw $$0) {
      ekb $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, f);
   }
}
