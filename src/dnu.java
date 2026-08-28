import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dnu extends dlu {
   public static final MapCodec<dnu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dtk.a.fieldOf("wood_type").forGetter(dlu::d), u()).apply($$0, dnu::new));
   public static final dsr b = diq.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<je, ewf> i = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         deu.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         je.d,
         deu.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         je.f,
         deu.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         je.e,
         deu.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dnu> a() {
      return a;
   }

   public dnu(dtk $$0, drw.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, je.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      drx $$1 = this.n();
      enq $$2 = $$0.q().b_($$0.a());
      dbw $$3 = $$0.q();
      iz $$4 = $$0.a();
      je[] $$5 = $$0.f();

      for (je $$6 : $$5) {
         if ($$6.o().d()) {
            je $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == enr.c));
            }
         }
      }

      return null;
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(drx $$0) {
      return $$0.c(b).p();
   }

   @Override
   public evm m(drx $$0) {
      ewf $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, f);
   }
}
