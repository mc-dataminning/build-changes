import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dnr extends ddl {
   public static final MapCodec<dnr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctd.q.fieldOf("color").forGetter(ddl::b), u()).apply($$0, dnr::new));
   public static final dsr b = diq.aE;
   private static final Map<je, ewf> c = Maps.newEnumMap(
      ImmutableMap.of(
         je.c,
         deu.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         je.d,
         deu.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         je.e,
         deu.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         je.f,
         deu.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dnr> a() {
      return a;
   }

   public dnr(ctd $$0, drw.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, je.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dew.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public drx a(cxv $$0) {
      drx $$1 = this.n();
      dbw $$2 = $$0.q();
      iz $$3 = $$0.a();
      je[] $$4 = $$0.f();

      for (je $$5 : $$4) {
         if ($$5.o().d()) {
            je $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
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
      $$0.a(b);
   }
}
