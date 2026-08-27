import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dmv extends dcp {
   public static final MapCodec<dmv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csh.q.fieldOf("color").forGetter(dcp::b), u()).apply($$0, dmv::new));
   public static final drv b = dhu.aE;
   private static final Map<it, evd> c = Maps.newEnumMap(
      ImmutableMap.of(
         it.c,
         ddy.a(0.0, 0.0, 14.0, 16.0, 12.5, 16.0),
         it.d,
         ddy.a(0.0, 0.0, 0.0, 16.0, 12.5, 2.0),
         it.e,
         ddy.a(14.0, 0.0, 0.0, 16.0, 12.5, 16.0),
         it.f,
         ddy.a(0.0, 0.0, 0.0, 2.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dmv> a() {
      return a;
   }

   public dmv(csh $$0, dra.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(b, it.c));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1 == $$0.c(b).g() && !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return c.get($$0.c(b));
   }

   @Override
   public drb a(cwz $$0) {
      drb $$1 = this.n();
      dba $$2 = $$0.q();
      io $$3 = $$0.a();
      it[] $$4 = $$0.f();

      for (it $$5 : $$4) {
         if ($$5.o().d()) {
            it $$6 = $$5.g();
            $$1 = $$1.a(b, $$6);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }
}
