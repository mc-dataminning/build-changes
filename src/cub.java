import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cub extends daa {
   public static final MapCodec<cub> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgq.a.fieldOf("wood_type").forGetter(daa::d), t()).apply($$0, cub::new));
   public static final dgd b = dft.ba;
   public static final dfu c = dft.a;
   protected static final float d = 5.0F;
   protected static final eia e = ctc.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, eia> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         ctc.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         ctc.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         ctc.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         ctc.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<cub> a() {
      return a;
   }

   public cub(dgq $$0, dfc.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.c_($$2) instanceof deh $$6) {
         cjl $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bhe.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cca $$0, ehd $$1, deh $$2, cjl $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cix && $$1.b().equals(ha.a);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ha.a, dbb.b);
   }

   @Override
   public dfd a(clt $$0) {
      cqb $$1 = $$0.q();
      eag $$2 = $$1.b_($$0.a());
      gw $$3 = $$0.a().c();
      dfd $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(apv.az);
      ha $$6 = ha.a((double)$$0.i());
      boolean $$7 = !ctc.a($$4.k($$1, $$3), ha.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dbw.b)) {
            ha $$8 = $$4.c(dbw.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ha> $$9 = dgj.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dgj.a($$6.g()) : dgj.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == eah.c));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      eia $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   public eia b_(dfd $$0, cph $$1, gw $$2) {
      return this.a($$0, $$1, $$2, ehm.a());
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1 == ha.b && !this.a($$0, $$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dfd $$0) {
      return dgj.b($$0.c(b));
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return a($$2, ddb.i, deh::a);
   }
}
