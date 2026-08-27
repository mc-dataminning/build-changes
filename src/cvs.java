import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvs extends dbs {
   public static final MapCodec<cvs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dij.a.fieldOf("wood_type").forGetter(dbs::d), t()).apply($$0, cvs::new));
   public static final dhw b = dhm.ba;
   public static final dhn c = dhm.a;
   protected static final float d = 5.0F;
   protected static final ekb e = cut.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, ekb> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         cut.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         cut.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         cut.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         cut.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<cvs> a() {
      return a;
   }

   public cvs(dij $$0, dgv.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      if ($$1.c_($$2) instanceof dga $$6) {
         clb $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return biq.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cdm $$0, eje $$1, dga $$2, clb $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof ckn && $$1.b().equals(hx.a);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), hx.a, dct.b);
   }

   @Override
   public dgw a(cnj $$0) {
      crs $$1 = $$0.q();
      ecg $$2 = $$1.b_($$0.a());
      ht $$3 = $$0.a().c();
      dgw $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(arc.az);
      hx $$6 = hx.a((double)$$0.i());
      boolean $$7 = !cut.a($$4.k($$1, $$3), hx.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(ddo.b)) {
            hx $$8 = $$4.c(ddo.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<hx> $$9 = dic.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dic.a($$6.g()) : dic.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == ech.c));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      ekb $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   public ekb b_(dgw $$0, cqy $$1, ht $$2) {
      return this.a($$0, $$1, $$2, ejn.a());
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return $$1 == hx.b && !this.a($$0, $$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dgw $$0) {
      return dic.b($$0.c(b));
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public der a(ht $$0, dgw $$1) {
      return new dfo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return a($$2, det.i, dga::a);
   }
}
