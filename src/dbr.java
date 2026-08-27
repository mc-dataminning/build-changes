import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.stream.Stream;

public class dbr extends cyo {
   public static final MapCodec<dbr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.e.q().fieldOf("potted").forGetter($$0x -> $$0x.e), u()).apply($$0, dbr::new)
   );
   private static final Map<cyo, cyo> d = Maps.newHashMap();
   public static final float b = 3.0F;
   protected static final eol c = cyo.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final cyo e;

   @Override
   public MapCodec<dbr> a() {
      return a;
   }

   public dbr(cyo $$0, dle.d $$1) {
      super($$1);
      this.e = $$0;
      d.put($$0, this);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return c;
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      dlf $$8 = ($$0.d() instanceof cms $$7 ? d.getOrDefault($$7.e(), cyq.a) : cyq.a).o();
      if ($$8.i()) {
         return blw.d;
      } else if (!this.g()) {
         return blw.b;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, dpp.c, $$3);
         $$4.a(atu.ah);
         if (!$$4.fU().d) {
            $$0.h(1);
         }

         return blw.a($$2.B);
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if (this.g()) {
         return blu.b;
      } else {
         coz $$5 = new coz(this.e);
         Stream.of(blt.a, blt.b).filter($$1x -> $$3.b($$1x).b()).findFirst().ifPresentOrElse($$2x -> $$3.a($$2x, $$5), () -> {
            if (!$$3.i($$5)) {
               $$3.a($$5, false);
            }
         });
         $$1.a($$2, cyq.fR.o(), 3);
         $$1.a($$3, dpp.c, $$2);
         return blu.a($$1.B);
      }
   }

   @Override
   public coz a(cvq $$0, hz $$1, dlf $$2) {
      return this.g() ? super.a($$0, $$1, $$2) : new coz(this.e);
   }

   private boolean g() {
      return this.e == cyq.a;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public cyo b() {
      return this.e;
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
