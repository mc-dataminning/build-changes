import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import javax.annotation.Nullable;

public class ctl extends cti {
   public static final MapCodec<ctl> b = b(ctl::new);
   public static final dgv c = cxu.aE;
   private static final Map<hx, eiy> e = Maps.newEnumMap(
      ImmutableMap.of(
         hx.c,
         cua.a(0.0, 4.0, 5.0, 16.0, 12.0, 16.0),
         hx.d,
         cua.a(0.0, 4.0, 0.0, 16.0, 12.0, 11.0),
         hx.e,
         cua.a(5.0, 4.0, 0.0, 16.0, 12.0, 16.0),
         hx.f,
         cua.a(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)
      )
   );

   @Override
   public MapCodec<? extends ctl> a() {
      return b;
   }

   protected ctl(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, hx.c).a(d, Boolean.valueOf(true)));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return e.get($$0.c(c));
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(c, d);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ebf.c, ebf.c.a($$3));
      }

      return $$1.g() == $$0.c(c) && !$$0.a($$3, $$4) ? cuc.a.o() : $$0;
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      hx $$3 = $$0.c(c);
      ht $$4 = $$2.a($$3.g());
      dgb $$5 = $$1.a_($$4);
      return $$5.d($$1, $$4, $$3);
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = super.a($$0);
      crc $$2 = $$0.q();
      ht $$3 = $$0.a();
      hx[] $$4 = $$0.f();

      for (hx $$5 : $$4) {
         if ($$5.o().d()) {
            $$1 = $$1.a(c, $$5.g());
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }
}
