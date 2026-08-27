import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class diw extends cyr {
   public static final MapCodec<diw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cpb.q.fieldOf("color").forGetter(cyr::b), u()).apply($$0, diw::new));
   public static final dnt b = ddv.aE;
   private static final Map<ih, eqk> c = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         daa.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         ih.d,
         daa.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         ih.e,
         daa.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         ih.f,
         daa.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<diw> a() {
      return a;
   }

   public diw(cpb $$0, dmy.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, ih.c));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public dmz a(css $$0) {
      dmz $$1 = this.o();
      cxc $$2 = $$0.q();
      ib $$3 = $$0.a();
      ih[] $$4 = $$0.f();

      for (ih $$5 : $$4) {
         if ($$5.o().d()) {
            ih $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }
}
