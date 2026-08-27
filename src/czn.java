import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class czn extends dfn {
   public static final MapCodec<czn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dms.a.fieldOf("wood_type").forGetter(dfn::d), u()).apply($$0, czn::new));
   public static final dmf b = dlv.ba;
   public static final dlw c = dlv.a;
   protected static final float d = 5.0F;
   protected static final eol e = cyo.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, eol> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         cyo.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         cyo.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         cyo.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         cyo.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<czn> a() {
      return a;
   }

   public czn(dms $$0, dle.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      if ($$2.c_($$3) instanceof dkc $$7 && this.a($$4, $$6, $$7, $$0)) {
         return blw.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(chh $$0, eno $$1, dkc $$2, coz $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof col && $$1.b().equals(ie.a);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ie.a, dgo.b);
   }

   @Override
   public dlf a(crg $$0) {
      cvn $$1 = $$0.q();
      egp $$2 = $$1.b_($$0.a());
      hz $$3 = $$0.a().c();
      dlf $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(atz.az);
      ie $$6 = ie.a((double)$$0.i());
      boolean $$7 = !cyo.a($$4.k($$1, $$3), ie.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dhl.b)) {
            ie $$8 = $$4.c(dhl.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ie> $$9 = dml.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dml.a($$6.g()) : dml.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == egq.c));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      eol $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected eol b_(dlf $$0, cut $$1, hz $$2) {
      return this.a($$0, $$1, $$2, enx.a());
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1 == ie.b && !this.a($$0, $$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dlf $$0) {
      return dml.b($$0.c(b));
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new djq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return a($$2, div.i, dkc::a);
   }
}
