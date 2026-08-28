import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class doj extends dee {
   public static final MapCodec<doj> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dmk.a.b.fieldOf("kind").forGetter(dee::b), u()).apply($$0, doj::new));
   public static final dtf d = dje.aE;
   private static final Map<jf, exa> b = Maps.newEnumMap(
      ImmutableMap.of(
         jf.c,
         dfi.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         jf.d,
         dfi.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         jf.f,
         dfi.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         jf.e,
         dfi.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends doj> a() {
      return c;
   }

   protected doj(dmk.a $$0, dsk.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, jf.c));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = super.a($$0);
      dbm $$2 = $$0.q();
      ja $$3 = $$0.a();
      jf[] $$4 = $$0.f();

      for (jf $$5 : $$4) {
         if ($$5.o().d()) {
            jf $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
