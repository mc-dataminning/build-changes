import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dos extends dmq {
   public static final MapCodec<dos> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dup.a.fieldOf("wood_type").forGetter(dmq::c), u()).apply($$0, dos::new));
   public static final dtw b = djc.aE;
   protected static final float c = 2.0F;
   protected static final float d = 4.5F;
   protected static final float e = 12.5F;
   private static final Map<iw, exn> i = Maps.newEnumMap(
      ImmutableMap.of(
         iw.c,
         dfc.a(0.0, 4.5, 14.0, 16.0, 12.5, 16.0),
         iw.d,
         dfc.a(0.0, 4.5, 0.0, 16.0, 12.5, 2.0),
         iw.f,
         dfc.a(0.0, 4.5, 0.0, 2.0, 12.5, 16.0),
         iw.e,
         dfc.a(14.0, 4.5, 0.0, 16.0, 12.5, 16.0)
      )
   );

   @Override
   public MapCodec<dos> a() {
      return a;
   }

   public dos(dup $$0, dtb.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.k(this.E.b().a(b, iw.c).a(f, Boolean.valueOf(false)));
   }

   @Override
   public String g() {
      return this.q().a();
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return i.get($$0.c(b));
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = this.n();
      epe $$2 = $$0.q().b_($$0.a());
      dcd $$3 = $$0.q();
      ir $$4 = $$0.a();
      iw[] $$5 = $$0.f();

      for (iw $$6 : $$5) {
         if ($$6.o().d()) {
            iw $$7 = $$6.g();
            $$1 = $$1.a(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.a(f, Boolean.valueOf($$2.a() == epf.c));
            }
         }
      }

      return null;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1.g() == $$0.c(b) && !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dtc $$0) {
      return $$0.c(b).p();
   }

   @Override
   public ewu m(dtc $$0) {
      exn $$1 = i.get($$0.c(b));
      return $$1.a().f();
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, f);
   }
}
