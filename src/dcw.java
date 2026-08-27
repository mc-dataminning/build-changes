import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dcw extends csw {
   public static final MapCodec<dcw> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dba.a.b.fieldOf("kind").forGetter(csw::b), t()).apply($$0, dcw::new));
   public static final dgv d = cxu.aE;
   private static final Map<hx, eiy> b = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cua.a(4.0, 4.0, 8.0, 12.0, 12.0, 16.0),
         hx.d,
         cua.a(4.0, 4.0, 0.0, 12.0, 12.0, 8.0),
         hx.f,
         cua.a(0.0, 4.0, 4.0, 8.0, 12.0, 12.0),
         hx.e,
         cua.a(8.0, 4.0, 4.0, 16.0, 12.0, 12.0)
      )
   );

   @Override
   public MapCodec<? extends dcw> a() {
      return c;
   }

   protected dcw(dba.a $$0, dga.d $$1) {
      super($$0, $$1);
      this.k(this.o().a(d, hx.c));
   }

   @Override
   public String h() {
      return this.k().a();
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return b.get($$0.c(d));
   }

   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = super.a($$0);
      cqf $$2 = $$0.q();
      ht $$3 = $$0.a();
      hx[] $$4 = $$0.f();

      for (hx $$5 : $$4) {
         if ($$5.o().d()) {
            hx $$6 = $$5.g();
            $$1 = $$1.a(d, $$6);
            if (!$$2.a_($$3.a($$5)).a($$0)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      super.a($$0);
      $$0.a(d);
   }
}
