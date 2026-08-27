import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class diz extends dgz {
   public static final MapCodec<diz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dom.a.fieldOf("wood_type").forGetter(dgz::d), u()).apply($$0, diz::new));
   public static final dnt b = ddv.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<ih, eqk> i = Maps.newEnumMap(
      ImmutableMap.of(
         ih.c,
         daa.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         ih.d,
         daa.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         ih.f,
         daa.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         ih.e,
         daa.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<diz> a() {
      return a;
   }

   public diz(dom $$0, dmy.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, ih.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      dmz $$1 = this.o();
      ein $$2 = $$0.q().b_($$0.a());
      cxc $$3 = $$0.q();
      ib $$4 = $$0.a();
      ih[] $$5 = $$0.f();

      for (ih $$6 : $$5) {
         if ($$6.o().d()) {
            ih $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == eio.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dmz $$0) {
      return $$0.c(b).p();
   }

   @Override
   public epr m(dmz $$0) {
      eqk $$1 = i.get($$0.c(b));
      return $$1.a().f();
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
      $$0.a(b, f);
   }
}
