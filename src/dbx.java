import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dbx extends daa {
   public static final MapCodec<dbx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgq.a.fieldOf("wood_type").forGetter(daa::d), t()).apply($$0, dbx::new));
   public static final dfx b = cww.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ha, eia> i = Maps.newEnumMap(
      ImmutableMap.of(
         ha.c,
         ctc.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ha.d,
         ctc.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ha.f,
         ctc.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ha.e,
         ctc.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dbx> a() {
      return a;
   }

   public dbx(dgq $$0, dfc.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ha.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      dfd $$1 = this.o();
      eag $$2 = $$0.q().b_($$0.a());
      cqe $$3 = $$0.q();
      gw $$4 = $$0.a();
      ha[] $$5 = $$0.f();

      for (ha $$6 : $$5) {
         if ($$6.o().d()) {
            ha $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eah.c));
            }
         }
      }

      return null;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfd $$0) {
      return $$0.c(b).p();
   }

   @Override
   public ehh h(dfd $$0) {
      eia $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, f);
   }
}
