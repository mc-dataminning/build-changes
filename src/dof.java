import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dof extends ddz {
   public static final MapCodec<dof> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csw.q.fieldOf("color").forGetter(ddz::b), u()).apply($$0, dof::new));
   public static final dtf b = dje.aE;
   private static final Map<jf, exa> c = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dfi.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         jf.d,
         dfi.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         jf.e,
         dfi.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         jf.f,
         dfi.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   public dof(csw $$0, dsk.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, jf.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = this.o();
      dcj $$2 = $$0.q();
      ja $$3 = $$0.a();
      jf[] $$4 = $$0.f();

      for (jf $$5 : $$4) {
         if ($$5.o().d()) {
            jf $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b);
   }
}
