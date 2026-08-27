import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvz extends dbz {
   public static final MapCodec<cvz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(div.a.fieldOf("wood_type").forGetter(dbz::d), u()).apply($$0, cvz::new));
   public static final dii b = dhy.ba;
   public static final dhz c = dhy.a;
   protected static final float d = 5.0F;
   protected static final ekn e = cva.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ekn> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         cva.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         cva.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         cva.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         cva.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<cvz> a() {
      return a;
   }

   public cvz(div $$0, dhh.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.c_($$2) instanceof dgm $$6) {
         clj $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bix.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cdu $$0, ejq $$1, dgm $$2, clj $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof ckv && $$1.b().equals(hx.a);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), hx.a, dda.b);
   }

   @Override
   public dhi a(cnr $$0) {
      csa $$1 = $$0.q();
      ecs $$2 = $$1.b_($$0.a());
      ht $$3 = $$0.a().c();
      dhi $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(arg.az);
      hx $$6 = hx.a((double)$$0.i());
      boolean $$7 = !cva.a($$4.k($$1, $$3), hx.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(ddw.b)) {
            hx $$8 = $$4.c(ddw.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<hx> $$9 = dio.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dio.a($$6.g()) : dio.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == ect.c));
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      ekn $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   public ekn b_(dhi $$0, crg $$1, ht $$2) {
      return this.a($$0, $$1, $$2, ejz.a());
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return $$1 == hx.b && !this.a($$0, $$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dhi $$0) {
      return dio.b($$0.c(b));
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new dga($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return a($$2, dff.i, dgm::a);
   }
}
