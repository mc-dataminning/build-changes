import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dmz extends dcu {
   public static final MapCodec<dmz> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dla.a.b.fieldOf("kind").forGetter(dcu::b), u()).apply($$0, dmz::new));
   public static final drv d = dhu.aE;
   private static final Map<it, evd> b = Maps.newEnumMap(
      ImmutableMap.of(
         it.c,
         ddy.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         it.d,
         ddy.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         it.f,
         ddy.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         it.e,
         ddy.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dmz> a() {
      return c;
   }

   protected dmz(dla.a $$0, dra.d $$1) {
      super($$0, $$1);
      this.k(this.n().a(d, it.c));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public drb a(cwz $$0) {
      drb $$1 = super.a($$0);
      dad $$2 = $$0.q();
      io $$3 = $$0.a();
      it[] $$4 = $$0.f();

      for (it $$5 : $$4) {
         if ($$5.o().d()) {
            it $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
