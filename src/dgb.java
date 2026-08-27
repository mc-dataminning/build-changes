import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dgb extends dmq {
   public static final MapCodec<dgb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dup.a.fieldOf("wood_type").forGetter(dmq::c), u()).apply($$0, dgb::new));
   public static final duc b = dts.ba;
   public static final dtt c = dts.a;
   protected static final float d = 5.0F;
   protected static final exn e = dfc.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, exn> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dfc.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dfc.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dfc.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dfc.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   public dgb(dup $$0, dtb.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if ($$2.c_($$3) instanceof drr $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bqc.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cly $$0, ewq $$1, drr $$2, cuh $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.f() instanceof ctt && $$1.b().equals(iw.a);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), iw.a, dns.b);
   }

   @Override
   public dtc a(cyd $$0) {
      dca $$1 = $$0.q();
      epe $$2 = $$1.b_($$0.a());
      ir $$3 = $$0.a().c();
      dtc $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awe.aB);
      iw $$6 = iw.a((double)$$0.i());
      boolean $$7 = !dfc.a($$4.k($$1, $$3), iw.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dor.b)) {
            iw $$8 = $$4.c(dor.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<iw> $$9 = dui.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dui.a($$6.g()) : dui.a($$0.i() + 180.0F);
      return this.n().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == epf.c));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      exn $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected exn b_(dtc $$0, dbg $$1, ir $$2) {
      return this.a($$0, $$1, $$2, ewz.a());
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1 == iw.b && !this.a($$0, $$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dtc $$0) {
      return dui.b($$0.c(b));
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dra($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return a($$2, dqe.j, drr::a);
   }
}
